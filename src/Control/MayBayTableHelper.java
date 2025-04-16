package Control;

import DTO.MayBayDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class MayBayTableHelper {
    public static void taiDuLieuMayBayLenBang(DefaultTableModel model, ArrayList<MayBayDTO> danhSachMayBay) {
        model.setRowCount(0);
        for(MayBayDTO mb : danhSachMayBay) {
            Vector row = new Vector();
            row.add(mb.getMaMayBay());
            row.add(mb.getTenMayBay());
            row.add(mb.getSoLuongGheThuong());
            row.add(mb.getSoLuongGheVip());
            row.add(mb.getTongSoLuongGhe());
            row.add(mb.getMaLoaiMayBay());
            model.addRow(row);
        }
    }
}
