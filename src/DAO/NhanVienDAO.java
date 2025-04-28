package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.NhanVienDTO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
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
            ConnectToSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không thể lấy danh sách nhân viên");
        }
        return danhSachNhanVien;
    }

    public boolean themNhanvien(NhanVienDTO nhanVien) {
        try {
            String sql = "INSERT INTO NhanVien (MaNhanVien, Ho, Ten, GioiTinh, SDT, Email, ChucVu, LuongCoBan, MaTaiKhoan)"
                    + "VALUES (?,?,?,?,?,?,?,?,?)";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nhanVien.getMaNhanVien());
            st.setString(2, nhanVien.getHo());
            st.setString(3, nhanVien.getTen());
            st.setString(4, nhanVien.getGioiTinh());
            st.setString(5, nhanVien.getSdt());
            st.setString(6, nhanVien.getEmail());
            st.setString(7, nhanVien.getChucVu());
            st.setInt(8, nhanVien.getLuongCoBan());
            st.setString(9, nhanVien.getMaTaiKhoan());
            st.executeUpdate();
            ConnectToSQLServer.closeConnection(conn);

            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không thể thêm nhân viên");
            return false;
        }
    }

    public boolean suaNhanVienDAO(NhanVienDTO nhanVien) {
        try {
            String sql = "UPDATE NhanVien "
                    + "SET Ho = ?, "
                    + "    Ten = ?, "
                    + "    GioiTinh = ?, "
                    + "    SDT = ?, "
                    + "    Email = ?, "
                    + "    ChucVu = ?, "
                    + "    LuongCoBan = ?, "
                    + "    MaTaiKhoan = ? "
                    + "WHERE MaNhanVien = ?;";
            conn = ConnectToSQLServer.getConnection();

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nhanVien.getHo());
            st.setString(2, nhanVien.getTen());
            st.setString(3, nhanVien.getGioiTinh());
            st.setString(4, nhanVien.getSdt());
            st.setString(5, nhanVien.getEmail());
            st.setString(6, nhanVien.getChucVu());
            st.setInt(7, nhanVien.getLuongCoBan());
            st.setString(8, nhanVien.getMaTaiKhoan());
            st.setString(9, nhanVien.getMaNhanVien());
            
            st.executeUpdate();
            st.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {      
            JOptionPane.showMessageDialog(null, "Không thể sửa nhân viên");
            return false;
        }
    }
    
    public boolean xoaNhanVien(String maNhanVien) {
        try {
            String sql = "DELETE FROM NhanVien WHERE  MaNhanVien = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, maNhanVien);
            st.executeUpdate();
            ConnectToSQLServer.closeConnection(conn);
            st.close();
            return true;
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Không thể xóa nhân viên");
            return false;
        }
    }
}
