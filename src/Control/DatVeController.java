
package Control;
import BUS.ChuyenBayBUS;
import BUS.HanhTrinhBUS;
import BUS.HoaDonBUS;
import BUS.KhachHangBUS;
import BUS.KhuyenMaiBUS;
import BUS.KhuyenMaiChiTietBUS;
import BUS.NhanVienBUS;
import BUS.VeBUS;
import DTO.CTHoaDonDTO;
import DTO.ChuyenBayDTO;
import DTO.HanhTrinhDTO;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.KhuyenMaiDTO;
import DTO.SanBayDTO;
import GUI.PDFDesign.GeneratePDF;
import GUI.forms.DatVeControlForm;
import GUI.forms.DatVePanelForm;
import GUI.forms.DatVeTableForm;
import GUI.forms.DatVeTableThemForm;
import GUI.forms.KhachHangForm;
import GUI.forms.ThongTinDatVeForm;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.sql.Date;

public class DatVeController {
    private final DatVeControlForm panelControl;
    private final DatVeTableForm panelTable;
    private final DatVeTableThemForm panelTableThem;
    private final KhachHangForm panelFormKH;
    private final ThongTinDatVeForm panelDatVe;
    private final ChuyenBayBUS chuyenBayBUS = new ChuyenBayBUS();
    private final HanhTrinhBUS hanhTrinhBUS = new HanhTrinhBUS();
    private final VeBUS veBUS = new VeBUS();
    private final NhanVienBUS nhanVienBUS = new NhanVienBUS();
    private final KhachHangBUS khachHangBUS = new KhachHangBUS();
    private final KhuyenMaiBUS khuyenMaiBUS = new KhuyenMaiBUS();
    private final KhuyenMaiChiTietBUS khuyenMaiCTBUS = new KhuyenMaiChiTietBUS();
    private final HoaDonBUS hoaDonBUS = new HoaDonBUS();
    private ArrayList<ChuyenBayDTO> dsChuyenBay;
    private final ArrayList<String> maVeDaThem = new ArrayList<>();
    private KhuyenMaiDTO khuyenMaiTimThay;
    private KhachHangDTO khachHangTimThay;
    private int tienPhaiTra;
    private int tongSoTien;
    public DatVeController(DatVePanelForm panel) {
        this.panelControl = panel.getDatVeControlForm();
        this.panelTable = panel.getDatVeTableForm();
        this.panelTableThem = panel.getDatVeTableThemForm();
        this.panelFormKH = panel.getKhachHangForm();
        this.panelDatVe = panel.getThongTinDatVeForm();
    }
    
    private void HienThiCacThongTin(ArrayList<ChuyenBayDTO> dsChuyenBay, DefaultTableModel model) {
        model.setRowCount(0);
        for(ChuyenBayDTO cb : dsChuyenBay) {
            HanhTrinhDTO hanhTrinh = hanhTrinhBUS.layMotHanhTrinh(cb.getMaHanhTrinh());
            int veThuong = veBUS.soLuongVeThuongConLaiMoiChuyenBay(cb.getMaChuyenBay());
            int veVip = veBUS.soLuongVeVipConLaiMoiChuyenBay(cb.getMaChuyenBay());
            Vector row = new Vector();
            row.add(cb.getMaChuyenBay());
            row.add(cb.getNgayXuatPhat());
            row.add(cb.getNgayDenNoi());
            row.add(hanhTrinh.getTenHanhTrinh());
            row.add(veThuong);
            row.add(veVip);
            row.add(cb.getGiaThuong());
            row.add(cb.getGiaVip());
            model.addRow(row);
        }
    }
    
    private void hienThiVe(String maChuyenBay, int indexLoaiVe) {
        String[] tenCot = {"Mã Vé", "Loại Vé"};
        panelDatVe.getBangLayMaVe().setcolumnDefaultTableModel(tenCot);
        DefaultTableModel model = panelDatVe.getBangLayMaVe().getModel();
        if(indexLoaiVe == 1) {
            HienThiTable.taiDuLieuTableVepopup(model, veBUS.timKiemVeTHTheoMaChuyenBayChuaDat(maChuyenBay));
        }else if (indexLoaiVe == 2){
            HienThiTable.taiDuLieuTableVepopup(model, veBUS.timKiemVeVipTheoMaChuyenBayChuaDat(maChuyenBay));
        }
     
        panelDatVe.getBangLayMaVe().getMyTable().setModel(model);
    }
    private void hienThiNhanVien() {
        String [] tenCot = {"Mã Nhân Viên", "Họ", "Tên"};
        panelDatVe.getBangLayMaNhanVien().setcolumnDefaultTableModel(tenCot);
        DefaultTableModel model = panelDatVe.getBangLayMaNhanVien().getModel();
        
        HienThiTable.taiDuLieuTableNhanVien(model, nhanVienBUS.getDanhSachNhanVien());
        panelDatVe.getBangLayMaNhanVien().getMyTable().setModel(model);
    }
    
