package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.KhuyenMaiDTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class KhuyenMaiDAO {
    Connection conn = null;
    
    public ArrayList<KhuyenMaiDTO> docDanhSach() {
        ArrayList<KhuyenMaiDTO> dsKM = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM KhuyenMai");
            
            while (rs.next()) {
                KhuyenMaiDTO km = new KhuyenMaiDTO();
                km.setMaKhuyenMai(rs.getString("MaKhuyenMai"));
                km.setTenKhuyenMai(rs.getString("TenKhuyenMai"));
                km.setPhanTramGiamGia(rs.getString("PhanTramGiamGia"));
                km.setNgayBatDau(rs.getDate("NgayBatDau"));
                km.setNgayKetThuc(rs.getDate("NgayKetThuc"));
                
          ;      dsKM.add(km);
            }
            
            ConnectToSQLServer.closeConnection(conn);
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể đọc danh sách khuyến mãi!");
        }
        return dsKM;
    }
    
    public boolean kiemTraMaKhuyenMaiDaTonTai(String maKM) {
        String sql = "SELECT 1 FROM KhuyenMai WHERE MaKhuyenMai = ?";
        try (Connection conn = ConnectToSQLServer.getConnection();
             PreparedStatement p = conn.prepareStatement(sql)) {
            p.setString(1, maKM);
            try (ResultSet rs = p.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean themKhuyenMai(KhuyenMaiDTO km) {
        if (kiemTraMaKhuyenMaiDaTonTai(km.getMaKhuyenMai())) {
            return true;
        }
        String sql = "INSERT INTO KhuyenMai (MaKhuyenMai, TenKhuyenMai, NgayBatDau, NgayKetThuc, PhanTramGiamGia) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConnectToSQLServer.getConnection();
             PreparedStatement p = conn.prepareStatement(sql)) {
            p.setString(1, km.getMaKhuyenMai());
            p.setString(2, km.getTenKhuyenMai());
            p.setDate(  3, new java.sql.Date(km.getNgayBatDau().getTime()));
            p.setDate(  4, new java.sql.Date(km.getNgayKetThuc().getTime()));
            p.setString(5, km.getPhanTramGiamGia());
            return p.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể thêm khuyến mãi!");
            return false;
        }
    }
    
    public boolean suaKhuyenMai(KhuyenMaiDTO km) {
        try {
            String query = "UPDATE KhuyenMai SET TenKhuyenMai = ?, NgayBatDau = ?, NgayKetThuc = ?, PhanTramGiamGia = ? WHERE MaKhuyenMai = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, km.getTenKhuyenMai());
            pstmt.setDate(2, new java.sql.Date(km.getNgayBatDau().getTime()));
            pstmt.setDate(3, new java.sql.Date(km.getNgayKetThuc().getTime()));
            pstmt.setString(4, km.getPhanTramGiamGia());
            pstmt.setString(5, km.getMaKhuyenMai());

            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể sửa khuyến mãi!");
            return false;
        }
    }
    
    public boolean xoaKhuyenMai(String maKM) {
        try {
            String query = "DELETE FROM KhuyenMai WHERE MaKhuyenMai = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, maKM);
            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể xóa khuyến mãi!");
            return false;
        }
    }
}
