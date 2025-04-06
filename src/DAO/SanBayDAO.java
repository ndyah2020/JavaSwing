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
    private Connection conn = ConnectToSQLServer.getConnection();
    
    public ArrayList layDanhSach() {
        ArrayList dsSanBay = new ArrayList<SanBayDTO>();
        try {
            
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
    
}
