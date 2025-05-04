package BUS;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import DAO.ChuyenBayDAO;
import DAO.HoaDonCTDAO;
import DAO.HoaDonDAO;
import DAO.VeDAO;
import DTO.CTHoaDonDTO;
import DTO.ChuyenBayDTO;
import DTO.HoaDonDTO;
import DTO.VeDTO;

public class ThongKeBUS {
    public Map<String, Map<Integer, Integer>> thongKeHoaDonTheoQuy(int nam){
        List<ChuyenBayDTO> dsChuyenBay = new ChuyenBayDAO().layDanhSachChuyenBayDAO();
        List<VeDTO> dsVe = new VeDAO().layDanhSachVe();
        List<HoaDonDTO> dsHoaDon = new HoaDonDAO().layDanhSachHoaDon();
        List<CTHoaDonDTO> dsCTHD = new HoaDonCTDAO().layDanhSachCTHoaDon();

        Map<String, Map<Integer, Integer>> ketQua = new HashMap<>();

        for (ChuyenBayDTO cb : dsChuyenBay) {
            int[] tongTienQuy = new int[4];
            for (VeDTO ve : dsVe) {
                if (!ve.getChuyenBay().equals(cb.getMaChuyenBay())) 
                    continue;
                for (CTHoaDonDTO cthd : dsCTHD) {
                    if (!cthd.getMaVe().equals(ve.getMaVe())) 
                        continue;
                    for (HoaDonDTO hd : dsHoaDon) {
                        if (!hd.getMaHoaDon().equals(cthd.getMaHoaDon())) 
                            continue;
                        Calendar cal = Calendar.getInstance();
                        cal.setTime(hd.getNgayLap());
                        int namHD = cal.get(Calendar.YEAR);
                        if (namHD != nam) 
                            continue;

                        int quy = cal.get(Calendar.MONTH) / 3;
                        int tiGia = ve.getLoaiVe().equalsIgnoreCase("LV-VIP") ? cb.getGiaVip() : cb.getGiaThuong();
                        int thanhTien = cthd.getSoLuong() * ve.getGiaVe() * tiGia;

                        tongTienQuy[quy] += thanhTien;
                    }
                }
            }
            Map<Integer, Integer> quyTien = new HashMap<>();
            for (int i = 0; i < 4; i++) {
                quyTien.put(i + 1, tongTienQuy[i]);
            }
        ketQua.put(cb.getMaChuyenBay(), quyTien);
        }
    return ketQua;
    }
}