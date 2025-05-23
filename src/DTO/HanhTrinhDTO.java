
package DTO;

public class HanhTrinhDTO {

    private String maHanhTrinh;
    private String tenHanhTrinh;
    private String sanBayDi;
    private String sanBayDen;
    private int giaCoBan;
    public HanhTrinhDTO(String maHanhTrinh,String tenHanhTrinh ,String sanBayDi, String sanBayDen, int giaCoBan) {
        this.maHanhTrinh = maHanhTrinh;
        this.tenHanhTrinh = tenHanhTrinh;
        this.sanBayDi = sanBayDi;
        this.sanBayDen = sanBayDen;
        this.giaCoBan = giaCoBan;
    }
    
    public HanhTrinhDTO() {
        
    }

    public String getMaHanhTrinh() {
        return maHanhTrinh;
    }
    
    public String getTenHanhTrinh() {
        return tenHanhTrinh;
    }
    
    public String getSanBayDi() {
        return sanBayDi;
    }

    public String getSanBayDen() {
        return sanBayDen;
    }

    public int getGiaCoBan() {
        return giaCoBan;
    }

    public void setMaHanhTrinh(String maHanhTrinh) {
        this.maHanhTrinh = maHanhTrinh;
    }
    
    public void setTenHanhTrinh(String tenHanhTrinh) {
        this.tenHanhTrinh = tenHanhTrinh;
    }

    public void setSanBayDi(String sanBayDi) {
        this.sanBayDi = sanBayDi;
    }

    public void setSanBayDen(String sanBayDen) {
        this.sanBayDen = sanBayDen;
    }

    public void setGiaCoBan(int giaCoBan) {
        this.giaCoBan = giaCoBan;
    }
    
}
