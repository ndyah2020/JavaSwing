package BUS;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import java.util.ArrayList;

public class NhanVienBUS {
    private ArrayList<NhanVienDTO> danhSachNhanVien;
    private final NhanVienDAO dao;
    
    public NhanVienBUS() {
        danhSachNhanVien = new ArrayList<>();
        dao = new NhanVienDAO();
        docDanhSachNhanvien();
    }
    
    private void docDanhSachNhanvien() {
        danhSachNhanVien = dao.layDanhSachNhanVienDAO();
    }
    
    public ArrayList<NhanVienDTO> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }
    
    public void themNhanvien (NhanVienDTO nhanVien) {
        if(dao.themNhanvien(nhanVien)) {
            danhSachNhanVien.add(nhanVien);
        }
    }
    
    public void xoaNhanVien(String maNhanVien) {
        if(dao.xoaNhanVien(maNhanVien)) {
            danhSachNhanVien.removeIf(nv -> nv.getMaNhanVien().equals(maNhanVien));
        }
    }
    
    public void suaNhanvien(NhanVienDTO nhanVien) {
        if(dao.suaNhanVienDAO(nhanVien)) {
            for(int i = 0; i < danhSachNhanVien.size(); i++) {
                if(danhSachNhanVien.get(i).getMaNhanVien().equals(nhanVien.getMaNhanVien())) {
                    danhSachNhanVien.set(i, nhanVien);
                    break;
                }
            }
        }
    }
    
    public NhanVienDTO layMotNhanVienTheoMa(String maNhanVien) {
        for(NhanVienDTO nv : danhSachNhanVien) {
            if(nv.getMaNhanVien().toLowerCase().trim().equals(maNhanVien.toLowerCase().trim())) {
                return nv;
            }
        }
        return null;
    }
    
    public ArrayList<NhanVienDTO> timKiemNhanVienTheoHoTen(String tenNhanVien) {
        ArrayList<NhanVienDTO> dsTimThay = new ArrayList<>();
        for(NhanVienDTO nv : danhSachNhanVien) {
            String ho = nv.getHo();
            String ten = nv.getTen(); 
            if((ho+" "+ten).toLowerCase().trim().contains(tenNhanVien.toLowerCase().trim())) {
                dsTimThay.add(nv);
            }
        }
        return dsTimThay;
    }
    
    public ArrayList<NhanVienDTO> timKiemNhanVienTheoMaTaiKhoan(String maTaiKhoan) {
        ArrayList<NhanVienDTO> dsTimThay = new ArrayList<>();
        for(NhanVienDTO nv : danhSachNhanVien) {
            if(nv.getMaTaiKhoan().toLowerCase().trim().contains(maTaiKhoan.toLowerCase().trim())) {
                dsTimThay.add(nv);
            }
        }
        return dsTimThay;
    }
    
    public ArrayList<NhanVienDTO> timKiemNhanVienTheoSoDienThoai(String soDienThoai) {
        ArrayList<NhanVienDTO> dsTimThay = new ArrayList<>();
        for(NhanVienDTO nv : danhSachNhanVien) {
            if(nv.getSdt().toLowerCase().trim().contains(soDienThoai.toLowerCase().trim())) {
                dsTimThay.add(nv);
            }
        }
        return dsTimThay;
    }
  
}
