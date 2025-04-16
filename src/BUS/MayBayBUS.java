package BUS;

import DAO.MayBayDAO;
import DTO.MayBayDTO;
import java.util.ArrayList;

public class MayBayBUS {
    private ArrayList<MayBayDTO> danhSachMayBay;
    private final MayBayDAO dao;
    
    public MayBayBUS() {
        dao = new MayBayDAO();
        danhSachMayBay = new ArrayList<>();
    }
    
    public void docDanhSachMayBayBUS() {
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
}
