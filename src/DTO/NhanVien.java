/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class NhanVien {
    private String maNhanVien;
    private String ho;
    private String ten;
    private String gioiTinh;
    private String sdt;
    private String email;
    private String chucVu;
    private double luongCoBan;
    private String maTaiKhoan;

    public NhanVien(String maNhanVien, String ho, String ten, String gioiTinh, String sdt, String email, String chucVu, double luongCoBan, String maTaiKhoan) {
        this.maNhanVien = maNhanVien;
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.email = email;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
        this.maTaiKhoan = maTaiKhoan;
    }

    
    public NhanVien(){
        
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getHo() {
        return ho;
    }

    public String getTen() {
        return ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }

    public String getChucVu() {
        return chucVu;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    
    
}
