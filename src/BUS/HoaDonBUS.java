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
    //Loc su dụng và
    public ArrayList<HoaDonDTO> locHoaDonVa(int giaTu, int giaDen, Date ngayTu, Date ngayDen) {
        ArrayList<HoaDonDTO> ds = new ArrayList<>();
        for (HoaDonDTO hd : dsHoaDon) {
            int giaHoaDon = hd.getTongTien();
            Date ngayLapHoaDon = hd.getNgayLap();
            System.out.println(ngayLapHoaDon);
            System.out.println(ngayTu);
            System.out.println(ngayDen);
            boolean kiemTra = true;

            if (giaTu > 0 && giaDen > 0) {
                if (giaHoaDon < giaTu || giaHoaDon > giaDen) {
                    kiemTra = false;
                }
            }
            
            if(ngayTu != null && ngayDen != null) {
                if(ngayLapHoaDon.compareTo(ngayTu) < 0 || ngayLapHoaDon.compareTo(ngayDen) > 0){
                    kiemTra = false;
                }
            }
            if (kiemTra) {
                ds.add(hd);
            }
        }
        return ds;
    }
    
    //Lọc sử dụng hoặc
    public ArrayList<HoaDonDTO> locHoaDonHoac(int giaTu, int giaDen, Date ngayTu, Date ngayDen) {
        ArrayList<HoaDonDTO> ds = new ArrayList<>();
        for(HoaDonDTO hd : dsHoaDon) {
            int giaHoaDon = hd.getTongTien();
            Date ngayLapHoaDon = hd.getNgayLap();
            boolean giaDung = false;
            boolean ngayDung = false;
            System.out.println(giaTu);
            
            if(giaTu > 0 && giaDen >0) {
                if(giaTu <= giaHoaDon && giaHoaDon <= giaDen) {
                   giaDung = true;
                }
            }else if(giaTu > 0) {
                if(giaTu <= giaHoaDon)
                    giaDung = true;
            } else if (giaDen >0) {
                if (giaDen >= giaHoaDon) {
                    giaDung = true;
                }
            }

            if (ngayTu != null && ngayDen != null) {
                if (ngayLapHoaDon.compareTo(ngayTu) >= 0 && ngayLapHoaDon.compareTo(ngayDen) <= 0) {
                    ngayDung = true;
                }
            } else if (ngayTu != null) {
                if (ngayLapHoaDon.compareTo(ngayTu) >= 0 ){
                    ngayDung = true;
                }
            } else if (ngayDen != null) {
                if (ngayLapHoaDon.compareTo(ngayDen) <= 0) {
                    ngayDung = true;
                }
            }
            if (giaDung || ngayDung) {

                ds.add(hd);
            }
        }
        return ds;
    }
}
