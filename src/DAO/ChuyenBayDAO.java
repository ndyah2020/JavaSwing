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

    Connection conn = null;
    public ArrayList<ChuyenBayDTO> layDanhSachChuyenBayDAO() {
        ArrayList<ChuyenBayDTO> dsChuyenBay = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ChuyenBay");
            while (rs.next()) {
                ChuyenBayDTO chuyenBay = new ChuyenBayDTO();
                chuyenBay.setMaChuyenBay(rs.getString("MaChuyenBay"));
                chuyenBay.setNgayXuatPhat(rs.getDate("NgayXuatPhat"));
                chuyenBay.setGioXuatPhat(rs.getTime("GioXuatPhat"));
                chuyenBay.setNgayDenNoi(rs.getDate("NgayDenNoi"));
                chuyenBay.setGioDenNoi(rs.getTime("GioDenNoi"));
                chuyenBay.setGiaThuong(rs.getInt("GiaThuong"));
                chuyenBay.setGiaVip(rs.getInt("GiaVip"));
                chuyenBay.setTrangThaiChuyenBay(rs.getString("TrangThaiChuyenBay"));
                chuyenBay.setTongSoLuongGhe(rs.getInt("TongSoLuongGhe"));
                chuyenBay.setSoGheDaBan(rs.getInt("SoGheDaBan"));
                chuyenBay.setSoGheConLai(rs.getInt("SoGheConLai"));
                chuyenBay.setMaMayBay(rs.getString("MaMayBay"));
                chuyenBay.setMaHanhTrinh(rs.getString("MaHanhTrinh"));  
                dsChuyenBay.add(chuyenBay);
            }
            ConnectToSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không thể lấy danh sách chuyến bay");
        }
        return dsChuyenBay;
    }
    public boolean themChuyenBay(ChuyenBayDTO chuyenBay) {
        try {
            String sql = "INSERT INTO ChuyenBay (MaChuyenBay, NgayXuatPhat, GioXuatPhat, NgayDenNoi, GioDenNoi, GiaThuong, GiaVip, TrangThaiChuyenBay, TongSoLuongGhe, SoGheDaBan, SoGheConLai, MaMayBay, MaHanhTrinh) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, chuyenBay.getMaChuyenBay());
            pst.setDate(2, chuyenBay.getNgayXuatPhat());
            pst.setTime(3, chuyenBay.getGioXuatPhat());
            pst.setDate(4, chuyenBay.getNgayDenNoi());
            pst.setTime(5, chuyenBay.getGioDenNoi());
            pst.setInt(6, chuyenBay.getGiaThuong());
            pst.setInt(7, chuyenBay.getGiaVip());
            pst.setString(8, chuyenBay.getTrangThaiChuyenBay());
            pst.setInt(9, chuyenBay.getTongSoLuongGhe());
            pst.setInt(10, chuyenBay.getSoGheDaBan());
            pst.setInt(11, chuyenBay.getSoGheConLai());
            pst.setString(12, chuyenBay.getMaMayBay());
            pst.setString(13, chuyenBay.getMaHanhTrinh());
            pst.executeUpdate();
            pst.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        }catch(SQLException e) {
            return false;
        }
    }
}
