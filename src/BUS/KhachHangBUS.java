package BUS;

import DAO.KhachHangDAO;
import DTO.KhachHangDTO;
import java.util.ArrayList;

public class KhachHangBUS {
    private ArrayList<KhachHangDTO> dsKhachHang;
    private final KhachHangDAO kh;

    public KhachHangBUS() {
        kh = new KhachHangDAO();
        dsKhachHang = new ArrayList();
        docdsKhachHang();
    }

    private void docdsKhachHang() {
        dsKhachHang = kh.docDanhSach();
    }

    public ArrayList<KhachHangDTO> getdsKhachHang() {
        if (dsKhachHang.isEmpty()) {
            docdsKhachHang();
        }
        return dsKhachHang;
    }

    public void themKhachHang(KhachHangDTO khachHang) {
        if (kh.themKhachHang(khachHang)) {
            dsKhachHang.add(khachHang);
        }
    }

    public void xoaKhachHang(String maKhachHang) {
        if (kh.xoaKhachHang(maKhachHang)) {
            dsKhachHang.removeIf((lmb) -> lmb.getMaKhachHang().equals(maKhachHang));
        }
    }

    public void suaKhachHang(KhachHangDTO khachHang) {
        if (kh.suaKhachHang(khachHang)) {
            for(int i = 0; i < dsKhachHang.size(); ++i) {
                if (((KhachHangDTO)dsKhachHang.get(i)).equals(khachHang.getMaKhachHang())) {
                    dsKhachHang.set(i, khachHang);
                    break;
                }
            }
        }
    }

    public ArrayList<KhachHangDTO> timDSKhachHangTheoId(String maKH) {
        if(dsKhachHang.isEmpty()){
            docdsKhachHang();
        }
        ArrayList<KhachHangDTO> dsKHTimThay = new ArrayList<>();
        for(KhachHangDTO kh : dsKhachHang) {
            if(kh.getMaKhachHang().toLowerCase().trim().contains((maKH.toLowerCase().trim()))) {
                dsKHTimThay.add(kh);
            }
        }
        return dsKHTimThay;
    }

    public ArrayList<KhachHangDTO> timDSKhachHangTheoCccd(String id) {
        if(dsKhachHang.isEmpty()){
            docdsKhachHang();
        }
        ArrayList<KhachHangDTO> dsKHTimThay = new ArrayList<>();
        for(KhachHangDTO kh : dsKhachHang) {
            if(kh.getCccd().trim().contains((id.trim()))) {
                dsKHTimThay.add(kh);
            }
        }
        return dsKHTimThay;
    }
    
    public KhachHangDTO layMotKhachHangTheoCccd(String cccd) {
        for(KhachHangDTO kh : dsKhachHang) {
            if(kh.getCccd().equals(cccd)){
                return kh;
            }
        }
        return null;
    }

    public KhachHangDTO timMotKH(String maKH) {
        if(dsKhachHang.isEmpty()){
            docdsKhachHang();
        }
        for (KhachHangDTO kh : dsKhachHang) {
            if (kh.getMaKhachHang().equals(maKH)) {
                return kh;
            }
        }
        return null;
    }
}