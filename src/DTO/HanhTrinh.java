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
public class HanhTrinh {

    private String maHanhTrinh;
    private SanBay sanBayDi;
    private SanBay sanBayDen;
    private double giaCoBan;

    public HanhTrinh(String maHanhTrinh, SanBay sanBayDi, SanBay sanBayDen, double giaCoBan) {
        this.maHanhTrinh = maHanhTrinh;
        this.sanBayDi = sanBayDi;
        this.sanBayDen = sanBayDen;
        this.giaCoBan = giaCoBan;
    }
    
    public HanhTrinh() {
        
    }

    public String getMaHanhTrinh() {
        return maHanhTrinh;
    }

    public SanBay getSanBayDi() {
        return sanBayDi;
    }

    public SanBay getSanBayDen() {
        return sanBayDen;
    }

    public double getGiaCoBan() {
        return giaCoBan;
    }

    public void setMaHanhTrinh(String maHanhTrinh) {
        this.maHanhTrinh = maHanhTrinh;
    }

    public void setSanBayDi(SanBay sanBayDi) {
        this.sanBayDi = sanBayDi;
    }

    public void setSanBayDen(SanBay sanBayDen) {
        this.sanBayDen = sanBayDen;
    }

    public void setGiaCoBan(double giaCoBan) {
        this.giaCoBan = giaCoBan;
    }
    
}
