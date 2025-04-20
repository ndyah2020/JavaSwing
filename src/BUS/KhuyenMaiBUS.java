package BUS;

import DAO.KhuyenMaiDAO;
import DTO.KhuyenMaiDTO;
import java.util.ArrayList;

public class KhuyenMaiBUS {
    private  final KhuyenMaiDAO khuyenMaiDAO;
    private ArrayList<KhuyenMaiDTO> danhSach;
    
    public KhuyenMaiBUS() {
        khuyenMaiDAO = new KhuyenMaiDAO();
        danhSach = new ArrayList<>();
    }
    
    public void docDanhSachBUS() {
        danhSach = khuyenMaiDAO.docDanhSach();
    }
    
    public ArrayList<KhuyenMaiDTO> getDanhSachKhuyenMai() {
        if(danhSach.isEmpty()) {
            docDanhSachBUS();
        }
        return danhSach;
    }
    
    public boolean themKhuyenMaiBUS(KhuyenMaiDTO km) {
        boolean result = khuyenMaiDAO.themKhuyenMai(km);
        boolean already = danhSach.stream().anyMatch(x -> x.getMaKhuyenMai().equals(km.getMaKhuyenMai()));
        if(result && !already) {
            danhSach.add(km);
        }
        return result;
    }
    
    public boolean suaKhuyenMaiBUS(KhuyenMaiDTO km) {
        boolean result = khuyenMaiDAO.suaKhuyenMai(km);
        if (result) {
            for (int i = 0; i < danhSach.size(); i++) {
                if (danhSach.get(i).getMaKhuyenMai().equals(km.getMaKhuyenMai())) {
                    danhSach.set(i, km);
                    break;
                }
            }
        }
        return result;
    }
    
    public boolean xoaKhuyenMaiBUS(String maKM) {
        boolean result = khuyenMaiDAO.xoaKhuyenMai(maKM);
        if (result) {
            danhSach.removeIf(km -> km.getMaKhuyenMai().equals(maKM));
        }
        return result;
    }
}
