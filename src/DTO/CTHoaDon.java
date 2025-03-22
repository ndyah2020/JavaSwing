/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class CTHoaDon {
    private String maCTHD;
    private int soLuong;
    private int gia;
    private String maHoaDon;
    private String maVe;

    public CTHoaDon(String maCTHD, int soLuong, int gia, String maHoaDon, String maVe) {
        this.maCTHD = maCTHD;
        this.soLuong = soLuong;
        this.gia = gia;
        this.maHoaDon = maHoaDon;
        this.maVe = maVe;
    }
    public CTHoaDon() {
        
    }

    public String getMaCTHD() {
        return maCTHD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getGia() {
        return gia;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaCTHD(String maCTHD) {
        this.maCTHD = maCTHD;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }
    
}
