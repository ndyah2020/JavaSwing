
package DTO;

import java.sql.Date;
import java.sql.Time;
public class HoaDonDTO {
    private String maHoaDon;
    private Date ngayLap;
    private int tongTien;
    private String maNhanVien;
    private String maKhuyenMai;
    private String maKhachHang;

    public HoaDonDTO(String maHoaDon, Date ngayLap, int tongTien, String maNhanVien, String maKhuyenMai, String maKhachHang) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
        this.maNhanVien = maNhanVien;
        this.maKhuyenMai = maKhuyenMai;
        this.maKhachHang = maKhachHang;
    }
    public HoaDonDTO() {
        
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public int getTongTien() {
        return tongTien;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
    
}
