package Control;

import BUS.ChuyenBayBUS;
import DTO.SanBayDTO;
import BUS.HanhTrinhBUS;
import BUS.SanBayBUS;
import DTO.ChuyenBayDTO;
import DTO.HanhTrinhDTO;
import GUI.forms.HanhTrinhControlForm;
import GUI.forms.HanhTrinhPanelForm;
import GUI.forms.HanhTrinhTableForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HanhTrinhController {

    private ArrayList<HanhTrinhDTO> dsHanhTrinh;
    private final HanhTrinhTableForm panelTable;
    private final HanhTrinhControlForm panelControl;
    private String popupModel = "";
    private final HanhTrinhBUS hanhTrinhBUS = new HanhTrinhBUS();
    public HanhTrinhController(HanhTrinhPanelForm panel) {
        this.panelTable = panel.getHanhTrinhTableForm();
        this.panelControl = panel.getHanhTrinhControlForm();

        panelControl.getTxtSanBayDi().setEditable(false);
        panelControl.getTxtSanBayDen().setEditable(false);
    }

    private void layDanhSachSanBayVaHienThiLenPopup() {
        String[] tenCot = {"Mã Sân Bay", "Tên Sân Bay"};
        panelControl.getBangLayMa().setcolumnDefaultTableModel(tenCot);
        DefaultTableModel model = panelControl.getBangLayMa().getModel();
        SanBayBUS bus = new SanBayBUS();
        ArrayList<SanBayDTO> dsSanBay = bus.getDanhSachSanBay();
        HienThiTable.taiDuLieuLenTabelSanBay(model, dsSanBay);
        panelControl.getBangLayMa().getMyTable().setModel(model);
    }
   
    private void setForm(HanhTrinhDTO hanhTrinh) {
        panelControl.getTxtTenHanhTrinh().setText(hanhTrinh.getTenHanhTrinh());
        panelControl.getTxtSanBayDi().setText(hanhTrinh.getSanBayDi());
        panelControl.getTxtSanBayDen().setText(hanhTrinh.getSanBayDen());
        panelControl.getTxtGiaCoBan().setText("" + hanhTrinh.getGiaCoBan());
    }
    
    public void hienThiDanhSachHanhTrinh() {
        
        DefaultTableModel modelDsHT = panelTable.getModel();
        dsHanhTrinh = hanhTrinhBUS.getDanhSachHanhTrinhBUS();
        HienThiTable.taiDuLieuTableHanhTrinh(modelDsHT, dsHanhTrinh);
        panelTable.getMyTable().setModel(modelDsHT);
    }

    public String generateRandom() {
        String prefix = "HT";
        String random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8).toUpperCase();
        while (isCodeDuplicate(random)) {
            random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8).toUpperCase();
        }
        return prefix + "-" + random;
    }

    //Kiểm tra mã duy nhất
        private boolean isCodeDuplicate(String code) {
            for (HanhTrinhDTO ht : dsHanhTrinh) {
                if (ht.getMaHanhTrinh().equals(code)) {
                    return true;
                }
            }
            return false;
        }

    private ArrayList<HanhTrinhDTO> danhSachGiaTim(int tuGia, int denGia){
       ArrayList<HanhTrinhDTO> dsHanhTrinhTimThay = new ArrayList<>();
       for(HanhTrinhDTO ht : dsHanhTrinh) {
           if( ht.getGiaCoBan() >= tuGia && ht.getGiaCoBan() <= denGia) {
                dsHanhTrinhTimThay.add(ht);
           }
       }
       return dsHanhTrinhTimThay;
    }
    
    private boolean kiemTraHanhTrinhSuDung(String maHanhtrinh) {
        ChuyenBayBUS bus = new ChuyenBayBUS();
        ArrayList<ChuyenBayDTO> dsChuyenBay = bus.getDanhSachChuyenBay();
        for(ChuyenBayDTO cb : dsChuyenBay) {
            if(cb.getMaHanhTrinh().equals(maHanhtrinh)){
                return true;
            }         
        }
        return false;
    }
    
    public void xuLySuKienHanhTrinhConTrol() {

        panelTable.addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int rowSeleted = panelTable.getMyTable().getSelectedRow();
                if (rowSeleted != -1) {
                    String maHanhTrinh = panelTable.getMyTable().getValueAt(rowSeleted, 0 ).toString();
                    HanhTrinhDTO motHanhTrinh = hanhTrinhBUS.layMotHanhTrinh(maHanhTrinh);
                    if(motHanhTrinh != null){
                        setForm(motHanhTrinh);
                    }
                               
                }
            }
        });
        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sanBayDi = panelControl.getTxtSanBayDi().getText().trim();
                String sanBayDen = panelControl.getTxtSanBayDen().getText().trim();
                String tenHanhTrinh = panelControl.getTxtTenHanhTrinh().getText().trim();
                String giaCoBanStr = panelControl.getTxtGiaCoBan().getText().trim();

                if (tenHanhTrinh.isEmpty() || sanBayDi.isEmpty() || sanBayDen.isEmpty() || giaCoBanStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;
                }

                if (sanBayDi.equalsIgnoreCase(sanBayDen)) {
                    JOptionPane.showMessageDialog(null, "Sân bay đi và sân bay đến không được trùng nhau!");
                    return;
                }

                int giaCoBan;
                try {
                    giaCoBan = Integer.parseInt(giaCoBanStr);
                    if (giaCoBan < 0) {
                        JOptionPane.showMessageDialog(null, "Giá cơ bản phải lớn hơn hoặc bằng 0!");
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Giá cơ bản phải là một số hợp lệ!");
                    return;
                }

                HanhTrinhDTO hanhTrinh = new HanhTrinhDTO();
                hanhTrinh.setMaHanhTrinh(generateRandom());
                hanhTrinh.setTenHanhTrinh(tenHanhTrinh);
                hanhTrinh.setSanBayDi(sanBayDi);
                hanhTrinh.setSanBayDen(sanBayDen);
                hanhTrinh.setGiaCoBan(giaCoBan);

                hanhTrinhBUS.themHanhTrinhBUS(hanhTrinh);
                panelControl.clearFormData();
                hienThiDanhSachHanhTrinh();
            }
        });

        //Xoa hanh Trinh
        panelControl.addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowSeleted = panelTable.getMyTable().getSelectedRow();
                if (rowSeleted != -1) {
                    String maHanhTrinh = panelTable.getMyTable().getValueAt(rowSeleted, 0).toString();
                    if (!kiemTraHanhTrinhSuDung(maHanhTrinh)) {
                        hanhTrinhBUS.xoaHanhTrinhBUS(maHanhTrinh);
                        panelControl.clearFormData();
                        hienThiDanhSachHanhTrinh();
                    }else{
                          JOptionPane.showMessageDialog(null, "Không thể xóa! Hành trình này đã được áp dụng");
                    }
                }
            }
        });
        //Sua hanh Trinh

        panelControl.addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowSeleted = panelTable.getMyTable().getSelectedRow();
                if (rowSeleted != -1) {
                    String maHanhTrinh = panelTable.getMyTable().getValueAt(rowSeleted, 0).toString();
                    if (!kiemTraHanhTrinhSuDung(maHanhTrinh)) {
                        HanhTrinhDTO hanhTrinh = new HanhTrinhDTO();
                        hanhTrinh.setMaHanhTrinh(maHanhTrinh);
                        hanhTrinh.setTenHanhTrinh(panelControl.getTxtTenHanhTrinh().getText());
                        hanhTrinh.setSanBayDi(panelControl.getTxtSanBayDi().getText());
                        hanhTrinh.setSanBayDen(panelControl.getTxtSanBayDen().getText());
                        hanhTrinh.setGiaCoBan(Integer.parseInt(panelControl.getTxtGiaCoBan().getText()));
                        hanhTrinhBUS.suaHanhTrinhBUS(hanhTrinh);
                        panelControl.clearFormData();
                        hienThiDanhSachHanhTrinh();
                    }else{
                        JOptionPane.showMessageDialog(null, "Không thể sửa! Hành trình này đã được áp dụng");
                    }
                    
                }
            }
        });
        //Hiển thị poup và đưa danh sách sân bay đi lên popup
        panelControl.addShowPopupSanBayDiListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelControl.getTxtSanBayDi().setText("");
                panelControl.showPopupSanBayDi();
                layDanhSachSanBayVaHienThiLenPopup();
                popupModel = "di";
            }
        });
        //Hiển thị poup và đưa danh sách sân bay đến lên popup
        panelControl.addShowPopupSanBayDenListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelControl.getTxtSanBayDen().setText("");
                panelControl.showPopupSanBayDen();
                layDanhSachSanBayVaHienThiLenPopup();
                popupModel = "den";
            }
        });
        //Sự kiện click set mả vào text flied khi chọn
        panelControl.getBangLayMa().addRowClickPopup(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String maSanBayPopup = panelControl.getBangLayMa().getMyTable().getValueAt(panelControl.getBangLayMa().getMyTable().getSelectedRow(), 0).toString();
                if ("di".equals(popupModel)) {
                    panelControl.getTxtSanBayDi().setText(maSanBayPopup);
                } else {
                    panelControl.getTxtSanBayDen().setText(maSanBayPopup);
                }
            }
        });
        //Tìm kiếm đơn giản trên danh sách hành trình
        panelControl.addTxtTimKiemListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                DefaultTableModel modeTimKiem = panelTable.getModel();
                String tenHanhTrinhTimKiem = panelControl.getTxtTimKiem().getText();
                if (!tenHanhTrinhTimKiem.isEmpty()) {
                    ArrayList<HanhTrinhDTO> hanhTrinh = hanhTrinhBUS.danhSachTimTheoTenHanhTrinh(tenHanhTrinhTimKiem);
                    HienThiTable.taiDuLieuTableHanhTrinh(modeTimKiem, hanhTrinh);
                } else {
                    hienThiDanhSachHanhTrinh();
                }
            }
        });
        //Lọc giá của hành trình từ combobox
        panelControl.addLocGiaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String giaDachon = (String) panelControl.getCmbLocGia().getSelectedItem();
                DefaultTableModel modeTimKiem = panelTable.getModel();
                switch (giaDachon) {
                    case "1 triệu":                       
                        modeTimKiem.setRowCount(0);
                        HienThiTable.taiDuLieuTableHanhTrinh(modeTimKiem,danhSachGiaTim(0,1000000));
                        break;
                    case "1 triệu - 2 triệu":
                        modeTimKiem.setRowCount(0);
                         HienThiTable.taiDuLieuTableHanhTrinh(modeTimKiem,danhSachGiaTim(1000000,2000000));                    
                        break;
                    case "2 triệu trở lên":            
                        modeTimKiem.setRowCount(0);
                        HienThiTable.taiDuLieuTableHanhTrinh(modeTimKiem,danhSachGiaTim(2000000, Integer.MAX_VALUE));                      
                        break;
                    default:
                        hienThiDanhSachHanhTrinh();
                        break;
                }
            }
        });
        
        panelControl.getBangLayMa().addSearchPopupListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                DefaultTableModel modeTimKiemPopup = panelControl.getBangLayMa().getModel();
                String tenSaBay =String.valueOf(panelControl.getBangLayMa().getTxtSearch().getText());
                SanBayBUS bus = new SanBayBUS();               
                if(!tenSaBay.isEmpty()){
                    ArrayList<SanBayDTO> sanBay = bus.danhSachTimTheoTenSanBay(tenSaBay);
                    HienThiTable.taiDuLieuLenTabelSanBay(modeTimKiemPopup, sanBay);
                } else {
                    layDanhSachSanBayVaHienThiLenPopup();
                }
                
            }
        });
    }
}
