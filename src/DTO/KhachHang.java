/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class KhachHang extends ConNguoi {
    private String maKhachHang;

    public KhachHang() {
    }

    public KhachHang(String maKhachHang, String ho, String ten, String gioiTinh, String ngaySinh, String sdt, String email) {
        super(ho, ten, gioiTinh, ngaySinh, sdt, email);
        this.maKhachHang = maKhachHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }
}

