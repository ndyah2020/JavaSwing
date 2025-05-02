package Control;

import java.util.ArrayList;

import BUS.KhachHangBUS;
import DTO.KhachHangDTO;
import GUI.forms.KhachHangControlForm;
import GUI.forms.KhachHangForm;
import GUI.forms.KhachHangPanelForm;
import GUI.forms.KhachHangTableForm;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;


public class KhachHangController {
    private ArrayList<KhachHangDTO> dsKhachHang;
    private final KhachHangForm panelForm;
    private final KhachHangControlForm panelControl;
    private final KhachHangTableForm panelTable;
    private final KhachHangBUS khachHangBUS = new KhachHangBUS();

    public KhachHangController(KhachHangPanelForm panel) {
        this.panelForm = panel.getKhachHangForm();
        this.panelControl = panel.getKhachHangControlForm();
        this.panelTable = panel.getKhachHangTableForm();   
    }

    public void layDanhSachKhachHang() {
        DefaultTableModel modelDS = panelTable.getModel();
        dsKhachHang = khachHangBUS.getdsKhachHang();
        HienThiTable.taiDuLieuTableKhachHang(modelDS, dsKhachHang);
        panelTable.getMyTable().setModel(modelDS);
    }
    private KhachHangDTO layKhachHangTheoMa(String id) {
        KhachHangDTO kh = new KhachHangDTO();
        KhachHangBUS bus = new KhachHangBUS();
        ArrayList<KhachHangDTO> dsKH = bus.getdsKhachHang();
        for(KhachHangDTO dto : dsKH) {
            if(dto.getMaKhachHang().equals(id)) {
                kh = dto;
                break;
            }
        }
        return kh;
    }

    private void setForm(KhachHangDTO kh) {
        panelForm.getMa().setText(kh.getMaKhachHang());
        panelForm.getHo().setText(kh.getHo());
        panelForm.getTen().setText(kh.getTen());
        panelForm.setGioiTinh(kh.getGioiTinh());
        panelForm.getNgaySinh().setText(kh.getNgaySinh().toString());
        panelForm.getSdt().setText(kh.getSdt());
        panelForm.getEmail().setText(kh.getEmail());
    }

    public void conTrol() {
        //set form
        panelTable.addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowSelected = panelTable.getMyTable().getSelectedRow();
            if(rowSelected != -1) {
                panelForm.getMa().setEditable(false);
                String maKH = panelTable.getMyTable().getValueAt(rowSelected, 0).toString();
                KhachHangDTO onlyKH = khachHangBUS.timMotKH(maKH);
                if(onlyKH != null) {
                    setForm(onlyKH);
                }
            }
            }
        });
        //delete form
        panelControl.addXoaFormListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelForm.getMa().setEditable(true);
                panelTable.getMyTable().clearSelection();
                panelForm.clearForm();
            }
        });
        //add khach hang
        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String maKh = panelForm.getMa().getText().trim();
                if(maKh.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập mã khách hàng!");
                    return;
                }

                if(khachHangBUS.timMotKH(maKh) != null) {
                    JOptionPane.showMessageDialog(null, "Mã khách hàng đã tồn tại!");
                    return;
                }
                try {
                    Date ngaySinh = Date.valueOf(panelForm.getNgaySinh().getText());
                    String gioiTinh = panelForm.getGioiTinh();
                    String ho = panelForm.getHo().getText().trim();
                    String ten = panelForm.getTen().getText().trim();
                    String sdt = panelForm.getSdt().getText().trim();
                    if(sdt.matches("\\d{10}")) {
                        JOptionPane.showMessageDialog(null, "Số điện thoại bạn nhập không đúng vui lòng nhập lại!");
                        return;
                    }
                    String email = panelForm.getEmail().getText().trim();
                    if(email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                        JOptionPane.showMessageDialog(null, "Email bạn nhập không đúng vui lòng nhập lại!");
                        return;
                    }
                    String cccd = panelForm.getCccd().getText().trim();
                    if(cccd.matches("^0\\d{11}$" + //
                                                "")) {
                        JOptionPane.showMessageDialog(null, "Cccd bạn nhập không đúng vui lòng nhập lại!");
                        return;
                    }
                    KhachHangDTO kh = new KhachHangDTO();
                    kh.setMaKhachHang(maKh);
                    kh.setHo(ho);
                    kh.setTen(ten);;
                    kh.setGioiTinh(gioiTinh);
                    kh.setNgaySinh(ngaySinh);
                    kh.setSdt(sdt);
                    kh.setEmail(email);

                    khachHangBUS.themKhachHang(kh);
                    panelForm.clearForm();
                    layDanhSachKhachHang();
                    JOptionPane.showMessageDialog(null, "Thêm khách hàng thành công!");
                } catch(Exception ex) {
                    JOptionPane.showMessageDialog(null, "Lỗi nhập dữ liệu: " + ex.getMessage());
                }
            }
        });
        //edit
        panelControl.addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowClick = panelTable.getMyTable().getSelectedRow();
                if (rowClick != -1) {
                    String maKh = panelForm.getMa().getText().trim();
                    if(maKh.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Vui lòng nhập mã khách hàng!");
                        return;
                    }
    
                    if(khachHangBUS.timMotKH(maKh) != null) {
                        JOptionPane.showMessageDialog(null, "Mã khách hàng đã tồn tại!");
                        return;
                    }
                        try {
                            Date ngaySinh = Date.valueOf(panelForm.getNgaySinh().getText());
                            String gioiTinh = panelForm.getGioiTinh();
                            String ho = panelForm.getHo().getText().trim();
                            String ten = panelForm.getTen().getText().trim();
                            String sdt = panelForm.getSdt().getText().trim();
                            if(sdt.matches("\\d{10}")) {
                                JOptionPane.showMessageDialog(null, "Số điện thoại bạn nhập không đúng vui lòng nhập lại!");
                                return;
                            }
                            String email = panelForm.getEmail().getText().trim();
                            if(email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                                JOptionPane.showMessageDialog(null, "Email bạn nhập không đúng vui lòng nhập lại!");
                                return;
                            }
                            String cccd = panelForm.getCccd().getText().trim();
                            if(cccd.matches("^0\\d{11}$")) {
                                JOptionPane.showMessageDialog(null, "Cccd bạn nhập không đúng vui lòng nhập lại!");
                                return;
                            }
                            KhachHangDTO kh = new KhachHangDTO();
                            kh.setMaKhachHang(maKh);
                            kh.setHo(ho);
                            kh.setTen(ten);;
                            kh.setGioiTinh(gioiTinh);
                            kh.setNgaySinh(ngaySinh);
                            kh.setSdt(sdt);
                            kh.setEmail(email);

                            khachHangBUS.themKhachHang(kh);
                            panelForm.clearForm();
                            layDanhSachKhachHang();
                            JOptionPane.showMessageDialog(null, "Thêm khách hàng thành công!");
                        } catch(Exception ex) {
                            JOptionPane.showMessageDialog(null, "Lỗi nhập dữ liệu: " + ex.getMessage());
                        }
                    
                }else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn chuyến bay cần sửa!");
                }
            }
        });
    }
}