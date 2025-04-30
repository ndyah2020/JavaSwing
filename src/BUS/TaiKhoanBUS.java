package BUS;

import DAO.TaiKhoanDAO;
import DTO.TaiKhoanDTO;
import java.util.ArrayList;

public class TaiKhoanBUS {
    private ArrayList<TaiKhoanDTO> danhSachTaiKhoan;
    private final TaiKhoanDAO dao;
    
    public TaiKhoanBUS() {
        danhSachTaiKhoan = new ArrayList<>();
        dao = new TaiKhoanDAO();
        layDanhSachTaiKhoanTuDao();
    }
    
    private void layDanhSachTaiKhoanTuDao() {
        danhSachTaiKhoan = dao.layDanhSachTaiKhoanDAO();
    }
    
    public ArrayList<TaiKhoanDTO> getDanhSachTaiKhoan() {
        return danhSachTaiKhoan;
    }
}
