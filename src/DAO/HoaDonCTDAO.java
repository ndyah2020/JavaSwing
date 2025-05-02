package DAO;
import Config.database_connection.ConnectToSQLServer;
import DTO.CTHoaDonDTO;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class HoaDonCTDAO {
    Connection conn = null;
    public ArrayList<CTHoaDonDTO> layDanhSachCTHoaDon() {
        ArrayList<CTHoaDonDTO> dsCtHoaDon =  new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM CTHoaDon");
            while(res.next()) {
                CTHoaDonDTO ctHoaDon = new CTHoaDonDTO();
                ctHoaDon.setMaCTHD(res.getString("MaCTHD"));
                ctHoaDon.setSoLuong(res.getInt("SoLuong"));
                ctHoaDon.setDonGia(res.getInt("DonGia"));
                ctHoaDon.setMaHoaDon(res.getString("MaHoaDon"));
                ctHoaDon.setMaVe(res.getString("MaVe"));
                dsCtHoaDon.add(ctHoaDon);
            }
            ConnectToSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            
        }      
        return dsCtHoaDon;
    }
}
