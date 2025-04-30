package Control;

import BUS.TaiKhoanBUS;
import DTO.TaiKhoanDTO;
import GUI.forms.TaiKhoanControlForm;
import GUI.forms.TaiKhoanPanelForm;
import GUI.forms.TaiKhoanTableForm;
import GUI.forms.ThongTinNhanVienForm;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class TaiKhoanController {
    private final TaiKhoanControlForm panelControl;
    private final TaiKhoanTableForm panelTable;
    private final ThongTinNhanVienForm panelThongTin;
    private final TaiKhoanBUS taiKhoanBUS = new TaiKhoanBUS();
    private ArrayList<TaiKhoanDTO> dsTaiKhoan;
    public TaiKhoanController(TaiKhoanPanelForm panel) {
        this.panelControl = panel.getTaiKhoanControlForm();
        this.panelTable = panel.getTaiKhoanTableForm();
        this.panelThongTin = panel.getThongTinNhanVienForm();
    }
    
    public void layDanhSachTaiKhoan() {
        DefaultTableModel model = panelTable.getModel();
        dsTaiKhoan = taiKhoanBUS.getDanhSachTaiKhoan();
        HienThiTable.taiDuLieuTaiKhoan(model, dsTaiKhoan);
        panelTable.getMyTable().setModel(model);
    }
    public void  xuLySuKien() {
        panelTable.addRowClickListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
    }
}
