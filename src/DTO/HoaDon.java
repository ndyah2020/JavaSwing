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
public class HoaDon {
    private String maHoaDon;
    private Date thoiGianTao;
    private String maNV;
    private String maKH;
    private int tongTien;

    public HoaDon(String maHoaDon, Date thoiGianTao, String maNV, String maKH, int tongTien) {
        this.maHoaDon = maHoaDon;
        this.thoiGianTao = thoiGianTao;
        this.maNV = maNV;
        this.maKH = maKH;
        this.tongTien = tongTien;
    }
    public HoaDon(){
        
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public Date getThoiGianTao() {
        return thoiGianTao;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setThoiGianTao(Date thoiGianTao) {
        this.thoiGianTao = thoiGianTao;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    
}
