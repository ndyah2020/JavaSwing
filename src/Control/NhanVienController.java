package Control;

import BUS.NhanVienBUS;
import BUS.TaiKhoanBUS;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import GUI.forms.NhanVienControlForm;
import GUI.forms.NhanVienForm;
import GUI.forms.NhanVienPanelForm;
import GUI.forms.NhanVienTableForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NhanVienController {

    private final NhanVienForm panelForm;
    private final NhanVienControlForm panelControl;
    private final NhanVienTableForm panelTable;
    private final NhanVienBUS nhanVienBUS = new NhanVienBUS();
    private final TaiKhoanBUS taiKhoanBUS = new TaiKhoanBUS();
    private ArrayList<NhanVienDTO> dsNhanVien;

    public NhanVienController(NhanVienPanelForm panel) {
        this.panelForm = panel.getNhanVienForm();
        this.panelControl = panel.getNhanVienControlForm();
        this.panelTable = panel.getNhanVienTableForm();
    }

    public void layDanhSachNhanvien() {
        DefaultTableModel model = panelTable.getModel();
        dsNhanVien = nhanVienBUS.getDanhSachNhanVien();
        HienThiTable.taiDuLieuTableNhanVien(model, dsNhanVien);
        panelTable.getMyTable().setModel(model);
    }

    private void hienThiTaiKhoanLenPopup() {
        String[] tenCot = {"Mã Tài Khoản", "Tên Tài Khoản"};
        panelForm.getBangLayMaTaiKhoan().setcolumnDefaultTableModel(tenCot);
        DefaultTableModel modelPopup = panelForm.getBangLayMaTaiKhoan().getModel();
        ArrayList<TaiKhoanDTO> taiKhoan = taiKhoanBUS.getDanhSachTaiKhoan();
        HienThiTable.taiDuLieuTaiKhoan(modelPopup, taiKhoan);
        panelForm.getBangLayMaTaiKhoan().getMyTable().setModel(modelPopup);
    }
    
    public void xuLySuKien() {
        panelTable.addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = panelTable.getMyTable().getSelectedRow();
                if (row != -1) {
                    panelForm.getTxtMaNhanVien().setEditable(false);
                    panelForm.getTxtMaTaiKhoan().setEditable(false);
                    String ma = panelTable.getMyTable().getValueAt(row, 0).toString();
                    String ho = panelTable.getMyTable().getValueAt(row, 1).toString();
                    String ten = panelTable.getMyTable().getValueAt(row, 2).toString();
                    String gioiTinh = panelTable.getMyTable().getValueAt(row, 3).toString();
                    String sdt = panelTable.getMyTable().getValueAt(row, 4).toString();
                    String email = panelTable.getMyTable().getValueAt(row, 5).toString();
                    String chucVu = panelTable.getMyTable().getValueAt(row, 6).toString();
                    String luongCoBan = panelTable.getMyTable().getValueAt(row, 7).toString();
                    String maTaiKhoan = panelTable.getMyTable().getValueAt(row, 8).toString();

                    panelForm.getTxtMaNhanVien().setText(ma);
                    panelForm.getTxtHoNhanVien().setText(ho);
                    panelForm.getTxtTenNhanVien().setText(ten);
                    if (gioiTinh.equals("Nam")) {
                        panelForm.getRadioNam().setSelected(true);
                    } else {
                        panelForm.getRadioNu().setSelected(true);
                    }
                    panelForm.getTxtSoDienThoai().setText(sdt);
                    panelForm.getTxtEmail().setText(email);
                    panelForm.getTxtChucVu().setText(chucVu);
                    panelForm.getTxtLuong().setText(luongCoBan);
                    panelForm.getTxtMaTaiKhoan().setText(maTaiKhoan);
                }
            }
        });
        panelControl.addXoaFormListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelForm.xoaForm();
            }
        });

        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maNhanvien = panelForm.getTxtMaNhanVien().getText();
                if (maNhanvien.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã nhân viên");
                    return;
                }
                if (nhanVienBUS.layMotNhanVienTheoMa(maNhanvien) == null) {
                    String ten = panelForm.getTxtTenNhanVien().getText();
                    String ho = panelForm.getTxtHoNhanVien().getText();
                    String gioiTinh = "";
                    if (panelForm.getRadioNam().isSelected()) {
                        gioiTinh = panelForm.getRadioNam().getText();
                    } else {
                        gioiTinh = panelForm.getRadioNu().getText();
                    }
                    if (gioiTinh.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Vui lòng chọn giới tính");
                        return;
                    }

                    String email = panelForm.getTxtEmail().getText();
                    String chucVu = panelForm.getTxtChucVu().getText();
                    String luongCoBanStr = panelForm.getTxtLuong().getText();
                    String sdt = panelForm.getTxtSoDienThoai().getText();
                    String maTaiKhoan = panelForm.getTxtMaTaiKhoan().getText();
                    if (ten.isEmpty() || ho.isEmpty() || email.isEmpty() || chucVu.isEmpty()
                            || luongCoBanStr.isEmpty() || sdt.isEmpty() || maTaiKhoan.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                        return;
                    }
                    int luongCoBan = 0;
                    try {
                        luongCoBan = Integer.parseInt(luongCoBanStr);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Lương phải là một số hợp lệ!");
                        return;
                    }

                    NhanVienDTO nhanVien = new NhanVienDTO(maNhanvien, ho, ten, gioiTinh, sdt, email, chucVu, luongCoBan, maTaiKhoan);
                    nhanVienBUS.themNhanvien(nhanVien);
                    panelForm.xoaForm();
                    layDanhSachNhanvien();
                }else {
                    JOptionPane.showMessageDialog(null, "Mã Nhan viên bị trùng");
                }
            }
        });

        panelControl.addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = panelTable.getMyTable().getSelectedRow();
                if (row != -1) {
                    String maNhanvien = panelTable.getMyTable().getValueAt(row, 0).toString();
                    nhanVienBUS.xoaNhanVien(maNhanvien);
                    panelForm.xoaForm();
                    layDanhSachNhanvien();
                }
            }
        });

        panelControl.addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = panelTable.getMyTable().getSelectedRow();
                if (row != -1) {
                    String maNhanvien = panelForm.getTxtMaNhanVien().getText();
                    String ten = panelForm.getTxtTenNhanVien().getText();
                    String ho = panelForm.getTxtHoNhanVien().getText();
                    String gioiTinh = "";
                    if (panelForm.getRadioNam().isSelected()) {
                        gioiTinh = panelForm.getRadioNam().getText();
                    } else {
                        gioiTinh = panelForm.getRadioNu().getText();
                    }
                    if (gioiTinh.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Vui lòng chọn giới tính");
                        return;
                    }

                    String email = panelForm.getTxtEmail().getText();
                    String chucVu = panelForm.getTxtChucVu().getText();
                    String luongCoBanStr = panelForm.getTxtLuong().getText();
                    String sdt = panelForm.getTxtSoDienThoai().getText();
                    String maTaiKhoan = panelForm.getTxtMaTaiKhoan().getText();
                    if (ten.isEmpty() || ho.isEmpty() || email.isEmpty() || chucVu.isEmpty()
                            || luongCoBanStr.isEmpty() || sdt.isEmpty() || maTaiKhoan.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                        return;
                    }
                    int luongCoBan = 0;
                    try {
                        luongCoBan = Integer.parseInt(luongCoBanStr);
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Lương phải là một số hợp lệ!");
                        return;
                    }
                    NhanVienDTO nhanVien = new NhanVienDTO( maNhanvien, ho, ten, gioiTinh, sdt, email, chucVu, luongCoBan, maTaiKhoan);
                    nhanVienBUS.suaNhanvien(nhanVien);
                    panelForm.xoaForm();
                    layDanhSachNhanvien();
                }
            }
        });
        
        panelControl.addTxtSearchListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                int selectetCmb = panelControl.getCmbLoaiTimKiem().getSelectedIndex();
                String tuKhoa = panelControl.getTxtSearch().getText();
                DefaultTableModel model = panelTable.getModel();
                if (!tuKhoa.isEmpty()) {
                    switch (selectetCmb) {
                        case 1:
                            HienThiTable.taiDuLieuTableNhanVien(model, nhanVienBUS.timKiemNhanVienTheoHoTen(tuKhoa));
                            break;
                        case 2:                
                            HienThiTable.taiDuLieuTableNhanVien(model, nhanVienBUS.timKiemNhanVienTheoSoDienThoai(tuKhoa));
                            break;
                        default:
                            HienThiTable.taiDuLieuTableNhanVien(model,nhanVienBUS.timKiemToanCuc(tuKhoa));
                            break;
                    }
                }else {
                    layDanhSachNhanvien();
                }
            }
        });

        ItemListener cbmListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int indexMucLuongTu = panelControl.getCmbMucLuongTu().getSelectedIndex();
                int indexMucLuongDen = panelControl.getCmbMucLuongDen().getSelectedIndex();
                int indexGioiTinh = panelControl.getCmbGioiTinh().getSelectedIndex();
                if (indexMucLuongTu > 0 || indexMucLuongDen > 0 || indexGioiTinh > 0) {
                    int giaTriMucLuongTu = 0;
                    int giaTriMucLuongDen = 0;
                    DefaultTableModel model = panelTable.getModel();

                    if (indexMucLuongTu > 0 && indexMucLuongDen > 0) {
                        try {
                            giaTriMucLuongTu = Integer.parseInt(panelControl.getCmbMucLuongTu().getSelectedItem().toString());
                            giaTriMucLuongDen = Integer.parseInt(panelControl.getCmbMucLuongDen().getSelectedItem().toString());
                        } catch (NumberFormatException evt) {
                            JOptionPane.showMessageDialog(null, "Lỗi định dạng số ");
                        }
                    }

                    ArrayList<NhanVienDTO> dsLoc = nhanVienBUS.locNhanVien(indexGioiTinh, giaTriMucLuongTu, giaTriMucLuongDen);
                    HienThiTable.taiDuLieuTableNhanVien(model, dsLoc);
                    panelTable.getMyTable().setModel(model);
                }else {
                    layDanhSachNhanvien();
                }
            }
        };
        
        panelControl.addItemCmbGioiTinhListener(cbmListener);
        panelControl.addItemCmbMucLuongTu(cbmListener);
        panelControl.addItemCmbMucLuongDen(cbmListener);
        
        panelForm.addBtnLayMaTaiKhoan(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                panelForm.showPopupBangLayMaTaiKhoan();
                hienThiTaiKhoanLenPopup();
            }
        });
        
        panelForm.getBangLayMaTaiKhoan().addRowClickPopup(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int row = panelForm.getBangLayMaTaiKhoan().getMyTable().getSelectedRow();
                if(row != -1) {
                    String maTaiKhoan = panelForm.getBangLayMaTaiKhoan().getMyTable().getValueAt(row, 0).toString();
                    panelForm.getTxtMaTaiKhoan().setText(maTaiKhoan);
                }
            }
        });
        
        panelForm.getBangLayMaTaiKhoan().addSearchPopupListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                String tuKhoa = panelForm.getBangLayMaTaiKhoan().getTxtSearch().getText();
                
                if(!tuKhoa.isEmpty()) {
                    DefaultTableModel model = panelForm.getBangLayMaTaiKhoan().getModel();
                    ArrayList<TaiKhoanDTO> ds  = taiKhoanBUS.timTaiKhoanToanCuc(tuKhoa);
                    HienThiTable.taiDuLieuTaiKhoan(model, ds);
                    panelForm.getBangLayMaTaiKhoan().getMyTable().setModel(model);
                }else {
                    hienThiTaiKhoanLenPopup();
                }
            }
        });
    }
}
