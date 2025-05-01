package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.HoaDonDTO;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
public class HoaDonDAO {
    Connection conn = null;
    public ArrayList<HoaDonDTO> layDanhSachHoaDon() {
        ArrayList<HoaDonDTO> dsHoaDOn = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM HoaDon");
            
            while(res.next()) {
                HoaDonDTO hoaDon = new HoaDonDTO();
                hoaDon.setMaHoaDon(res.getString("MaHoaDon"));
                hoaDon.setThoiGian(res.getTime("ThoiGian"));
                hoaDon.setTongTien(res.getInt("TongTien"));
                hoaDon.setMaNhanVien(res.getString("MaNhanVien"));
                hoaDon.setMaKhachHang(res.getString("MaKhachHang"));
                hoaDon.setMaKhuyenMai(res.getString("MakhuyenMai"));
                dsHoaDOn.add(hoaDon);
            }
            ConnectToSQLServer.closeConnection(conn);
        } catch(SQLException e) {
            JOptionPane.showConfirmDialog(null, "Không thể lấy danh sách hóa đơn");
        }
        
        return dsHoaDOn;
    }
}
