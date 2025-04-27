package GUI.forms;

import GUI.panel.swing.MyButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class NhanVienForm extends javax.swing.JPanel {
    public NhanVienForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroupGioiTinh = new javax.swing.ButtonGroup();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNhanVien = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtHoNhanVien = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        radioNam = new javax.swing.JRadioButton();
        radioNu = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtChucVu = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtMaTaiKhoan = new javax.swing.JTextField();
        btnLayMaTaiKhoan = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(255, 255, 255)));
        jPanel10.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Thông Tin Nhân Viên");
        jLabel1.setPreferredSize(new java.awt.Dimension(138, 25));
        jPanel11.add(jLabel1);

        jPanel10.add(jPanel11);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên:");
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel1.add(jLabel2);

        txtMaNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaNhanVien.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtMaNhanVien.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel1.add(txtMaNhanVien);

        jPanel10.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Họ:");
        jLabel3.setPreferredSize(new java.awt.Dimension(110, 20));
        jPanel2.add(jLabel3);

        txtHoNhanVien.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtHoNhanVien.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel2.add(txtHoNhanVien);

        jPanel10.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tên:");
        jLabel4.setMaximumSize(new java.awt.Dimension(1000, 1000));
        jLabel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel3.add(jLabel4);

        txtTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenNhanVien.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtTenNhanVien.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel3.add(txtTenNhanVien);

        jPanel10.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Giới tính:");
        jLabel5.setMaximumSize(new java.awt.Dimension(110, 30));
        jLabel5.setMinimumSize(new java.awt.Dimension(110, 30));
        jLabel5.setPreferredSize(new java.awt.Dimension(110, 30));
        jPanel4.add(jLabel5);

        radioNam.setBackground(new java.awt.Color(255, 255, 255));
        radioGroupGioiTinh.add(radioNam);
        radioNam.setText("Nam");
        radioNam.setMaximumSize(new java.awt.Dimension(100, 30));
        radioNam.setMinimumSize(new java.awt.Dimension(0, 0));
        radioNam.setPreferredSize(new java.awt.Dimension(55, 30));
        jPanel4.add(radioNam);

        radioNu.setBackground(new java.awt.Color(255, 255, 255));
        radioGroupGioiTinh.add(radioNu);
        radioNu.setText("Nữ");
        radioNu.setMaximumSize(new java.awt.Dimension(100, 30));
        radioNu.setMinimumSize(new java.awt.Dimension(0, 0));
        radioNu.setPreferredSize(new java.awt.Dimension(55, 30));
        jPanel4.add(radioNu);

        jPanel10.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Số điện thoại:");
        jLabel6.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel5.add(jLabel6);

        txtSoDienThoai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoDienThoai.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtSoDienThoai.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel5.add(txtSoDienThoai);

        jPanel10.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Email:");
        jLabel7.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel6.add(jLabel7);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtEmail.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel6.add(txtEmail);

        jPanel10.add(jPanel6);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Chức vụ:");
        jLabel9.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel8.add(jLabel9);

        txtChucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtChucVu.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtChucVu.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel8.add(txtChucVu);

        jPanel10.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Lương:");
        jLabel10.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel9.add(jLabel10);

        txtLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLuong.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtLuong.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel9.add(txtLuong);

        jPanel10.add(jPanel9);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mã tài khoản:");
        jLabel8.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel7.add(jLabel8);

        txtMaTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaTaiKhoan.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtMaTaiKhoan.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel7.add(txtMaTaiKhoan);

        btnLayMaTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnLayMaTaiKhoan.setBorderColor(new java.awt.Color(204, 204, 204));
        btnLayMaTaiKhoan.setColorClick(new java.awt.Color(0, 153, 255));
        btnLayMaTaiKhoan.setColorOver(new java.awt.Color(0, 204, 255));
        btnLayMaTaiKhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLayMaTaiKhoan.setMaximumSize(new java.awt.Dimension(40, 40));
        btnLayMaTaiKhoan.setMinimumSize(new java.awt.Dimension(10, 30));
        btnLayMaTaiKhoan.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel7.add(btnLayMaTaiKhoan);

        jPanel10.add(jPanel7);

        add(jPanel10);
    }// </editor-fold>//GEN-END:initComponents

    public MyButton getBtnLayMaTaiKhoan() {
        return btnLayMaTaiKhoan;
    }

    public ButtonGroup getRadioGroupGioiTinh() {
        return radioGroupGioiTinh;
    }

    public JRadioButton getRadioNam() {
        return radioNam;
    }

    public JRadioButton getRadioNu() {
        return radioNu;
    }

    public JTextField getTxtChucVu() {
        return txtChucVu;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtHoNhanVien() {
        return txtHoNhanVien;
    }

    public JTextField getTxtLuong() {
        return txtLuong;
    }

    public JTextField getTxtMaNhanVien() {
        return txtMaNhanVien;
    }

    public JTextField getTxtMaTaiKhoan() {
        return txtMaTaiKhoan;
    }

    public JTextField getTxtSoDienThoai() {
        return txtSoDienThoai;
    }

    public JTextField getTxtTenNhanVien() {
        return txtTenNhanVien;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnLayMaTaiKhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.ButtonGroup radioGroupGioiTinh;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoNhanVien;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtMaTaiKhoan;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
