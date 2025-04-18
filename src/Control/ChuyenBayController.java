package Control;

import BUS.ChuyenBayBUS;
import BUS.HanhTrinhBUS;
import BUS.MayBayBUS;
import DTO.ChuyenBayDTO;
import DTO.HanhTrinhDTO;
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
    
    private ChuyenBayDTO layMotChuyenBay(String maChuyenBay) {
        ChuyenBayDTO chuyenBay = new ChuyenBayDTO();
        for (ChuyenBayDTO cb : dsChuyenBay) {
            if (cb.getMaChuyenBay().equals(maChuyenBay)) {
                chuyenBay = cb;
                break;
            }
        }
        return chuyenBay;
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
                if(rowSelected != -1 ) {
                  String maChuyenBay = panelTable.getMyTable().getValueAt(rowSelected, 0).toString();
                  setForm(layMotChuyenBay(maChuyenBay));
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
                if(!tenHanhtrinh.isEmpty()){
                    ArrayList<HanhTrinhDTO> dsHanhTrinhTimThay = TimKiemTable.danhSachTimTheoTenHanhTrinh(tenHanhtrinh, bus.getDanhSachHanhTrinhBUS());
                    HienThiTable.taiDuLieuTableHanhTrinh(modelTimKiem, dsHanhTrinhTimThay);
                }else{
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
                if(!mayBay.isEmpty()) {
                    ArrayList<MayBayDTO> dsMayBayTimThay = TimKiemTable.danhSachTimTheoTenMayBay(mayBay, bus.getDanhSachMayBayBUS());
                    HienThiTable.taiDuLieuTabelMayBay(modelTableModel, dsMayBayTimThay);
                }else {
                    hienThiMayBayLenPopup();
                }
            }
        });       
        //Them Chuyen Bay
        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maChuyenBay = panelForm.getTxtMaChuyenBay().getText();
                Date ngayXuatPhat = Date.valueOf(panelForm.getTxtNgayXuatPhat().getText());
                //Lay kieu ep kieu ve time sql 
                java.util.Date gioXuatphatDate = (java.util.Date) panelForm.getSpinnerGioXuatPhat().getValue();
                Time gioXuatPhat = new Time(gioXuatphatDate.getTime()); 
                
                Date ngayDenNoi =  Date.valueOf(panelForm.getTxtNgayDenNoi().getText());   
                
                java.util.Date gioDenNoiDate = (java.util.Date) panelForm.getSpinnerGioDenNoi().getValue(); 
                Time gioDenNoi = new Time(gioDenNoiDate.getTime());
                
                int giaThuong = Integer.parseInt(panelForm.getTxtGiaThuong().getText());
                int giaVip = Integer.parseInt(panelForm.getTxtGiaVip().getText());
                String trangThai = panelForm.getTxtTrangThai().getText();
                int tongSoLuongGhe = Integer.parseInt(panelForm.getTxtTongSLGhe().getText());
                int soGheDaBan = Integer.parseInt(panelForm.getTxtSoGheDaBan().getText());
                int soGheConLai = Integer.parseInt(panelForm.getTxtSoGheConLai().getText());
                String maMayBay = panelForm.getTxtMaMayBay().getText();
                String maHanhTrinh = panelForm.getTxtMaHanhTrinh().getText();
                
                ChuyenBayDTO chuyenBay = new ChuyenBayDTO();
                chuyenBay.setMaChuyenBay(maChuyenBay);
                chuyenBay.setNgayXuatPhat(ngayXuatPhat);
                chuyenBay.setGioXuatPhat(gioXuatPhat);
                chuyenBay.setNgayDenNoi(ngayDenNoi);
                chuyenBay.setGioDenNoi(gioDenNoi);
                chuyenBay.setGiaThuong(giaThuong);
                chuyenBay.setGiaVip(giaVip);
                chuyenBay.setTrangThaiChuyenBay(trangThai);
                chuyenBay.setTongSoLuongGhe(tongSoLuongGhe);
                chuyenBay.setSoGheDaBan(soGheDaBan);
                chuyenBay.setSoGheConLai(soGheConLai);
                chuyenBay.setMaMayBay(maMayBay);
                chuyenBay.setMaHanhTrinh(maHanhTrinh);
                
                ChuyenBayBUS bus = new ChuyenBayBUS();
                bus.themChuyenBayBUS(chuyenBay);
                panelForm.clearForm();
                layDanhSachChuyenBay();
                System.out.print("Them Thanh cong");
            }
        });
    }
}
