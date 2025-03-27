/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class CTKhuyenMaiDTO {

    private String maCTKhuyenMai;
    private String maHanhTrinh;
    private String maKhuyenMai;

    public CTKhuyenMaiDTO(String maCTKhuyenMai, String maHanhTrinh, String maKhuyenMai) {
        this.maCTKhuyenMai = maCTKhuyenMai;
        this.maHanhTrinh = maHanhTrinh;
        this.maKhuyenMai = maKhuyenMai;
    }
    public CTKhuyenMaiDTO() {
        
    }

    public String getMaCTKhuyenMai() {
        return maCTKhuyenMai;
    }

    public String getMaHanhTrinh() {
        return maHanhTrinh;
    }

    public String getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaCTKhuyenMai(String maCTKhuyenMai) {
        this.maCTKhuyenMai = maCTKhuyenMai;
    }

    public void setMaHanhTrinh(String maHanhTrinh) {
        this.maHanhTrinh = maHanhTrinh;
    }

    public void setMaKhuyenMai(String maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }
}