    public void layDanhSachChuyenBayVaVe() {
        DefaultTableModel model = panelTable.getModel();
        dsChuyenBay = chuyenBayBUS.getDanhSachChuyenBay();
        HienThiCacThongTin(dsChuyenBay, model);
        panelTable.getMyTable().setModel(model);
    }
    
    private void setFormKH(KhachHangDTO kh) {
        panelFormKH.getMa().setText(kh.getMaKhachHang());
        panelFormKH.getHo().setText(kh.getHo());
        panelFormKH.getTen().setText(kh.getTen());
        panelFormKH.setGioiTinh(kh.getGioiTinh());
        panelFormKH.getNgaySinh().setText(kh.getNgaySinh().toString());
        panelFormKH.getSdt().setText(kh.getSdt());
        panelFormKH.getEmail().setText(kh.getEmail());
        panelFormKH.getCccd().setText(kh.getCccd());
    }

    private boolean kiemTraMaVeDaThem(String maVe) {
        if(!maVeDaThem.isEmpty()) {
            for(String maVeDaCo : maVeDaThem) {
                if(maVeDaCo.equals(maVe))
                    return true;
            }
        }
        return false;
    }

    private int tinhToanTongGia(DefaultTableModel model) {
        int tongGia = 0;

        for (int i = 0; i < panelTableThem.getMyTable().getRowCount(); i++) {
            int value = Integer.parseInt(panelTableThem.getMyTable().getValueAt(i, 3).toString());
            tongGia += value;
        }
        return tongGia;
    }
  
    private ArrayList<CTHoaDonDTO> layChiTietHoaDonTuModel(DefaultTableModel model, String maHoaDon) {
        ArrayList<CTHoaDonDTO> dsChiTiet = new ArrayList<>();

        for (int row = 0; row < model.getRowCount(); row++) {
            CTHoaDonDTO ct = new CTHoaDonDTO();
            ct.setMaCTHD("CTHD" + maHoaDon + (row + 1)); 
            ct.setMaHoaDon(maHoaDon);
            ct.setSoLuong(Integer.parseInt(model.getValueAt(row, 1).toString())); 
            ct.setMaVe(model.getValueAt(row, 2).toString()); 
            ct.setDonGia(Integer.parseInt(model.getValueAt(row, 3).toString()));

            dsChiTiet.add(ct);
        }

        return dsChiTiet;
    }

