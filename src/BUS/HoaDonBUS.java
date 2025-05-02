package BUS;

import DAO.HoaDonDAO;
import DTO.HoaDonDTO;
import java.util.ArrayList;
import java.sql.Date;
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
    
    public ArrayList<HoaDonDTO> timKiemHoaDonToanCuc(String tuKhoa) {
        String tuKhoaFM = tuKhoa.toLowerCase().trim();
        ArrayList<HoaDonDTO> dsTimThay = new ArrayList<>();
        for(HoaDonDTO hd: dsHoaDon) {
            if(hd.getMaHoaDon().toLowerCase().contains(tuKhoaFM) 
                    || hd.getMaKhachHang().toLowerCase().contains(tuKhoaFM) 
                    || hd.getMaKhuyenMai().toLowerCase().contains(tuKhoaFM) 
                    || hd.getMaNhanVien().toLowerCase().contains(tuKhoaFM)
                    ) {
                dsTimThay.add(hd);
            }
        }
        return dsTimThay;
    }
    
    public ArrayList<HoaDonDTO> locHoaDon(int giaTu, int giaDen, Date ngayTu, Date ngayDen) {
        ArrayList<HoaDonDTO> ds  = new ArrayList<>();
        for(HoaDonDTO hd : dsHoaDon) {
            int giaHoaDon = hd.getTongTien();
            Date ngaLap = hd.getNgayLap();
            
            boolean kiemTra = true;
            if(giaTu >= 0 && giaDen > 0) {
               if(giaTu > giaHoaDon || giaDen < giaHoaDon) {
                   kiemTra = false;
               }
            }
            
            if(ngayTu != null || ngayDen != null) {
                
                if(ngayTu.getTime() > ngaLap.getTime() || ngayTu.getTime() < ngaLap.getTime() ) {
                    
                }
            }
            if(kiemTra) {
                ds.add(hd);
            }
        }
        return ds;
    }
}
