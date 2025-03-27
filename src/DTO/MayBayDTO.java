/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class MayBayDTO {
    private String maMayBay;
    private String tenMayBay;
    private int soLuongGheThuong;
    private int soLuongGheVip;
    private int tongSoLuongGhe;
    private String maLoaiMayBay;

    public MayBayDTO(String maMayBay, String tenMayBay, int soLuongGheThuong, int soLuongGheVip, int tongSoLuongGhe, String maLoaiMayBay) {
        this.maMayBay = maMayBay;
        this.tenMayBay = tenMayBay;
        this.soLuongGheThuong = soLuongGheThuong;
        this.soLuongGheVip = soLuongGheVip;
        this.tongSoLuongGhe = tongSoLuongGhe;
        this.maLoaiMayBay = maLoaiMayBay;
    }
    
    public MayBayDTO () {
        
    }

    public String getMaMayBay() {
        return maMayBay;
    }

    public String getTenMayBay() {
        return tenMayBay;
    }

    public int getSoLuongGheThuong() {
        return soLuongGheThuong;
    }

    public int getSoLuongGheVip() {
        return soLuongGheVip;
    }

    public int getTongSoLuongGhe() {
        return tongSoLuongGhe;
    }

    public String getLoaiMayBay() {
        return maLoaiMayBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public void setTenMayBay(String tenMayBay) {
        this.tenMayBay = tenMayBay;
    }

    public void setSoLuongGheThuong(int soLuongGheThuong) {
        this.soLuongGheThuong = soLuongGheThuong;
    }

    public void setSoLuongGheVip(int soLuongGheVip) {
        this.soLuongGheVip = soLuongGheVip;
    }

    public void setTongSoLuongGhe(int tongSoLuongGhe) {
        this.tongSoLuongGhe = tongSoLuongGhe;
    }

    public void setLoaiMayBay(String maLoaiMayBay) {
        this.maLoaiMayBay = maLoaiMayBay;
    }
    
}
