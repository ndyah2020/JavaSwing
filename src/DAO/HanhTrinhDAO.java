package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.HanhTrinhDTO;
import DTO.SanBayDTO;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class HanhTrinhDAO {
    Connection conn = null;
    
    public ArrayList<HanhTrinhDTO> layDanhSachHanhTrinhDAO() {
        ArrayList<HanhTrinhDTO> dsHanhTrinh = new ArrayList<>();
        try{
            conn = ConnectToSQLServer.getConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM HanhTrinh");
            while(res.next()) {
                HanhTrinhDTO hanhTrinh = new HanhTrinhDTO();
                hanhTrinh.setMaHanhTrinh(res.getString("MaHanhTrinh"));
                hanhTrinh.setSanBayDi(res.getString("MaSanBayDi"));
                hanhTrinh.setSanBayDen(res.getString("MaSanBayDen"));
                hanhTrinh.setGiaCoBan(res.getInt("GiaCoBan"));
                dsHanhTrinh.add(hanhTrinh);
            }
            ConnectToSQLServer.closeConnection(conn);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Khong the lay danh sach");
        }
        
        return dsHanhTrinh;
    }
    public boolean themHanhTrinh(HanhTrinhDTO hanhTrinh) {
        try{
            String sql = "INSERT INTO HanhTrinh(MaHanhTrinh, MaSanBayDi, MaSanBayDen, GiaCoBan) VALUES(?,?,?,?)";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, hanhTrinh.getMaHanhTrinh());
            pst.setString(2, hanhTrinh.getSanBayDi());
            pst.setString(3, hanhTrinh.getSanBayDen());
            pst.setDouble(4, hanhTrinh.getGiaCoBan());
            
            pst.executeUpdate();
            pst.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Không thể thêm hành trình");
            return false;
        }
    }
    public boolean xoaHanhTrinh(String maHanhTrinh) {
        try{
            String sql = "DELETE FROM HanhTrinh WHERE = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, maHanhTrinh);
            pst.executeUpdate();
            pst.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Khong the xoa hanh trinh");
            return false;
        }
    }
}
