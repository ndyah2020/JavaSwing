package GUI.forms;

import GUI.PopupForm.PopupFormSearch;
import GUI.panel.swing.MyButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

public class MayBayControlForm extends javax.swing.JPanel {
    private final PopupFormSearch bangLayMa = new PopupFormSearch();
    
    public MayBayControlForm() {
        initComponents();
        jPopupMenu.setLayout(new BorderLayout());
        jPopupMenu.add(bangLayMa, BorderLayout.CENTER);
    }
    
    public PopupFormSearch getBangLayMaLoaiMayBay() {
        return bangLayMa;
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTenMayBay = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtSoLuongGheVip = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtMaMayBay = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSoLuongGheThuong = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtGetMaLoaiMayBay = new javax.swing.JTextField();
        btnGetMaLoaiMayBay = new GUI.panel.swing.MyButton();
        mucLuongComboBox = new GUI.panel.swing.MyCombobox();
        mucLuongComboBox1 = new GUI.panel.swing.MyCombobox();
        btnThem = new GUI.panel.swing.MyButton();
        btnXoa = new GUI.panel.swing.MyButton();
        btnSua = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1065, 140));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh Sách Máy Bay");
        jLabel1.setPreferredSize(new java.awt.Dimension(153, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên Máy Bay ");
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel2.add(jLabel2);

        txtTenMayBay.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel2.add(txtTenMayBay);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Số Lượng Ghế Vip");
        jLabel3.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel3.add(jLabel3);

        txtSoLuongGheVip.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel3.add(txtSoLuongGheVip);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Mã Máy Bay ");
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel1.add(jLabel6);

        txtMaMayBay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaMayBay.setPreferredSize(new java.awt.Dimension(79, 31));
        txtMaMayBay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaMayBayActionPerformed(evt);
            }
        });
        jPanel1.add(txtMaMayBay);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số Lượng Ghế Thường");
        jLabel4.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel4.add(jLabel4);

        txtSoLuongGheThuong.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel4.add(txtSoLuongGheThuong);

        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        txtTimKiem.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel6.add(txtTimKiem);

        jLabel7.setBackground(new java.awt.Color(0, 204, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/search.png"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel7.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel7.setOpaque(true);
        jLabel7.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel6.add(jLabel7);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Loại Máy Bay");
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel5.add(jLabel5);

        txtGetMaLoaiMayBay.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel5.add(txtGetMaLoaiMayBay);

        btnGetMaLoaiMayBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnGetMaLoaiMayBay.setBorderColor(new java.awt.Color(204, 204, 204));
        btnGetMaLoaiMayBay.setColorClick(new java.awt.Color(0, 153, 255));
        btnGetMaLoaiMayBay.setColorOver(new java.awt.Color(0, 204, 255));
        btnGetMaLoaiMayBay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGetMaLoaiMayBay.setMinimumSize(new java.awt.Dimension(30, 30));
        btnGetMaLoaiMayBay.setPreferredSize(new java.awt.Dimension(32, 31));
        jPanel5.add(btnGetMaLoaiMayBay);

        mucLuongComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Xắp Xếp: Tăng Dần", "Giảm Dần" }));
        mucLuongComboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mucLuongComboBox.setPreferredSize(new java.awt.Dimension(150, 31));

        mucLuongComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lọc: Theo Mã", "Theo Tên" }));
        mucLuongComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mucLuongComboBox1.setPreferredSize(new java.awt.Dimension(150, 31));
        mucLuongComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mucLuongComboBox1ActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThem.setColorClick(new java.awt.Color(0, 153, 255));
        btnThem.setColorOver(new java.awt.Color(0, 204, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setPreferredSize(new java.awt.Dimension(99, 31));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/Xoa.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorderColor(new java.awt.Color(204, 204, 204));
        btnXoa.setColorClick(new java.awt.Color(0, 153, 255));
        btnXoa.setColorOver(new java.awt.Color(0, 204, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setPreferredSize(new java.awt.Dimension(99, 31));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSua.setColorClick(new java.awt.Color(0, 153, 255));
        btnSua.setColorOver(new java.awt.Color(0, 204, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setPreferredSize(new java.awt.Dimension(72, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mucLuongComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mucLuongComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mucLuongComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mucLuongComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mucLuongComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mucLuongComboBox1ActionPerformed
     
    }//GEN-LAST:event_mucLuongComboBox1ActionPerformed

    private void txtMaMayBayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaMayBayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaMayBayActionPerformed
    
    public JTextField getTxtMaMayBay() {
        return txtMaMayBay;
    }
    
    public JTextField getTxtTenMayBay() {
        return txtTenMayBay;
    }
    
    public JTextField getTxtGetMaLoaiMayBay() {
        return txtGetMaLoaiMayBay;
    }
    
    public JTextField getTxtSoLuongGheThuong() {
        return txtSoLuongGheThuong;
    }
    
    public JTextField getTxtSoLuongGheVip() {
        return txtSoLuongGheVip;
    }
    
    public JTextField getTxtTimKiem() {
        return txtTimKiem;
    }
    
    public MyButton getBtnGetMaLoaiMayBay() {
        return btnGetMaLoaiMayBay;
    }
    
    public JPopupMenu getJPopupMenu () {
        return jPopupMenu;
    }
    
    public void showPopupGetMaLoaiMayBay() {
        jPopupMenu.show(btnGetMaLoaiMayBay, -250, btnGetMaLoaiMayBay.getWidth());
    }
    
    public void resetForm() {
        txtMaMayBay.setText("");
        txtTenMayBay.setText("");
        txtSoLuongGheThuong.setText("");
        txtSoLuongGheVip.setText("");
        txtGetMaLoaiMayBay.setText("");
    }
    
    public void addThemListener(ActionListener al) {
        btnThem.addActionListener(al);
    }
    
    public void addXoaListenner(ActionListener al) {
        btnXoa.addActionListener(al);
    } 
    
    public void addSuaListener(ActionListener al) {
        btnSua.addActionListener(al);
                
    }
    
    public void addTimKiemListener(KeyAdapter ka) {
        txtTimKiem.addKeyListener(ka);
    }
    
    public void addShowPopupGetMaLoaiMayBay(ActionListener al) {
        btnGetMaLoaiMayBay.addActionListener(al);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnGetMaLoaiMayBay;
    private GUI.panel.swing.MyButton btnSua;
    private GUI.panel.swing.MyButton btnThem;
    private GUI.panel.swing.MyButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu;
    private GUI.panel.swing.MyCombobox mucLuongComboBox;
    private GUI.panel.swing.MyCombobox mucLuongComboBox1;
    private javax.swing.JTextField txtGetMaLoaiMayBay;
    private javax.swing.JTextField txtMaMayBay;
    private javax.swing.JTextField txtSoLuongGheThuong;
    private javax.swing.JTextField txtSoLuongGheVip;
    private javax.swing.JTextField txtTenMayBay;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
