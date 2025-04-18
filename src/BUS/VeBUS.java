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
    }
    
    public void layDanhSachVe() {
        danhSachVe = dao.layDanhSachVe();
    }
    
    public ArrayList<VeDTO> getDanhSachVe () {
        if(danhSachVe.isEmpty()) {
            layDanhSachVe();
        }
        return danhSachVe;
    }
    
}
