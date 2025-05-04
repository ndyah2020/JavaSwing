package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.KhachHangDTO;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class KhachHangDAO {
    Connection conn = null;
    public ArrayList<KhachHangDTO> docDanhSach() {
        ArrayList<KhachHangDTO> dsKhachHang = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM KhachHang");
        while(rs.next()) {
            KhachHangDTO khachHang = new KhachHangDTO();
            khachHang.setMaKhachHang(rs.getString("MaKhachHang"));
            khachHang.setHo(rs.getString("Ho"));
            khachHang.setTen(rs.getString("Ten"));
            khachHang.setGioiTinh(rs.getString("GioiTinh"));
            khachHang.setNgaySinh(rs.getDate("NgaySinh"));
            khachHang.setSdt(rs.getString("SDT"));
            khachHang.setEmail(rs.getString("email"));
            khachHang.setCccd(rs.getString("cccd"));
            dsKhachHang.add(khachHang);
        }

            ConnectToSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog((Component)null, "Không thể đọc danh sách");
        }
        return dsKhachHang;
    }

    public boolean themKhachHang(KhachHangDTO khachHang) {
        try {
            String query = "Insert into KhachHang (MaKhachHang, Ho, Ten, GioiTinh, NgaySinh, SDT, email, cccd) values (?, ?, ?, ?, ?, ?, ?, ?)";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, khachHang.getMaKhachHang());
            pstmt.setString(2, khachHang.getHo());
            pstmt.setString(3, khachHang.getTen());
            pstmt.setString(4, khachHang.getGioiTinh());
            pstmt.setDate(5, khachHang.getNgaySinh());
            pstmt.setString(6, khachHang.getSdt());
            pstmt.setString(7, khachHang.getEmail());
            pstmt.setString(8, khachHang.getCccd());
            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog((Component)null, "Không thể thêm vào danh sách!");
            return false;
        }
    }

    public Boolean suaKhachHang(KhachHangDTO khachHang) {
        try {
            String query = "UPDATE KhachHang SET Ho = ?, Ten = ?, GioiTinh = ?, NgaySinh = ?, SDT = ?, email = ?, cccd = ? Where MaKhachHang = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, khachHang.getMaKhachHang());
            pstmt.setString(2, khachHang.getHo());
            pstmt.setString(3, khachHang.getTen());
            pstmt.setString(4, khachHang.getGioiTinh());
            pstmt.setDate(5, khachHang.getNgaySinh());
            pstmt.setString(6, khachHang.getSdt());
            pstmt.setString(7, khachHang.getEmail());
            pstmt.setString(8, khachHang.getCccd());
            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog((Component)null, "Không thể cập nhật khách hàng này!");
            return false;
        }
    }

    public Boolean xoaKhachHang(String maKhachHang) {
        try {
            String query = "DELETE FROM KhachHang WHERE MaKhachHang = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, maKhachHang);
            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog((Component)null, "Không thể xóa khách hàng này!");
            return false;
        }
    }
}