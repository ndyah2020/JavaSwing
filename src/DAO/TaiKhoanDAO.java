package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.TaiKhoanDTO;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
}
