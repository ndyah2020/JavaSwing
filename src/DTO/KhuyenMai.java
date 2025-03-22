/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class KhuyenMai {
    private String maKhuyenMai;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String phanTramGiamGia;

    public KhuyenMai(String maKhuyenMai, String ngayBatDau, String ngayKetThuc, String phanTramGiamGia) {
        this.maKhuyenMai = maKhuyenMai;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.phanTramGiamGia = phanTramGiamGia;
    }
    public KhuyenMai() {
        
    }

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public String getPhanTramGiamGia() {
        return phanTramGiamGia;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public void setPhanTramGiamGia(String phanTramGiamGia) {
        this.phanTramGiamGia = phanTramGiamGia;
    }
    
}
