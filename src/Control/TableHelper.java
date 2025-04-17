package Control;

import DTO.ChuyenBayDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class ChuyenBayTableHelper {
    public static void taiDuLieuTableChuyenBay (DefaultTableModel model, ArrayList<ChuyenBayDTO> dsChuyenBay) {
        model.setRowCount(0);
        for(ChuyenBayDTO cb : dsChuyenBay) {
            Vector row = new Vector();
            row.add(cb.getMaChuyenBay());
            row.add(cb.getNgayXuatPhat());
            row.add(cb.getNgayDenNoi());
            row.add(cb.getGiaThuong());
            row.add(cb.getGiaVip());
            row.add(cb.getTrangThaiChuyenBay());
            row.add(cb.getMaMayBay());
            row.add(cb.getMaHanhTrinh());
            model.addRow(row);
        }
    }
}
