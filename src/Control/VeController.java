package Control;

import BUS.ChuyenBayBUS;
import BUS.VeBUS;
import DTO.ChuyenBayDTO;
import DTO.VeDTO;
import GUI.forms.ThongTinChuyenbayForm;
import GUI.forms.VePanelForm;
import GUI.forms.VeTableForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class VeController {
    private ArrayList<VeDTO> dsVe;
    private final ThongTinChuyenbayForm panelForm;
    private final VeTableForm panelTable;
    private final VeBUS veBUS = new VeBUS();
    private final ChuyenBayBUS chuyenBayBUS = new ChuyenBayBUS();
    public VeController(VePanelForm panel) {
        this.panelForm = panel.getThongTinChuyenbayForm();
        this.panelTable = panel.getVeTableForm();
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
    }
}
