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
public class HanhTrinhDTO {

    private String maHanhTrinh;
    private SanBayDTO sanBayDi;
    private SanBayDTO sanBayDen;
    private double giaCoBan;

    public HanhTrinhDTO(String maHanhTrinh, SanBayDTO sanBayDi, SanBayDTO sanBayDen, double giaCoBan) {
        this.maHanhTrinh = maHanhTrinh;
        this.sanBayDi = sanBayDi;
        this.sanBayDen = sanBayDen;
        this.giaCoBan = giaCoBan;
    }
    
    public HanhTrinhDTO() {
        
    }

    public String getMaHanhTrinh() {
        return maHanhTrinh;
    }

    public SanBayDTO getSanBayDi() {
        return sanBayDi;
    }

    public SanBayDTO getSanBayDen() {
        return sanBayDen;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setMaHanhTrinh(String maHanhTrinh) {
        this.maHanhTrinh = maHanhTrinh;
    }

    public void setSanBayDi(SanBayDTO sanBayDi) {
        this.sanBayDi = sanBayDi;
    }

    public void setSanBayDen(SanBayDTO sanBayDen) {
        this.sanBayDen = sanBayDen;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }
    
}
