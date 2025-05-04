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
            String sql = "INSERT INTO ChuyenBay (MaChuyenBay, NgayXuatPhat, GioXuatPhat, NgayDenNoi, GioDenNoi, GiaThuong, GiaVip, TrangThaiChuyenBay, TongSoLuongGhe, SoGheDaBan, SoGheConLai, MaMayBay, MaHanhTrinh) "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
            int row = pst.executeUpdate();
            if(row > 0) {
                VeDAO ve = new VeDAO();
                ve.sinhVeTuDong(chuyenBay.getMaChuyenBay());
                pst.close();
                ConnectToSQLServer.closeConnection(conn);
                return true;
            }else {
                return false;
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Khong the them chuyen bay");
            return false;
        }
    }
    
    public boolean xoaChuyenBay(String maChuyenBay) {
        try {
            String sql = "DELETE FROM HanhTrinh WHERE MaHanhTrinh = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, maChuyenBay);
            pst.executeUpdate();
            pst.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        }catch (SQLException e) {
            return false;
        }
    }
    
    public boolean suaChuyenBay(ChuyenBayDTO chuyenBay) {
        try {
            String sql = "UPDATE ChuyenBay SET NgayXuatPhat = ? , GioXuatPhat = ?, NgayDenNoi = ?, GioDenNoi = ? WHERE MaChuyenBay = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setDate(1, chuyenBay.getNgayXuatPhat());
            pst.setTime(2, chuyenBay.getGioXuatPhat());
            pst.setDate(3, chuyenBay.getNgayDenNoi());
            pst.setTime(4, chuyenBay.getGioDenNoi());
            pst.setString(5, chuyenBay.getMaChuyenBay());
            pst.executeUpdate();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không thể sửa chuyến bay");
            e.printStackTrace();
            return false;
        }
    }

    public boolean capNhatSoLuongVe(String maChuyenBay, int soVeDaBan, int tongSoVe) {
        try {
            String sql = "UPDATE ChuyenBay SET SoGheDaBan = ?, SoGheConLai = ? WHERE MaChuyenBay = ?";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1, soVeDaBan);
            st.setInt(2, tongSoVe - soVeDaBan);
            st.setString(3, maChuyenBay);
            st.executeUpdate();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không thể cập nhật số ghế");
            e.printStackTrace();
            return false;
        }
    }
}
