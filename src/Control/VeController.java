package Control;

import BUS.VeBUS;
import DTO.VeDTO;
import GUI.forms.ThongTinChuyenbayForm;
import GUI.forms.VePanelForm;
import GUI.forms.VeTableForm;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class VeController {
    private ArrayList<VeDTO> dsVe;
    private final ThongTinChuyenbayForm panelForm;
    private final VeTableForm tableForm;
    
    public VeController(VePanelForm panel) {
        this.panelForm = panel.getThongTinChuyenbayForm();
        this.tableForm = panel.getVeTableForm();
    }
    
    public void layDanhSachVe() {
        DefaultTableModel modelDs = tableForm.getModel();
        VeBUS bus = new VeBUS();
        dsVe = bus.getDanhSachVe();
        HienThiTable.taiDuLieuTableVe(modelDs, dsVe);
        tableForm.getMyTable().setModel(modelDs);
    }
    
    public void xuLySuKien() {
        
    }
}
