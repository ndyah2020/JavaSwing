package DTO;
import java.sql.Date;
public class ThongKeKhachHangDTO {
    private String maKhachHang;
    private String hoKhachHang;
    private String tenKhachHang;
    private Date ngayMua;
    private int tongSoTien;

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public String getHoKhachHang() {
        return hoKhachHang;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public int getTongSoTien() {
        return tongSoTien;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public void setTongSoTien(int tongSoTien) {
        this.tongSoTien = tongSoTien;
    }

    public void setHoKhachHang(String hoKhachHang) {
        this.hoKhachHang = hoKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    
    public ThongKeKhachHangDTO() {
        
    }

    public ThongKeKhachHangDTO(String maKhachHang, String hoKhachHang, String tenKhachHang, Date ngayMua, int tongSoTien) {
        this.maKhachHang = maKhachHang;
        this.hoKhachHang = hoKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.ngayMua = ngayMua;
        this.tongSoTien = tongSoTien;
    }
    
}
