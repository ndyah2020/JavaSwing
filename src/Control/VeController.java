package Control;

import BUS.ChuyenBayBUS;
import BUS.VeBUS;
import DTO.ChuyenBayDTO;
import DTO.VeDTO;
import GUI.forms.ThongTinChuyenbayForm;
import GUI.forms.VeControlForm;
import GUI.forms.VePanelForm;
import GUI.forms.VeTableForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VeController {
    private ArrayList<VeDTO> dsVe;
    private final ThongTinChuyenbayForm panelForm;
    private final VeTableForm panelTable;
    private final VeControlForm panelControl;
    private final VeBUS veBUS = new VeBUS();
    private final ChuyenBayBUS chuyenBayBUS = new ChuyenBayBUS();
    public VeController(VePanelForm panel) {
        this.panelForm = panel.getThongTinChuyenbayForm();
        this.panelTable = panel.getVeTableForm();
        this.panelControl = panel.getVeControlForm();
    }
    
    public void layDanhSachVe() {
        DefaultTableModel modelDs = panelTable.getModel();       
        dsVe = veBUS.getDanhSachVe();
        HienThiTable.taiDuLieuTableVe(modelDs, dsVe);
        panelTable.getMyTable().setModel(modelDs);
    }
    
    public void xuLySuKien() {
        panelTable.addRowClick(new MouseAdapter() {          
            public void mouseClicked(MouseEvent e) {
                int row = panelTable.getMyTable().getSelectedRow();
                if(row != -1) {
                    String maChuyenBay = panelTable.getMyTable().getValueAt(row, 4).toString();
                    ChuyenBayDTO chuyenBay = chuyenBayBUS.layMotChuyenBay(maChuyenBay);
                    if(chuyenBay != null) {
                        panelForm.clearForm();
                        panelForm.getCtMaChuyenBay().setText(chuyenBay.getMaChuyenBay());
                        panelForm.getCtNgayXuatPhat().setText(chuyenBay.getNgayXuatPhat().toString());
                        panelForm.getCtGioXuatPhat().setText(chuyenBay.getGioXuatPhat().toString());
                        panelForm.getCtNgayDen().setText(chuyenBay.getNgayDenNoi().toString());
                        panelForm.getCtGioDen().setText(chuyenBay.getGioDenNoi().toString());
                        panelForm.getCtTongSoLuongGhe().setText(""+chuyenBay.getTongSoLuongGhe());
                    }
                }
            }
        });
      
        ItemListener cmbListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    int indexGiaVeTu = panelControl.getCmbGiaVeTu().getSelectedIndex();
                    int indexGiaVeDen = panelControl.getCmbGiaVeDen().getSelectedIndex();
                    int indexLoaiVe = panelControl.getCmbLoaiVe().getSelectedIndex();
                    if (indexGiaVeTu > 0 || indexGiaVeDen > 0 || indexLoaiVe > 0) {
                        DefaultTableModel model = panelTable.getModel();
                        int giaVeTu = -1;
                        int giaVeDen = -1;
                        if (indexGiaVeTu > 0 && indexGiaVeDen > 0) {
                            try {
                                giaVeTu = Integer.parseInt(panelControl.getCmbGiaVeTu().getSelectedItem().toString());
                                giaVeDen = Integer.parseInt(panelControl.getCmbGiaVeDen().getSelectedItem().toString());
                            } catch (NumberFormatException evt) {
                                JOptionPane.showMessageDialog(null, "Lỗi Định dạng ");
                            }
                        }
                        HienThiTable.taiDuLieuTableVe(model, veBUS.locDanhSachVe(giaVeTu, giaVeDen, indexLoaiVe));
                    }else {
                        layDanhSachVe();
                    }                  
                }
            }
        };
        
        panelControl.addCmbGiaVeTuListener(cmbListener);
        panelControl.addCmbGiaVeDenListener(cmbListener);
        panelControl.addCmbLoaiVeListener(cmbListener);
       
        panelControl.addtxtSearch(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String tukhoa = panelControl.getTxtSearch().getText();
                if (!tukhoa.isEmpty()) {
                    int loaiTimKiem = panelControl.getCmbLoaiTimKiem().getSelectedIndex();
                    DefaultTableModel model = panelTable.getModel();
                    switch (loaiTimKiem) {
                        case 1:
                            //Ma chuyen bau
                            HienThiTable.taiDuLieuTableVe(model, veBUS.timKiemVeTheoMaChuyenBay(tukhoa));
                            break;
                        case 2:
                            //Trang thai ve\
                            HienThiTable.taiDuLieuTableVe(model, veBUS.timKiemTheoTrangThai(tukhoa));
                            break;
                        case 3:
                            //Loai ve
                            HienThiTable.taiDuLieuTableVe(model, veBUS.timKiemVeTheoLoaiVe(tukhoa));
                            break;
                        default:
                            HienThiTable.taiDuLieuTableVe(model, veBUS.timKiemToanCucVer2(tukhoa));
                    }
                } else {
                    layDanhSachVe();
                }
                
            }
        });
    }
}
