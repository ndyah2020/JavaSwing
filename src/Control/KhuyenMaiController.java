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
    private final HanhTrinhBUS hanhTrinhBUS  = new HanhTrinhBUS();
;//    private ArrayList<KhuyenMaiDTO> dsKhuyenMai;
//    private ArrayList<CTKhuyenMaiDTO> dsCTKhuyenMai;
    
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
    
    public void hienThiKhuyenMai() {
        ArrayList<KhuyenMaiDTO> dsKhuyenMai = kmBUS.getDanhSachKhuyenMai();
        HienThiTable.taiDuLieuTableKhuyenMai(panelKhuyenMaiTable.getModel(), dsKhuyenMai);
        panelKhuyenMaiTable.getMyTable().setModel(panelKhuyenMaiTable.getModel());
        panelCTKhuyenMaiTable.getModel().setRowCount(0);
    }
    
    private KhuyenMaiDTO layMotKhuyenMai(String maKM) {
        for (KhuyenMaiDTO km : kmBUS.getDanhSachKhuyenMai()) {
            if (km.getMaKhuyenMai().equals(maKM)) return km;
        }
        return null;
    }
    
    private CTKhuyenMaiDTO layMotCTKhuyenMai(String maCT) {
        for (CTKhuyenMaiDTO ct : ctkmBUS.getDanhSachChiTietKhuyenMai()) {
            if (ct.getMaKhuyenMai().equals(maCT)) return ct;
        }
        return null;
    }
    
//    private String generateMaCTKhuyenMai() {
//        return "CTKM-" + UUID.randomUUID().toString().substring(0,6).toUpperCase();
//    }   
    
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
                int kmRow = panelKhuyenMaiTable.getMyTable().getSelectedRow();
                if (kmRow == -1) return;
                String maKM = panelKhuyenMaiTable.getMyTable().getValueAt(kmRow, 0).toString();
                KhuyenMaiDTO km = kmBUS.layMotKhuyenMai(maKM);
//                panelControl.getTxtMaKhuyenMai().setText(km.getMaKhuyenMai());
//                panelControl.getTxtTenKhuyenMai().setText(km.getTenKhuyenMai());
//                panelControl.getTxtPhanTramKhuyenMai().setText(km.getPhanTramGiamGia());
//                panelControl.setNgayBatDau(km.getNgayBatDau());
//                panelControl.setNgayKetThuc(km.getNgayKetThuc());
                CTKhuyenMaiDTO ct0 = ctkmBUS.getDanhSachTheoMaKhuyenMai(maKM)
                                        .stream().findFirst().orElse(null);
                setForm(km, ct0);
                
                ArrayList<CTKhuyenMaiDTO> dsCT = ctkmBUS.getDanhSachTheoMaKhuyenMai(maKM);
                HienThiTable.taiDuLieuTableCTKhuyenMai(panelCTKhuyenMaiTable.getModel(), dsCT);
                panelCTKhuyenMaiTable.getMyTable().setModel(panelCTKhuyenMaiTable.getModel());
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
                
                if (maKM.isEmpty() || tenKM.isEmpty() || ptgg.isEmpty() || nbd==null || nkt==null || maHT.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đủ thông tin và chọn hành trình.");
                    return;
                }

                KhuyenMaiDTO km = new KhuyenMaiDTO(maKM, tenKM, nbd, nkt, ptgg);
                if (!kmBUS.themKhuyenMaiBUS(km)) {
                JOptionPane.showMessageDialog(null, "Không thể thêm khuyến mãi!");
                return;
    }
                
                if (ctkmBUS.kiemTraTonTaiVoiMaHanhTrinh(maKM, maHT)) {
                    JOptionPane.showMessageDialog(null, "Chi tiết khuyến mãi đã tồn tại cho hành trình này!");
                    return;
                } 
                
                CTKhuyenMaiDTO ct = new CTKhuyenMaiDTO(
                    "CTKM-" + UUID.randomUUID().toString().substring(0,6).toUpperCase(),
                    maHT, maKM
                );
                
                if (ctkmBUS.themCTKhuyenMaiBUS(ct)) {
                    hienThiKhuyenMai();
                    hienThiKhuyenMai();
                    panelControl.resetForm();
                    JOptionPane.showMessageDialog(null, "Thêm thành công!");
                } else {
                    JOptionPane.showMessageDialog(null, "Không thể thêm chi tiết khuyến mãi!");
                }  
            }
        });
        
        panelControl.addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ctkmRow = panelCTKhuyenMaiTable.getMyTable().getSelectedRow();
                int kmRow = panelKhuyenMaiTable.getMyTable().getSelectedRow();
                
                if (ctkmRow != -1) {
//                    panelControl.getTxtMaHanhTrinh().setEditable(true);
                    String maCT = panelCTKhuyenMaiTable.getMyTable().getValueAt(ctkmRow, 0).toString();
                    String maHT = panelControl.getTxtMaHanhTrinh().getText().trim();
                    String maKM = panelControl.getTxtMaKhuyenMai().getText().trim();
                    
                    boolean conflict = ctkmBUS.getDanhSachTheoMaKhuyenMai(maKM)
                        .stream()
                        .anyMatch(ct ->
                            ct.getMaHanhTrinh().equals(maHT)
                            && !ct.getMaCTKhuyenMai().equals(maCT)
                        );
                    if (conflict) {
                        JOptionPane.showMessageDialog(null,
                          "Hành trình này đã có trong chi tiết khuyến mãi rồi!");
                        return;
                    }
                    
                    CTKhuyenMaiDTO ct = new CTKhuyenMaiDTO(maCT, maHT, maKM);
                    
                    if (ctkmBUS.suaCTKhuyenMaiBUS(ct)) {
                        ArrayList<CTKhuyenMaiDTO> ds = ctkmBUS.getDanhSachTheoMaKhuyenMai(maKM);
                        HienThiTable.taiDuLieuTableCTKhuyenMai(panelCTKhuyenMaiTable.getModel(), ds);
                        JOptionPane.showMessageDialog(null, "Cập nhật chi tiết thành công!");
                        return;

                    }
//                    panelControl.getTxtMaHanhTrinh().setEditable(false);
                } else if (kmRow != -1) {
                    String maKM = panelControl.getTxtMaKhuyenMai().getText().trim();
                    String tenKM = panelControl.getTxtTenKhuyenMai().getText().trim();
                    String ptgg = panelControl.getTxtPhanTramKhuyenMai().getText().trim();
                    Date nbd = panelControl.getNgayBatDau();
                    Date nkt = panelControl.getNgayKetThuc();
                    KhuyenMaiDTO km = new KhuyenMaiDTO(maKM, tenKM, nbd, nkt, ptgg);
                    if (kmBUS.suaKhuyenMaiBUS(km)) {
                        HienThiTable.taiDuLieuTableKhuyenMai(
                                panelKhuyenMaiTable.getModel(), 
                                kmBUS.getDanhSachKhuyenMai()
                        );
                        JOptionPane.showMessageDialog(null, "Cập nhật khuyến mãi thành công!");
                    }
                    return;
                }
                JOptionPane.showMessageDialog(null, "Vui lòng chọn một chi tiết để sửa, hoặc nếu muốn sửa khuyến mãi thì chọn một khuyến mãi.");
