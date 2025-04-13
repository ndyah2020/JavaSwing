package Control;

import BUS.LoaiMayBayBus;
import DTO.LoaiMayBayDTO;
import GUI.forms.LoaiMayBayPanelForm;
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

public class LoaiMayBayController {
    
    private ArrayList<LoaiMayBayDTO> danhSachLoaiMayBay;
    private final LoaiMayBayPanelForm loaiMayBayPanel;
    
    public LoaiMayBayController(LoaiMayBayPanelForm panel) {
        this.loaiMayBayPanel = panel;
    }
    
    private void taiDuLieuLenTable (DefaultTableModel model, ArrayList<LoaiMayBayDTO> danhSach) {
        model.setRowCount(0);
        for (LoaiMayBayDTO lmb : danhSach) {
            Vector<String> row = new Vector<>();
            row.add(lmb.getMaLoai());
            row.add(lmb.getTenLoai());
            row.add(Float.toString(lmb.getHeSoGiaThuong()));
            row.add(Float.toString(lmb.getHeSoGiaVip()));
            model.addRow(row);
        }
    }
    
    public void hienThiDanhSachLoaiMayBay() {
        LoaiMayBayBus loaiMayBayBUS = new LoaiMayBayBus();
        DefaultTableModel modelDanhSach = loaiMayBayPanel.getLoaiMayBayTableForm().getModel();
        danhSachLoaiMayBay = loaiMayBayBUS.getDanhSachLoaiMayBay();
        taiDuLieuLenTable(modelDanhSach, danhSachLoaiMayBay);
        loaiMayBayPanel.getLoaiMayBayTableForm().getMyTable().setModel(modelDanhSach);
    }
    
    private ArrayList<LoaiMayBayDTO> hienThiDanhSachTimThay(String tenLoai) {
        ArrayList<LoaiMayBayDTO> danhSachTimThay = new ArrayList<>();
        for (LoaiMayBayDTO lmb : danhSachLoaiMayBay) {
            if (lmb.getTenLoai().toLowerCase().trim().contains(tenLoai.toLowerCase().trim())) {
                danhSachTimThay.add(lmb);
            }
        }
        return danhSachTimThay;
    }
    
