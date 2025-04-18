package Control;

import BUS.ChuyenBayBUS;
import BUS.HanhTrinhBUS;
import BUS.LoaiMayBayBus;
import BUS.MayBayBUS;
import DTO.ChuyenBayDTO;
import DTO.HanhTrinhDTO;
import DTO.LoaiMayBayDTO;
import DTO.MayBayDTO;
import GUI.forms.ChuyenBayControlForm;
import GUI.forms.ChuyenBayForm;
import GUI.forms.ChuyenBayPanelForm;
import GUI.forms.ChuyenBayTableForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.sql.Time;

public class ChuyenBayController {

    private ArrayList<ChuyenBayDTO> dsChuyenBay;
    private final ChuyenBayForm panelForm;
    private final ChuyenBayControlForm panelControl;
    private final ChuyenBayTableForm panelTable;
    private String popupModel = "";

    public ChuyenBayController(ChuyenBayPanelForm panel) {
        this.panelForm = panel.getChuyenBayForm();
        this.panelControl = panel.getChuyenBayControlForm();
        this.panelTable = panel.getChuyenBayTableForm();
    }

    public void layDanhSachChuyenBay() {
        DefaultTableModel modelDS = panelTable.getModel();
        ChuyenBayBUS bus = new ChuyenBayBUS();
        dsChuyenBay = bus.getDanhSachChuyenBay();
        HienThiTable.taiDuLieuTableChuyenBay(modelDS, dsChuyenBay);
        panelTable.getMyTable().setModel(modelDS);
    }

    private HanhTrinhDTO layHanhTrinhTheoMa(String maHanhTrinh) {
        HanhTrinhDTO hanhTrinh = new HanhTrinhDTO();
        HanhTrinhBUS bus = new HanhTrinhBUS();
        ArrayList<HanhTrinhDTO> dsHT = bus.getDanhSachHanhTrinhBUS();
        for (HanhTrinhDTO ht : dsHT) {
            if (ht.getMaHanhTrinh().equals(maHanhTrinh)) {
                hanhTrinh = ht;
                break;
            }
        }
        return hanhTrinh;
    }

    private void setForm(ChuyenBayDTO chuyenBay) {
        panelForm.getTxtMaChuyenBay().setText(chuyenBay.getMaChuyenBay());

        panelForm.getTxtNgayXuatPhat().setText(chuyenBay.getNgayXuatPhat().toString());
        Time gioDi = chuyenBay.getGioXuatPhat();
        panelForm.getSpinnerGioXuatPhat().setValue(new java.util.Date(gioDi.getTime()));

        panelForm.getTxtNgayDenNoi().setText(chuyenBay.getNgayDenNoi().toString());
        panelForm.getSpinnerGioDenNoi().setValue(chuyenBay.getGioDenNoi());

        panelForm.getTxtGiaThuong().setText(String.valueOf(chuyenBay.getGiaThuong()));
        panelForm.getTxtGiaVip().setText(String.valueOf(chuyenBay.getGiaVip()));
        panelForm.getTxtTrangThai().setText(chuyenBay.getTrangThaiChuyenBay());
        panelForm.getTxtTongSLGhe().setText(String.valueOf(chuyenBay.getTongSoLuongGhe()));
        panelForm.getTxtSoGheDaBan().setText(String.valueOf(chuyenBay.getSoGheDaBan()));
        panelForm.getTxtSoGheConLai().setText(String.valueOf(chuyenBay.getSoGheConLai()));
        panelForm.getTxtMaMayBay().setText(chuyenBay.getMaMayBay());
        panelForm.getTxtMaHanhTrinh().setText(chuyenBay.getMaHanhTrinh());
    }

    private void hienThiHanhTrinhLenPopup() {
        String[] tenCot = {"Mã Hành Trình", "Tên Hành Trình"};
        panelForm.getBangLayMaHanhTrinh().setcolumnDefaultTableModel(tenCot);
        DefaultTableModel model = panelForm.getBangLayMaHanhTrinh().getModel();
        HanhTrinhBUS bus = new HanhTrinhBUS();
        ArrayList<HanhTrinhDTO> hanHTrinh = bus.getDanhSachHanhTrinhBUS();
        HienThiTable.taiDuLieuTableHanhTrinh(model, hanHTrinh);
    }

    private void hienThiMayBayLenPopup() {
        String[] tenCot = {"Mã Máy Bay", "Tên Máy Bay"};
        panelForm.getBangLayMaMayBay().setcolumnDefaultTableModel(tenCot);
        DefaultTableModel model = panelForm.getBangLayMaMayBay().getModel();
        MayBayBUS bus = new MayBayBUS();
        ArrayList<MayBayDTO> mayBay = bus.getDanhSachMayBayBUS();
        HienThiTable.taiDuLieuTabelMayBay(model, mayBay);
    }

