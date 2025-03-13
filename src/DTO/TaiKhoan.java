/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lenovo
 */
public class TaiKhoan {
    private String email;
    private String matKhau;
    private String vaiTro;
    private String otp;
    private String otpHetHan;
    private String trangThai;

    public TaiKhoan(String email, String matKhau, String vaiTro, String otp, String otpHetHan, String TrangThai) {
        this.email = email;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
        this.otp = otp;
        this.otpHetHan = otpHetHan;
        this.trangThai = trangThai;
    }
    public TaiKhoan() {
        
    }

    public String getEmail() {
        return email;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public String getOtp() {
        return otp;
    }

    public String getOtpHetHan() {
        return otpHetHan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public void setOtp(String otp) {
        this.otp = otp;
    }

    public void setOtpHetHan(String otpHetHan) {
        this.otpHetHan = otpHetHan;
    }

    public void setTrangThai(String TrangThai) {
        this.trangThai = TrangThai;
    }
    
}
