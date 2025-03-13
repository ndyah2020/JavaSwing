/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class NhanVien extends ConNguoi{
    private String maNV;
    private String chucVu;
    private int  luongCoBan;
    
    public NhanVien(){
        
    }
    public NhanVien (String maNV,String ho, String ten, String gioiTinh, String ngaySinh, String sdt, String email, String chucVu, int luongCoBan){
        super(ho, ten, gioiTinh, ngaySinh, sdt, email);
        this.maNV = maNV;
        this.chucVu = chucVu;
        this.luongCoBan = luongCoBan;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

}
