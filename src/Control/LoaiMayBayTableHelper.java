package Control;

import DTO.LoaiMayBayDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class LoaiMayBayTableHelper {
    public static void taiDuLieuLenLoaiMayBayLenTable (DefaultTableModel model, ArrayList<LoaiMayBayDTO> danhSach) {
        model.setRowCount(0);
        for (LoaiMayBayDTO lmb : danhSach) {
            Vector<String> row = new Vector<>();
            row.add(lmb.getMaLoai());
            row.add(lmb.getTenLoai());
            row.add(Float.toString(lmb.getHeSoGiaThuong()));
            row.add(Float.toString(lmb.getHeSoGiaVip()));
            model.addRow(row);
        }
    }
}
