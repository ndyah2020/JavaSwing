package BUS;

import DAO.TaiKhoanDAO;
import DTO.KhachHangDTO;
import DTO.TaiKhoanDTO;
import java.util.ArrayList;

public class TaiKhoanBUS {
    private ArrayList<TaiKhoanDTO> danhSachTaiKhoan;
    private final TaiKhoanDAO dao;
    
    public TaiKhoanBUS() {
        danhSachTaiKhoan = new ArrayList<>();
        dao = new TaiKhoanDAO();
        layDanhSachTaiKhoanTuDao();
    }
    
    private void docDSTaiKhoan(){
        danhSachTaiKhoan = dao.layDanhSachTaiKhoanDAO();
    }

    private void layDanhSachTaiKhoanTuDao() {
        danhSachTaiKhoan = dao.layDanhSachTaiKhoanDAO();
    }
    
    public ArrayList<TaiKhoanDTO> getDanhSachTaiKhoan() {
        return danhSachTaiKhoan;
    }

    public void themTaiKhoan(TaiKhoanDTO taiKhoan) {
        if (dao.themTaiKhoanDAO(taiKhoan)) {
            danhSachTaiKhoan.add(taiKhoan);
        }
    }
    
    public ArrayList<TaiKhoanDTO> timTaiKhoanToanCuc(String tuKhoa) {
        String tuKhoaFM = tuKhoa.toLowerCase().trim();
        ArrayList<TaiKhoanDTO> ds = new ArrayList<>();
        for(TaiKhoanDTO taiKhoan: danhSachTaiKhoan) {
            if(taiKhoan.getMaTaiKhoan().toLowerCase().contains(tuKhoaFM)
                    || taiKhoan.getEmail().toLowerCase().contains(tuKhoaFM)
                    || taiKhoan.getVaiTro().toLowerCase().contains(tuKhoaFM)
                    || taiKhoan.getTrangThai().toLowerCase().contains(tuKhoaFM)) {
                ds.add(taiKhoan);
            }
        }
        return ds;
    }

    public TaiKhoanDTO timMotTK(String maTK) {
        if(danhSachTaiKhoan.isEmpty()){
            docDSTaiKhoan();
        }
        for (TaiKhoanDTO tk : danhSachTaiKhoan) {
            if (tk.getMaTaiKhoan().equals(maTK)) {
                return tk;
            }
        }
        return null;
    }
}
