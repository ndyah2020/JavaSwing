package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.NhanVienDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class NhanVienDAO {
    Connection conn = null;
    
    public ArrayList<NhanVienDTO> layDanhSachNhanVienDAO() {
        ArrayList<NhanVienDTO> danhSachNhanVien = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM NhanVien");
            while (res.next()) {
                NhanVienDTO nhanVien = new NhanVienDTO();
                nhanVien.setMaNhanVien(res.getString("MaNhanVien"));
                nhanVien.setHo(res.getString("Ho"));
                nhanVien.setTen(res.getString("Ten"));
                nhanVien.setGioiTinh(res.getString("GioiTinh"));
                nhanVien.setSdt(res.getString("SDT"));
                nhanVien.setEmail(res.getString("Email"));
                nhanVien.setChucVu(res.getString("ChucVu"));
                nhanVien.setLuongCoBan(res.getInt("LuongCoBan"));
                nhanVien.setMaTaiKhoan(res.getString("MaTaiKhoan"));
                danhSachNhanVien.add(nhanVien);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không thể lấy danh sách nhân viên");
        }
        return danhSachNhanVien;
    }
}
