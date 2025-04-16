package DTO;
import java.sql.Time;
import java.sql.Date;
public class ChuyenBayDTO {

    private String maChuyenBay;
    private String ngayXuatPhat;
    private String gioXuatPhat;
    private String ngayDenNoi;
    private String gioDenNoi;
    private int giaThuong;
    private int giaVip;
    private String trangThaiChuyenBay;
    private int tongSoLuongGhe;
    private int soGheDaBan;
    private int soChoConLai;
    private String maMayBay;
    private String maHanhTrinh;

    public ChuyenBayDTO(String maChuyenBay, String ngayXuatPhat, String gioXuatPhat, String ngayDenNoi, String gioDenNoi, int giaThuong, int giaVip, String trangThaiChuyenBay, int tongSoLuongGhe, int soGheDaBan, int soChoConLai, String maMayBay, String maHanhTrinh) {
        this.maChuyenBay = maChuyenBay;
        this.ngayXuatPhat = ngayXuatPhat;
        this.gioXuatPhat = gioXuatPhat;
        this.ngayDenNoi = ngayDenNoi;
        this.gioDenNoi = gioDenNoi;
        this.giaThuong = giaThuong;
        this.giaVip = giaVip;
        this.trangThaiChuyenBay = trangThaiChuyenBay;
        this.tongSoLuongGhe = tongSoLuongGhe;
        this.soGheDaBan = soGheDaBan;
        this.soChoConLai = soChoConLai;
        this.maMayBay = maMayBay;
        this.maHanhTrinh = maHanhTrinh;
    }

    public ChuyenBayDTO() {
        
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public String getNgayXuatPhat() {
        return ngayXuatPhat;
    }

    public String getGioXuatPhat() {
        return gioXuatPhat;
    }

    public String getNgayDenNoi() {
        return ngayDenNoi;
    }

    public String getGioDenNoi() {
        return gioDenNoi;
    }

    public int getGiaThuong() {
        return giaThuong;
    }

    public int getGiaVip() {
        return giaVip;
    }

    public String getTrangThaiChuyenBay() {
        return trangThaiChuyenBay;
    }

    public int getTongSoLuongGhe() {
        return tongSoLuongGhe;
    }

    public int getSoGheDaBan() {
        return soGheDaBan;
    }

    public int getSoChoConLai() {
        return soChoConLai;
    }

    public String getMaMayBay() {
        return maMayBay;
    }

    public String getMaHanhTrinh() {
        return maHanhTrinh;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setNgayXuatPhat(String ngayXuatPhat) {
        this.ngayXuatPhat = ngayXuatPhat;
    }

    public void setGioXuatPhat(String gioXuatPhat) {
        this.gioXuatPhat = gioXuatPhat;
    }

    public void setNgayDenNoi(String ngayDenNoi) {
        this.ngayDenNoi = ngayDenNoi;
    }

    public void setGioDenNoi(String gioDenNoi) {
        this.gioDenNoi = gioDenNoi;
    }

    public void setGiaThuong(int giaThuong) {
        this.giaThuong = giaThuong;
    }

    public void setGiaVip(int giaVip) {
        this.giaVip = giaVip;
    }

    public void setTrangThaiChuyenBay(String trangThaiChuyenBay) {
        this.trangThaiChuyenBay = trangThaiChuyenBay;
    }

    public void setTongSoLuongGhe(int tongSoLuongGhe) {
        this.tongSoLuongGhe = tongSoLuongGhe;
    }

    public void setSoGheDaBan(int soGheDaBan) {
        this.soGheDaBan = soGheDaBan;
    }

    public void setSoChoConLai(int soChoConLai) {
        this.soChoConLai = soChoConLai;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public void setMaHanhTrinh(String maHanhTrinh) {
        this.maHanhTrinh = maHanhTrinh;
    }
    
}
