package Control;

import BUS.TaiKhoanBUS;
import DTO.TaiKhoanDTO;
import GUI.forms.TaiKhoanControlForm;
import GUI.forms.TaiKhoanForm;
import GUI.forms.TaiKhoanPanelForm;
import GUI.forms.TaiKhoanTableForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TaiKhoanController {
    private final TaiKhoanControlForm panelControl;
    private final TaiKhoanTableForm panelTable;
    private final TaiKhoanForm panelForm;
    private final TaiKhoanBUS taiKhoanBUS = new TaiKhoanBUS();
    private ArrayList<TaiKhoanDTO> dsTaiKhoan;
    public TaiKhoanController(TaiKhoanPanelForm panel) {
        this.panelControl = panel.getTaiKhoanControlForm();
        this.panelTable = panel.getTaiKhoanTableForm();
        this.panelForm = panel.getTaiKhoanForm();
    }
    
    public void layDanhSachTaiKhoan() {
        DefaultTableModel model = panelTable.getModel();
        dsTaiKhoan = taiKhoanBUS.getDanhSachTaiKhoan();
        HienThiTable.taiDuLieuTaiKhoan(model, dsTaiKhoan);
        panelTable.getMyTable().setModel(model);
    }

    public void setForm(TaiKhoanDTO tk) {
        panelForm.getMa().setText(tk.getMaTaiKhoan());
        panelForm.getEmail().setText(tk.getEmail());
        panelForm.getMauKhau().setText(tk.getMatKhau());
        panelForm.getChucVu().setText(tk.getVaiTro());
        panelForm.getOtp().setText(tk.getOtp());
        panelForm.getHanOtp().setText(tk.getOtpHetHan());
        panelForm.getTrangThai().setText(tk.getTrangThai());
    }

    public void  xuLySuKien() {
        panelTable.addRowClickListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowSelected = panelTable.getMyTable().getSelectedRow();
            if(rowSelected != -1) {
                panelForm.getMa().setEditable(false);
                String maTK = panelTable.getMyTable().getValueAt(rowSelected, 0).toString();
                TaiKhoanDTO tk = taiKhoanBUS.timMotTK(maTK);
                if(tk != null) {
                    setForm(tk);
                }
            }
            }
        });

        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maTK = panelForm.getMa().getText().trim();
                if(maTK.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã tài khoản!");
                    return;
                }

                if(taiKhoanBUS.timMotTK(maTK) != null) {
                    JOptionPane.showMessageDialog(null, "Mã tài khoản đã tồn tại!");
                    return;
                }
                try {
                    String mauKhau = panelForm.getMauKhau().toString();
                    String chucVu = panelForm.getChucVu().getText().trim();
                    String otp = panelForm.getOtp().getText().trim();
                    String hanOtp = panelForm.getHanOtp().getText().trim();
                    String trangThai = panelForm.getTrangThai().getText().trim();
                    String email = panelForm.getEmail().getText().trim();
                    if(email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                        JOptionPane.showMessageDialog(null, "Email bạn nhập không đúng vui lòng nhập lại!");
                        return;
                    }

                    TaiKhoanDTO tk = new TaiKhoanDTO();
                    tk.setMaTaiKhoan(maTK);
                    tk.setEmail(email);
                    tk.setMatKhau(mauKhau);
                    tk.setVaiTro(chucVu);
                    tk.setOtp(otp);
                    tk.setOtpHetHan(hanOtp);
                    tk.setTrangThai(trangThai);

                    taiKhoanBUS.themTaiKhoan(tk);
                    panelForm.clearForm();
                    layDanhSachTaiKhoan();
                    JOptionPane.showMessageDialog(null, "Thêm tài khoản thành công!");
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(null, "Lỗi nhập dữ liệu: " + ex.getMessage());
                }
            }
        });
    }
}
