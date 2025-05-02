
package Control;
import GUI.forms.DatVeControlForm;
import GUI.forms.DatVePanelForm;
import GUI.forms.DatVeTableForm;
import GUI.forms.DatVeTableThemForm;
import GUI.forms.KhachHangForm;
import GUI.forms.ThongTinDatVeForm;


public class DatVeController {
    private DatVeControlForm panelControl;
    private DatVeTableForm panelTable;
    private DatVeTableThemForm panelTableThem;
    private KhachHangForm panelFormKH;
    private ThongTinDatVeForm panelDatVe;
    
    public DatVeController(DatVePanelForm panel) {
        this.panelControl = panel.getDatVeControlForm();
        this.panelTable = panel.getDatVeTableForm();
        this.panelTableThem = panel.getDatVeTableThemForm();
        this.panelFormKH = panel.getKhachHangForm();
        this.panelDatVe = panel.getThongTinDatVeForm();
    }
    
    public void layDanhSachChuyenBayVaVe() {
        
    }
    
    public void xuLySuKien() {
        panelDatVe.addShowPopopMaVe((e) -> {
            panelDatVe.showPopBangLayMaVe();
        });
        
        
    }
}
