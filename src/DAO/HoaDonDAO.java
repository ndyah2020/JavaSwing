package DAO;

import Config.database_connection.ConnectToSQLServer;
import DTO.CTHoaDonDTO;
import DTO.HoaDonDTO;
import java.sql.Connection;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class HoaDonDAO {

    Connection conn = null;

    public ArrayList<HoaDonDTO> layDanhSachHoaDon() {
        ArrayList<HoaDonDTO> dsHoaDOn = new ArrayList<>();
        try {
            conn = ConnectToSQLServer.getConnection();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM HoaDon");

            while (res.next()) {
                HoaDonDTO hoaDon = new HoaDonDTO();
                hoaDon.setMaHoaDon(res.getString("MaHoaDon"));
                hoaDon.setNgayLap(res.getDate("NgayLap"));
                hoaDon.setTongTien(res.getInt("TongTien"));
                hoaDon.setMaNhanVien(res.getString("MaNV"));
                hoaDon.setMaKhachHang(res.getString("MaKhachHang"));

                String maKhuyenMai = res.getString("MakhuyenMai");
                if (maKhuyenMai == null) {
                    hoaDon.setMaKhuyenMai("None");
                } else {
                    hoaDon.setMaKhuyenMai(res.getString("MakhuyenMai"));
                }

                dsHoaDOn.add(hoaDon);
            }
            ConnectToSQLServer.closeConnection(conn);
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "Không thể lấy danh sách hóa đơn");
        }
        return dsHoaDOn;
    }

    public boolean themHoaDonVaChiTiet(HoaDonDTO hoaDon, ArrayList<CTHoaDonDTO> danhSachCT, ArrayList<String> danhSachmaVe) {
        Connection conn = null;
        try {
            conn = ConnectToSQLServer.getConnection();
            conn.setAutoCommit(false); // Bắt đầu transaction

            // 1. Thêm hóa đơn
            String sqlHD = "INSERT INTO HoaDon (MaHoaDon, NgayLap, TongTien, MaKhachHang, MaNV) VALUES (?,?,?,?,?)";
            PreparedStatement stHD = conn.prepareStatement(sqlHD);
            stHD.setString(1, hoaDon.getMaHoaDon());
            stHD.setDate(2, hoaDon.getNgayLap());
            stHD.setInt(3, hoaDon.getTongTien());
            stHD.setString(4, hoaDon.getMaKhachHang());
            stHD.setString(5, hoaDon.getMaNhanVien());
            stHD.executeUpdate();

            // 2. Thêm chi tiết hóa đơn
            String sqlCT = "INSERT INTO CTHoaDon (MaCTHD, MaHoaDon, MaVe, SoLuong, DonGia) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stCT = conn.prepareStatement(sqlCT);
            for (CTHoaDonDTO ct : danhSachCT) {
                stCT.setString(1, ct.getMaCTHD());
                stCT.setString(2, ct.getMaHoaDon());
                stCT.setString(3, ct.getMaVe());
                stCT.setInt(4, ct.getSoLuong());
                stCT.setInt(5, ct.getDonGia());
                stCT.addBatch();
            }
            stCT.executeBatch();

            // 3. Cập nhật trạng thái vé
            String sqlVe = "UPDATE Ve SET TrangThaiVe = ? WHERE MaVe = ?";
            PreparedStatement stVe = conn.prepareStatement(sqlVe);
            for (String maVe : danhSachmaVe) {
                stVe.setString(1, "Đã Đặt");
                stVe.setString(2, maVe);
                stVe.addBatch();
            }
            stVe.executeBatch();

            // Nếu mọi thứ OK → commit
            conn.commit();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                if (conn != null) {
                    conn.rollback(); // Nếu lỗi → rollback
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(null, "Thêm hóa đơn thất bại.\nLỗi: " + e.getMessage());
            return false;
        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true); // Đưa lại trạng thái mặc định
                }
                ConnectToSQLServer.closeConnection(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
