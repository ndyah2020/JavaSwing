package Control;

import BUS.HoaDonBUS;
import BUS.HoaDonCTBUS;
import BUS.KhachHangBUS;
import BUS.NhanVienBUS;
import DTO.CTHoaDonDTO;
import DTO.HoaDonDTO;
import DTO.KhachHangDTO;
import DTO.NhanVienDTO;
import GUI.forms.HoaDonCTTableForm;
import GUI.forms.HoaDonControlForm;
import GUI.forms.HoaDonPanelForm;
import GUI.forms.HoaDonTableForm;
import GUI.forms.ThongTinKhachHangForm;
import GUI.forms.ThongTinNhanVienForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;

public class HoaDonVaCTController {
    private final HoaDonCTTableForm panelTableCT;
    private final HoaDonTableForm panelTable;
    private final HoaDonControlForm panelControl;
    private final ThongTinNhanVienForm panelThongTinNV;
    private final ThongTinKhachHangForm panelThongTinKH;
    private final HoaDonBUS hoaDonBUS = new HoaDonBUS();
    private final HoaDonCTBUS hoaDonCTBUS = new HoaDonCTBUS();
    private final KhachHangBUS khachHangBUS = new KhachHangBUS();
    private final NhanVienBUS  nhanVienBUS = new NhanVienBUS();
    
    private ArrayList<HoaDonDTO> dsHoaDon;
    public HoaDonVaCTController(HoaDonPanelForm panel) {
        this.panelTableCT = panel.getHoaDonCTTableForm();
        this.panelTable = panel.getHoaDonTableForm();
        this.panelControl = panel.getHoaDonControlForm();
        this.panelThongTinNV = panel.getThongTinNhanVienForm();
        this.panelThongTinKH = panel.getThongTinKhachHangForm();
    }
    
    public void layDanhSachHoaDon() {
        DefaultTableModel model = panelTable.getModel();
        dsHoaDon = hoaDonBUS.getDanhSachHoaODon();
        HienThiTable.taiDuLieuHoaDon(model, dsHoaDon);
        panelTable.getMyTable().setModel(model);
    }

    private void hienThiCtHoaDon(int row) {
        String maHoaDon = panelTable.getMyTable().getValueAt(row, 0).toString();
        DefaultTableModel model = panelTableCT.getModel();
        ArrayList<CTHoaDonDTO> ds = hoaDonCTBUS.timCTHoaDonTheoMaHoaDon(maHoaDon);
        HienThiTable.taiDuLieuCTHoaDon(model, ds);
        panelTableCT.getMyTable().setModel(model);
        panelTableCT.getMyTable().revalidate();
        panelTableCT.getMyTable().repaint();

    }

    private void hienThiThongTinKhachHang(int row) {
        String maKhachHang = panelTable.getMyTable().getValueAt(row, 4).toString();
        KhachHangDTO khachHang = khachHangBUS.timMotKH(maKhachHang);

        if (khachHang != null) {
            panelThongTinKH.getCtMaKhachHang().setText(khachHang.getMaKhachHang());
            panelThongTinKH.getCtTenKhachHang().setText(khachHang.getHo()+" "+ khachHang.getTen());
            panelThongTinKH.getCtGioiTinh().setText(khachHang.getGioiTinh());
            panelThongTinKH.getCtEmail().setText(khachHang.getEmail());
        } else {
            panelThongTinKH.clearForm();
        }
    }
  
    private void hienThiThongTinNhanvien(int row) {
        String maNhanvien = panelTable.getMyTable().getValueAt(row, 3).toString();
        NhanVienDTO nhanVien = nhanVienBUS.layMotNhanVienTheoMa(maNhanvien);

        if (nhanVien != null) {
            panelThongTinNV.getCtMaNhanVien().setText(nhanVien.getMaNhanVien());
            panelThongTinNV.getCtHoNhanVien().setText(nhanVien.getHo());
            panelThongTinNV.getCtTenNhanVien().setText(nhanVien.getTen());
            panelThongTinNV.getCtGioiTinhNhanVien().setText(nhanVien.getGioiTinh());
            panelThongTinNV.getCtSdt().setText(nhanVien.getSdt());
            panelThongTinNV.getCtEmail().setText(nhanVien.getEmail());
            panelThongTinNV.getCtChucVu().setText(nhanVien.getChucVu());
        } else {
            panelThongTinNV.clearForm();
        }
    }

    public void xuLySuKien() {
        panelTable.addRowClickListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int row = panelTable.getMyTable().getSelectedRow();
                if (row != -1) {
                    hienThiCtHoaDon(row);
                    hienThiThongTinKhachHang(row);
                    hienThiThongTinNhanvien(row);
                }
            }
        });
        
        panelControl.addTxtSearchListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                String tuKhoa = panelControl.getTxtSearch().getText();
                if(!tuKhoa.isEmpty()) {
                    ArrayList<HoaDonDTO> ds = hoaDonBUS.timKiemHoaDonToanCuc(tuKhoa);
                    DefaultTableModel model = panelTable.getModel();
                    HienThiTable.taiDuLieuHoaDon(model, ds);
                    panelTable.getMyTable().setModel(model);
                } else {
                    layDanhSachHoaDon();
                }
            }
        });
        
        panelControl.addCbmKieuLocListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt ) {
                int giaTu = (int )panelControl.getTxtMucGiaTu().getValue();
                int giaDen = (int) panelControl.getTxtMucGiaDen().getValue();
                String ngayTuStr = panelControl.getTxtTuNgay().getText();
                String ngayDenStr = panelControl.getTxtDenNgay().getText();
                Date ngayTu = null;
                Date ngayDen = null;
                if (!ngayTuStr.isEmpty()) {
                    ngayTu = Date.valueOf(ngayTuStr);
                    
                }
                if(!ngayDenStr.isEmpty()) {
                    ngayDen = Date.valueOf(ngayDenStr);
                }
                
                if (giaTu > 0 || giaDen > 0 || ngayTu != null || ngayDen != null) {
                    int kieuLoc = panelControl.getCbmKieuLoc().getSelectedIndex();
                    DefaultTableModel model = panelTable.getModel();

                    if (kieuLoc == 0) {
                        HienThiTable.taiDuLieuHoaDon(model, hoaDonBUS.locHoaDonVa(giaTu, giaDen, ngayTu, ngayDen));
                    } else {
                        HienThiTable.taiDuLieuHoaDon(model, hoaDonBUS.locHoaDonHoac(giaTu, giaDen, ngayTu, ngayDen));
                    }

                    panelTable.getMyTable().setModel(model);
                } else {
                    layDanhSachHoaDon();
                }

            }
        });
        
        panelControl.addBtnTaiLaiListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt ) {
               panelTable.getMyTable().clearSelection();
               panelThongTinKH.clearForm();
               panelThongTinNV.clearForm();
               panelControl.clearForm();
               panelTableCT.getModel().setRowCount(0);
               layDanhSachHoaDon();
            }
        });
    }
}
