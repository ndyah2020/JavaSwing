package BUS;

import DAO.VeDAO;
import DTO.VeDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
    
    public ArrayList<VeDTO> locDanhSachVe(int giaVeTu, int giaVeDen, int loaiVe) {
        ArrayList<VeDTO> danhSachVeTimDuoc = new ArrayList<>();
        for (VeDTO ve : danhSachVe) {
            boolean kiemTra = true;
  
            if(giaVeTu > 0 && giaVeDen > 0) {
                int giaVe = ve.getGiaVe();
                if(giaVe < giaVeTu || giaVe > giaVeDen){
                    kiemTra = false;
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

    public ArrayList<VeDTO> timKiemToanCuc(String tuKhoa) {
        ArrayList<VeDTO> dsTimThay = new ArrayList<>();
        String tuKhoaFm = tuKhoa.toLowerCase().trim();
        for (VeDTO ve : danhSachVe) {
            if (ve.getMaVe().toLowerCase().contains(tuKhoaFm)
                    || ve.getLoaiVe().toLowerCase().contains(tuKhoaFm)
                    || ve.getTrangThaiVe().toLowerCase().contains(tuKhoaFm)
                    || ve.getChuyenBay().toLowerCase().contains(tuKhoaFm)) {
                dsTimThay.add(ve);
            }
        }
        return dsTimThay;
    }

    public ArrayList<VeDTO> timKiemToanCucVer2(String tuKhoa) {
        String tuKhoaFm = tuKhoa.toLowerCase().trim();
        return (ArrayList<VeDTO>) danhSachVe.stream()
                .filter(ve -> 
                        ve.getMaVe().toLowerCase().contains(tuKhoaFm) ||
                        ve.getChuyenBay().toLowerCase().contains(tuKhoaFm) ||
                        ve.getLoaiVe().toLowerCase().contains(tuKhoaFm) ||
                        ve.getTrangThaiVe().toLowerCase().contains(tuKhoaFm)
                )
                .collect(Collectors.toList());
    }
}