    private ArrayList<String> layMaVe(DefaultTableModel model) {
        ArrayList<String> danhSachMaVe = new ArrayList<>();
        for (int row = 0; row < model.getRowCount(); row++) {
            String maVe = model.getValueAt(row, 2).toString();

            danhSachMaVe.add(maVe);
        }
        return danhSachMaVe;
    }
    public String generateRandom(String ma) {
        String prefix = ma;
        String random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8).toUpperCase();
        while (isCodeDuplicate(random)) {
            random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8).toUpperCase();
        }
        return prefix + random;
    }

    //Kiểm tra mã duy nhất
    private boolean isCodeDuplicate(String code) {
        for (HoaDonDTO hd : hoaDonBUS.getDanhSachHoaODon()) {
            if (hd.getMaHoaDon().equals(code)) {
                return true;
            }
        }
        return false;
    }
    
    public void xuLySuKien() {
        panelDatVe.addShowPopopMaVe((e) -> {
            panelDatVe.showPopBangLayMaVe();
            String maChuyenBay = panelDatVe.getTxtMaChuyenBay().getText();
            int indexLoaiVe = panelDatVe.getCmbLoaiVe().getSelectedIndex();
           
            if (indexLoaiVe == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn loại vé");
            } else if(maChuyenBay.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn chuyến bay cần đặt");
            } else{
                hienThiVe(maChuyenBay, indexLoaiVe);
            } 
        });
        
     
        panelDatVe.getBangLayMaVe().addRowClickPopup(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int row = panelDatVe.getBangLayMaVe().getMyTable().getSelectedRow();
                if (row != -1) {
                    String maVe = panelDatVe.getBangLayMaVe().getMyTable().getValueAt(row, 0).toString();
                    panelDatVe.getTxtMaVe().setText(maVe);

                    int rowTabel = panelTable.getMyTable().getSelectedRow();
                    int cmbIndex = panelDatVe.getCmbLoaiVe().getSelectedIndex();
                    try {
                        if (cmbIndex == 1) {
                            panelDatVe.getTxtGiaVe().setText(panelTable.getMyTable().getValueAt(rowTabel, 6).toString());
                        } else {
                            panelDatVe.getTxtGiaVe().setText(panelTable.getMyTable().getValueAt(rowTabel, 7).toString());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Lỗi khi lấy giá vé!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        
        panelDatVe.addShowPopupMaNhanVien(e -> {
            panelDatVe.showPopBangLayMaNV();
            hienThiNhanVien();
        });
        
        panelDatVe.getBangLayMaNhanVien().addRowClickPopup(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = panelDatVe.getBangLayMaNhanVien().getMyTable().getSelectedRow();
                if(row != -1 ) {
                    String maNhanVien = panelDatVe.getBangLayMaNhanVien().getMyTable().getValueAt(row, 0).toString();
                    panelDatVe.getTxtMaNhanVien().setText(maNhanVien);
                }
            }
        });
        
        panelDatVe.addCmbLoaiVeListener(e -> {
            panelDatVe.getTxtMaVe().setText("");
            panelDatVe.getTxtGiaVe().setText("");
        });
        
        panelTable.addRowClickListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int row = panelTable.getMyTable().getSelectedRow();
                if(row != -1) {
                    String maChuyenBay = panelTable.getMyTable().getValueAt(row, 0).toString();
                    panelDatVe.getTxtMaChuyenBay().setText(maChuyenBay);
                }
            }
        });
        
        panelDatVe.addBtnKiemTraKH(e -> {
            String cccd = panelDatVe.getTxtCccd().getText();
            System.out.println(cccd);
            if(cccd.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập căn cước công dân");
            }else {
                khachHangTimThay = khachHangBUS.layMotKhachHangTheoCccd(cccd);
                
                if(khachHangTimThay != null) {                   
                    setFormKH(khachHangTimThay);
                    panelFormKH.setEditKhachHangForm(false);
                }else {
                    panelFormKH.clearForm();
                    panelFormKH.setEditKhachHangForm(true);
                    JOptionPane.showMessageDialog(null, "Khách Hàng không tồn tại vui lòng nhập thông tin mới cho khách hàng");
                }
            }
        });
        
        panelDatVe.getBangLayMaVe().addSearchPopupListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                String tuKhoa = panelDatVe.getBangLayMaVe().getTxtSearch().getText();
                if(!tuKhoa.isEmpty()) {
                    DefaultTableModel model = panelDatVe.getBangLayMaVe().getModel();
                    HienThiTable.taiDuLieuTableVepopup(model, veBUS.timKiemToanCuc(tuKhoa));
                }else {
                    String maChuyenBay = panelDatVe.getTxtMaChuyenBay().getText();
                    int indexLoaiVe = panelDatVe.getCmbLoaiVe().getSelectedIndex();
                    hienThiVe(maChuyenBay, indexLoaiVe);
                }
                
            }        
        });
        
        panelDatVe.getBangLayMaNhanVien().addSearchPopupListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
               String tuKhoa = panelDatVe.getBangLayMaNhanVien().getTxtSearch().getText();
               if(!tuKhoa.isEmpty()) {
                   DefaultTableModel model = panelDatVe.getBangLayMaNhanVien().getModel();
                   HienThiTable.taiDuLieuTableNhanVien(model, nhanVienBUS.timKiemToanCuc(tuKhoa));
               }else {
                   hienThiNhanVien();
               }
            }        
        });

        panelDatVe.addBtnKiemTraKM(e -> {
            String maKhuyenMai = panelDatVe.getTxtKhuyenMai().getText();
            String maChuyenBay = panelDatVe.getTxtMaChuyenBay().getText();

            if (maKhuyenMai.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập mã khuyến mãi");
            } else if (maChuyenBay.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn chuyến bay");
            } else {
                khuyenMaiTimThay = khuyenMaiBUS.layMotKhuyenMaiTheoMaHT(maKhuyenMai, maChuyenBay);
                if (khuyenMaiTimThay != null) {
                    panelDatVe.getLbPhanTramGiamGia().setText(khuyenMaiTimThay.getPhanTramGiamGia());
                } else {
                    JOptionPane.showMessageDialog(null, "Khuyến mãi không tồn tại hoặc không áp dụng cho hành trình này");
                }
            }
        });    
        
        panelDatVe.addBtnThemveListener(e -> {
            String maChuyenBay = panelDatVe.getTxtMaChuyenBay().getText();
            String maVe = panelDatVe.getTxtMaVe().getText();
            String donGia = panelDatVe.getTxtGiaVe().getText();
            boolean veDaThem = kiemTraMaVeDaThem(maVe);
            if (!veDaThem) {
                if (!maChuyenBay.isEmpty() && !maVe.isEmpty() && !donGia.isEmpty()) {
                    Vector row = new Vector();
                    row.add(maChuyenBay);
                    row.add(1);
                    row.add(maVe);
                    row.add(donGia);
                    maVeDaThem.add(maVe);
                    panelTableThem.getModel().addRow(row);
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng điền đủ thông tin");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Vé đã được thêm vào vui lòng chọn vé khác");
            }

        });
        
        panelDatVe.addBtnXoaVe(e -> {
            int row = panelTableThem.getMyTable().getSelectedRow();
            DefaultTableModel model = panelTableThem.getModel();
            if(row != -1) {
                String maVe = panelTableThem.getMyTable().getValueAt(row, 2).toString();
                maVeDaThem.removeIf(maveDaCo -> maveDaCo.equals(maVe));
                model.removeRow(row); 
            }
        });
        
        panelDatVe.addBtnDatVeListener(e -> {
            panelDatVe.showPopupThongTinHoaDon();
            String maKhachgHang = panelFormKH.getMa().getText();
            String tenKhachHang = panelFormKH.getTen().getText();
            String hoKhachHang = panelFormKH.getHo().getText();
            String email = panelFormKH.getEmail().getText();
            String gioiTinh = panelFormKH.getGioiTinh();
            String ngaySinh = panelFormKH.getNgaySinh().getText();
            String sdt = panelFormKH.getSdt().getText();
            String cccd = panelFormKH.getCccd().getText();

            boolean kiemTraThongTin
                    = !maKhachgHang.isEmpty()
                    && !tenKhachHang.isEmpty()
                    && !hoKhachHang.isEmpty()
                    && !email.isEmpty()
                    && !gioiTinh.isEmpty()
                    && !ngaySinh.isEmpty()
                    && !sdt.isEmpty()
                    && !cccd.isEmpty();
            
            DefaultTableModel model = panelTableThem.getModel();
            if(!kiemTraThongTin) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin khách hàng");
            }else if(model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng thêm vé");
            }else {
                panelDatVe.getThongTinHoaDon().getThongTinKhachHangForm1().getCtMaKhachHang().setText(maKhachgHang);
                panelDatVe.getThongTinHoaDon().getThongTinKhachHangForm1().getCtTenKhachHang().setText(hoKhachHang + " " + tenKhachHang);
                panelDatVe.getThongTinHoaDon().getThongTinKhachHangForm1().getCtGioiTinh().setText(gioiTinh);
                panelDatVe.getThongTinHoaDon().getThongTinKhachHangForm1().getCtEmail().setText(email);
                panelDatVe.getThongTinHoaDon().getMyTable().setModel(model);
                
                tongSoTien = tinhToanTongGia(model);
                panelDatVe.getThongTinHoaDon().getLbTongTien().setText(""+tongSoTien);
                
                if(khuyenMaiTimThay != null) {
                    
                    
                    panelDatVe.getThongTinHoaDon().getLbMaKhuyenMai()
                        .setText(khuyenMaiTimThay.getMaKhuyenMai());
                    
                    int tienGiamGia =  tongSoTien * Integer.parseInt(khuyenMaiTimThay.getPhanTramGiamGia())/100;
                    panelDatVe.getThongTinHoaDon().getLbGiamGia()
                        .setText(""+tienGiamGia);
                    
                    tienPhaiTra = tongSoTien - tienGiamGia;
                    
                    
                    panelDatVe.getThongTinHoaDon().getlBTienPhaiTra()
                            .setText(""+tienPhaiTra);
                }else {
                    panelDatVe.getThongTinHoaDon().getLbGiamGia()
                        .setText("0");
                    panelDatVe.getThongTinHoaDon().getLbMaKhuyenMai()
                        .setText("");
                     panelDatVe.getThongTinHoaDon().getlBTienPhaiTra()
                            .setText(""+tongSoTien);
                }
            }
        });
        
        panelDatVe.getThongTinHoaDon().addBtnXuatPDFListener(e -> {
            DefaultTableModel model = panelTableThem.getModel();
            GeneratePDF.xuatPDFHoaDon(khachHangTimThay, khuyenMaiTimThay, model, tongSoTien, tienPhaiTra);
        });
        
        panelDatVe.getThongTinHoaDon().addBtnXacNhanListener(e -> {
            String maNhanvien = panelDatVe.getTxtMaNhanVien().getText();
            if(maNhanvien.isEmpty()) {
                JOptionPane.showConfirmDialog(null, "Vui lòng nhập mã nhân viên");
                return;
            }
            
            if(khachHangTimThay == null) {
                String maKhachHang = panelFormKH.getMa().getText();
                if (khachHangBUS.timMotKH(maKhachHang) != null) {
                    JOptionPane.showMessageDialog(null, "Mã khách hàng đã tồn tại!");
                    return;
                }
                Date ngaySinh = Date.valueOf(panelFormKH.getNgaySinh().getText());
                String gioiTinh = panelFormKH.getGioiTinh();
                String ho = panelFormKH.getHo().getText().trim();
                String ten = panelFormKH.getTen().getText().trim();
                String sdt = panelFormKH.getSdt().getText().trim();
                if (!sdt.matches("\\d{10}")) {
                    JOptionPane.showMessageDialog(null, "Số điện thoại bạn nhập không đúng vui lòng nhập lại!");
                    return;
                }
                String email = panelFormKH.getEmail().getText().trim();
                if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                    JOptionPane.showMessageDialog(null, "Email bạn nhập không đúng vui lòng nhập lại!");
                    return;
                }
                String cccd = panelFormKH.getCccd().getText().trim();
                if (!cccd.matches("^0\\d{11}$"
                        + //
                        "")) {
                    JOptionPane.showMessageDialog(null, "Cccd bạn nhập không đúng vui lòng nhập lại!");
                    return;
                }
                KhachHangDTO khachHang = new KhachHangDTO(maKhachHang,ho, ten, gioiTinh, ngaySinh, sdt, email, cccd);
                khachHangTimThay = khachHang;
            }
            
            
            
            String maHoaDon = generateRandom("HD");
            Date ngayLap = new Date(System.currentTimeMillis());
            String maKhuyenMai = "";
            if(khuyenMaiTimThay != null) {
               maKhuyenMai = khuyenMaiTimThay.getMaKhuyenMai();
            }
            
            HoaDonDTO hoaDon = new HoaDonDTO(maHoaDon, ngayLap, tongSoTien, maNhanvien, maKhuyenMai ,khachHangTimThay.getMaKhachHang());
            ArrayList<CTHoaDonDTO> dsCtHoaDon = layChiTietHoaDonTuModel(panelTableThem.getModel(), maHoaDon);
            ArrayList<String> danhSachMaVe = layMaVe(panelTableThem.getModel());
            
            if(hoaDonBUS.themHoaDonBUS(hoaDon, dsCtHoaDon, danhSachMaVe)) {
                veBUS.capNhatDanhSach();
                String maChuyenBay = panelDatVe.getTxtMaChuyenBay().getText();
                int soVeDaBan = panelTableThem.getModel().getRowCount();
                
                int row = panelTable.getMyTable().getSelectedRow();
                int tongSoLuongVe = 0;
                if(row != -1) {
                    tongSoLuongVe = Integer.parseInt(panelTable.getMyTable().getValueAt(row, 4).toString()) 
                            + Integer.parseInt(panelTable.getMyTable().getValueAt(row, 5).toString());
                 }
                chuyenBayBUS.capNhatSoLuongChuyenBay(maChuyenBay, soVeDaBan, tongSoLuongVe);
                JOptionPane.showConfirmDialog(null, "Đặt vé thành công");
            }
        });
    }
}
