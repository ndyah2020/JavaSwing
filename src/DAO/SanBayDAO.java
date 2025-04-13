package DAO;

import DTO.SanBayDTO;
import Config.database_connection.ConnectToSQLServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SanBayDAO {
    Connection conn = null;
    
    public ArrayList<SanBayDTO> layDanhSach() {
        ArrayList<SanBayDTO> dsSanBay = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("Select * from SanBay");
            
            while(res.next()){
                SanBayDTO sanBay = new SanBayDTO();
                sanBay.setMaSanBay(res.getString("maSanBay"));
                sanBay.setTenSanBay(res.getString("tenSanBay"));
                sanBay.setDiaChi(res.getString("diaChi"));
                dsSanBay.add(sanBay);
            }
            ConnectToSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Khôn thể lấy danh sách");
        }
        return dsSanBay;
    }
    public Boolean themSanBay(SanBayDTO sanBay) {
        try{
            String sql = "Insert into SanBay(MaSanBay, TenSanBay, DiaChi) values (?,?,?)";
            conn = ConnectToSQLServer.getConnection();     
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, sanBay.getMaSanBay());
            pst.setString(2, sanBay.getTenSanBay());
            pst.setString(3, sanBay.getDiaChi());
            
            pst.executeUpdate();
            pst.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Không thể thêm danh sách");
             return false;
        }
    }
    
    public Boolean xoaSanBay(String maSanBay) {
        try {
            String sql = "DELETE FROM SanBay WHERE MaSanBay = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, maSanBay);
            pst.executeUpdate();
            pst.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể xóa sân bay");
            return false;
        }
    }
    public Boolean suaSanBay(SanBayDTO sanBay) {
        try {
            String sql = "UPDATE SanBay SET TenSanBay = ?, DiaChi = ? Where MaSanBay = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, sanBay.getTenSanBay());
            pst.setString(2, sanBay.getDiaChi());
            pst.setString(3, sanBay.getMaSanBay());
            
            pst.executeUpdate();
            pst.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể cập nhật sân bay");
            return false;
        }
    }
}
