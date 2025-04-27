package BUS;

import DAO.VeDAO;
import DTO.VeDTO;
import java.util.ArrayList;

public class VeBUS {
    private ArrayList<VeDTO> danhSachVe;
    private final VeDAO dao;
    
    public VeBUS() {
        danhSachVe = new ArrayList<>();
        dao = new VeDAO();
        layDanhSachVe();
    }
    
    private void layDanhSachVe() {
        danhSachVe = dao.layDanhSachVe();
    }
    
    public ArrayList<VeDTO> getDanhSachVe () {
        if(danhSachVe.isEmpty()) {
            layDanhSachVe();
        }
        return danhSachVe;
    }
    
    public VeDTO timKiemVeTheoMaChuyenBayDaDat(String maChuyenBay){
        if(danhSachVe.isEmpty()) {
            layDanhSachVe();
        }
        for(VeDTO ve : danhSachVe) {
            if(ve.getChuyenBay().equals(maChuyenBay) && ve.getTrangThaiVe().equals("Đã đặt")){
                return ve;
            }
        }
        return null;
    }
    
    public ArrayList<VeDTO> timKiemVeTheoMaChuyenBay(String maChuyenBay){
        if(danhSachVe.isEmpty()) {
            layDanhSachVe();
        }
        ArrayList<VeDTO> danhSachTimThay = new ArrayList<>();
        
        for(VeDTO ve : danhSachVe) {
            if(ve.getChuyenBay().toLowerCase().trim().contains(maChuyenBay.toLowerCase().trim())){
                danhSachTimThay.add(ve);
            }
        }
        return danhSachTimThay;
    }
    
    public ArrayList<VeDTO> timKiemVeTheoLoaiVe(String loaiVe){
        if(danhSachVe.isEmpty()) {
            layDanhSachVe();
        }
        ArrayList<VeDTO> danhSachTimThay = new ArrayList<>();
        
        for(VeDTO ve : danhSachVe) {
            if(ve.getLoaiVe().toLowerCase().trim().contains(loaiVe.toLowerCase().trim())){
                danhSachTimThay.add(ve);
            }
        }
        return danhSachTimThay;
    }
    
    public ArrayList<VeDTO> timKiemTheoTrangThai(String trangThai){
        if(danhSachVe.isEmpty()) {
            layDanhSachVe();
        }
        ArrayList<VeDTO> danhSachTimThay = new ArrayList<>();
        
        for(VeDTO ve : danhSachVe) {
            if(ve.getTrangThaiVe().toLowerCase().trim().contains(trangThai.toLowerCase().trim())){
                danhSachTimThay.add(ve);
            }
        }
        return danhSachTimThay;
    }
    
    public ArrayList<VeDTO> locDanhSachVe(int indexTrangThai, int indexGiaVe, int loaiVe) {
        ArrayList<VeDTO> danhSachVeTimDuoc = new ArrayList<>();
        for (VeDTO ve : danhSachVe) {
            boolean kiemTra = true;
            
            if (indexTrangThai > 0) {
                String trangThaiVe = ve.getTrangThaiVe().trim();     
                
                switch(indexTrangThai) {
                    case 1 :
                        if(!trangThaiVe.equals("Chưa Đặt")) {
                            kiemTra = false;
                        }
                        break;
                    case 2:
                        if(!trangThaiVe.equals("Đã Đặt")) {
                            kiemTra = false;
                        }
                        break;         
                }
            }
            if (indexGiaVe > 0) {
                int giaVe = ve.getGiaVe();       
                switch(indexGiaVe) {
                    case 1 :
                        if(giaVe >= 1_000_000) {
                            kiemTra = false;
                        }
                        break;
                    case 2:
                        if(giaVe < 1_000_000 || giaVe > 2_000_000) {
                            kiemTra = false;
                        }
                        break;
                    case 3: 
                        if(giaVe <= 2_000_000) {
                            kiemTra = false;
                        }
                        break;             
                }
            }            
            
            if(loaiVe > 0) {
                String loaiVeString = ve.getLoaiVe().trim();
                switch(loaiVe) {
                    case 1:
                        if(!loaiVeString.equals("LV-THU")) {
                            kiemTra = false;
                        }
                        break;
                    case 2:
                        if(!loaiVeString.equals("LV-VIP")){
                            kiemTra = false;
                        }
                        break;
                }
            } 
            if (kiemTra) {
                danhSachVeTimDuoc.add(ve);
            }
        }

        return danhSachVeTimDuoc;
    }
}
