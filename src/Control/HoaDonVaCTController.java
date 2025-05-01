package Control;

import GUI.forms.HoaDonCTTableForm;
import GUI.forms.HoaDonControlForm;
import GUI.forms.HoaDonPanelForm;
import GUI.forms.HoaDonTableForm;
import GUI.forms.ThongTinKhachHangForm;
import GUI.forms.ThongTinNhanVienForm;

public class HoaDonVaCTController {
    private final HoaDonCTTableForm panelTableCT;
    private final HoaDonTableForm panelTable;
    private final HoaDonControlForm panelControl;
    private final ThongTinNhanVienForm panelThongTinNV;
    private final ThongTinKhachHangForm panelThongTinKH;
            
    public HoaDonVaCTController(HoaDonPanelForm panel) {
        this.panelTableCT = panel.getHoaDonCTTableForm();
        this.panelTable = panel.getHoaDonTableForm();
        this.panelControl = panel.getHoaDonControlForm();
        this.panelThongTinNV = panel.getThongTinNhanVienForm();
        this.panelThongTinKH = panel.getThongTinKhachHangForm();
    }
    
    
}
