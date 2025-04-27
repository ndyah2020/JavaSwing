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
    
    public ArrayList<CTKhuyenMaiDTO> docChiTietKMtheoMaKM(String maKM) {
        var list = new ArrayList<CTKhuyenMaiDTO>();
        String sql = "SELECT * FROM CTKhuyenMai WHERE MaKhuyenMai = ?";
        try (Connection conn = ConnectToSQLServer.getConnection();
             PreparedStatement p = conn.prepareStatement(sql)) {
            p.setString(1, maKM);
            try (ResultSet rs = p.executeQuery()) {
                while (rs.next()) {
                    var ct = new CTKhuyenMaiDTO();
                    ct.setMaCTKhuyenMai(rs.getString("MaCTKhuyenMai"));
                    ct.setMaHanhTrinh  (rs.getString("MaHanhTrinh"));
                    ct.setMaKhuyenMai  (rs.getString("MaKhuyenMai"));
                    list.add(ct);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể đọc chi tiết khuyến mãi theo mã KM!");
        }
        return list;
    }
    
    public boolean kiemTraTonTaiCTKMVoiMaHanhTrinh(String maKM, String maHT) {
        String sql = "SELECT 1 FROM CTKhuyenMai WHERE MaKhuyenMai=? AND MaHanhTrinh=?";
        try (Connection conn = ConnectToSQLServer.getConnection();
             PreparedStatement p = conn.prepareStatement(sql)) {
            p.setString(1, maKM);
            p.setString(2, maHT);
            try (ResultSet rs = p.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean themCTKhuyenMai(CTKhuyenMaiDTO ct) {
        String sql = "INSERT INTO CTKhuyenMai(MaCTKhuyenMai,MaHanhTrinh,MaKhuyenMai) VALUES(?,?,?)";
        try (Connection conn = ConnectToSQLServer.getConnection();
             PreparedStatement p = conn.prepareStatement(sql)) {
            p.setString(1, ct.getMaCTKhuyenMai());
            p.setString(2, ct.getMaHanhTrinh());
            p.setString(3, ct.getMaKhuyenMai());
            return p.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể thêm chi tiết khuyến mãi!");
            return false;
        }
    }
    
    public boolean suaCTKhuyenMai(CTKhuyenMaiDTO ct) {
        String sql = "UPDATE CTKhuyenMai SET MaHanhTrinh=?,MaKhuyenMai=? WHERE MaCTKhuyenMai=?";
        try (Connection conn = ConnectToSQLServer.getConnection();
             PreparedStatement p = conn.prepareStatement(sql)) {
            p.setString(1, ct.getMaHanhTrinh());
            p.setString(2, ct.getMaKhuyenMai());
            p.setString(3, ct.getMaCTKhuyenMai());
            return p.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể sửa chi tiết khuyến mãi!");
            return false;
        }
    }
    
    public boolean xoaCTKhuyenMai(String maCTKhuyenMai) {
        String sql = "DELETE FROM CTKhuyenMai WHERE MaCTKhuyenMai=?";
        try (Connection conn = ConnectToSQLServer.getConnection();
             PreparedStatement p = conn.prepareStatement(sql)) {
            p.setString(1, maCTKhuyenMai);
            return p.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể xóa chi tiết khuyến mãi!");
            return false;
        }
    }
    
    public boolean xoaTheoMaKhuyenMai(String maKM) {
        String sql = "DELETE FROM CTKhuyenMai WHERE MaKhuyenMai=?";
        try (Connection conn = ConnectToSQLServer.getConnection();
             PreparedStatement p = conn.prepareStatement(sql)) {
            p.setString(1, maKM);
            return p.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể xóa chi tiết khuyến mãi theo mã KM!");
            return false;
        }
    }
    
    public boolean capNhatMaKhuyenMai(String maCu, String maMoi) {
        String sql = "UPDATE CTKhuyenMai SET MaKhuyenMai=? WHERE MaKhuyenMai=?";
        try (Connection c = ConnectToSQLServer.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, maMoi);
            ps.setString(2, maCu);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi cập nhật mã CTKM: " + e.getMessage());
            return false;
        }
    }
}