    public void xuLySuKien() {
        //set các dữ liệu lên text field
        panelTable.addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowSelected = panelTable.getMyTable().getSelectedRow();
                if (rowSelected != -1) {
                    String maChuyenBay = panelTable.getMyTable().getValueAt(rowSelected, 0).toString();
                    ChuyenBayDTO motChuyenBay = TimKiemTable.layMotChuyenBay(maChuyenBay, dsChuyenBay);
                    if (motChuyenBay != null) {
                        setForm(motChuyenBay);
                    }
                }
            }
        });
        //Xóa form
        panelControl.addXoaFormListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelForm.clearForm();
            }
        });
        //show pop
        panelForm.addShowPopupMaHanhTrinh(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelForm.showPopBangLayMaHanhTrinh();
                hienThiHanhTrinhLenPopup();
            }
        });

        panelForm.addShowPopupMaMayBay(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelForm.showPopBangLayMaMayBay();
                hienThiMayBayLenPopup();
            }
        });

        //Tim kiem tren popup
        panelForm.getBangLayMaHanhTrinh().addSearchPopupListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                DefaultTableModel modelTimKiem = panelForm.getBangLayMaHanhTrinh().getModel();
                HanhTrinhBUS bus = new HanhTrinhBUS();
                String tenHanhtrinh = panelForm.getBangLayMaHanhTrinh().getTxtSearch().getText();
                if (!tenHanhtrinh.isEmpty()) {
                    ArrayList<HanhTrinhDTO> dsHanhTrinhTimThay = TimKiemTable.danhSachTimTheoTenHanhTrinh(tenHanhtrinh, bus.getDanhSachHanhTrinhBUS());
                    HienThiTable.taiDuLieuTableHanhTrinh(modelTimKiem, dsHanhTrinhTimThay);
                } else {
                    hienThiHanhTrinhLenPopup();
                }
            }
        });

        panelForm.getBangLayMaMayBay().addSearchPopupListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                DefaultTableModel modelTableModel = panelForm.getBangLayMaMayBay().getModel();
                MayBayBUS bus = new MayBayBUS();
                String mayBay = panelForm.getBangLayMaMayBay().getTxtSearch().getText();
                if (!mayBay.isEmpty()) {
                    ArrayList<MayBayDTO> dsMayBayTimThay = TimKiemTable.danhSachTimTheoTenMayBay(mayBay, bus.getDanhSachMayBayBUS());
                    HienThiTable.taiDuLieuTabelMayBay(modelTableModel, dsMayBayTimThay);
                } else {
                    hienThiMayBayLenPopup();
                }
            }
        });
        //Them Chuyen Bay
        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Khởi tạo BUS
                MayBayBUS mayBayBUS = new MayBayBUS();
                HanhTrinhBUS hanhTrinhBUS = new HanhTrinhBUS();
                LoaiMayBayBus loaiMayBayBUS = new LoaiMayBayBus();
                ChuyenBayBUS chuyenBayBUS = new ChuyenBayBUS();

                // Lấy dữ liệu từ form
                String maChuyenBay = panelForm.getTxtMaChuyenBay().getText();
                Date ngayXuatPhat = Date.valueOf(panelForm.getTxtNgayXuatPhat().getText());
                Time gioXuatPhat = new Time(((java.util.Date) panelForm.getSpinnerGioXuatPhat().getValue()).getTime());
                Date ngayDenNoi = Date.valueOf(panelForm.getTxtNgayDenNoi().getText());
                Time gioDenNoi = new Time(((java.util.Date) panelForm.getSpinnerGioDenNoi().getValue()).getTime());

                String maMayBay = panelForm.getTxtMaMayBay().getText();
                String maHanhTrinh = panelForm.getTxtMaHanhTrinh().getText();

                // Lấy danh sách dữ liệu
                ArrayList<LoaiMayBayDTO> dsLoaiMayBay = loaiMayBayBUS.getDanhSachLoaiMayBay();
                ArrayList<HanhTrinhDTO> dsHanhTrinh = hanhTrinhBUS.getDanhSachHanhTrinhBUS();
                ArrayList<MayBayDTO> dsMayBay = mayBayBUS.getDanhSachMayBayBUS();

                // Tính toán giá vé
                int giaCoBan = TimKiemTable.layMotHanhTrinh(maHanhTrinh, dsHanhTrinh).getGiaCoBan();
                String maLoaiMayBay = TimKiemTable.layMotMayBay(maMayBay, dsMayBay).getMaLoaiMayBay();

                double heSoGiaThuong = TimKiemTable.layMotLoaiMayBay(maLoaiMayBay, dsLoaiMayBay).getHeSoGiaThuong();
                double heSoGiaVip = TimKiemTable.layMotLoaiMayBay(maLoaiMayBay, dsLoaiMayBay).getHeSoGiaVip();

                int giaThuong = (int) (giaCoBan * heSoGiaThuong);
                int giaVip = (int) (giaCoBan * heSoGiaVip);

                // Tính tổng số lượng ghế
                MayBayDTO mayBay = TimKiemTable.layMotMayBay(maMayBay, dsMayBay);
                int tongSoLuongGhe = mayBay.getSoLuongGheThuong() + mayBay.getSoLuongGheVip();

                // Tạo đối tượng ChuyenBayDTO
                ChuyenBayDTO chuyenBay = new ChuyenBayDTO();
                chuyenBay.setMaChuyenBay(maChuyenBay);
                chuyenBay.setNgayXuatPhat(ngayXuatPhat);
                chuyenBay.setGioXuatPhat(gioXuatPhat);
                chuyenBay.setNgayDenNoi(ngayDenNoi);
                chuyenBay.setGioDenNoi(gioDenNoi);
                chuyenBay.setGiaThuong(giaThuong);
                chuyenBay.setGiaVip(giaVip);
                chuyenBay.setTrangThaiChuyenBay("Đang mở bán");
                chuyenBay.setTongSoLuongGhe(tongSoLuongGhe);
                chuyenBay.setSoGheDaBan(0);
                chuyenBay.setSoGheConLai(tongSoLuongGhe);
                chuyenBay.setMaMayBay(maMayBay);
                chuyenBay.setMaHanhTrinh(maHanhTrinh);

                // Thêm chuyến bay
                chuyenBayBUS.themChuyenBayBUS(chuyenBay);

                // Làm mới giao diện
                panelForm.clearForm();
                layDanhSachChuyenBay();
                System.out.println("Thêm thành công");
            }
        });

    }
}
