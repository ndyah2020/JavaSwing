package DAO;

import DTO.SanBayDTO;
import Config.database_connection.ConnectToSQLServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.UUID;
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
            String sql = "Insert into MayBay(MaSanBay, TenSanBay, DiaChi) values (? , ? , ?)";
            conn = ConnectToSQLServer.getConnection();
            
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, sanBay.getMaSanBay());
            pst.setString(2, sanBay.getTenSanBay());
            pst.setString(3, sanBay.getDiaChi());
            pst.executeUpdate();
            ConnectToSQLServer.closeConnection(conn);
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Không thể thêm danh sách");
             return false;
        }
        return true;
    }
}
