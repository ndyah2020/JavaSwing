package Control;

import BUS.HanhTrinhBUS;
import BUS.KhuyenMaiBUS;
import BUS.KhuyenMaiChiTietBUS;
import DTO.CTKhuyenMaiDTO;
import DTO.HanhTrinhDTO;
import DTO.KhuyenMaiDTO;
import GUI.forms.KhuyenMaiChiTietTableForm;
import GUI.forms.KhuyenMaiControlForm;
import GUI.forms.KhuyenMaiPanelForm;
import GUI.forms.KhuyenMaiTableForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class KhuyenMaiController {
    private final KhuyenMaiTableForm panelKhuyenMaiTable;
    private final KhuyenMaiChiTietTableForm panelCTKhuyenMaiTable;
    private final KhuyenMaiControlForm panelControl;
    private final KhuyenMaiBUS kmBUS = new KhuyenMaiBUS();
    private final KhuyenMaiChiTietBUS ctkmBUS = new KhuyenMaiChiTietBUS();
    private ArrayList<KhuyenMaiDTO> dsKhuyenMai;
    private ArrayList<CTKhuyenMaiDTO> dsCTKhuyenMai;
    
    public KhuyenMaiController(KhuyenMaiPanelForm panel) {
        this.panelKhuyenMaiTable = panel.getKhuyenMaiTableForm();
        this.panelCTKhuyenMaiTable = panel.getKhuyenMaiChiTietTableForm();
        this.panelControl = panel.getKhuyenMaiControlForm();
        panelControl.getTxtMaHanhTrinh().setEditable(false);
    }
    
    private void setForm(KhuyenMaiDTO km, CTKhuyenMaiDTO ct) {
        panelControl.getTxtMaKhuyenMai().setText(km.getMaKhuyenMai());
        panelControl.getTxtTenKhuyenMai().setText(km.getTenKhuyenMai());
        panelControl.getTxtPhanTramKhuyenMai().setText(km.getPhanTramGiamGia());
        panelControl.setNgayBatDau(km.getNgayBatDau());
        panelControl.setNgayKetThuc(km.getNgayKetThuc());
        if (ct != null) {
            panelControl.getTxtMaHanhTrinh().setText(ct.getMaHanhTrinh());
        }
    }
    
    public void hienThiDuLieu() {
        dsKhuyenMai = kmBUS.getDanhSachKhuyenMai();
        dsCTKhuyenMai = ctkmBUS.getDanhSachChiTietKhuyenMai();
        HienThiTable.taiDuLieuTableKhuyenMai(panelKhuyenMaiTable.getModel(), dsKhuyenMai);
        HienThiTable.taiDuLieuTableCTKhuyenMai(panelCTKhuyenMaiTable.getModel(), dsCTKhuyenMai);
    }
    
    private KhuyenMaiDTO layMotKhuyenMai(String ma) {
        return TimKiemTable.layMotKhuyenMai(ma, dsKhuyenMai);
    }
    
    private CTKhuyenMaiDTO layMotCTKhuyenMai(String maKM) {
        for (CTKhuyenMaiDTO ct : dsCTKhuyenMai) {
            if (ct.getMaKhuyenMai().equals(maKM)) return ct;
        }
        return null;
    }
    
    private String generateMaCTKhuyenMai() {
        return "CTKM-" + UUID.randomUUID().toString().substring(0,6).toUpperCase();
    }
    
    private void hienThiHanhTrinhLenPopup() {
        String[] cols = {"Mã hành trinh", "Tên Hành Trình"};
        panelControl.getBangLayMa().setcolumnDefaultTableModel(cols);
        DefaultTableModel model = panelControl.getBangLayMa().getModel();
        ArrayList<HanhTrinhDTO> dsHanhTrinh = new HanhTrinhBUS().getDanhSachHanhTrinhBUS();
        HienThiTable.taiDuLieuTableHanhTrinh(model, dsHanhTrinh);
    }
    
    public void xuLySuKienKhuyenMai() {
        panelKhuyenMaiTable.addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = panelKhuyenMaiTable.getMyTable().getSelectedRow();
                if (row != -1) {
                    String ma = panelKhuyenMaiTable.getMyTable().getValueAt(row, 0).toString();
                    KhuyenMaiDTO km = layMotKhuyenMai(ma);
                    CTKhuyenMaiDTO ct = layMotCTKhuyenMai(ma);
                    setForm(km, ct);
                    
                    for (int i =0; i <panelCTKhuyenMaiTable.getMyTable().getRowCount(); i++) {
                        if (panelCTKhuyenMaiTable.getMyTable().getValueAt(i, 2).toString().equals(ma)) {
                            panelCTKhuyenMaiTable.getMyTable().setRowSelectionInterval(i, i);
                            break;
                        }
                    }
                }
            }
        });
        
        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maKM = panelControl.getTxtMaKhuyenMai().getText().trim();
                String tenKM = panelControl.getTxtTenKhuyenMai().getText().trim();
                String ptgg = panelControl.getTxtPhanTramKhuyenMai().getText().trim();
                Date nbd = panelControl.getNgayBatDau();
                Date nkt = panelControl.getNgayKetThuc();
                String maHT = panelControl.getTxtMaHanhTrinh().getText().trim();
                
                if (maKM.isEmpty() || maHT.isEmpty() || ptgg.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin.");
                    return;
                }

                KhuyenMaiDTO km = new KhuyenMaiDTO(maKM, tenKM, nbd, nkt, ptgg);
                CTKhuyenMaiDTO ct = new CTKhuyenMaiDTO(generateMaCTKhuyenMai(), maHT, maKM);
                kmBUS.themKhuyenMaiBUS(km);
                ctkmBUS.themCTKhuyenMaiBUS(ct);
                hienThiDuLieu();
                panelControl.resetForm();
                JOptionPane.showMessageDialog(null, "Thêm thành công!");
            }
        });
        
        panelControl.addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maKM = panelControl.getTxtMaKhuyenMai().getText().trim();
                KhuyenMaiDTO km = layMotKhuyenMai(maKM);
                CTKhuyenMaiDTO ct = layMotCTKhuyenMai(maKM);
                if (km != null && ct != null) {
                    km.setTenKhuyenMai(panelControl.getTxtTenKhuyenMai().getText().trim());
                    km.setPhanTramGiamGia(panelControl.getTxtPhanTramKhuyenMai().getText().trim());
                    km.setNgayBatDau(panelControl.getNgayBatDau());
                    km.setNgayKetThuc(panelControl.getNgayKetThuc());

                    ct.setMaHanhTrinh(panelControl.getTxtMaHanhTrinh().getText().trim());

                    kmBUS.suaKhuyenMaiBUS(km);
                    ctkmBUS.suaCTKhuyenMaiBUS(ct);
                    hienThiDuLieu();
                    panelControl.resetForm();
                    JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
                }
            }
        });
        
        panelControl.addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = panelKhuyenMaiTable.getMyTable().getSelectedRow();
                if (row != -1) {
                    String maKM = panelKhuyenMaiTable.getMyTable().getValueAt(row, 0).toString();
                    KhuyenMaiDTO km = layMotKhuyenMai(maKM);
                    if (km != null) {
                        ctkmBUS.xoaCTKMTheoMaKhuyenMai(maKM);
                        kmBUS.xoaKhuyenMaiBUS(maKM);
                        hienThiDuLieu();
                        panelControl.resetForm();

                        JOptionPane.showMessageDialog(null, "Xóa thành công!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Không tìm thấy khuyến mãi cần xóa.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn một khuyến mãi để xóa.");
                }
            }
        });
        
        panelControl.addTimKiemListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String tuKhoa = panelControl.getTxtTimKiem().getText().trim();
                if (!tuKhoa.isEmpty()) {
                    ArrayList<KhuyenMaiDTO> kq = TimKiemTable.danhSachTimKiemTheoTenKM(tuKhoa, dsKhuyenMai);
                    HienThiTable.taiDuLieuTableKhuyenMai(panelKhuyenMaiTable.getModel(), kq);
                } else {
                    hienThiDuLieu();
                }
            }
        });
        
        panelControl.addShowPopupMaHanhTrinh(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelControl.getTxtMaHanhTrinh().setText("");
                panelControl.showPopupMaHanhTrinh();
                hienThiHanhTrinhLenPopup();
            }
        });
        
        panelControl.getBangLayMa().addRowClickPopup(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                String maHT = panelControl.getBangLayMa().getMyTable()
                        .getValueAt(panelControl.getBangLayMa().getMyTable().getSelectedRow(), 0).toString();
                panelControl.getTxtMaHanhTrinh().setText(maHT);
            }
        });
        
        panelControl.getBangLayMa().addSearchPopupListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String tuKhoa = panelControl.getBangLayMa().getTxtSearch().getText();
                ArrayList<HanhTrinhDTO> hanhTrinh = TimKiemTable.danhSachTimTheoTenHanhTrinh(tuKhoa, new HanhTrinhBUS().getDanhSachHanhTrinhBUS());
                DefaultTableModel modelTimKiem = panelControl.getBangLayMa().getModel();
                HienThiTable.taiDuLieuTableHanhTrinh(modelTimKiem, hanhTrinh);
                
            }
        });
    }
}
