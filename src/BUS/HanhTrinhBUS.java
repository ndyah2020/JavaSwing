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
   
   public void themHanhTrinhBUS(HanhTrinhDTO hanhTrinh) {
       if(dao.themHanhTrinh(hanhTrinh)){
           danhSachHanhTrinh.add(hanhTrinh);
       }
   }
   
   public void xoaHanhTrinhBUS(String maHanhTrinh) {
       if(dao.xoaHanhTrinh(maHanhTrinh)){
           danhSachHanhTrinh.removeIf(ht -> ht.getMaHanhTrinh().equals(maHanhTrinh));
       }
   }
   public void suaHanhTrinhBUS(HanhTrinhDTO hanhTrinh) {
       if(dao.suaHanhTrinhDAO(hanhTrinh)){
           for(int i = 0; i< danhSachHanhTrinh.size(); i++){
               if(danhSachHanhTrinh.get(i).equals(hanhTrinh.getMaHanhTrinh())){
                   danhSachHanhTrinh.set(i, hanhTrinh);
                   break;
               }
           }
       }
   }
}
