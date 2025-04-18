package Control;

import BUS.HanhTrinhBUS;
import BUS.SanBayBUS;
import DTO.HanhTrinhDTO;
import DTO.SanBayDTO;
import GUI.forms.SanBayControlForm;
import GUI.forms.SanBayPanelForm;
import GUI.forms.SanBayTableForm;
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

public class SanBayController {

    private ArrayList<SanBayDTO> dsSanBay;
    
    private final SanBayTableForm panelTable;
    private final SanBayControlForm panelControl;
    
    public SanBayController(SanBayPanelForm panel) {
        this.panelTable = panel.getSanBayTableForm();
        this.panelControl = panel.getSanBayControlForm();
       
    } 
    
    public void hienThiDanhSachSanBay() {
        SanBayBUS sanBayBUS = new SanBayBUS();
        DefaultTableModel modelDs = panelTable.getModel();
        dsSanBay = sanBayBUS.getDanhSachSanBay();
         HienThiTable.taiDuLieuLenTabelSanBay(modelDs, dsSanBay);
        panelTable.getMyTable().setModel(modelDs);
    }

    private SanBayDTO layMotSanBay(String maSanBay) {
        SanBayDTO sanBay = new SanBayDTO();
        for (SanBayDTO sb : dsSanBay) {
            if (sb.getMaSanBay().equals(maSanBay)) {
                sanBay = sb;
                break;
            }
        }
        return sanBay;
    }
    
    //tạo mã random
    public String generateRandom() {
        String prefix = "SB";
        String random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8).toUpperCase();
        while (isCodeDuplicate(random)) {
            random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8).toUpperCase();
        }
        return prefix + "-" + random;
    }

    //Kiểm tra mã duy nhất
    private boolean isCodeDuplicate(String code) {
        for (SanBayDTO sb : dsSanBay) {
            if (sb.getMaSanBay().equals(code)) {
                return true;
            }
        }
        return false;
    }
    private void setForm(SanBayDTO sanBay) {
        panelControl.getTxtTenSanBay().setText(sanBay.getTenSanBay());
        panelControl.getTxtDiaChi().setText(sanBay.getDiaChi());
    }
    
    private boolean kiemTraSanBayCoDuocSuDung(String maSanBay) {
        HanhTrinhBUS hanhTrinhBUS = new HanhTrinhBUS();
        ArrayList<HanhTrinhDTO> dsHanhTrinh = hanhTrinhBUS.getDanhSachHanhTrinhBUS();
        for (HanhTrinhDTO ht : dsHanhTrinh) {
            if (ht.getSanBayDen().equals(maSanBay) || ht.getSanBayDi().equals(maSanBay)) {              
                return true;
            }
        }
        return false;
    }
    
    public void xuLySuKien() {
        //tai du lieu lem text field
        panelTable.addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowSeleted = panelTable.getMyTable().getSelectedRow();
                
                if (rowSeleted != -1) {
                    String maSanBay = panelTable.getMyTable().getValueAt(rowSeleted, 0).toString();
                    setForm(layMotSanBay(maSanBay));
                }
            }
        });
        //thêm sân bay mới
        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ten = panelControl.getTxtTenSanBay().getText().trim();
                String diaChi = panelControl.getTxtDiaChi().getText().trim();

                if (ten.isEmpty() || diaChi.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;
                }
                SanBayDTO sanBay = new SanBayDTO();
                sanBay.setMaSanBay(generateRandom());
                sanBay.setTenSanBay(ten);
                sanBay.setDiaChi(diaChi);

                SanBayBUS bus = new SanBayBUS();
                bus.themSanBay(sanBay);

                panelControl.clearFormData();
                hienThiDanhSachSanBay();
            }
        });
        //Xóa sân bay
        panelControl.addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {               
                int rowSeleted = panelTable.getMyTable().getSelectedRow();
                if (rowSeleted != -1) {
                    String maSanBay = panelTable.getMyTable().getValueAt(rowSeleted, 0).toString();
                    if(!kiemTraSanBayCoDuocSuDung(maSanBay)){
                        SanBayBUS bus = new SanBayBUS();
                        bus.xoaSanBay(maSanBay);
                        panelControl.clearFormData();
                        hienThiDanhSachSanBay();
                    }else
                        JOptionPane.showMessageDialog(null, "Không thể xóa ! Sân Bay này đã được áp dụng vào hành trình ");
                    
                }
            }
        });
        //Sửa sân bay
        panelControl.addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ten = panelControl.getTxtTenSanBay().getText();
                String diaChi = panelControl.getTxtDiaChi().getText();

                if (ten.isEmpty() || diaChi.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;
                }

                int selectedRow = panelTable.getMyTable().getSelectedRow();
                if (selectedRow != -1) {
                    String maSanBay = panelTable.getMyTable().getValueAt(selectedRow, 0).toString();
                    if (!kiemTraSanBayCoDuocSuDung(maSanBay)) {
                        SanBayDTO sanBay = new SanBayDTO();
                        sanBay.setMaSanBay(maSanBay);
                        sanBay.setTenSanBay(ten);
                        sanBay.setDiaChi(diaChi);

                        SanBayBUS bus = new SanBayBUS();
                        bus.suaSanBay(sanBay);

                        panelControl.clearFormData();
                        hienThiDanhSachSanBay();
                    }else
                        JOptionPane.showMessageDialog(null, "Không thể sửa ! Sân Bay này đã được áp dụng vào hành trình ");          
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để sửa!");
                }
            }
        });
        //tim kiem danh sach 
        panelControl.addTimKiemListenter(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                DefaultTableModel modelTimKiem = panelTable.getModel();
                
                String tenNhapVao = panelControl.getTxtTimKiem().getText();
                if(!tenNhapVao.isEmpty()){
                    ArrayList<SanBayDTO> danhSachSBMoi = TimKiemTable.danhSachTimTheoTenSanBay(tenNhapVao, dsSanBay);
                    HienThiTable.taiDuLieuLenTabelSanBay(modelTimKiem, danhSachSBMoi);
                    panelTable.getMyTable().setModel(modelTimKiem);
                }else{
                    hienThiDanhSachSanBay();
                }
                
            }
        });
    }
}
