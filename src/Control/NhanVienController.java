package Control;

import BUS.NhanVienBUS;
import DTO.NhanVienDTO;
import GUI.forms.NhanVienControlForm;
import GUI.forms.NhanVienForm;
import GUI.forms.NhanVienPanelForm;
import GUI.forms.NhanVienTableForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
    }
}
