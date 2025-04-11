package BUS;

import DAO.SanBayDAO;
import DTO.SanBayDTO;
import java.util.ArrayList;

public class SanBayBUS {
    private ArrayList<SanBayDTO> danhSachSanBay;
    
    public SanBayBUS() {
        danhSachSanBay = new ArrayList<>();
        layDanhSachSanBay();
    }
    public void layDanhSachSanBay() {
        SanBayDAO dao = new SanBayDAO();
        danhSachSanBay = dao.layDanhSach();
    }
    public ArrayList<SanBayDTO> getDanhSachSanBay() {
        return danhSachSanBay;
    }
    
    public void themSanBay(SanBayDTO newSanBay) {
        SanBayDAO dao = new SanBayDAO();
        if(dao.themSanBay(newSanBay)){
            danhSachSanBay.add(newSanBay);
        }
    }
}
