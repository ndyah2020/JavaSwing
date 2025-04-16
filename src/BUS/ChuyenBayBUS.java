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
    }
    
    public void layDanhSachChuyenBay() {
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
}