//                String maKM = panelControl.getTxtMaKhuyenMai().getText().trim();
//                KhuyenMaiDTO km = layMotKhuyenMai(maKM);
//                CTKhuyenMaiDTO ct = layMotCTKhuyenMai(maKM);
//                if (km != null && ct != null) {
//                    km.setTenKhuyenMai(panelControl.getTxtTenKhuyenMai().getText().trim());
//                    km.setPhanTramGiamGia(panelControl.getTxtPhanTramKhuyenMai().getText().trim());
//                    km.setNgayBatDau(panelControl.getNgayBatDau());
//                    km.setNgayKetThuc(panelControl.getNgayKetThuc());
//
//                    ct.setMaHanhTrinh(panelControl.getTxtMaHanhTrinh().getText().trim());
//
//                    kmBUS.suaKhuyenMaiBUS(km);
//                    ctkmBUS.suaCTKhuyenMaiBUS(ct);
//                    hienThiDuLieu();
//                    panelControl.resetForm();
//                    JOptionPane.showMessageDialog(null, "Cập nhật thành công!");
//                }
            }
        });
        
        panelControl.addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ctkmRow = panelCTKhuyenMaiTable.getMyTable().getSelectedRow();
                int kmRow = panelKhuyenMaiTable.getMyTable().getSelectedRow();
                if (ctkmRow != -1) {
                    String maCT = panelCTKhuyenMaiTable.getMyTable().getValueAt(ctkmRow, 0).toString();
                    if (ctkmBUS.xoaCTKhuyenMaiBUS(maCT)) {
                        String maKM = panelControl.getTxtMaKhuyenMai().getText().trim();
                        ArrayList<CTKhuyenMaiDTO> ds = ctkmBUS.getDanhSachTheoMaKhuyenMai(maKM);
                        HienThiTable.taiDuLieuTableCTKhuyenMai(
                                panelCTKhuyenMaiTable.getModel(), ds
                        );
                        JOptionPane.showMessageDialog(null, "Xóa chi tiết thành công!");
                    } 
                } else if (kmRow != -1) {
                    String maKM = panelKhuyenMaiTable.getMyTable().getValueAt(kmRow, 0).toString();
                    ctkmBUS.xoaCTKMTheoMaKhuyenMai(maKM);
                    kmBUS.xoaKhuyenMaiBUS(maKM);
                    hienThiKhuyenMai();
                    panelControl.resetForm();
                    JOptionPane.showMessageDialog(null, "Xóa khuyến mãi và tất cả chi tiết thành công!");
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn chi tiết hoặc khuyến mãi để xóa.");
                } 
            }
        });
        
        panelControl.addTimKiemListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String tuKhoa = panelControl.getTxtTimKiem().getText().trim();
                if (!tuKhoa.isEmpty()) {
                    ArrayList<KhuyenMaiDTO> kq = kmBUS.danhSachTimKiemTheoTenKM(tuKhoa);
                    HienThiTable.taiDuLieuTableKhuyenMai(
                            panelKhuyenMaiTable.getModel(), kq
                    );
                } else {
                    hienThiKhuyenMai();
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
                ArrayList<HanhTrinhDTO> hanhTrinh = hanhTrinhBUS.danhSachTimTheoTenHanhTrinh(tuKhoa);
                DefaultTableModel modelTimKiem = panelControl.getBangLayMa().getModel();
                HienThiTable.taiDuLieuTableHanhTrinh(modelTimKiem, hanhTrinh);
                
            }
        });
    }
}
