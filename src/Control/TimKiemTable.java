package Control;

import DTO.ChuyenBayDTO;
import DTO.HanhTrinhDTO;
import DTO.KhuyenMaiDTO;
import DTO.LoaiMayBayDTO;
import DTO.MayBayDTO;
import DTO.SanBayDTO;
import java.util.ArrayList;

public class TimKiemTable {
    
    
    
    
    
   
       
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
    
    public static ChuyenBayDTO layMotChuyenBayTuMaMayBay(String maMayBay, ArrayList<ChuyenBayDTO> dsChuyenBay) {
        for (ChuyenBayDTO cb : dsChuyenBay) {
            if (cb.getMaMayBay().equals(maMayBay)) {
                return cb;
            }
        }
        return null;
    }
    
    public static KhuyenMaiDTO layMotKhuyenMai(String maKhuyenMai, ArrayList<KhuyenMaiDTO> danhSach) {
        for (KhuyenMaiDTO km : danhSach) {
            if (km.getMaKhuyenMai().equals(maKhuyenMai)) return km;
        }
        return null;
    }
    
    public static ArrayList<KhuyenMaiDTO> danhSachTimKiemTheoTenKM(String ten, ArrayList<KhuyenMaiDTO> danhSach) {
        ArrayList<KhuyenMaiDTO> dsKhuyenMaiTimThay = new ArrayList<>();
        for (KhuyenMaiDTO km : danhSach) {
            if (km.getTenKhuyenMai().toLowerCase().contains(ten.toLowerCase())) {
                dsKhuyenMaiTimThay.add(km);
            }
        }
        return dsKhuyenMaiTimThay;
    }
}
