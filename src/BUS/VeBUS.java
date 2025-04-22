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
    
    public VeDTO timVeDaDatTuChuyenBay(String maChuyenBay){
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
    
    public ArrayList<VeDTO> locDanhSachVe(String trangThai, String giaVe, String loaiVe) {
        ArrayList<VeDTO> danhSachVeTimDuoc = new ArrayList<>();
        if(!trangThai.isEmpty() || !giaVe.isEmpty() || !loaiVe.isEmpty()) {
            
        } else {
            danhSachVeTimDuoc.addAll(danhSachVe);
        }
        return danhSachVeTimDuoc;
    }
}
