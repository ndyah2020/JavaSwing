package BUS;

import DAO.KhuyenMaiChiTIetDAO;
import DTO.CTKhuyenMaiDTO;
import java.util.ArrayList;

public class KhuyenMaiChiTietBUS {
    private final KhuyenMaiChiTIetDAO khuyenMaiChiTietDAO;
    private ArrayList<CTKhuyenMaiDTO> danhSach;
    
    public KhuyenMaiChiTietBUS() {
        khuyenMaiChiTietDAO = new KhuyenMaiChiTIetDAO();
        danhSach = new ArrayList<>();
        docDanhSachBUS();
    }
    
    private void docDanhSachBUS() {
        danhSach = khuyenMaiChiTietDAO.docDanhSach();
    }
    
    public ArrayList<CTKhuyenMaiDTO> getDanhSachChiTietKhuyenMai() {
        if (danhSach.isEmpty()) {
            docDanhSachBUS();
        }
        return danhSach;
    }
    
    public ArrayList<CTKhuyenMaiDTO> getDanhSachTheoMaKhuyenMai(String maKhuyenMai) {
        ArrayList<CTKhuyenMaiDTO> ketQua = new ArrayList<>();
        for (CTKhuyenMaiDTO ct : getDanhSachChiTietKhuyenMai()) {
            if (ct.getMaKhuyenMai().equals(maKhuyenMai)) {
                ketQua.add(ct);
            }
        }
        return ketQua;
    }
    
    public boolean kiemTraTonTaiVoiMaHanhTrinh(String maKhuyenMai, String maHanhTrinh) {
        for (CTKhuyenMaiDTO ct : getDanhSachChiTietKhuyenMai()) {
            if (ct.getMaKhuyenMai().equals(maKhuyenMai)
             && ct.getMaHanhTrinh().equals(maHanhTrinh)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean themCTKhuyenMaiBUS(CTKhuyenMaiDTO ct) {
        boolean result = khuyenMaiChiTietDAO.themCTKhuyenMai(ct);
        if (result) {
            danhSach.add(ct);
        }
        return result;
    }
    
    public boolean suaCTKhuyenMaiBUS(CTKhuyenMaiDTO ct) {
        boolean result = khuyenMaiChiTietDAO.suaCTKhuyenMai(ct);
        if (result) {
            for (int i = 0; i < danhSach.size(); i++) {
                if (danhSach.get(i).getMaCTKhuyenMai().equals(ct.getMaCTKhuyenMai())) {
                    danhSach.set(i, ct);
                    break;
                }
            }
        }
        return result;
    }
    
    public boolean xoaCTKhuyenMaiBUS(String maCT) {
        boolean result = khuyenMaiChiTietDAO.xoaCTKhuyenMai(maCT);
        if (result) {
            danhSach.removeIf(ct -> ct.getMaCTKhuyenMai().equals(maCT));
        }
        return result;
    }
    
    public boolean xoaCTKMTheoMaKhuyenMai(String maKhuyenMai) {
        boolean kq = khuyenMaiChiTietDAO.xoaTheoMaKhuyenMai(maKhuyenMai);
        if (kq) {
            danhSach.removeIf(ctkm -> ctkm.getMaKhuyenMai().equals(maKhuyenMai));
        }
        return kq;
    }
    
    public boolean capNhatMaKhuyenMai(String maKMCu, String maKMMoi) {
        return khuyenMaiChiTietDAO.capNhatMaKhuyenMai(maKMCu, maKMMoi);
    }
}
