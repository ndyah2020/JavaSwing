package DAO;
import Config.database_connection.ConnectToSQLServer;
import DTO.CTHoaDonDTO;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
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

    public boolean themDanhSachCT(ArrayList<CTHoaDonDTO> danhSach) {
        String sql = "INSERT INTO CTHoaDon (MaCTHD, MaHoaDon, MaVe, SoLuong, DonGia) VALUES (?, ?, ?, ?, ?)";

        try {
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);

            for (CTHoaDonDTO ct : danhSach) {
                st.setString(1, ct.getMaCTHD());
                st.setString(2, ct.getMaHoaDon());
                st.setString(3, ct.getMaVe());
                st.setInt(4, ct.getSoLuong());
                st.setInt(5, ct.getDonGia());
                st.addBatch();
            }
            st.executeBatch();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể thêm chi tiết hóa đơn.\nLỗi: " + e.getMessage());
            return false;
        }
    }

}
