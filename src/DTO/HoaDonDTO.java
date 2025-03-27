/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class HoaDonDTO {
    private String maHoaDon;
    private Date thoiGian;
    private double tongTien;
    private String maNhanVien;
    private String maKhuyenMai;
    private String maKhachHang;

    public HoaDonDTO(String maHoaDon, Date thoiGian, double tongTien, String maNhanVien, String maKhuyenMai, String maKhachHang) {
        this.maHoaDon = maHoaDon;
        this.thoiGian = thoiGian;
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

    public Date getThoiGian() {
        return thoiGian;
    }

    public double getTongTien() {
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

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    public void setTongTien(double tongTien) {
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
