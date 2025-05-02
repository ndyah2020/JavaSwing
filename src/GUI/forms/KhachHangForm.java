/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.forms;

import GUI.panel.swing.dateChooser.DateChooser;
import javax.swing.JTextField;


/**
 *
 * @author thien
 */
public class KhachHangForm extends javax.swing.JPanel {

    private DateChooser ngaySinhDate;
    
    public KhachHangForm() {
        initComponents();
        initDateChoosers();
        buttonGroup1.add(btnNam);
        buttonGroup1.add(btnNu);
        txtNgaySinh.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel15 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnNam = new javax.swing.JRadioButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 0), new java.awt.Dimension(40, 32767));
        btnNu = new javax.swing.JRadioButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtCccd = new javax.swing.JTextField();

        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(255, 255, 255)));
        jPanel15.setForeground(new java.awt.Color(204, 204, 204));
        jPanel15.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin khách hàng");
        jPanel15.add(jLabel1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã khách hàng:");
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel1.add(jLabel2);

        txtMa.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtMa.setPreferredSize(null);
        jPanel1.add(txtMa);

        jPanel15.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Họ:");
        jLabel3.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel2.add(jLabel3);

        txtHo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtHo.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtHo.setPreferredSize(null);
        jPanel2.add(txtHo);

        jPanel15.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setName(""); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tên:");
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel3.add(jLabel4);

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTen.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtTen.setPreferredSize(null);
        jPanel3.add(txtTen);

        jPanel15.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setName(""); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Giới tính:");
        jLabel5.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel4.add(jLabel5);

        btnNam.setBackground(new java.awt.Color(255, 255, 255));
        btnNam.setText("Nam");
        jPanel4.add(btnNam);
        jPanel4.add(filler3);

        btnNu.setBackground(new java.awt.Color(255, 255, 255));
        btnNu.setText("Nữ");
        jPanel4.add(btnNu);
        jPanel4.add(filler2);

        jPanel15.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setName(""); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ngày sinh:");
        jLabel6.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel5.add(jLabel6);

        txtNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgaySinh.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtNgaySinh.setPreferredSize(null);
        jPanel5.add(txtNgaySinh);

        jPanel15.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setName(""); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Số điện thoại:");
        jLabel7.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel6.add(jLabel7);

        txtSdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSdt.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtSdt.setPreferredSize(null);
        jPanel6.add(txtSdt);

        jPanel15.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setName(""); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Email:");
        jLabel8.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel7.add(jLabel8);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmail.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtEmail.setPreferredSize(null);
        jPanel7.add(txtEmail);

        jPanel15.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setName(""); // NOI18N
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("CCCD:");
        jLabel9.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel8.add(jLabel9);

        txtCccd.setMaximumSize(new java.awt.Dimension(2147483647, 40));
        txtCccd.setPreferredSize(null);
        jPanel8.add(txtCccd);

        jPanel15.add(jPanel8);

        add(jPanel15);
    }// </editor-fold>//GEN-END:initComponents

    private void initDateChoosers() {
        ngaySinhDate = new DateChooser();
        ngaySinhDate.setTextRefernce(txtNgaySinh);
    }
    
    public JTextField getMa() {
        return txtMa;
    }
    
    public JTextField getHo() {
        return txtHo;
    }
    
    public JTextField getTen() {
        return txtTen;
    }
    
    public JTextField getNgaySinh() {
        return txtNgaySinh;
    }
    
    public DateChooser getNgaySinhDate() {
        return ngaySinhDate;
    }
    
    public JTextField getSdt() {
        return txtSdt;
    }
    
    public JTextField getEmail() {
        return txtEmail;
    }
    
    public JTextField getCccd() {
        return txtCccd;
    }
    
    public String getGioiTinh() {
        String gender = btnNam.isSelected() ? "Nam" : "Nữ";
        return gender;
    }
    
    public void setGioiTinh(String gioiTinh) {
    if ("Nam".equalsIgnoreCase(gioiTinh)) {
        btnNam.setSelected(true);
    } else {
        btnNu.setSelected(true);
    }
}
    
    public void clearForm() {
        initDateChoosers();
        txtMa.setText("");
        txtHo.setText("");
        txtTen.setText("");
        txtNgaySinh.setText("");
        txtSdt.setText("");
        txtEmail.setText("");
        txtCccd.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnNam;
    private javax.swing.JRadioButton btnNu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField txtCccd;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
