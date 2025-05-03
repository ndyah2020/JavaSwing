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
//    private ArrayList<KhuyenMaiDTO> dsKhuyenMai;
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
    
    public void hienThiCTKM(String maKM) {
        ArrayList<CTKhuyenMaiDTO> dsCTKM = ctkmBUS.getDanhSachTheoMaKhuyenMai(maKM);
        HienThiTable.taiDuLieuTableCTKhuyenMai(panelCTKhuyenMaiTable.getModel(), dsCTKM);
        panelCTKhuyenMaiTable.getMyTable().setModel(panelCTKhuyenMaiTable.getModel());
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
                try {
                    int kmRow = panelKhuyenMaiTable.getMyTable().getSelectedRow();
                    if (kmRow == -1) return;
                    String maKM = panelKhuyenMaiTable.getMyTable().getValueAt(kmRow, 0).toString();
                    KhuyenMaiDTO km = kmBUS.layMotKhuyenMai(maKM);
                    CTKhuyenMaiDTO ct0 = ctkmBUS.getDanhSachTheoMaKhuyenMai(maKM)
                                        .stream().findFirst().orElse(null);
//                    panelControl.getTxtMaKhuyenMai().setText(km.getMaKhuyenMai());
//                    panelControl.getTxtTenKhuyenMai().setText(km.getTenKhuyenMai());
//                    panelControl.getTxtPhanTramKhuyenMai().setText(km.getPhanTramGiamGia());
//                    panelControl.setNgayBatDau(km.getNgayBatDau());
//                    panelControl.setNgayKetThuc(km.getNgayKetThuc());
//                    panelControl.getTxtMaHanhTrinh().setText(ct0!=null?ct0.getMaHanhTrinh():"");
//                    panelControl.getTxtMaKhuyenMai().setEditable(true);
//                    hienThiCTKM(maKM);
                    setForm(km, ct0);            
                    ArrayList<CTKhuyenMaiDTO> dsCT = ctkmBUS.getDanhSachTheoMaKhuyenMai(maKM);
                    HienThiTable.taiDuLieuTableCTKhuyenMai(panelCTKhuyenMaiTable.getModel(), dsCT);
                    panelCTKhuyenMaiTable.getMyTable().setModel(panelCTKhuyenMaiTable.getModel());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        panelCTKhuyenMaiTable.addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    int ctRow = panelCTKhuyenMaiTable.getMyTable().getSelectedRow();
                    if (ctRow == -1) return;
                    String maHT = panelCTKhuyenMaiTable.getMyTable()
                                    .getValueAt(ctRow, 1).toString();
                    panelControl.getTxtMaHanhTrinh().setText(maHT);
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
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
                        panelControl.resetForm();
                        JOptionPane.showMessageDialog(null, "Thêm thành công!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Không thể thêm chi tiết khuyến mãi!");
                    }  
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        panelControl.addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int ctkmRow = panelCTKhuyenMaiTable.getMyTable().getSelectedRow();
                    int kmRow = panelKhuyenMaiTable.getMyTable().getSelectedRow();

                    if (ctkmRow != -1) {
                        // Xử lý sửa chi tiết khuyến mãi
                        String maCT = panelCTKhuyenMaiTable.getMyTable().getValueAt(ctkmRow, 0).toString();
                        String maHT = panelControl.getTxtMaHanhTrinh().getText().trim();
                        String maKM = panelControl.getTxtMaKhuyenMai().getText().trim();

                        boolean conflict = ctkmBUS.getDanhSachTheoMaKhuyenMai(maKM)
                                .stream()
                                .anyMatch(ct -> ct.getMaHanhTrinh().equals(maHT) && !ct.getMaCTKhuyenMai().equals(maCT));

                        if (conflict) {
                            JOptionPane.showMessageDialog(null, "Hành trình này đã có trong chi tiết khuyến mãi!");
                            return;
                        }

                        CTKhuyenMaiDTO ct = new CTKhuyenMaiDTO(maCT, maHT, maKM);

                        if (ctkmBUS.suaCTKhuyenMaiBUS(ct)) {
                            hienThiCTKM(maKM);
                            JOptionPane.showMessageDialog(null, "Cập nhật chi tiết thành công!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Lỗi cập nhật chi tiết!");
                        }
                        return;
                    }

                    if (kmRow != -1) {
                        // Xử lý sửa khuyến mãi
                        String maKMCu = panelKhuyenMaiTable.getMyTable().getValueAt(kmRow, 0).toString();
                        String maKMMoi = panelControl.getTxtMaKhuyenMai().getText().trim();
                        String tenKM = panelControl.getTxtTenKhuyenMai().getText().trim();
                        Date nbd = panelControl.getNgayBatDau();
                        Date nkt = panelControl.getNgayKetThuc();
                        String ptgg = panelControl.getTxtPhanTramKhuyenMai().getText().trim();

                        if (!maKMCu.equals(maKMMoi)) {
                            JOptionPane.showMessageDialog(null,
                                "Không thể sửa mã khuyến mãi! Vui lòng xóa và tạo lại khuyến mãi nếu cần thay đổi mã.");
                            return;
                        }

                        KhuyenMaiDTO km = new KhuyenMaiDTO(maKMMoi, tenKM, nbd, nkt, ptgg);
                        if (!kmBUS.suaKhuyenMaiBUS(km)) {
                            JOptionPane.showMessageDialog(null, "Lỗi cập nhật thông tin khuyến mãi!");
                            return;
                        }

                        hienThiKhuyenMai();
                        panelControl.resetForm();
                        JOptionPane.showMessageDialog(null, "Cập nhật thông tin khuyến mãi thành công!");
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Có lỗi xảy ra khi cập nhật!");
                }        
            }
        });
    
        panelControl.addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
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
                            return;
                        } 
                    } 

                    if (kmRow != -1) {
                        if (panelCTKhuyenMaiTable.getModel().getRowCount() > 0) {
                            JOptionPane.showMessageDialog(null,
                              "Không thể xóa khuyến mãi vì còn chi tiết đang hiển thị!");
                            return;
                        }

                        String maKM = panelKhuyenMaiTable.getMyTable().getValueAt(kmRow,0).toString();
                        kmBUS.xoaKhuyenMaiBUS(maKM);
                        hienThiKhuyenMai();
                        JOptionPane.showMessageDialog(null, "Xóa khuyến mãi thành công!");
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        panelControl.addTimKiemListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    String tuKhoa = panelControl.getTxtTimKiem().getText().trim();
                    if (!tuKhoa.isEmpty()) {
                        ArrayList<KhuyenMaiDTO> kq = kmBUS.danhSachTimKiemTheoTenKM(tuKhoa);
                        HienThiTable.taiDuLieuTableKhuyenMai(
                                panelKhuyenMaiTable.getModel(), kq
                        );
                    } else {
                        hienThiKhuyenMai();
                    }
                } catch(Exception ex) {
                    ex.printStackTrace();
                } 
            }
        });
        
        panelControl.addTimKiemNangCaoListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String  maKMTimKiem = panelControl.getTxtTimKiemMaKhuyenMai().getText().trim();
                    String tenKMTimKiem = panelControl.getTxtTimKiemTenKhuyenMai().getText().trim();
                    Date ngayBDTimKiem = panelControl.getTimKiemNgayBatDau();
                    Date ngayKTTimKiem = panelControl.getTimKiemNgayKetThuc();
                    
                    if (maKMTimKiem.isEmpty() && tenKMTimKiem.isEmpty() && ngayBDTimKiem == null && ngayKTTimKiem == null) {
                        JOptionPane.showMessageDialog(null, 
                                                    "Vui lòng nhập ít nhất một tiêu chí để tìm kiếm.", 
                                                    "Thiếu thông tin",
                                                    JOptionPane.INFORMATION_MESSAGE
                        );
                        return;
                    }

                    // danh sách tìm thấy
                    ArrayList<KhuyenMaiDTO> danhSachTimThay = kmBUS.danhSachTimKiemNangCao(maKMTimKiem, tenKMTimKiem, ngayBDTimKiem, ngayKTTimKiem);
                    
                    DefaultTableModel model = panelKhuyenMaiTable.getModel();
                    HienThiTable.taiDuLieuTableKhuyenMai(model, danhSachTimThay);
                    panelKhuyenMaiTable.getMyTable().setModel(model);
                    
                    if (danhSachTimThay.isEmpty()) {
                        JOptionPane.showMessageDialog(null, 
                                                    "Không tìm thấy kết quả phù hợp.",
                                                    "Kết quả tìm kiếm",
                                                    JOptionPane.INFORMATION_MESSAGE
                        );
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                                    "Tìm thấy " + danhSachTimThay.size() + "kết quả.",
                                                    "Kết quả tìm kiếm",
                                                    JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                    
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(null, 
                                                "Có lỗi xảy ra khi tìm kiếm:\n" + ex.getMessage(),
                                                "Lỗi", 
                                                JOptionPane.ERROR_MESSAGE
                    );
                    ex.printStackTrace();
                }
            }
        });
        
        panelControl.addReloadFormLisener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                panelControl.resetForm();

                ArrayList<KhuyenMaiDTO> all = kmBUS.getDanhSachKhuyenMai();
                DefaultTableModel model = panelKhuyenMaiTable.getModel();
                HienThiTable.taiDuLieuTableKhuyenMai(model, all);
                panelKhuyenMaiTable.getMyTable().setModel(model);

                panelCTKhuyenMaiTable.getModel().setRowCount(0);
                JOptionPane.showMessageDialog(null, "Đã làm mới khuyến mãi.");
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Lỗi khi làm mới: " + ex.getMessage());
            }
                }
        });
        
        panelControl.addShowPopupMaHanhTrinh(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    panelControl.getTxtMaHanhTrinh().setText("");
                    panelControl.showPopupMaHanhTrinh();
                    hienThiHanhTrinhLenPopup();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        panelControl.getBangLayMa().addRowClickPopup(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    String maHT = panelControl.getBangLayMa().getMyTable()
                     .getValueAt(panelControl.getBangLayMa().getMyTable().getSelectedRow(), 0).toString();
                    panelControl.getTxtMaHanhTrinh().setText(maHT);
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        panelControl.getBangLayMa().addSearchPopupListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    String tuKhoa = panelControl.getBangLayMa().getTxtSearch().getText();
                    ArrayList<HanhTrinhDTO> hanhTrinh = hanhTrinhBUS.danhSachTimTheoTenHanhTrinh(tuKhoa);
                    DefaultTableModel modelTimKiem = panelControl.getBangLayMa().getModel();
                    HienThiTable.taiDuLieuTableHanhTrinh(modelTimKiem, hanhTrinh);
                } catch(Exception ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
}
