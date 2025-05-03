package GUI.forms;

import GUI.PopupForm.PopupFormSearch;
import GUI.panel.swing.MyButton;
import GUI.panel.swing.MyCombobox;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.BorderLayout;
public class ThongTinDatVeForm extends javax.swing.JPanel {
    private PopupFormSearch bangLayMaVe;
    private PopupFormSearch bangLayMaNhanVien;
    
    public ThongTinDatVeForm() {
        initComponents();
        intPopup();     
        txtMaChuyenBay.setEditable(false);
        txtMaVe.setEditable(false);
        txtMaNhanVien.setEditable(false);
        txtGiaVe.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupLayMaVe = new javax.swing.JPopupMenu();
        popupLayMaNV = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtMaChuyenBay = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cmbLoaiVe = new GUI.panel.swing.MyCombobox();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtMaVe = new javax.swing.JTextField();
        btnMaVe = new GUI.panel.swing.MyButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtGiaVe = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtCccd = new javax.swing.JTextField();
        btnKiemTracccd = new GUI.panel.swing.MyButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        btnNhanVien = new GUI.panel.swing.MyButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtKhuyenMai = new javax.swing.JTextField();
        btnKiemTraKM = new GUI.panel.swing.MyButton();
        jPanel1 = new javax.swing.JPanel();
        btnThemVe = new GUI.panel.swing.MyButton();
        btnDatVe = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin đặc vé");
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel3.add(jLabel1);

        add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 6));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new javax.swing.BoxLayout(jPanel21, javax.swing.BoxLayout.LINE_AXIS));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Mã CB:");
        jLabel19.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel21.add(jLabel19);

        txtMaChuyenBay.setMaximumSize(new java.awt.Dimension(2147483647, 36));
        txtMaChuyenBay.setMinimumSize(new java.awt.Dimension(0, 0));
        txtMaChuyenBay.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel21.add(txtMaChuyenBay);

        jPanel20.add(jPanel21);

        jPanel2.add(jPanel20);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Loại Vé");
        jLabel12.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel4.add(jLabel12);

        cmbLoaiVe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn Loại Vé", "Vé Thường", "Vé Vip" }));
        cmbLoaiVe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbLoaiVe.setMaximumSize(new java.awt.Dimension(32767, 36));
        cmbLoaiVe.setMinimumSize(new java.awt.Dimension(0, 0));
        cmbLoaiVe.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel4.add(cmbLoaiVe);

        jPanel2.add(jPanel4);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Chọn Vé:");
        jLabel10.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel9.add(jLabel10);

        txtMaVe.setMaximumSize(new java.awt.Dimension(2147483647, 36));
        txtMaVe.setMinimumSize(new java.awt.Dimension(0, 0));
        txtMaVe.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel9.add(txtMaVe);

        btnMaVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnMaVe.setBorderColor(new java.awt.Color(204, 204, 204));
        btnMaVe.setColorClick(new java.awt.Color(0, 153, 255));
        btnMaVe.setColorOver(new java.awt.Color(0, 204, 255));
        btnMaVe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMaVe.setMaximumSize(new java.awt.Dimension(30, 36));
        btnMaVe.setMinimumSize(new java.awt.Dimension(0, 0));
        btnMaVe.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel9.add(btnMaVe);

        jPanel2.add(jPanel9);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new javax.swing.BoxLayout(jPanel17, javax.swing.BoxLayout.LINE_AXIS));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Giá vé");
        jLabel17.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel17.setPreferredSize(new java.awt.Dimension(69, 30));
        jPanel17.add(jLabel17);

        txtGiaVe.setMaximumSize(new java.awt.Dimension(2147483647, 36));
        txtGiaVe.setMinimumSize(new java.awt.Dimension(0, 0));
        txtGiaVe.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel17.add(txtGiaVe);

        jPanel2.add(jPanel17);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("CCCD");
        jLabel14.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel13.add(jLabel14);

        txtCccd.setMargin(null);
        txtCccd.setMaximumSize(new java.awt.Dimension(2147483647, 36));
        txtCccd.setMinimumSize(new java.awt.Dimension(0, 0));
        txtCccd.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel13.add(txtCccd);

        btnKiemTracccd.setText("Kiểm tra");
        btnKiemTracccd.setBorderColor(new java.awt.Color(204, 204, 204));
        btnKiemTracccd.setColorClick(new java.awt.Color(0, 153, 255));
        btnKiemTracccd.setColorOver(new java.awt.Color(0, 204, 255));
        btnKiemTracccd.setMargin(null);
        btnKiemTracccd.setMaximumSize(new java.awt.Dimension(74, 36));
        btnKiemTracccd.setMinimumSize(new java.awt.Dimension(0, 0));
        btnKiemTracccd.setPreferredSize(new java.awt.Dimension(74, 30));
        jPanel13.add(btnKiemTracccd);

        jPanel2.add(jPanel13);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("NV Bán");
        jLabel11.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel10.add(jLabel11);

        txtMaNhanVien.setMaximumSize(new java.awt.Dimension(2147483647, 36));
        txtMaNhanVien.setMinimumSize(new java.awt.Dimension(0, 0));
        txtMaNhanVien.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel10.add(txtMaNhanVien);

        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnNhanVien.setBorderColor(new java.awt.Color(204, 204, 204));
        btnNhanVien.setColorClick(new java.awt.Color(0, 153, 255));
        btnNhanVien.setColorOver(new java.awt.Color(0, 204, 255));
        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNhanVien.setMaximumSize(new java.awt.Dimension(30, 36));
        btnNhanVien.setMinimumSize(new java.awt.Dimension(0, 0));
        btnNhanVien.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel10.add(btnNhanVien);

        jPanel2.add(jPanel10);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new javax.swing.BoxLayout(jPanel14, javax.swing.BoxLayout.LINE_AXIS));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Mã KM");
        jLabel15.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel14.add(jLabel15);

        txtKhuyenMai.setMargin(null);
        txtKhuyenMai.setMaximumSize(new java.awt.Dimension(2147483647, 36));
        txtKhuyenMai.setMinimumSize(new java.awt.Dimension(0, 0));
        txtKhuyenMai.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel14.add(txtKhuyenMai);

        btnKiemTraKM.setText("Kiểm tra");
        btnKiemTraKM.setBorderColor(new java.awt.Color(204, 204, 204));
        btnKiemTraKM.setColorClick(new java.awt.Color(0, 153, 255));
        btnKiemTraKM.setColorOver(new java.awt.Color(0, 204, 255));
        btnKiemTraKM.setMargin(null);
        btnKiemTraKM.setMaximumSize(new java.awt.Dimension(74, 36));
        btnKiemTraKM.setMinimumSize(new java.awt.Dimension(0, 0));
        btnKiemTraKM.setPreferredSize(new java.awt.Dimension(74, 30));
        jPanel14.add(btnKiemTraKM);

        jPanel2.add(jPanel14);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 12, 0));

        btnThemVe.setText("Thêm Vé");
        btnThemVe.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThemVe.setColorClick(new java.awt.Color(0, 153, 255));
        btnThemVe.setColorOver(new java.awt.Color(0, 204, 255));
        btnThemVe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThemVe.setMaximumSize(new java.awt.Dimension(74, 36));
        btnThemVe.setMinimumSize(new java.awt.Dimension(0, 0));
        btnThemVe.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(btnThemVe);

        btnDatVe.setText("Đặt Vé");
        btnDatVe.setBorderColor(new java.awt.Color(204, 204, 204));
        btnDatVe.setColorClick(new java.awt.Color(0, 153, 255));
        btnDatVe.setColorOver(new java.awt.Color(0, 204, 255));
        btnDatVe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDatVe.setMaximumSize(new java.awt.Dimension(432423, 36));
        btnDatVe.setMinimumSize(new java.awt.Dimension(0, 0));
        btnDatVe.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(btnDatVe);

        jPanel2.add(jPanel1);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents
    public void showPopBangLayMaVe() {
        popupLayMaVe.show(btnMaVe, -287, btnMaVe.getHeight() - 200);
    }
    
    public void showPopBangLayMaNV() {
        popupLayMaNV.show(btnNhanVien, -287, btnNhanVien.getHeight() - 200);
    }
    
    private void intPopup() {
        bangLayMaVe = new PopupFormSearch();
        popupLayMaVe.setLayout(new BorderLayout());
        popupLayMaVe.add(bangLayMaVe, BorderLayout.CENTER);
        
        bangLayMaNhanVien = new PopupFormSearch();
        popupLayMaNV.setLayout(new BorderLayout());
        popupLayMaNV.add(bangLayMaNhanVien, BorderLayout.CENTER);
    }

    public PopupFormSearch getBangLayMaNhanVien() {
        return bangLayMaNhanVien;
    }
    
    public MyButton getBtnDatVe() {
        return btnDatVe;
    }

    public MyButton getBtnKiemTracccd() {
        return btnKiemTracccd;
    }

    public MyButton getBtnMaVe() {
        return btnMaVe;
    }

    public MyButton getBtnThemVe() {
        return btnThemVe;
    }

    public JTextField getTxtCccd() {
        return txtCccd;
    }

    public JTextField getTxtGiaVe() {
        return txtGiaVe;
    }

    public JTextField getTxtMaChuyenBay() {
        return txtMaChuyenBay;
    }

    public JTextField getTxtMaVe() {
        return txtMaVe;
    }

    public PopupFormSearch getBangLayMaVe() {
        return bangLayMaVe;
    }

    public MyButton getBtnNhanVien() {
        return btnNhanVien;
    }

    public JTextField getTxtMaNhanVien() {
        return txtMaNhanVien;
    }

    public MyCombobox getCmbLoaiVe() {
        return cmbLoaiVe;
    }

    public JTextField getTxtKhuyenMai() {
        return txtKhuyenMai;
    }
    
    public void addBtnThemveListener(ActionListener listener) {
        btnThemVe.addActionListener(listener);
    }
    
    public void addBtnDatVeListener(ActionListener listener) {
        btnDatVe.addActionListener(listener);
    }
    
    public void addBtnKiemTraKH(ActionListener listener) {
        btnKiemTracccd.addActionListener(listener);
    }
    
    public void addShowPopopMaVe(ActionListener listener) {
        btnMaVe.addActionListener(listener);
    }
    
    public void addShowPopupMaNhanVien(ActionListener listener) {
        btnNhanVien.addActionListener(listener);
    }
    
    public void addCmbLoaiVeListener(ActionListener listener) {
        cmbLoaiVe.addActionListener(listener);
    }
    
    public void addBtnKiemTraKM(ActionListener listener) {
        btnKiemTraKM.addActionListener(listener);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnDatVe;
    private GUI.panel.swing.MyButton btnKiemTraKM;
    private GUI.panel.swing.MyButton btnKiemTracccd;
    private GUI.panel.swing.MyButton btnMaVe;
    private GUI.panel.swing.MyButton btnNhanVien;
    private GUI.panel.swing.MyButton btnThemVe;
    private GUI.panel.swing.MyCombobox cmbLoaiVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu popupLayMaNV;
    private javax.swing.JPopupMenu popupLayMaVe;
    private javax.swing.JTextField txtCccd;
    private javax.swing.JTextField txtGiaVe;
    private javax.swing.JTextField txtKhuyenMai;
    private javax.swing.JTextField txtMaChuyenBay;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtMaVe;
    // End of variables declaration//GEN-END:variables
}
