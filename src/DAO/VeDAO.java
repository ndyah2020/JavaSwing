package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.VeDTO;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VeDAO {

    Connection conn = null;

    public ArrayList<VeDTO> layDanhSachVe() {
        ArrayList<VeDTO> dsVe = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM Ve");

            while (res.next()) {
                VeDTO ve = new VeDTO();
                ve.setMaVe(res.getString("MaVe"));
                ve.setTrangThaiVe(res.getString("TrangThaiVe"));
                ve.setGiaVe(res.getInt("GiaVe"));
                ve.setLoaiVe(res.getString("MaLoaiVe"));
                ve.setChuyenBay(res.getString("MaChuyenBay"));
                dsVe.add(ve);
            }
            ConnectToSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Khong the lay danh sach");
        }
        return dsVe;
    }

    public boolean sinhVeTuDong(String maChuyenBay) {
        try {
            conn = ConnectToSQLServer.getConnection();
            String sql = "SELECT ht.GiaCoBan, mb.SoLuongGheThuong, mb.SoLuongGheVip, "
                    + "lmb.HeSoGiaThuong, lmb.HeSoGiaVip "
                    + "FROM ChuyenBay cb "
                    + "JOIN HanhTrinh ht ON cb.MaHanhTrinh = ht.MaHanhTrinh "
                    + "JOIN MayBay mb ON cb.MaMayBay = mb.MaMayBay "
                    + "JOIN LoaiMayBay lmb ON lmb.MaLoai = mb.MaLoaiMayBay "
                    + "WHERE cb.MaChuyenBay = ?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, maChuyenBay);
            ResultSet res = st.executeQuery();

            if (res.next()) {
                int giaCoBan = res.getInt("GiaCoBan");
                int soGheThuong = res.getInt("SoLuongGheThuong");
                int soGheVip = res.getInt("SoLuongGheVip");
                float heSoGiaThuong = res.getFloat("HeSoGiaThuong");
                float heSoGiaVip = res.getFloat("HeSoGiaVip");

                int giaThuong = Math.round(giaCoBan * heSoGiaThuong);
                int giaVip = Math.round(giaCoBan * heSoGiaVip);

                // Tạo vé thường
                String sqlThem = "INSERT INTO Ve (MaVe, TrangThaiVe, GiaVe, MaLoaiVe, MaChuyenBay) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement themVe = conn.prepareStatement(sqlThem);
                
                for (int i = 1; i <= soGheThuong; i++) {
                    String maVe = maChuyenBay + "-TH-" + i;
                    themVe.setString(1, maVe);
                    themVe.setString(2, "Chưa Đặt");
                    themVe.setInt(3, giaThuong);
                    themVe.setString(4, "LV-THU");
                    themVe.setString(5, maChuyenBay);
                    themVe.addBatch();
                }

                // Tạo vé VIP
                for (int i = 1; i <= soGheVip; i++) {
                    String maVe = maChuyenBay + "-VIP-" + i;
                    themVe.setString(1, maVe);
                    themVe.setString(2, "Chưa Đặt");
                    themVe.setInt(3, giaVip);
                    themVe.setString(4, "LV-VIP");
                    themVe.setString(5, maChuyenBay);                  
                    themVe.addBatch();
                }              
                themVe.executeBatch();       
                themVe.close();
            }
            res.close();
            st.close();
            ConnectToSQLServer.closeConnection(conn);
            return true;
        } catch (SQLException e) {
            e.printStackTrace(); 
            JOptionPane.showMessageDialog(null, "Khong the sinh ve");
            return false;
        }
    }
    
    public void capNhatTrangThaiVeDaDat(ArrayList<String> danhSachMaVe) {
        try {
            String sql = "UPDATE Ve SET TrangThaiVe = ? WHERE MaVe = ?";    
            conn = ConnectToSQLServer.getConnection();
              PreparedStatement st = conn.prepareStatement(sql);
            for (String maVe : danhSachMaVe) {
                st.setString(1, "Đã Đặt");
                st.setString(2, maVe);
                st.addBatch();
            }
            st.executeBatch();
            ConnectToSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Không thể cập nhật trạng thái vé");
        }
    }
}
