package DAO;
import Config.database_connection.ConnectToSQLServer;
import DTO.ChuyenBayDTO;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ChuyenBayDAO {
//    Connection conn = null;
//    public ArrayList<ChuyenBayDTO> layDanhSachChuyenBayDTO() {
//        try {
//            conn = ConnectToSQLServer.getConnection();
//            Statement st = conn.createStatement();
//            ResultSet rs = st.executeQuery("SELETE * FROM ChuyenBay");
//            ChuyenBayDTO chuyenBay = new ChuyenBayDTO();
//            chuyenBay.setMaChuyenBay(rs.getString("MaChuyenBay"));
//            chuyenBay.set
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Không thể lấy danh sách chuyến bay");
//        }
//                
//    }
}
