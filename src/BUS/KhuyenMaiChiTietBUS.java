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
    }
    
    public void docDanhSachBUS() {
        danhSach = khuyenMaiChiTietDAO.docDanhSach();
    }
    
    ArrayList<CTKhuyenMaiDTO> getDanhSachChiTietKhuyenMai() {
        if (danhSach.isEmpty()) {
            docDanhSachBUS();
        }
        return danhSach;
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
    
    public boolean xoaCTKhuyenBUS(String maCT) {
        boolean result = khuyenMaiChiTietDAO.xoaCTKhuyenMai(maCT);
        if (result) {
            danhSach.removeIf(ct -> ct.getMaCTKhuyenMai().equals(maCT));
        }
        return result;
    }
    
    public boolean xoaCTKMTheoMaKhuyenMai(String maKhuyenMai) {
        ArrayList<CTKhuyenMaiDTO> dsXoa = new ArrayList<>();
        for (CTKhuyenMaiDTO ct : danhSach) {
            if (ct.getMaKhuyenMai().equals(maKhuyenMai)) {
                khuyenMaiChiTietDAO.xoaCTKhuyenMai(ct.getMaCTKhuyenMai());
                dsXoa.add(ct);
            }
        }
        return danhSach.removeAll(dsXoa);
    }
}
