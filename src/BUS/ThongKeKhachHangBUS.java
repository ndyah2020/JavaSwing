package BUS;

import DAO.ThongKeDAO;
import DTO.ThongKeKhachHangDTO;
import java.util.ArrayList;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
public class ThongKeKhachHangBUS {
    private ArrayList<ThongKeKhachHangDTO>  dsThongKeKhachHang;
    private final ThongKeDAO dao;
    
    public ThongKeKhachHangBUS() {
        dsThongKeKhachHang = new ArrayList<>();
        dao = new ThongKeDAO();
        layDanhSachThongKe();
    }
    
    private void layDanhSachThongKe() {
        dsThongKeKhachHang = dao.thongKeDoanhThuTheoHoaDon();
    }
    
    public ArrayList<ThongKeKhachHangDTO> getDanhSachThongKeKhachHang() {
        return dsThongKeKhachHang;
    }
    
    public ArrayList<Object[]> thongKeKhachHangTheoHoaDon(Date tuNgay, Date denNgay) {
        if(dsThongKeKhachHang.isEmpty()) {
            layDanhSachThongKe();
        }
        ArrayList<Object[]> danhSachthongKe = new ArrayList<>();
        System.out.println("Số danh sách"+dsThongKeKhachHang.size());
        
        for (ThongKeKhachHangDTO tk : dsThongKeKhachHang) {
            if (!tk.getNgayMua().before(tuNgay) && !tk.getNgayMua().after(denNgay)) {
                String maKH = tk.getMaKhachHang();
                String hoKH = tk.getHoKhachHang();
                String tenKH = tk.getTenKhachHang();
                int soLuongHoaDon = 1;
                int tongSoTien = tk.getTongSoTien();
                if (!kiemTraVaCapNhatKhachHang(danhSachthongKe, tongSoTien, maKH)) {
                    Object[] thongTinKhachHang = {maKH, hoKH, tenKH , soLuongHoaDon, tongSoTien};
                    danhSachthongKe.add(thongTinKhachHang);
                }
            }
        }
        return danhSachthongKe;
    }
    
    private boolean kiemTraVaCapNhatKhachHang( ArrayList<Object[]> danhSachthongKe, int tongSoTien, String maKhachHang) {
        for (Object[] obj : danhSachthongKe) {
            if (obj[0].equals(maKhachHang)) {
                obj[3] = (int)obj[3] + 1;
                obj[4] = (double)obj[4] + tongSoTien;
                return true;
            }
        }
        return false;
    }
}
