package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.LoaiMayBayDTO;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class LoaiMayBayDAO {
    Connection conn = null;
    
    public ArrayList<LoaiMayBayDTO> docDanhSach() {
        ArrayList<LoaiMayBayDTO> dsLoaiMayBay = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * From LoaiMayBay");

            while(rs.next()) {
                LoaiMayBayDTO loaiMayBay = new LoaiMayBayDTO();
                loaiMayBay.setMaLoai(rs.getString("maLoai"));
                loaiMayBay.setTenLoai(rs.getString("tenLoai"));
                loaiMayBay.setHeSoGiaThuong(rs.getFloat("heSoGiaThuong"));
                loaiMayBay.setHeSoGiaVip(rs.getFloat("heSoGiaVip"));
                dsLoaiMayBay.add(loaiMayBay); 

            }
            ConnectToSQLServer.closeConnection(conn);
        } catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể đọc danh sách");
        }
        return dsLoaiMayBay;   
    }
    
    public Boolean themLoaiMayBay (LoaiMayBayDTO loaiMayBay) {
        try {
            String query = "Insert into LoaiMayBay (MaLoai, TenLoai, HeSoGiaThuong, HeSoGiaVip) values (?, ?, ?, ?)";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            pstmt.setString(1, loaiMayBay.getMaLoai());
            pstmt.setString(2, loaiMayBay.getTenLoai());
            pstmt.setFloat(3, loaiMayBay.getHeSoGiaThuong());
            pstmt.setFloat(4, loaiMayBay.getHeSoGiaVip());
            
            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể thêm vào danh sách!");
            return false;
        }
    }
    
    public Boolean xoaLoaiMayBay(String maLoaiMayBay) {
        try {
            String query = "DELETE FROM LoaiMayBay WHERE MaLoai = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            
            pstmt.setString(1, maLoaiMayBay);
            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể xóa loại máy bay này!");
            return false;
        }
    }
    
    public Boolean suaLoaiMayBay(LoaiMayBayDTO loaiMayBay){
        try {
            String query = "UPDATE LoaiMayBay SET TenLoai = ?, HeSoGiaThuong = ?, HeSoGiaVip = ? Where MaLoai = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, loaiMayBay.getTenLoai());
            pstmt.setFloat(2, loaiMayBay.getHeSoGiaThuong());
            pstmt.setFloat(3, loaiMayBay.getHeSoGiaVip());
            pstmt.setString(4, loaiMayBay.getMaLoai());

            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể cập nhật loại máy bay này!");
            return false;
        }
    }
}