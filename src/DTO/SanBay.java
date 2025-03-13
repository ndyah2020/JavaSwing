/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class SanBay {
    private String maSB;
    private String tenSanBay;
    private String diaChi;
    
    public SanBay() {
    
    }
    public SanBay(String maSB, String tenSanBay, String diaChi) {
        this.maSB = maSB;
        this.tenSanBay = tenSanBay;
        this.diaChi = diaChi;
    }

    public String getMaSB() {
        return maSB;
    }

    public String getTenSanBay() {
        return tenSanBay;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setMaSB(String maSB) {
        this.maSB = maSB;
    }

    public void setTenSanBay(String tenSanBay) {
        this.tenSanBay = tenSanBay;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }   
}
