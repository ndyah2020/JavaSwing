package BUS;

import DAO.ThongKeDAO;
import DTO.ThongKeKhachHangDTO;
import java.util.ArrayList;
import java.sql.Date;
public class ThongKeKhachHangBUS {
    private ArrayList<ThongKeKhachHangDTO>  danhSachKhachHang;
    private final ThongKeDAO dao;
    
    
    public ThongKeKhachHangBUS() {
        danhSachKhachHang = new ArrayList<>();
        dao = new ThongKeDAO();
        layDanhSachThongKe();
    }
    
    private void layDanhSachThongKe() {
        danhSachKhachHang = dao.thongKeDoanhThuTheoHoaDon();
    }
    
    public ArrayList<ThongKeKhachHangDTO> getDanhSachThongKeKhachHang() {
        return danhSachKhachHang;
    }
    
    public void tongTienKhachHangMua(Date tuNgay, Date denNgay) {
        for(ThongKeKhachHangDTO tk : danhSachKhachHang) {
            if(tk.getNgayMua() )
        }
    }
}
