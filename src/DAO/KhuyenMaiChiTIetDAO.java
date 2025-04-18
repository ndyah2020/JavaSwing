package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.CTKhuyenMaiDTO;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class KhuyenMaiChiTIetDAO {
    Connection conn = null;
    
    public ArrayList<CTKhuyenMaiDTO> docDanhSach() {
        ArrayList<CTKhuyenMaiDTO> dsCTKM = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM CTKhuyenMai");
            
            while (rs.next()) {
                CTKhuyenMaiDTO ct = new CTKhuyenMaiDTO();
                ct.setMaCTKhuyenMai(rs.getString("MaCTKhuyenMai"));
                ct.setMaHanhTrinh(rs.getString("MaHanhTrinh"));
                ct.setMaKhuyenMai(rs.getString("MaKhuyenMai"));
                dsCTKM.add(ct);
            }
            
            ConnectToSQLServer.closeConnection(conn);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể đọc danh sách chi tiết khuyến mãi!");
        }
        return dsCTKM;
    }
    
    public boolean themCTKhuyenMai(CTKhuyenMaiDTO ct) {
        try {
            String query = "INSERT INTO CTKhuyenMai (MaCTKhuyenMai, MaHanhTrinh, MaKhuyenMai) VALUES (?, ?, ?)";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, ct.getMaCTKhuyenMai());
            pstmt.setString(2, ct.getMaHanhTrinh());
            pstmt.setString(3, ct.getMaKhuyenMai());

            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể thêm chi tiết khuyến mãi!");
            return false;
        }
    }
    
    public boolean suaCTKhuyenMai(CTKhuyenMaiDTO ct) {
        try {
            String query = "UPDATE CTKhuyenMai SET MaHanhTrinh = ?, MaKhuyenMai = ? WHERE MaCTKhuyenMai = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, ct.getMaHanhTrinh());
            pstmt.setString(2, ct.getMaKhuyenMai());
            pstmt.setString(3, ct.getMaCTKhuyenMai());

            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể sửa chi tiết khuyến mãi!");
            return false;
        }
    }
    
    public boolean xoaCTKhuyenMai(String maCTKhuyenMai) {
        try {
            String query = "DELETE FROM CTKhuyenMai WHERE MaCTKhuyenMai = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, maCTKhuyenMai);

            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể xóa chi tiết khuyến mãi!");
            return false;
        }
    }
}
