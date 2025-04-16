package DTO;

import java.sql.Date;
import java.sql.Time;

public class ChuyenBayDTO {

    private String maChuyenBay;
    private Date ngayXuatPhat;
    private Time gioXuatPhat;
    private Date ngayDenNoi;
    private Time gioDenNoi;
    private int giaThuong;
    private int giaVip;
    private String trangThaiChuyenBay;
    private int tongSoLuongGhe;
    private int soGheDaBan;
    private int soGheConLai;
    private String maMayBay;
    private String maHanhTrinh;

    public ChuyenBayDTO(String maChuyenBay, Date ngayXuatPhat, Time gioXuatPhat, Date ngayDenNoi, Time gioDenNoi,
                        int giaThuong, int giaVip, String trangThaiChuyenBay,
                        int tongSoLuongGhe, int soGheDaBan, int soChoConLai,
                        String maMayBay, String maHanhTrinh) {
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
        this.soGheConLai = soChoConLai;
        this.maMayBay = maMayBay;
        this.maHanhTrinh = maHanhTrinh;
    }

    public ChuyenBayDTO() {
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public Date getNgayXuatPhat() {
        return ngayXuatPhat;
    }

    public void setNgayXuatPhat(Date ngayXuatPhat) {
        this.ngayXuatPhat = ngayXuatPhat;
    }

    public Time getGioXuatPhat() {
        return gioXuatPhat;
    }

    public void setGioXuatPhat(Time gioXuatPhat) {
        this.gioXuatPhat = gioXuatPhat;
    }

    public Date getNgayDenNoi() {
        return ngayDenNoi;
    }

    public void setNgayDenNoi(Date ngayDenNoi) {
        this.ngayDenNoi = ngayDenNoi;
    }

    public Time getGioDenNoi() {
        return gioDenNoi;
    }

    public void setGioDenNoi(Time gioDenNoi) {
        this.gioDenNoi = gioDenNoi;
    }

    public int getGiaThuong() {
        return giaThuong;
    }

    public void setGiaThuong(int giaThuong) {
        this.giaThuong = giaThuong;
    }

    public int getGiaVip() {
        return giaVip;
    }

    public void setGiaVip(int giaVip) {
        this.giaVip = giaVip;
    }

    public String getTrangThaiChuyenBay() {
        return trangThaiChuyenBay;
    }

    public void setTrangThaiChuyenBay(String trangThaiChuyenBay) {
        this.trangThaiChuyenBay = trangThaiChuyenBay;
    }

    public int getTongSoLuongGhe() {
        return tongSoLuongGhe;
    }

    public void setTongSoLuongGhe(int tongSoLuongGhe) {
        this.tongSoLuongGhe = tongSoLuongGhe;
    }

    public int getSoGheDaBan() {
        return soGheDaBan;
    }

    public void setSoGheDaBan(int soGheDaBan) {
        this.soGheDaBan = soGheDaBan;
    }

    public int getSoGheConLai() {
        return soGheConLai;
    }

    public void setSoGheConLai(int soChoConLai) {
        this.soGheConLai = soChoConLai;
    }

    public String getMaMayBay() {
        return maMayBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public String getMaHanhTrinh() {
        return maHanhTrinh;
    }

    public void setMaHanhTrinh(String maHanhTrinh) {
        this.maHanhTrinh = maHanhTrinh;
    }
}
