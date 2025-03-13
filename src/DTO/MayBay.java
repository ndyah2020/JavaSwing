/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class MayBay {
    private String maMayBay;
    private String tenMayBay;
    private int soLuongGhe;
    private String maLoai;

    // Constructor không tham số
    public MayBay() {
    }

    // Constructor có tham số
    public MayBay(String maMayBay, String tenMayBay, int soLuongGhe, String maLoai) {
        this.maMayBay = maMayBay;
        this.tenMayBay = tenMayBay;
        this.soLuongGhe = soLuongGhe;
        this.maLoai = maLoai;
    }

    // Getter và Setter
    public String getMaMayBay() {
        return maMayBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public String getTenMayBay() {
        return tenMayBay;
    }

    public void setTenMayBay(String tenMayBay) {
        this.tenMayBay = tenMayBay;
    }

    public int getSoLuongGhe() {
        return soLuongGhe;
    }

    public void setSoLuongGhe(int soLuongGhe) {
        this.soLuongGhe = soLuongGhe;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }
}
