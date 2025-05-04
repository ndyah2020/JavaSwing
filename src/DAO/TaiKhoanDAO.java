package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.TaiKhoanDTO;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.Component;

public class TaiKhoanDAO {
    Connection conn = null;
    
    public ArrayList<TaiKhoanDTO> layDanhSachTaiKhoanDAO() {
        ArrayList<TaiKhoanDTO>  dsTaiKhoan = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT MaTaiKhoan, Email, TrangThai, VaiTro FROM TaiKhoan");
            while(res.next()) {
                TaiKhoanDTO taiKhoan = new TaiKhoanDTO();
                taiKhoan.setMaTaiKhoan(res.getString("MaTaiKhoan"));
                taiKhoan.setEmail(res.getString("Email"));
                taiKhoan.setTrangThai(res.getString("TrangThai"));
                taiKhoan.setVaiTro(res.getString("VaiTro"));
                dsTaiKhoan.add(taiKhoan);
            }
            ConnectToSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Không thể lấy danh sách tài khoản");
        }
        return dsTaiKhoan;
    }

    public boolean themTaiKhoanDAO(TaiKhoanDTO taiKhoan) {
        try {
            String query = "Insert into TaiKhoan (MaTaiKhoan, Email, MatKhau, VaiTro, OTP, HanOTP, TrangThai) values (?, ?, ?, ?, ?, ?, ?)";
            conn = ConnectToSQLServer.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, taiKhoan.getMaTaiKhoan());
            pstmt.setString(2, taiKhoan.getEmail());
            pstmt.setString(3, taiKhoan.getMatKhau());
            pstmt.setString(4, taiKhoan.getVaiTro());
            pstmt.setString(5, taiKhoan.getOtp());
            pstmt.setString(6, taiKhoan.getOtpHetHan());
            pstmt.setString(7, taiKhoan.getTrangThai());
            pstmt.executeUpdate();
            pstmt.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog((Component)null, "Không thể thêm vào danh sách!");
            return false;
        }
    }
}
