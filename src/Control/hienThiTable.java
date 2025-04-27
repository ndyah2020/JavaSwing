package Control;

import DTO.CTKhuyenMaiDTO;
import DTO.ChuyenBayDTO;
import DTO.HanhTrinhDTO;
import DTO.KhuyenMaiDTO;
import DTO.LoaiMayBayDTO;
import DTO.MayBayDTO;
import DTO.NhanVienDTO;
import DTO.SanBayDTO;
import DTO.VeDTO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class HienThiTable {
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
    
    public static void taiDuLieuTableVe(DefaultTableModel model, ArrayList<VeDTO> danhSach) {
        model.setRowCount(0);
        for(VeDTO ve : danhSach) {
            Vector row = new Vector();
            row.add(ve.getMaVe());
            row.add(ve.getTrangThaiVe());
            row.add(ve.getGiaVe());
            row.add(ve.getLoaiVe());
            row.add(ve.getChuyenBay());
            model.addRow(row);  
        }
    }
    
    public static void taiDuLieuTableKhuyenMai(DefaultTableModel model, ArrayList<KhuyenMaiDTO> danhSach) {
        model.setRowCount(0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (KhuyenMaiDTO km : danhSach) {
            Vector row = new Vector();
            row.add(km.getMaKhuyenMai());
            row.add(km.getTenKhuyenMai());
            row.add(sdf.format(km.getNgayBatDau()));
            row.add(sdf.format(km.getNgayKetThuc()));
            row.add(km.getPhanTramGiamGia() + "%");
            model.addRow(row);
        }
    }
    
    public static void taiDuLieuTableCTKhuyenMai(DefaultTableModel model, ArrayList<CTKhuyenMaiDTO> danhSach) {
        model.setRowCount(0);
        for (CTKhuyenMaiDTO ct : danhSach) {
            Vector row = new Vector();
            row.add(ct.getMaCTKhuyenMai());
            row.add(ct.getMaHanhTrinh());
            row.add(ct.getMaKhuyenMai());
            model.addRow(row);
        }
    }

    public static void taiDuLieuTableNhanVien(DefaultTableModel model, ArrayList<NhanVienDTO> danhSach) {
        model.setRowCount(0);
        for (NhanVienDTO nv : danhSach) {
            Vector row = new Vector();
            row.add(nv.getMaNhanVien());
            row.add(nv.getHo());
            row.add(nv.getTen());
            row.add(nv.getGioiTinh());
            row.add(nv.getSdt());
            row.add(nv.getEmail());
            row.add(nv.getChucVu());
            row.add(nv.getLuongCoBan());
            row.add(nv.getMaTaiKhoan());
            model.addRow(row);
        }
    }
}
