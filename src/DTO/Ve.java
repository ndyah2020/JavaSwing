/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class Ve {

    private String maVe;
    private String trangThaiVe;
    private int giaVe;
    private String maLoaiVe;
    private String maChuyenBay;

    public Ve(String maVe, String trangThaiVe, int giaVe, String maLoaiVe, String maChuyenBay) {
        this.maVe = maVe;
        this.trangThaiVe = trangThaiVe;
        this.giaVe = giaVe;
        this.maLoaiVe = maLoaiVe;
        this.maChuyenBay = maChuyenBay;
    }
    public Ve() {
        
    }

    public String getMaVe() {
        return maVe;
    }

    public String getTrangThaiVe() {
        return trangThaiVe;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public String getLoaiVe() {
        return maLoaiVe;
    }

    public String getChuyenBay() {
        return maChuyenBay;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public void setTrangThaiVe(String trangThaiVe) {
        this.trangThaiVe = trangThaiVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public void setLoaiVe(String maLoaiVe) {
        this.maLoaiVe = maLoaiVe;
    }

    public void setChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }
    
}
