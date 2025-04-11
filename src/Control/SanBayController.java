package Control;

import BUS.SanBayBUS;
import DTO.SanBayDTO;
import GUI.forms.SanBayPanelForm;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SanBayController {
    private ArrayList<SanBayDTO> dsSanBay;
    private SanBayPanelForm sanBayPanel;
    
    public SanBayController(SanBayPanelForm panel) {
        this.sanBayPanel = panel;
    }
    
    public void hienThiDanhSachSanBay() {
        DefaultTableModel model = sanBayPanel.getSanBayTableForm().getModel();
        model.setRowCount(0);
        SanBayBUS sanBayBUS = new SanBayBUS();
        dsSanBay = sanBayBUS.getDanhSachSanBay();
        
        for(SanBayDTO sb: dsSanBay){
            Vector<String> row = new Vector<>();
            row.add(sb.getMaSanBay());
            row.add(sb.getTenSanBay());
            row.add(sb.getDiaChi());
            model.addRow(row);
        }
        sanBayPanel.getSanBayTableForm().getMyTable().setModel(model);
    }
}
