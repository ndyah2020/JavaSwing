/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class ChuyenBay {

    private String maChuyenBay;
    private String maSanBayDi;
    private String maSanBayDen;
    private String khoanCach;
    private int giaCoBan;
    private String trangThaiChuyenBay;

    public ChuyenBay(String maChuyenBay, String maSanBayDi, String maSanBayDen, String khoanCach, int giaCoBan, String trangThaiChuyenBay) {
        this.maChuyenBay = maChuyenBay;
        this.maSanBayDi = maSanBayDi;
        this.maSanBayDen = maSanBayDen;
        this.khoanCach = khoanCach;
        this.giaCoBan = giaCoBan;
        this.trangThaiChuyenBay = trangThaiChuyenBay;
    }
    public ChuyenBay(){
        
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public String getMaSanBayDi() {
        return maSanBayDi;
    }

    public String getMaSanBayDen() {
        return maSanBayDen;
    }

    public String getKhoanCach() {
        return khoanCach;
    }

    public int getGiaCoBan() {
        return giaCoBan;
    }

    public String getTrangThaiChuyenBay() {
        return trangThaiChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public void setMaSanBayDi(String maSanBayDi) {
        this.maSanBayDi = maSanBayDi;
    }

    public void setMaSanBayDen(String maSanBayDen) {
        this.maSanBayDen = maSanBayDen;
    }

    public void setKhoanCach(String khoanCach) {
        this.khoanCach = khoanCach;
    }

    public void setGiaCoBan(int giaCoBan) {
        this.giaCoBan = giaCoBan;
    }

    public void setTrangThaiChuyenBay(String trangThaiChuyenBay) {
        this.trangThaiChuyenBay = trangThaiChuyenBay;
    }
}
