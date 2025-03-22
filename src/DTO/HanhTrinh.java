/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class LichBay {
    private String maLichBay;
    private Date ngayXuatPhat;
    private Date thoiGianDi;
    private Date thoiGianDen;
    private String maChuyenBay;
    private String maMayBay;

    public LichBay(String maLichBay, Date ngayXuatPhat, Date thoiGianDi, Date thoiGianDen, String maChuyenBay, String maMayBay) {
        this.maLichBay = maLichBay;
        this.ngayXuatPhat = ngayXuatPhat;
        this.thoiGianDi = thoiGianDi;
        this.thoiGianDen = thoiGianDen;
        this.maChuyenBay = maChuyenBay;
        this.maMayBay = maMayBay;
    }
    public LichBay(){
        
    }

    public String getMaLichBay() {
        return maLichBay;
    }

    public Date getNgayXuatPhat() {
        return ngayXuatPhat;
    }

    public Date getThoiGianDi() {
        return thoiGianDi;
    }

    public Date getThoiGianDen() {
        return thoiGianDen;
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public String getMaMayBay() {
        return maMayBay;
    }

    public void setMaLichBay(String maLichBay) {
        this.maLichBay = maLichBay;
    }

    public void setNgayXuatPhat(Date ngayXuatPhat) {
        this.ngayXuatPhat = ngayXuatPhat;
    }

    public void setThoiGianDi(Date thoiGianDi) {
        this.thoiGianDi = thoiGianDi;
    }

    public void setThoiGianDen(Date thoiGianDen) {
        this.thoiGianDen = thoiGianDen;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }
    
}
