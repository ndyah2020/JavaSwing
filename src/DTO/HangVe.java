/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class HangVe {

    private String maHangVe;
    private String tenHangVe;
    private int soLuongGhe;
    private int heSoGia;

    public HangVe(String maHangVe, String tenHangVe, int soLuongGhe, int heSoGia) {
        this.maHangVe = maHangVe;
        this.tenHangVe = tenHangVe;
        this.soLuongGhe = soLuongGhe;
        this.heSoGia = heSoGia;
    }
    public HangVe() {
        
    }

    public String getMaHangVe() {
        return maHangVe;
    }

    public String getTenHangVe() {
        return tenHangVe;
    }

    public int getSoLuongGhe() {
        return soLuongGhe;
    }

    public int getHeSoGia() {
        return heSoGia;
    }

    public void setMaHangVe(String maHangVe) {
        this.maHangVe = maHangVe;
    }

    public void setTenHangVe(String tenHangVe) {
        this.tenHangVe = tenHangVe;
    }

    public void setSoLuongGhe(int soLuongGhe) {
        this.soLuongGhe = soLuongGhe;
    }

    public void setHeSoGia(int heSoGia) {
        this.heSoGia = heSoGia;
    }
    
}
