package BUS;

import DAO.ChuyenBayDAO;
import DTO.ChuyenBayDTO;
import java.util.ArrayList;

public class ChuyenBayBUS {
    private ArrayList<ChuyenBayDTO> danhSachChuyenBay;
    private final ChuyenBayDAO dao;
    
    public ChuyenBayBUS() {
        danhSachChuyenBay = new ArrayList<>();
        dao = new ChuyenBayDAO();
        layDanhSachChuyenBay();
    }
    
    private void layDanhSachChuyenBay() {
        danhSachChuyenBay = dao.layDanhSachChuyenBayDAO();
    }
    
    public ArrayList<ChuyenBayDTO> getDanhSachChuyenBay() {
        if(danhSachChuyenBay.isEmpty()){
            layDanhSachChuyenBay();
        }
        return danhSachChuyenBay;
    }
    
    public void themChuyenBayBUS(ChuyenBayDTO chuyenBay) {
        if(dao.themChuyenBay(chuyenBay)){
            danhSachChuyenBay.add(chuyenBay);
        }
    }
    
    public void xoaChuyenBay(String maChuyenBay){
        if(dao.xoaChuyenBay(maChuyenBay)) {
            danhSachChuyenBay.removeIf(ht -> ht.getMaHanhTrinh().equals(maChuyenBay));
        }
    }
    
    public ArrayList<ChuyenBayDTO> danhSachTimKiemTheoMaChuyenBay(String maChuyenBay) {
        if(danhSachChuyenBay.isEmpty()){
            layDanhSachChuyenBay();
        }
        ArrayList<ChuyenBayDTO> dsChuyenBayTimThay = new ArrayList<>();
        for(ChuyenBayDTO cb : danhSachChuyenBay) {
            if(cb.getMaChuyenBay().toLowerCase().trim().contains((maChuyenBay.toLowerCase().trim()))) {
                dsChuyenBayTimThay.add(cb);
            }
        }
        return dsChuyenBayTimThay;
    }
    
    public ChuyenBayDTO layMotChuyenBay(String maChuyenBay) {
        if(danhSachChuyenBay.isEmpty()){
            layDanhSachChuyenBay();
        }
        for (ChuyenBayDTO cb : danhSachChuyenBay) {
            if (cb.getMaChuyenBay().equals(maChuyenBay)) {
                return cb;
            }
        }
        return null;
    }
    
    public ChuyenBayDTO layMotChuyenBayTuMaMayBay(String maMayBay) {
        if(danhSachChuyenBay.isEmpty()){
            layDanhSachChuyenBay();
        }
        for (ChuyenBayDTO cb : danhSachChuyenBay) {
            if (cb.getMaMayBay().equals(maMayBay)) {
                return cb;
            }
        }
        return null;
    }
}
