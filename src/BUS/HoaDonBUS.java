package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDonDTO;
import java.util.ArrayList;

public class HoaDonBUS {
    private ArrayList<HoaDonDTO> dsHoaDon;
    private final HoaDonDAO dao;
    
    public HoaDonBUS() {
        dao = new HoaDonDAO();
        dsHoaDon = new ArrayList<>();
        layDanhSachHoaDon();
    }
    
    private void layDanhSachHoaDon() {
        dsHoaDon = dao.layDanhSachHoaDon();
    }
    
    public ArrayList<HoaDonDTO> getDanhSachHoaODon() {
        return dsHoaDon;
    }
}
