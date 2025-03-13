/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class Ve {
    private String maVe;
    private String trangThaiVe;
    private String GiaVe;
    private String maHangVe;
    private String maHangBay;

    public Ve(String maVe, String trangThaiVe, String GiaVe, String maHangVe, String maHangBay) {
        this.maVe = maVe;
        this.trangThaiVe = trangThaiVe;
        this.GiaVe = GiaVe;
        this.maHangVe = maHangVe;
        this.maHangBay = maHangBay;
    }
    public Ve(){
        
    }

    public String getMaVe() {
        return maVe;
    }

    public String getTrangThaiVe() {
        return trangThaiVe;
    }

    public String getGiaVe() {
        return GiaVe;
    }

    public String getMaHangVe() {
        return maHangVe;
    }

    public String getMaHangBay() {
        return maHangBay;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public void setTrangThaiVe(String trangThaiVe) {
        this.trangThaiVe = trangThaiVe;
    }

    public void setGiaVe(String GiaVe) {
        this.GiaVe = GiaVe;
    }

    public void setMaHangVe(String maHangVe) {
        this.maHangVe = maHangVe;
    }

    public void setMaHangBay(String maHangBay) {
        this.maHangBay = maHangBay;
    }
    
}
