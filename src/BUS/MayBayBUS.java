package BUS;

import DAO.MayBayDAO;
import DTO.LoaiMayBayDTO;
import DTO.MayBayDTO;
import java.util.ArrayList;
import java.util.Comparator;

public class MayBayBUS {
    private ArrayList<MayBayDTO> danhSachMayBay;
    private final MayBayDAO dao;
    
    public MayBayBUS() {
        dao = new MayBayDAO();
        danhSachMayBay = new ArrayList<>();
        docDanhSachMayBayBUS();
    }
    
    private void docDanhSachMayBayBUS() {
        danhSachMayBay = dao.docDanhSach();
    }
    
    public ArrayList<MayBayDTO> getDanhSachMayBayBUS() {
        if(danhSachMayBay.isEmpty()) {
            docDanhSachMayBayBUS();
        }
        return danhSachMayBay;
    }
    
    public void themMayBayBUS(MayBayDTO mayBay) {
        if(dao.themMayBay(mayBay)) {
            danhSachMayBay.add(mayBay);
        }
    }
    
    public void xoaMayBay(String maMayBay) {
        if(dao.xoaMayBay(maMayBay)) {
            danhSachMayBay.removeIf(mb -> mb.getMaMayBay().equals(maMayBay));
        }
    }
    
    public void suaMayBayBUS(MayBayDTO mayBay) {
        if(dao.suaMayBay(mayBay)){
            for(int i = 0; i < danhSachMayBay.size(); i++ ) {
                if(danhSachMayBay.get(i).getMaMayBay().equals(mayBay.getMaMayBay())) {
                    danhSachMayBay.set(i, mayBay);
                    break;
                }
            }
        }
    }
    public ArrayList<MayBayDTO> danhSachTimTheoTuKhoa(String tuKhoa) {
        if(danhSachMayBay.isEmpty()) {
            docDanhSachMayBayBUS();
        }
        ArrayList<MayBayDTO> ketQua = new ArrayList<>();
        for (MayBayDTO mb : danhSachMayBay) {
            if (mb.getTenMayBay().toLowerCase().contains(tuKhoa.toLowerCase()) ||
                mb.getMaMayBay().toLowerCase().contains(tuKhoa.toLowerCase()) ||
                mb.getMaLoaiMayBay().toLowerCase().contains(tuKhoa.toLowerCase()) ||
                String.valueOf(mb.getSoLuongGheThuong()).toLowerCase().contains(tuKhoa) ||
                String.valueOf(mb.getSoLuongGheVip()).toLowerCase().contains(tuKhoa) ||
                String.valueOf(mb.getTongSoLuongGhe()).toLowerCase().contains(tuKhoa)   ) {
                ketQua.add(mb);
            }
        }
        return ketQua;
    }

    public ArrayList<MayBayDTO> danhSachMayBaySapXep(String loc, String sapXep, String tuKhoa) {
        ArrayList<MayBayDTO> danhSachTam = getDanhSachMayBayBUS();
        
        if (tuKhoa != null && !tuKhoa.trim().isEmpty()) {
            danhSachTam = danhSachTimTheoTuKhoa(tuKhoa);
        } else {
            danhSachTam = getDanhSachMayBayBUS();
        }
        
        if (!"Lọc theo".equals(loc) || !"Sắp xếp".equals(sapXep)) {
            Comparator<MayBayDTO> comp;
            
            if ("Mã máy bay".equals(loc)) {
                comp = Comparator.comparing(mb -> mb.getMaMayBay().toLowerCase());
            } else if ("Tên máy bay".equals(loc)) {
                comp = Comparator.comparing(mb -> mb.getTenMayBay().toLowerCase());
            } else {
                return danhSachTam;
            }

            if ("Giảm dần".equals(sapXep)) {
                comp = comp.reversed();
            }

            danhSachTam.sort(comp);
        }
        return danhSachTam;   
    }
    
    public MayBayDTO layMotMayBay(String maMayBay) {
        if(danhSachMayBay.isEmpty()) {
            docDanhSachMayBayBUS();
        }
        for(MayBayDTO mb : danhSachMayBay) {
            if (mb.getMaMayBay().equals(maMayBay)) {
                return mb;
            }
        }
        return null;
    }  
}
