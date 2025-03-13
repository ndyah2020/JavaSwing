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
    private String maLoaiMayBay;
    private String tenLoai;
    private String hangSanXuat;

    public LoaiMayBay(String maLoaiMayBay, String tenLoai, String hangSanXuat) {
        this.maLoaiMayBay = maLoaiMayBay;
        this.tenLoai = tenLoai;
        this.hangSanXuat = hangSanXuat;
    }
    public LoaiMayBay(){
        
    }

    public String getMaLoaiMayBay() {
        return maLoaiMayBay;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setMaLoaiMayBay(String maLoaiMayBay) {
        this.maLoaiMayBay = maLoaiMayBay;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
}
