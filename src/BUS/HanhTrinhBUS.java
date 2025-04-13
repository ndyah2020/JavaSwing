package BUS;

import DAO.HanhTrinhDAO;
import DTO.HanhTrinhDTO;
import java.util.ArrayList;

public class HanhTrinhBUS {
   private ArrayList<HanhTrinhDTO> danhSachHanhTrinh; 
   private final HanhTrinhDAO dao;
   
   public HanhTrinhBUS() {
       danhSachHanhTrinh = new  ArrayList<>();
       dao = new HanhTrinhDAO();
   }
   
   public void layDanhSachHanhTrinhBUS() {
       danhSachHanhTrinh = dao.layDanhSachHanhTrinhDAO();
   }
   public ArrayList<HanhTrinhDTO> getDanhSachHanhTrinhBUS() {
       if(danhSachHanhTrinh.isEmpty()){
           layDanhSachHanhTrinhBUS();
       }
       return danhSachHanhTrinh;
   }
   
   public void themHanhTrinh(HanhTrinhDTO hanhTrinh) {
       if(dao.themHanhTrinh(hanhTrinh)){
           danhSachHanhTrinh.add(hanhTrinh);
       }
   }
}
