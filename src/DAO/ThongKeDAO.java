package DAO;
import Config.database_connection.ConnectToSQLServer;
import DTO.ThongKeKhachHangDTO;
import java.sql.Connection;
import java.util.ArrayList;
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
            }
        }catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Không thể lấy danh  sách");
        }
        return danhSach;
    }
}
