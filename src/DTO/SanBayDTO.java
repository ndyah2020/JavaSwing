/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class SanBayDTO {

    private String maSanBay;
    private String tenSanBay;
    private String diaChi;

    public SanBayDTO(String maSanBay, String tenSanBay, String diaChi) {
        this.maSanBay = maSanBay;
        this.tenSanBay = tenSanBay;
        this.diaChi = diaChi;
    }
    public SanBayDTO() {
        
    }
    
    public String getMaSanBay() {
        return maSanBay;
    }

    public String getTenSanBay() {
        return tenSanBay;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setMaSanBay(String maSanBay) {
        this.maSanBay = maSanBay;
    }

    public void setTenSanBay(String tenSanBay) {
        this.tenSanBay = tenSanBay;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
