package Control;

import BUS.NhanVienBUS;
import DTO.NhanVienDTO;
import GUI.forms.NhanVienControlForm;
import GUI.forms.NhanVienForm;
import GUI.forms.NhanVienPanelForm;
import GUI.forms.NhanVienTableForm;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class NhanVienController {
    private final NhanVienForm panelForm;
    private final NhanVienControlForm panelControl;
    private final NhanVienTableForm pannelTable;
    private final NhanVienBUS nhanVienBUS = new NhanVienBUS();
    private ArrayList<NhanVienDTO> dsNhanVien;
    public NhanVienController(NhanVienPanelForm panel) {
        this.panelForm = panel.getNhanVienForm();
        this.panelControl = panel.getNhanVienControlForm();
        this.pannelTable = panel.getNhanVienTableForm();
    }
    
    public void layDanhSachNhanvien() {
        DefaultTableModel model = pannelTable.getModel();
        dsNhanVien = nhanVienBUS.getDanhSachNhanVien();
        HienThiTable.taiDuLieuTableNhanVien(model, dsNhanVien);
        pannelTable.getMyTable().setModel(model);
    }
    
    public void xuLySuKien() {
        
    }
}
