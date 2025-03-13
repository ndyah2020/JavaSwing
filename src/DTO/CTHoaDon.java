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
    private String maCTHoaDon;
    private int soLuongVe;
    private int Gia;
    private String maHoaDon;
    private String maVe;

    public CTHoaDon(String maCTHoaDon, int soLuongVe, int Gia, String maHoaDon, String maVe) {
        this.maCTHoaDon = maCTHoaDon;
        this.soLuongVe = soLuongVe;
        this.Gia = Gia;
        this.maHoaDon = maHoaDon;
        this.maVe = maVe;
    }
    public CTHoaDon(){
        
    }

    public String getMaCTHoaDon() {
        return maCTHoaDon;
    }

    public int getSoLuongVe() {
        return soLuongVe;
    }

    public int getGia() {
        return Gia;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaCTHoaDon(String maCTHoaDon) {
        this.maCTHoaDon = maCTHoaDon;
    }

    public void setSoLuongVe(int soLuongVe) {
        this.soLuongVe = soLuongVe;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }
    
}
