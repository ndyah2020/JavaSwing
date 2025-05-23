package GUI.forms;

import javax.swing.JLabel;

public class ThongTinNhanVienForm extends javax.swing.JPanel {
    public ThongTinNhanVienForm() {
        initComponents();
    }

    public JLabel getCtChucVu() {
        return ctChucVu;
    }

    public JLabel getCtEmail() {
        return ctEmail;
    }

    public JLabel getCtGioiTinhNhanVien() {
        return ctGioiTinhNhanVien;
    }

    public JLabel getCtHoNhanVien() {
        return ctHoNhanVien;
    }

    public JLabel getCtMaNhanVien() {
        return ctMaNhanVien;
    }

    public JLabel getCtSdt() {
        return ctSdt;
    }

    public JLabel getCtTenNhanVien() {
        return ctTenNhanVien;
    }

    public void clearForm() {
        ctMaNhanVien.setText("");
        ctHoNhanVien.setText("");
        ctTenNhanVien.setText("");
        ctGioiTinhNhanVien.setText("");
        ctSdt.setText("");
        ctEmail.setText("");
        ctChucVu.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ctMaNhanVien = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ctTenNhanVien = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ctChucVu = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        ctHoNhanVien = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        ctGioiTinhNhanVien = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        ctSdt = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbEmial = new javax.swing.JLabel();
        ctEmail = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Thông tin chi tiết nhân viên");
        jLabel1.setPreferredSize(new java.awt.Dimension(86, 30));
        jPanel9.add(jLabel1);

        add(jPanel9);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 12, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setLayout(new java.awt.GridLayout(0, 1, 10, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(204, 30));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Mã Nhân Viên: ");
        jLabel11.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel2.add(jLabel11);

        ctMaNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        ctMaNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctMaNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ctMaNhanVien.setMaximumSize(new java.awt.Dimension(200, 300));
        ctMaNhanVien.setMinimumSize(new java.awt.Dimension(120, 300));
        ctMaNhanVien.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel2.add(ctMaNhanVien);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(204, 30));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Tên Nhân Viên: ");
        jLabel13.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel3.add(jLabel13);

        ctTenNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        ctTenNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctTenNhanVien.setMaximumSize(new java.awt.Dimension(200, 300));
        ctTenNhanVien.setMinimumSize(new java.awt.Dimension(120, 300));
        ctTenNhanVien.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel3.add(ctTenNhanVien);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(204, 30));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Chức Vụ: ");
        jLabel15.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabel15.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabel15.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel4.add(jLabel15);

        ctChucVu.setBackground(new java.awt.Color(255, 255, 255));
        ctChucVu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctChucVu.setMaximumSize(new java.awt.Dimension(200, 300));
        ctChucVu.setMinimumSize(new java.awt.Dimension(120, 300));
        ctChucVu.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel4.add(ctChucVu);

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(204, 30));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Họ Nhân Viên: ");
        jLabel17.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel5.add(jLabel17);

        ctHoNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        ctHoNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctHoNhanVien.setMaximumSize(new java.awt.Dimension(200, 300));
        ctHoNhanVien.setMinimumSize(new java.awt.Dimension(120, 300));
        ctHoNhanVien.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel5.add(ctHoNhanVien);

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(204, 30));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Giới Tính: ");
        jLabel19.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel19.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel19.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel6.add(jLabel19);

        ctGioiTinhNhanVien.setBackground(new java.awt.Color(255, 255, 255));
        ctGioiTinhNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctGioiTinhNhanVien.setMaximumSize(new java.awt.Dimension(200, 300));
        ctGioiTinhNhanVien.setMinimumSize(new java.awt.Dimension(120, 300));
        ctGioiTinhNhanVien.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel6.add(ctGioiTinhNhanVien);

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(204, 30));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("SDT:");
        jLabel21.setMaximumSize(new java.awt.Dimension(120, 30));
        jLabel21.setMinimumSize(new java.awt.Dimension(120, 30));
        jLabel21.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel7.add(jLabel21);

        ctSdt.setBackground(new java.awt.Color(255, 255, 255));
        ctSdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctSdt.setMaximumSize(new java.awt.Dimension(200, 300));
        ctSdt.setMinimumSize(new java.awt.Dimension(120, 300));
        ctSdt.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel7.add(ctSdt);

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(204, 30));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        lbEmial.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbEmial.setText("Email: ");
        lbEmial.setMaximumSize(new java.awt.Dimension(120, 30));
        lbEmial.setMinimumSize(new java.awt.Dimension(40, 30));
        lbEmial.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel8.add(lbEmial);

        ctEmail.setBackground(new java.awt.Color(255, 255, 255));
        ctEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctEmail.setMaximumSize(new java.awt.Dimension(200, 300));
        ctEmail.setMinimumSize(new java.awt.Dimension(120, 300));
        ctEmail.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel8.add(ctEmail);

        jPanel1.add(jPanel8);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ctChucVu;
    private javax.swing.JLabel ctEmail;
    private javax.swing.JLabel ctGioiTinhNhanVien;
    private javax.swing.JLabel ctHoNhanVien;
    private javax.swing.JLabel ctMaNhanVien;
    private javax.swing.JLabel ctSdt;
    private javax.swing.JLabel ctTenNhanVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbEmial;
    // End of variables declaration//GEN-END:variables
}
