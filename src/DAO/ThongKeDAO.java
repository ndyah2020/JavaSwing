package DAO;
import Config.database_connection.ConnectToSQLServer;
import DTO.ThongKeKhachHangDTO;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
public class ThongKeDAO {
    Connection conn = null;
    
    public ArrayList<ThongKeKhachHangDTO> thongKeDoanhThuTheoHoaDon() {
        ArrayList<ThongKeKhachHangDTO> danhSach = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT kh.MaKhachHang, kh.Ho, kh.Ten, hd.NgayLap, hd.TongTien"
                    + " FROM HoaDon hd"
                    + " join KhachHang kh on kh.MaKhachHang = hd.MaKhachHang");
            while(res.next()) {
                ThongKeKhachHangDTO thongKe = new ThongKeKhachHangDTO();
                thongKe.setMaKhachHang(res.getString("MaKhachHang"));
                thongKe.setHoKhachHang(res.getString("Ho"));
                thongKe.setTenKhachHang(res.getString("Ten"));
                thongKe.setNgayMua(res.getDate("NgayLap"));
                thongKe.setTongSoTien(res.getInt("TongTien"));
                danhSach.add(thongKe);
            }
            ConnectToSQLServer.closeConnection(conn);
        }catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Không thể lấy danh  sách");
        }
        return danhSach;
    }

    public List<Object[]> thongKeTheoNam(int nam) {
        List<Object[]> list = new ArrayList<>();
        String sql = "SELECT cb.MaChuyenBay, DATEPART(QUARTER, hd.NgayLap) AS Quy, SUM(cthd.SoLuong * cthd.DonGia) AS TongTien "
                    + "FROM HoaDon hd "
                    + "JOIN CTHoaDon cthd ON hd.MaHoaDon = cthd.MaHoaDon "
                    + "JOIN Ve v ON v.MaVe = cthd.MaVe "
                    + "JOIN ChuyenBay cb ON cb.MaChuyenBay = v.MaChuyenBay "
                    + "WHERE YEAR(hd.NgayLap) = ? "
                    + "GROUP BY cb.MaChuyenBay, DATEPART(QUARTER, hd.NgayLap) "
                    + "ORDER BY cb.MaChuyenBay, Quy";
    
        try (Connection con = ConnectToSQLServer.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {
    
            ps.setInt(1, nam);
            ResultSet rs = ps.executeQuery();
    
            while (rs.next()) {
                String maCB = rs.getString("MaChuyenBay");
                int quy = rs.getInt("Quy");
                int tong = rs.getInt("TongTien");
    
                list.add(new Object[]{maCB, quy, tong});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
