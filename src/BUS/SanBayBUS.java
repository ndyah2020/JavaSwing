package BUS;

import DAO.SanBayDAO;
import DTO.SanBayDTO;
import java.util.ArrayList;

public class SanBayBUS {
    private SanBayDAO sanBayDAO;
    private ArrayList<SanBayDTO> dsSanBay;
    
    public ArrayList layDanhSachSanBay() {
        sanBayDAO = new SanBayDAO();
        if( dsSanBay == null ){
            dsSanBay = new  ArrayList<SanBayDTO>();
            dsSanBay = sanBayDAO.layDanhSach();
        }
        return dsSanBay;
    }
}