    public String taoMaNgauNhien() {
        String prefix = "LMB";
        String random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 4).toUpperCase();
        while (maDaTonTai(random)) {
            random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 4).toUpperCase();
        }
        return prefix + "-" + random;
    }
    
    public boolean maDaTonTai(String ma) {
        for (LoaiMayBayDTO lmb : danhSachLoaiMayBay) {
            if (lmb.getMaLoai().equals(ma)) {
                return true;
            }
        }
        return false;
    }
    
    public Float toFloat(String input, String fieldName) {
        if (input == null || input.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập " + fieldName + ".");
            return null;
        }

        try {
            return Float.parseFloat(input.trim().replace(",", "."));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, fieldName + " phải là một số hợp lệ.");
            return null;
        }
    }


    
    public void xuLySuKienLoaiMayBay() {
        loaiMayBayPanel.getLoaiMayBayTableForm().addRowClick(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int rowSelected = loaiMayBayPanel.getLoaiMayBayTableForm().getMyTable().getSelectedRow();
                
                if (rowSelected != -1) {
                    LoaiMayBayDTO loaiMayBay = danhSachLoaiMayBay.get(rowSelected);
                    loaiMayBayPanel.getLoaiMayBayControlForm().getTxtTenLoaiMayBay().setText(loaiMayBay.getTenLoai());
                    loaiMayBayPanel.getLoaiMayBayControlForm().getTxtHeSoGiaThuong().setText(Float.toString(loaiMayBay.getHeSoGiaThuong()));
                    loaiMayBayPanel.getLoaiMayBayControlForm().getTxtHeSoGiaVip().setText(Float.toString(loaiMayBay.getHeSoGiaVip()));
                }
            }
        });
        
        loaiMayBayPanel.getLoaiMayBayControlForm().addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tenLoai = loaiMayBayPanel.getLoaiMayBayControlForm().getTxtTenLoaiMayBay().getText();
                String heSoGiaThuong = loaiMayBayPanel.getLoaiMayBayControlForm().getTxtHeSoGiaThuong().getText();
                String heSoGiaVip = loaiMayBayPanel.getLoaiMayBayControlForm().getTxtHeSoGiaVip().getText();
                
                if (tenLoai.isEmpty() || heSoGiaThuong.isEmpty() || heSoGiaVip.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;
                }
                LoaiMayBayDTO loaiMayBay = new LoaiMayBayDTO();
                loaiMayBay.setMaLoai(taoMaNgauNhien());
                loaiMayBay.setTenLoai(tenLoai);
                loaiMayBay.setHeSoGiaThuong(Float.parseFloat(heSoGiaThuong));
                loaiMayBay.setHeSoGiaVip(Float.parseFloat(heSoGiaVip));
                
                LoaiMayBayBus bus = new LoaiMayBayBus();
                bus.themLoaiMayBay(loaiMayBay);
                
                loaiMayBayPanel.getLoaiMayBayControlForm().clearFormData();
                hienThiDanhSachLoaiMayBay();
            }
        });
        
        loaiMayBayPanel.getLoaiMayBayControlForm().addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowSelected = loaiMayBayPanel.getLoaiMayBayTableForm().getMyTable().getSelectedRow();
                if (rowSelected != -1) {
                    String maLoaiMayBay = loaiMayBayPanel.getLoaiMayBayTableForm().getMyTable().getValueAt(rowSelected, 0).toString();
                    LoaiMayBayBus bus = new LoaiMayBayBus();
                    bus.xoaLoaiMayBay(maLoaiMayBay);
                    loaiMayBayPanel.getLoaiMayBayControlForm().clearFormData();
                    hienThiDanhSachLoaiMayBay();
                }
            }
        });
        
        loaiMayBayPanel.getLoaiMayBayControlForm().addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tenLoaiMayBay = loaiMayBayPanel.getLoaiMayBayControlForm().getTxtTenLoaiMayBay().getText();
                String heSoGiaThuongText = loaiMayBayPanel.getLoaiMayBayControlForm().getTxtHeSoGiaThuong().getText();
                Float heSoGiaThuong = toFloat(heSoGiaThuongText, "Hệ số giá thuòng");
                String heSoGiaVipText = loaiMayBayPanel.getLoaiMayBayControlForm().getTxtHeSoGiaVip().getText();
                Float heSoGiaVip = toFloat(heSoGiaVipText, "Hệ số giá Vip");
                
                if (tenLoaiMayBay.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;
                }
                
                int selectedRow = loaiMayBayPanel.getLoaiMayBayTableForm().getMyTable().getSelectedRow();
                if (selectedRow != -1) {
                    String maLoaiMayBay = loaiMayBayPanel.getLoaiMayBayTableForm().getMyTable().getValueAt(selectedRow, 0).toString();
                    
                    LoaiMayBayDTO loaiMayBay = new LoaiMayBayDTO();
                    loaiMayBay.setMaLoai(maLoaiMayBay);
                    loaiMayBay.setTenLoai(tenLoaiMayBay);
                    loaiMayBay.setHeSoGiaThuong(heSoGiaThuong);
                    loaiMayBay.setHeSoGiaVip(heSoGiaVip);
                    
                    LoaiMayBayDTO dto = danhSachLoaiMayBay.set(selectedRow, loaiMayBay);
                    
                    LoaiMayBayBus bus = new LoaiMayBayBus();
                    bus.suaLoaiMayBay(loaiMayBay);
                    
                    loaiMayBayPanel.getLoaiMayBayControlForm().clearFormData();
                    hienThiDanhSachLoaiMayBay();
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để sửa!");
                }
            }       
        });
        
        loaiMayBayPanel.getLoaiMayBayControlForm().addTimKiemListener(new KeyAdapter() {
           @Override
           public void keyReleased(KeyEvent e) {
                DefaultTableModel modelTimKiem = loaiMayBayPanel.getLoaiMayBayTableForm().getModel();

                String tenDauVao = loaiMayBayPanel.getLoaiMayBayControlForm().getTxtTimKiem().getText();
                if (!tenDauVao.isEmpty()) {
                    ArrayList<LoaiMayBayDTO> danhSachLMBMoi = hienThiDanhSachTimThay(tenDauVao);
                    taiDuLieuLenTable(modelTimKiem, danhSachLMBMoi);
                    loaiMayBayPanel.getLoaiMayBayTableForm().getMyTable().setModel(modelTimKiem);
                } else {
                    hienThiDanhSachLoaiMayBay();
                }
            }
            
        });
    }
}
