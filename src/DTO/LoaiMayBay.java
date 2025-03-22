/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class LoaiMayBay {
    private String maLoai;
    private String tenLoai;
    private float heSoGiaThuong;
    private float heSoGiaVip;

    public LoaiMayBay(String maLoai, String tenLoai, float heSoGiaThuong, float heSoGiaVip) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.heSoGiaThuong = heSoGiaThuong;
        this.heSoGiaVip = heSoGiaVip;
    }
    
    public LoaiMayBay() {
        
    }

    public String getMaLoai() {
        return maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public float getHeSoGiaThuong() {
        return heSoGiaThuong;
    }

    public float getHeSoGiaVip() {
        return heSoGiaVip;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public void setHeSoGiaThuong(float heSoGiaThuong) {
        this.heSoGiaThuong = heSoGiaThuong;
    }

    public void setHeSoGiaVip(float heSoGiaVip) {
        this.heSoGiaVip = heSoGiaVip;
    }
    
}
