package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;

public class NhanVienBUS {
    private ArrayList<NhanVienDTO> danhSachNhanVien;
    private final NhanVienDAO dao;
    
    public NhanVienBUS() {
        danhSachNhanVien = new ArrayList<>();
        dao = new NhanVienDAO();
        docDanhSachNhanvien();
    }
    
    private void docDanhSachNhanvien() {
        danhSachNhanVien = dao.layDanhSachNhanVienDAO();
    }
    
    public ArrayList<NhanVienDTO> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }
    
}
