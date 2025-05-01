package BUS;

import DAO.HoaDonCTDAO;
import DTO.CTHoaDonDTO;
import java.util.ArrayList;

public class HoaDonCTBUS {
    private ArrayList<CTHoaDonDTO> danhSachCTHoaDon;
    private final HoaDonCTDAO dao;
    
    public HoaDonCTBUS() {
        dao = new HoaDonCTDAO();
        danhSachCTHoaDon = new ArrayList<>();
        layDanhSachCTHoaDon();
    }
    
    private void layDanhSachCTHoaDon() {
        danhSachCTHoaDon = dao.layDanhSachCTHoaDon();
    }
    
    public ArrayList<CTHoaDonDTO> getDanhSachCTHoaDon() {
        return danhSachCTHoaDon;
    }
}
