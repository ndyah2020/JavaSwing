/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Lenovo
 */
public class KhachHangDTO {
    private String maKhachHang;
    private String ho;
    private String ten;
    private String gioiTinh;
    private Date ngaySinh;
    private String sdt;
    private String email;
    private String cccd;

    public KhachHangDTO(String maKhachHang, String ho, String ten, String gioiTinh, Date ngaySinh, String sdt, String email, String cccd) {
        this.maKhachHang = maKhachHang;
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.email = email;
        this.cccd = cccd;
    }
    public KhachHangDTO() {
        
    }

    public String getMaKhachHang() {
        return maKhachHang;
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

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public String getEmail() {
        return email;
    }

    public String getCccd() {
        return cccd;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
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

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
    
}
