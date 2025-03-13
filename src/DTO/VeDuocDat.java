/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class VeDuocDat {
    private String maVeDuocDat;
    private String soLuongVeDaBan;
    private String maLichBay;
    private String maHangVe;

    public VeDuocDat(String maVeDuocDat, String soLuongVeDaBan, String maLichBay, String maHangVe) {
        this.maVeDuocDat = maVeDuocDat;
        this.soLuongVeDaBan = soLuongVeDaBan;
        this.maLichBay = maLichBay;
        this.maHangVe = maHangVe;
    }
    public VeDuocDat(){
        
    }

    public String getMaVeDuocDat() {
        return maVeDuocDat;
    }

    public String getSoLuongVeDaBan() {
        return soLuongVeDaBan;
    }

    public String getMaLichBay() {
        return maLichBay;
    }

    public String getMaHangVe() {
        return maHangVe;
    }

    public void setMaVeDuocDat(String maVeDuocDat) {
        this.maVeDuocDat = maVeDuocDat;
    }

    public void setSoLuongVeDaBan(String soLuongVeDaBan) {
        this.soLuongVeDaBan = soLuongVeDaBan;
    }

    public void setMaLichBay(String maLichBay) {
        this.maLichBay = maLichBay;
    }

    public void setMaHangVe(String maHangVe) {
        this.maHangVe = maHangVe;
    }
    
}
