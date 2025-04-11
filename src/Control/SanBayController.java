package Control;

import BUS.SanBayBUS;
import DTO.SanBayDTO;
import GUI.forms.SanBayPanelForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SanBayController {

    private ArrayList<SanBayDTO> dsSanBay;
    private SanBayPanelForm sanBayPanel;
    private DefaultTableModel model;
    
    public SanBayController(SanBayPanelForm panel) {
        this.sanBayPanel = panel;
    }

    public void hienThiDanhSachSanBay() {
        model = sanBayPanel.getSanBayTableForm().getModel();
        model.setRowCount(0);
        SanBayBUS sanBayBUS = new SanBayBUS();
        dsSanBay = sanBayBUS.getDanhSachSanBay();
        
        for (SanBayDTO sb : dsSanBay) {
            Vector<String> row = new Vector<>();
            row.add(sb.getMaSanBay());
            row.add(sb.getTenSanBay());
            row.add(sb.getDiaChi());
            model.addRow(row);
        }
        sanBayPanel.getSanBayTableForm().getMyTable().setModel(model);
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
                
                Vector<String> row = new Vector<>();
                row.add(sanBay.getMaSanBay());
                row.add(sanBay.getTenSanBay());
                row.add(sanBay.getDiaChi());
                sanBayPanel.getSanBayControlForm().clearFormData(ten, diaChi);
                hienThiDanhSachSanBay();
            }
        });
        //Xóa sân bay
        sanBayPanel.getSanBayControlForm().addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowSeleted = sanBayPanel.getSanBayTableForm().getMyTable().getSelectedRow();
                if( rowSeleted != -1) {
                    String maSanBay = sanBayPanel.getSanBayTableForm().getMyTable().getValueAt(rowSeleted, 0).toString();
                    SanBayBUS bus = new SanBayBUS();
                    bus.xoaSanBay(maSanBay);
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
                int rowSeleted = sanBayPanel.getSanBayTableForm().getMyTable().getSelectedRow();
                if(rowSeleted != -1){
                    String maSanBay = sanBayPanel.getSanBayTableForm().getMyTable().getValueAt(rowSeleted, 0).toString();
                    SanBayDTO sanBay = new SanBayDTO();
//                    SanBayDTO sanBayOLD = new SanBayDTO();
//                    sanBayOLD = dsSanBay.get(rowSeleted, )
                            
                    sanBay.setMaSanBay(maSanBay);
                    sanBay.setTenSanBay(ten);
                    sanBay.setDiaChi(diaChi);
                    
                    SanBayBUS bus = new SanBayBUS();
                    bus.suaSanBay(sanBay);

                    sanBayPanel.getSanBayControlForm().clearFormData(ten, diaChi);
                    hienThiDanhSachSanBay();
                }
            }
        });
        sanBayPanel.getSanBayTableForm().addRowClick(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowSeleted = sanBayPanel.getSanBayTableForm().getMyTable().getSelectedRow();
                if(rowSeleted != -1){
                    SanBayDTO sanBay = new SanBayDTO();
                    sanBay = dsSanBay.get(rowSeleted);
                    sanBayPanel.getSanBayControlForm().getTxtTenSanBay().setText(sanBay.getTenSanBay());
                    sanBayPanel.getSanBayControlForm().getTxtDiaChi().setText(sanBay.getDiaChi());
                }
            }
        });
    }
}
