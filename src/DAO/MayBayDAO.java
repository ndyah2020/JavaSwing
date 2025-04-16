package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.MayBayDTO;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class MayBayDAO {
    Connection conn = null;

    public ArrayList<MayBayDTO> docDanhSach(){
        ArrayList<MayBayDTO> dsMayBay = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("Select * From MayBay");


            while(rs.next()) {
                MayBayDTO mayBay = new MayBayDTO();
                mayBay.setMaMayBay(rs.getString("MaMayBay"));
                mayBay.setTenMayBay(rs.getString("TenMayBay"));
                mayBay.setSoLuongGheThuong(rs.getInt("SoLuongGheThuong"));
                mayBay.setSoLuongGheVip(rs.getInt("SoLuongGheVip"));
                mayBay.setTongSoLuongGhe(rs.getInt("TongSoLuongGhe"));
                mayBay.setMaLoaiMayBay(rs.getString("MaLoaiMayBay"));

                dsMayBay.add(mayBay);
            }
            ConnectToSQLServer.closeConnection(conn);
        } catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể đọc danh sách máy bay!");
        }
        return dsMayBay;
    }

    public Boolean xoaMayBay(String maMayBay) {
        try {
            String query = "Delete From MayBay Where MaMayBay = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, maMayBay);
            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể xóa máy bay này");
            return false;
        }
    }

    public Boolean themMayBay(MayBayDTO mayBay) {
        try {
            int tongSoLuongGhe = mayBay.getSoLuongGheThuong() + mayBay.getSoLuongGheVip();

            String query = "Insert Into MayBay (MaMayBay, TenMayBay, SoLuongGheThuong, SoLuongGheVip, TongSoLuongGhe, MaLoaiMayBay) Values (?, ?, ?, ?, ?, ?)";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt= conn.prepareStatement(query);

            pstmt.setString(1, mayBay.getMaMayBay());
            pstmt.setString(2, mayBay.getTenMayBay());
            pstmt.setInt(3, mayBay.getSoLuongGheThuong());
            pstmt.setInt(4, mayBay.getSoLuongGheVip());
            pstmt.setInt(5, tongSoLuongGhe);
            pstmt.setString(6, mayBay.getMaLoaiMayBay());

            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể thêm máy bay Này");
            return false;
        }
    }

    public Boolean suaMayBay(MayBayDTO mayBay) {
        try {
            int tongSoLuongGhe = mayBay.getSoLuongGheThuong() + mayBay.getSoLuongGheVip();

            String query = "Update MayBay Set TenMayBay = ?, SoLuongGheThuong = ?, SoLuongGheVip = ?, TongSoLuongGhe = ?, MaLoaiMayBay = ? Where MaMayBay = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setString(1, mayBay.getTenMayBay());
            pstmt.setInt(2, mayBay.getSoLuongGheThuong());
            pstmt.setInt(3, mayBay.getSoLuongGheVip());
            pstmt.setInt(4, tongSoLuongGhe);
            pstmt.setString(5, mayBay.getMaLoaiMayBay());
            pstmt.setString(6, mayBay.getMaMayBay());

            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch(SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Không thể cập nhật máy bay này!");
            return false;
        }
    }
}