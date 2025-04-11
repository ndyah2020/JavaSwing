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
    
    public void themSanBay(SanBayDTO sanBay) {
        SanBayDAO dao = new SanBayDAO();
        if(dao.themSanBay(sanBay)){
            danhSachSanBay.add(sanBay);
        }
    }
    public void xoaSanBay(String maSanBay) {
        SanBayDAO dao = new SanBayDAO();
        if(dao.xoaSanBay(maSanBay)){
            danhSachSanBay.removeIf(sb -> sb.getMaSanBay().equals(maSanBay));
        }
    }
    public void suaSanBay(SanBayDTO sanBay) {
        SanBayDAO dao = new SanBayDAO();
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
