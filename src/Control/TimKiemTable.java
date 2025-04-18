package Control;

import DTO.ChuyenBayDTO;
import DTO.HanhTrinhDTO;
import DTO.LoaiMayBayDTO;
import DTO.MayBayDTO;
import DTO.SanBayDTO;
import java.util.ArrayList;

public class TimKiemTable {
    public static ArrayList<SanBayDTO> danhSachTimTheoTenSanBay(String tenSanBay, ArrayList<SanBayDTO> dsSanBay) {
        ArrayList<SanBayDTO> danhSachTimThay = new ArrayList<>();
            for (SanBayDTO sb : dsSanBay) {
                if (sb.getTenSanBay().toLowerCase().trim().contains(tenSanBay.toLowerCase().trim())) {
                    danhSachTimThay.add(sb);
                }
            }
        return danhSachTimThay;
    }

    public static ArrayList<MayBayDTO> danhSachTimTheoTenMayBay(String tuKhoa, ArrayList<MayBayDTO> dsMayBay) {
        ArrayList<MayBayDTO> ketQua = new ArrayList<>();
        for (MayBayDTO mb : dsMayBay) {
            if (mb.getTenMayBay().toLowerCase().contains(tuKhoa.toLowerCase())) {
                ketQua.add(mb);
            }
        }
        return ketQua;
    }
    
    public static MayBayDTO layMotMayBay(String maMayBay,  ArrayList<MayBayDTO> dsMayBay) {
        for(MayBayDTO mb : dsMayBay) {
            if (mb.getMaMayBay().equals(maMayBay)) {
                return mb;
            }
        }
        return null;
    }
    
    public static ArrayList<LoaiMayBayDTO> danhSachTimTheoTenLoaiMB(String tenLoai,  ArrayList<LoaiMayBayDTO> danhSachLoaiMayBay) {
        ArrayList<LoaiMayBayDTO> danhSachTimThay = new ArrayList<>();
        for (LoaiMayBayDTO lmb : danhSachLoaiMayBay) {
            if (lmb.getTenLoai().toLowerCase().trim().contains(tenLoai.toLowerCase().trim())) {
                danhSachTimThay.add(lmb);
            }
        }
        return danhSachTimThay;
    }
    
    public static LoaiMayBayDTO layMotLoaiMayBay(String maLoai,  ArrayList<LoaiMayBayDTO> dsLoaiMayBay) {
        for(LoaiMayBayDTO mb : dsLoaiMayBay) {
            if (mb.getMaLoai().equals(maLoai)) {
                return mb;
            }
        }
        return null;
    }
    
    public static ArrayList<HanhTrinhDTO> danhSachTimTheoTenHanhTrinh(String tenHangTrinh, ArrayList<HanhTrinhDTO> dsHanhTrinh) {
        ArrayList<HanhTrinhDTO> dsHanhTrinhTimThay = new ArrayList<>();
        for (HanhTrinhDTO ht : dsHanhTrinh) {
            if (ht.getTenHanhTrinh().toLowerCase().trim().contains(tenHangTrinh.toLowerCase().trim())) {
                dsHanhTrinhTimThay.add(ht);
            }
        }
        return dsHanhTrinhTimThay;
    }
    
    public static HanhTrinhDTO layMotHanhTrinh(String maHanhTrinh, ArrayList<HanhTrinhDTO> dsHanhTrinh) {
        for (HanhTrinhDTO ht : dsHanhTrinh) {
            if (ht.getMaHanhTrinh().equals(maHanhTrinh)) {
                return ht;
            }
        }
        return null;
    }
    
    public static ArrayList<ChuyenBayDTO> danhSachTimKiemTheoMaChuyenBay(String maChuyenBay, ArrayList<ChuyenBayDTO> dsChuyenBay) {
        ArrayList<ChuyenBayDTO> dsChuyenBayTimThay = new ArrayList<>();
        for(ChuyenBayDTO cb : dsChuyenBay) {
            if(cb.getMaChuyenBay().toLowerCase().trim().contains((maChuyenBay.toLowerCase().trim()))) {
                dsChuyenBayTimThay.add(cb);
            }
        }
        return dsChuyenBayTimThay;
    }
    
    public static ChuyenBayDTO layMotChuyenBay(String maChuyenBay, ArrayList<ChuyenBayDTO> dsChuyenBay) {
        for (ChuyenBayDTO cb : dsChuyenBay) {
            if (cb.getMaChuyenBay().equals(maChuyenBay)) {
                return cb;
            }
        }
        return null;
    }
}
