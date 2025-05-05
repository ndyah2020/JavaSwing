package BUS;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import DAO.ThongKeDAO;

public class ThongKeBUS {
    private ThongKeDAO dao;

    public ThongKeBUS() {
        dao = new ThongKeDAO();
    }

    public List<Object[]> thongKeChuyenBayTheoNam(int nam) {
        List<Object[]> duLieuRaw = dao.thongKeTheoNam(nam);

        // Dữ liệu dạng Map để gom theo chuyến bay
        Map<String, int[]> thongKeTheoCB = new LinkedHashMap<>();

        for (Object[] row : duLieuRaw) {
            String maCB = (String) row[0];
            int quy = (int) row[1];
            int tien = (int) row[2];

            thongKeTheoCB.putIfAbsent(maCB, new int[5]);
            thongKeTheoCB.get(maCB)[quy - 1] += tien;
            thongKeTheoCB.get(maCB)[4] += tien;
        }

        List<Object[]> ketQua = new ArrayList<>();
        for (Map.Entry<String, int[]> entry : thongKeTheoCB.entrySet()) {
            Object[] row = new Object[6];
            row[0] = entry.getKey();
            for (int i = 0; i < 5; i++) {
                row[i + 1] = entry.getValue()[i];
            }
            ketQua.add(row);
        }

        return ketQua;
    }
}