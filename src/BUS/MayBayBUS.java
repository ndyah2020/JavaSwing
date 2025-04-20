package BUS;

import DAO.MayBayDAO;
import DTO.LoaiMayBayDTO;
import DTO.MayBayDTO;
import java.util.ArrayList;

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
    public ArrayList<MayBayDTO> danhSachTimTheoTenMayBay(String tuKhoa) {
        if(danhSachMayBay.isEmpty()) {
            docDanhSachMayBayBUS();
        }
        ArrayList<MayBayDTO> ketQua = new ArrayList<>();
        for (MayBayDTO mb : danhSachMayBay) {
            if (mb.getTenMayBay().toLowerCase().contains(tuKhoa.toLowerCase())) {
                ketQua.add(mb);
            }
        }
        return ketQua;
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
