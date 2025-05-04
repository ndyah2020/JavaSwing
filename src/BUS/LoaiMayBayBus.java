package BUS;

import DAO.LoaiMayBayDAO;
import DTO.LoaiMayBayDTO;
import java.util.ArrayList;
import java.util.Comparator;

public class LoaiMayBayBus {
    private ArrayList<LoaiMayBayDTO> danhSachLoaiMayBay;
    private final LoaiMayBayDAO dao;
    
    public LoaiMayBayBus() {
        dao = new LoaiMayBayDAO();
        danhSachLoaiMayBay = new ArrayList<>();
        docDanhSachLoaiMayBay();
    }
    
    private void docDanhSachLoaiMayBay() {
        danhSachLoaiMayBay = dao.docDanhSach();
    }
    
    public ArrayList<LoaiMayBayDTO> getDanhSachLoaiMayBay() {
        if (danhSachLoaiMayBay.isEmpty()){
            docDanhSachLoaiMayBay();
        }
        return danhSachLoaiMayBay;
    }
    
    public void themLoaiMayBay (LoaiMayBayDTO loaiMayBay) {
        if(dao.themLoaiMayBay(loaiMayBay)) {
            danhSachLoaiMayBay.add(loaiMayBay);
        }
    }
    
    public void xoaLoaiMayBay(String maLoaiMayBay) {
        if(dao.xoaLoaiMayBay(maLoaiMayBay)) {
            danhSachLoaiMayBay.removeIf(lmb -> lmb.getMaLoai().equals(maLoaiMayBay));
        }
    }
    
    public void suaLoaiMayBay (LoaiMayBayDTO loaiMayBay) {
        if(dao.suaLoaiMayBay(loaiMayBay)) {
            for(int i = 0; i < danhSachLoaiMayBay.size(); i++){
                if(danhSachLoaiMayBay.get(i).equals(loaiMayBay.getMaLoai())) {
                    danhSachLoaiMayBay.set(i, loaiMayBay);
                    break;
                }
            }
        }
    }
    
    public ArrayList<LoaiMayBayDTO> danhSachTimTheoTuKhoa(String tuKhoa) {
        if(danhSachLoaiMayBay.isEmpty()) {
            docDanhSachLoaiMayBay();
        }
        ArrayList<LoaiMayBayDTO> ketQua = new ArrayList<>();
        for (LoaiMayBayDTO lmb : danhSachLoaiMayBay) {
            if (lmb.getTenLoai().toLowerCase().contains(tuKhoa.toLowerCase()) ||
                lmb.getMaLoai().toLowerCase().contains(tuKhoa.toLowerCase()) ||
                String.valueOf(lmb.getHeSoGiaThuong()).toLowerCase().contains(tuKhoa) ||
                String.valueOf(lmb.getHeSoGiaVip()).toLowerCase().contains(tuKhoa)) {
                ketQua.add(lmb);
            }
        }
        return ketQua;
    }
    
    public LoaiMayBayDTO layMotLoaiMayBay(String maLoai) {
        for(LoaiMayBayDTO mb : danhSachLoaiMayBay) {
            if (mb.getMaLoai().equals(maLoai)) {
                return mb;
            }
        }
        return null;
    }
}
