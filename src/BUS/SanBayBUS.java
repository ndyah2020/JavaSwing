package BUS;

import DAO.SanBayDAO;
import DTO.SanBayDTO;
import java.util.ArrayList;

public class SanBayBUS {
    private ArrayList<SanBayDTO> danhSachSanBay;
    private final SanBayDAO dao;
    
    public SanBayBUS() {
        dao = new SanBayDAO();
        danhSachSanBay = new ArrayList<>();
    }
    
    public void layDanhSachSanBay() {
        danhSachSanBay = dao.layDanhSach();
    }
    
    public ArrayList<SanBayDTO> getDanhSachSanBay() {
        if(danhSachSanBay.isEmpty()){
            layDanhSachSanBay();
        }
        return danhSachSanBay;
    }
    
    public void themSanBay(SanBayDTO sanBay) {
        if(dao.themSanBay(sanBay)){
            danhSachSanBay.add(sanBay);
        }
    }
    public void xoaSanBay(String maSanBay) {
        if(dao.xoaSanBay(maSanBay)){
            danhSachSanBay.removeIf(sb -> sb.getMaSanBay().equals(maSanBay));
        }
    }
    public void suaSanBay(SanBayDTO sanBay) {
        if(dao.suaSanBay(sanBay)){
            for(int i = 0; i < danhSachSanBay.size(); i++){
                if(danhSachSanBay.get(i).equals(sanBay.getMaSanBay())){
                   danhSachSanBay.set(i, sanBay);
                   break;
                }
            }
        }
    }
}
