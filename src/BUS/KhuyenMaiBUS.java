package BUS;

import DAO.KhuyenMaiDAO;
import DTO.KhuyenMaiDTO;
import java.util.ArrayList;
import java.util.Date;

public class KhuyenMaiBUS {
    private  final KhuyenMaiDAO khuyenMaiDAO;
    private ArrayList<KhuyenMaiDTO> danhSach;
    
    public KhuyenMaiBUS() {
        khuyenMaiDAO = new KhuyenMaiDAO();
        danhSach = new ArrayList<>();
        docDanhSachBUS();
    }
    
    private void docDanhSachBUS() {
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
    
    public boolean capNhatMaKhuyenMai(String maCu, String maMoi) {
        return khuyenMaiDAO.capNhatMaKhuyenMai(maCu, maMoi);
    }
    
    public KhuyenMaiDTO layMotKhuyenMai(String maKhuyenMai) {
        for (KhuyenMaiDTO km : danhSach) {
            if (km.getMaKhuyenMai().equals(maKhuyenMai)) return km;
        }
        return null;
    }
    
    public ArrayList<KhuyenMaiDTO> danhSachTimKiemTheoTenKM(String ten) {
        ArrayList<KhuyenMaiDTO> dsKhuyenMaiTimThay = new ArrayList<>();
        for (KhuyenMaiDTO km : danhSach) {
            if (km.getTenKhuyenMai().toLowerCase().contains(ten.toLowerCase())) {
                dsKhuyenMaiTimThay.add(km);
            }
        }
        return dsKhuyenMaiTimThay;
    }
    public KhuyenMaiDTO layMotKhuyenMaiTheoMaHT(String maKhuyenMai, String maChuyenBay) {
        return khuyenMaiDAO.layKhuyenMaiCoMaHanhTrinh(maKhuyenMai, maChuyenBay);
    }
    
    public ArrayList<KhuyenMaiDTO> danhSachTimKiemNangCao(String ma, String ten, Date tu, Date den) {
        ArrayList<KhuyenMaiDTO> danhSachKhuyenMai = khuyenMaiDAO.docDanhSach();
        ArrayList<KhuyenMaiDTO> danhSachKhuyenMaiTimThay = new ArrayList<>();
        
        boolean isNhapDieuKien = (ma != null && !ma.isEmpty()) || (ten != null && !ten.isEmpty()) || (tu != null) || (den != null);
        
        if (! isNhapDieuKien) {
            return danhSachKhuyenMaiTimThay;
        }
        
        for (KhuyenMaiDTO km : danhSachKhuyenMai) {
            boolean match = false;
            
            if (!ma.isEmpty() && ma != null) {
                if (km.getMaKhuyenMai().equalsIgnoreCase(ma)) {
                    match = true;
                }
            }
            
            if (!match && !ten.isEmpty() && ten != null) {
                if (km.getTenKhuyenMai().toLowerCase().contains(ten.toLowerCase())) {
                    match = true;
                }
            }
            
            if (!match && tu != null && den != null) {
                if (!km.getNgayBatDau().before(tu) && !km.getNgayKetThuc().after(den)) {
                    match = true;
                }
            } else if (tu != null) {
                if (km.getNgayBatDau().before(tu)) {
                    match = true;
                }
            } else if (den != null) {
                if (km.getNgayKetThuc().after(den)) {
                    match = true;
                }
            }

            if (match) {
                danhSachKhuyenMaiTimThay.add(km);
            }
        }
        return danhSachKhuyenMaiTimThay;
    }
}
