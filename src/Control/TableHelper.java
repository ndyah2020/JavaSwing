package Control;

import DTO.ChuyenBayDTO;
import DTO.HanhTrinhDTO;
import DTO.LoaiMayBayDTO;
import DTO.MayBayDTO;
import DTO.SanBayDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class TableHelper {
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
    
    public static void taiDuLieuLenTabelSanBay(DefaultTableModel model, ArrayList<SanBayDTO> danhSach) {
        model.setRowCount(0);
        for (SanBayDTO sb : danhSach) {
            Vector<String> row = new Vector<>();
            row.add(sb.getMaSanBay());
            row.add(sb.getTenSanBay());
            row.add(sb.getDiaChi());
            model.addRow(row);
        }
    }
    
    public static void taiDuLieuTabelMayBay(DefaultTableModel model, ArrayList<MayBayDTO> danhSachMayBay) {
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
    
    public static void taiDuLieuTableLoaiMayBay(DefaultTableModel model, ArrayList<LoaiMayBayDTO> danhSach) {
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
    
    public static void taiDuLieuTableHanhTrinh(DefaultTableModel model, ArrayList<HanhTrinhDTO> danhSach) {
        model.setRowCount(0);
        for (HanhTrinhDTO ht : danhSach) {
            Vector row = new Vector();
            row.add(ht.getMaHanhTrinh());
            row.add(ht.getTenHanhTrinh());
            row.add(ht.getSanBayDi());
            row.add(ht.getSanBayDen());
            row.add(ht.getGiaCoBan());
            model.addRow(row);
        }
    }
}
