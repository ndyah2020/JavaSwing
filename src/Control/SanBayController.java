package Control;

import BUS.SanBayBUS;
import DTO.SanBayDTO;
import GUI.forms.SanBayPanelForm;
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
    private final SanBayPanelForm sanBayPanel;
    
    public SanBayController(SanBayPanelForm panel) {
        this.sanBayPanel = panel;
    }
    
    public void taiDuLieuLenTabel(DefaultTableModel model, ArrayList<SanBayDTO> danhSach) {
        model.setRowCount(0);
        for (SanBayDTO sb : danhSach) {
            Vector<String> row = new Vector<>();
            row.add(sb.getMaSanBay());
            row.add(sb.getTenSanBay());
            row.add(sb.getDiaChi());
            model.addRow(row);
        }
    }
    
    public void hienThiDanhSachSanBay() {
        SanBayBUS sanBayBUS = new SanBayBUS();
        DefaultTableModel modelDs = sanBayPanel.getSanBayTableForm().getModel();
        dsSanBay = sanBayBUS.getDanhSachSanBay();
        taiDuLieuLenTabel(modelDs, dsSanBay);
        sanBayPanel.getSanBayTableForm().getMyTable().setModel(modelDs);
    }
   
    private ArrayList<SanBayDTO> hienThiDanhSachTimThay(String tenSanBay) {
        ArrayList<SanBayDTO> danhSachTimThay = new ArrayList<>();
            for (SanBayDTO sb : dsSanBay) {
                if (sb.getTenSanBay().toLowerCase().trim().contains(tenSanBay.toLowerCase().trim())) {
                    danhSachTimThay.add(sb);
                }
            }
        return danhSachTimThay;
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

    public void xuLySuKien() {
        //tai du lieu lem text field
        sanBayPanel.getSanBayTableForm().addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowSeleted = sanBayPanel.getSanBayTableForm().getMyTable().getSelectedRow();
                
                if (rowSeleted != -1) {
                    SanBayDTO sanBay = dsSanBay.get(rowSeleted);
                    sanBayPanel.getSanBayControlForm().getTxtTenSanBay().setText(sanBay.getTenSanBay());
                    sanBayPanel.getSanBayControlForm().getTxtDiaChi().setText(sanBay.getDiaChi());
                }
            }
        });
        //thêm sân bay mới
        sanBayPanel.getSanBayControlForm().addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ten = sanBayPanel.getSanBayControlForm().getTxtTenSanBay().getText();
                String diaChi = sanBayPanel.getSanBayControlForm().getTxtDiaChi().getText();

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

                sanBayPanel.getSanBayControlForm().clearFormData();
                hienThiDanhSachSanBay();
            }
        });
        //Xóa sân bay
        sanBayPanel.getSanBayControlForm().addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {               
                int rowSeleted = sanBayPanel.getSanBayTableForm().getMyTable().getSelectedRow();
                if (rowSeleted != -1) {
                    String maSanBay = sanBayPanel.getSanBayTableForm().getMyTable().getValueAt(rowSeleted, 0).toString();
                    SanBayBUS bus = new SanBayBUS();
                    bus.xoaSanBay(maSanBay);
                    sanBayPanel.getSanBayControlForm().clearFormData();
                    hienThiDanhSachSanBay();
                }
            }
        });
        //Sửa sân bay
        sanBayPanel.getSanBayControlForm().addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ten = sanBayPanel.getSanBayControlForm().getTxtTenSanBay().getText();
                String diaChi = sanBayPanel.getSanBayControlForm().getTxtDiaChi().getText();

                if (ten.isEmpty() || diaChi.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;
                }

                int selectedRow = sanBayPanel.getSanBayTableForm().getMyTable().getSelectedRow();
                if (selectedRow != -1) {
                    String maSanBay = sanBayPanel.getSanBayTableForm().getMyTable().getValueAt(selectedRow, 0).toString();

                    SanBayDTO sanBay = new SanBayDTO();
                    sanBay.setMaSanBay(maSanBay);
                    sanBay.setTenSanBay(ten);
                    sanBay.setDiaChi(diaChi);

                    SanBayDTO old = dsSanBay.set(selectedRow, sanBay);
                    
                    SanBayBUS bus = new SanBayBUS();
                    bus.suaSanBay(sanBay);

                    sanBayPanel.getSanBayControlForm().clearFormData();
                    hienThiDanhSachSanBay();
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để sửa!");
                }
            }
        });
        //tim kiem danh sach 
        sanBayPanel.getSanBayControlForm().addTimKiemListenter(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                DefaultTableModel modelTimKiem = sanBayPanel.getSanBayTableForm().getModel();
                
                String tenNhapVao = sanBayPanel.getSanBayControlForm().getTxtTimKiem().getText();
                if(!tenNhapVao.isEmpty()){
                    ArrayList<SanBayDTO> danhSachSBMoi = hienThiDanhSachTimThay(tenNhapVao);
                    taiDuLieuLenTabel(modelTimKiem, danhSachSBMoi);
                    sanBayPanel.getSanBayTableForm().getMyTable().setModel(modelTimKiem);
                }else{
                    hienThiDanhSachSanBay();
                }
                
            }
        });
    }
}
