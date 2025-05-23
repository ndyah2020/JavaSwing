package Control;

import BUS.ChuyenBayBUS;
import BUS.HanhTrinhBUS;
import BUS.LoaiMayBayBus;
import BUS.MayBayBUS;
import BUS.VeBUS;
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
import javax.swing.JOptionPane;

public class ChuyenBayController {

    private ArrayList<ChuyenBayDTO> dsChuyenBay;
    private final ChuyenBayForm panelForm;
    private final ChuyenBayControlForm panelControl;
    private final ChuyenBayTableForm panelTable;
    private String popupModel = "";
    private final MayBayBUS mayBayBUS = new MayBayBUS();
    private final HanhTrinhBUS hanhTrinhBUS = new HanhTrinhBUS();
    private final LoaiMayBayBus loaiMayBayBUS = new LoaiMayBayBus();
    private final ChuyenBayBUS chuyenBayBUS = new ChuyenBayBUS();
    private final VeBUS veBUS = new VeBUS();
    public ChuyenBayController(ChuyenBayPanelForm panel) {
        this.panelForm = panel.getChuyenBayForm();
        this.panelControl = panel.getChuyenBayControlForm();
        this.panelTable = panel.getChuyenBayTableForm();
    }

    public void layDanhSachChuyenBay() {
        DefaultTableModel modelDS = panelTable.getModel();      
        dsChuyenBay = chuyenBayBUS.getDanhSachChuyenBay();
        HienThiTable.taiDuLieuTableChuyenBay(modelDS, dsChuyenBay);
        panelTable.getMyTable().setModel(modelDS);
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
                    panelForm.getTxtMaChuyenBay().setEditable(false);
                    panelForm.getBtnMaHanhTrinh().setEnabled(false);
                    panelForm.getBtnMaMayBay().setEnabled(false);
                    String maChuyenBay = panelTable.getMyTable().getValueAt(rowSelected, 0).toString();
                    ChuyenBayDTO motChuyenBay = chuyenBayBUS.layMotChuyenBay(maChuyenBay);
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
                panelForm.getTxtMaChuyenBay().setEditable(true);
                panelForm.getBtnMaHanhTrinh().setEnabled(true);
                panelForm.getBtnMaMayBay().setEnabled(true);
                panelTable.getMyTable().clearSelection();
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
                    ArrayList<HanhTrinhDTO> dsHanhTrinhTimThay = hanhTrinhBUS.danhSachTimTheoTenHanhTrinh(tenHanhtrinh);
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
                    ArrayList<MayBayDTO> dsMayBayTimThay = bus.danhSachTimTheoTuKhoa(mayBay);
                    HienThiTable.taiDuLieuTabelMayBay(modelTableModel, dsMayBayTimThay);
                } else {
                    hienThiMayBayLenPopup();
                }
            }
        });
        //lấy mã hành trình từ popup
        panelForm.getBangLayMaHanhTrinh().addRowClickPopup(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String maHanhTrinh = panelForm.getBangLayMaHanhTrinh().getMyTable()
                                    .getValueAt(panelForm.getBangLayMaHanhTrinh().getMyTable().getSelectedRow(), 0)
                                    .toString();
                panelForm.getTxtMaHanhTrinh().setText(maHanhTrinh);
            }
        });
        //lấy mã máy bay
        panelForm.getBangLayMaMayBay().addRowClickPopup(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String maMayBay = panelForm.getBangLayMaMayBay().getMyTable()
                                  .getValueAt(panelForm.getBangLayMaMayBay().getMyTable().getSelectedRow(), 0)
                                  .toString();
                String maHanhTrinh = panelForm.getTxtMaHanhTrinh().getText();
                if(!maHanhTrinh.isEmpty()) {
                    if (chuyenBayBUS.layMotChuyenBayTuMaMayBay(maMayBay) == null) {
                        panelForm.getTxtMaMayBay().setText(maMayBay);
                        int giaCoBan = hanhTrinhBUS.layMotHanhTrinh(maHanhTrinh).getGiaCoBan();
                        MayBayDTO mayBay = mayBayBUS.layMotMayBay(maMayBay);
                        
                        double heSoGiaThuong = loaiMayBayBUS.layMotLoaiMayBay(mayBay.getMaLoaiMayBay()).getHeSoGiaThuong();
                        double heSoGiaVip = loaiMayBayBUS.layMotLoaiMayBay(mayBay.getMaLoaiMayBay()).getHeSoGiaVip();

                        int giaThuong = (int) (giaCoBan * heSoGiaThuong);
                        int giaVip = (int) (giaCoBan * heSoGiaVip);

                        panelForm.getTxtGiaThuong().setText("" + giaThuong);
                        panelForm.getTxtGiaVip().setText("" + giaVip);
                        panelForm.getTxtTongSLGhe().setText("" + mayBay.getTongSoLuongGhe());
                        panelForm.getTxtSoGheConLai().setText("" + mayBay.getTongSoLuongGhe());
                        panelForm.getTxtSoGheDaBan().setText("0");
                        panelForm.getTxtTrangThai().setText("Đang mở bán");
                    } else {
                        JOptionPane.showMessageDialog(null, "Máy bay này đã có chuyến bay");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn hành trình");
                }
            }
        });
        //Them Chuyen Bay
        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maChuyenBay = panelForm.getTxtMaChuyenBay().getText().trim();

                if (maChuyenBay.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập Mã Chuyến Bay!");
                    return;
                }

                if (chuyenBayBUS.layMotChuyenBay(maChuyenBay) != null) {
                    JOptionPane.showMessageDialog(null, "Mã Chuyến Bay đã tồn tại!");
                    return;
                }

                try {
                    Date ngayXuatPhat = Date.valueOf(panelForm.getTxtNgayXuatPhat().getText());
                    Time gioXuatPhat = new Time(((java.util.Date) panelForm.getSpinnerGioXuatPhat().getValue()).getTime());
                    Date ngayDenNoi = Date.valueOf(panelForm.getTxtNgayDenNoi().getText());
                    Time gioDenNoi = new Time(((java.util.Date) panelForm.getSpinnerGioDenNoi().getValue()).getTime());

                    String maMayBay = panelForm.getTxtMaMayBay().getText().trim();
                    String maHanhTrinh = panelForm.getTxtMaHanhTrinh().getText().trim();

                    if (maMayBay.isEmpty() && maHanhTrinh.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Vui lòng nhập Mã Máy Bay hoặc Mã Hành Trình!");
                        return;
                    }

                    int giaThuong = Integer.parseInt(panelForm.getTxtGiaThuong().getText());
                    int giaVip = Integer.parseInt(panelForm.getTxtGiaVip().getText());
                    int tongSoLuongGhe = Integer.parseInt(panelForm.getTxtTongSLGhe().getText());
                    String trangThai = panelForm.getTxtTrangThai().getText();
                    int soGheDaban = Integer.parseInt(panelForm.getTxtSoGheDaBan().getText());

                    ChuyenBayDTO chuyenBay = new ChuyenBayDTO(maChuyenBay, ngayXuatPhat, gioXuatPhat, ngayDenNoi, gioDenNoi, 
                                    giaThuong, giaVip, trangThai,tongSoLuongGhe, soGheDaban, tongSoLuongGhe - soGheDaban, 
                                    maMayBay, maHanhTrinh);              
                    chuyenBayBUS.themChuyenBayBUS(chuyenBay);
                    panelForm.clearForm();
                    layDanhSachChuyenBay();
                    veBUS.capNhatDanhSach();
                    JOptionPane.showMessageDialog(null, "Thêm chuyến bay thành công!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Lỗi nhập dữ liệu: " + ex.getMessage());
                }
            }
        });
  
        panelControl.addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowClick = panelTable.getMyTable().getSelectedRow();
                if (rowClick != -1) {
                    String maChuyenBay = panelTable.getMyTable().getValueAt(rowClick, 0).toString();
                    if(veBUS.timKiemVeTheoMaChuyenBayDaDat(maChuyenBay) == null) {
                        try {              
                            System.out.println(maChuyenBay);
                            String maMayBay = panelForm.getTxtMaMayBay().getText().trim();
                            String maHanhTrinh = panelForm.getTxtMaHanhTrinh().getText().trim();

                            Date ngayXuatPhat = Date.valueOf(panelForm.getTxtNgayXuatPhat().getText());
                            Time gioXuatPhat = new Time(((java.util.Date) panelForm.getSpinnerGioXuatPhat().getValue()).getTime());
                            Date ngayDenNoi = Date.valueOf(panelForm.getTxtNgayDenNoi().getText());
                            Time gioDenNoi = new Time(((java.util.Date) panelForm.getSpinnerGioDenNoi().getValue()).getTime());

                            int giaThuong = Integer.parseInt(panelForm.getTxtGiaThuong().getText());
                            int giaVip = Integer.parseInt(panelForm.getTxtGiaVip().getText());
                            int tongSoLuongGhe = Integer.parseInt(panelForm.getTxtTongSLGhe().getText());
                            String trangThai = panelForm.getTxtTrangThai().getText();
                            int soGheDaban = Integer.parseInt(panelForm.getTxtSoGheDaBan().getText());

                            ChuyenBayDTO chuyenBay = new ChuyenBayDTO();
                            chuyenBay.setMaChuyenBay(maChuyenBay);
                            chuyenBay.setMaMayBay(maMayBay);
                            chuyenBay.setMaHanhTrinh(maHanhTrinh);
                            chuyenBay.setNgayXuatPhat(ngayXuatPhat);
                            chuyenBay.setGioXuatPhat(gioXuatPhat);
                            chuyenBay.setNgayDenNoi(ngayDenNoi);
                            chuyenBay.setGioDenNoi(gioDenNoi);
                            chuyenBay.setGiaThuong(giaThuong);
                            chuyenBay.setGiaVip(giaVip);
                            chuyenBay.setTongSoLuongGhe(tongSoLuongGhe);
                            chuyenBay.setTrangThaiChuyenBay(trangThai);
                            chuyenBay.setSoGheDaBan(soGheDaban);

                            chuyenBayBUS.suaChuyenBay(chuyenBay);
                            panelForm.clearForm();
                            layDanhSachChuyenBay();

                            JOptionPane.showMessageDialog(null, "Sửa thành công");
                            panelForm.getBtnMaHanhTrinh().setEnabled(true);
                            panelForm.getBtnMaMayBay().setEnabled(true);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Lỗi nhập liệu: " + ex.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Không thể sửa chuyến bay vì vé chuyến bay đã được bán");
                    }
                        
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn chuyến bay cần sửa!");
                }
            }
        });

    }
}
