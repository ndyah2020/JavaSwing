package GUI.forms;
public class HoaDonControlForm extends javax.swing.JPanel {
    public HoaDonControlForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSua1 = new GUI.panel.swing.MyButton();
        jPanel5 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSua3 = new GUI.panel.swing.MyButton();
        myCombobox1 = new GUI.panel.swing.MyCombobox();
        jPanel6 = new javax.swing.JPanel();
        lbDenNgay = new javax.swing.JLabel();
        txtNgayKetThuc = new javax.swing.JTextField();
        btnNgayKetThuc = new GUI.panel.swing.MyButton();
        jPanel7 = new javax.swing.JPanel();
        lbDenNgay1 = new javax.swing.JLabel();
        txtNgayKetThuc1 = new javax.swing.JTextField();
        btnNgayKetThuc1 = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Danh sách hóa đơn");

        btnSua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/hidden.png"))); // NOI18N
        btnSua1.setText("Ẩn");
        btnSua1.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSua1.setColorClick(new java.awt.Color(0, 153, 255));
        btnSua1.setColorOver(new java.awt.Color(0, 204, 255));
        btnSua1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua1.setPreferredSize(new java.awt.Dimension(72, 31));

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        txtSearch.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel5.add(txtSearch);

        jLabel3.setBackground(new java.awt.Color(0, 204, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/search.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel5.add(jLabel3);

        btnSua3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/reloadNhanVien.png"))); // NOI18N
        btnSua3.setText("Tải lại");
        btnSua3.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSua3.setColorClick(new java.awt.Color(0, 153, 255));
        btnSua3.setColorOver(new java.awt.Color(0, 204, 255));
        btnSua3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua3.setPreferredSize(new java.awt.Dimension(72, 31));
        btnSua3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua3ActionPerformed(evt);
            }
        });

        myCombobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Xắp Xếp Mã", "Tăng dần", "Giảm dần" }));
        myCombobox1.setToolTipText("");
        myCombobox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        myCombobox1.setPreferredSize(new java.awt.Dimension(250, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        lbDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDenNgay.setText("Đến Ngày:");
        lbDenNgay.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel6.add(lbDenNgay);

        txtNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayKetThuc.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel6.add(txtNgayKetThuc);

        btnNgayKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnNgayKetThuc.setBorderColor(new java.awt.Color(204, 204, 204));
        btnNgayKetThuc.setColorClick(new java.awt.Color(0, 153, 255));
        btnNgayKetThuc.setColorOver(new java.awt.Color(0, 204, 255));
        btnNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNgayKetThuc.setMaximumSize(new java.awt.Dimension(30, 30));
        btnNgayKetThuc.setMinimumSize(new java.awt.Dimension(30, 30));
        btnNgayKetThuc.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel6.add(btnNgayKetThuc);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        lbDenNgay1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDenNgay1.setText("Từ Ngày:");
        lbDenNgay1.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel7.add(lbDenNgay1);

        txtNgayKetThuc1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayKetThuc1.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel7.add(txtNgayKetThuc1);

        btnNgayKetThuc1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnNgayKetThuc1.setBorderColor(new java.awt.Color(204, 204, 204));
        btnNgayKetThuc1.setColorClick(new java.awt.Color(0, 153, 255));
        btnNgayKetThuc1.setColorOver(new java.awt.Color(0, 204, 255));
        btnNgayKetThuc1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNgayKetThuc1.setMaximumSize(new java.awt.Dimension(30, 30));
        btnNgayKetThuc1.setMinimumSize(new java.awt.Dimension(30, 30));
        btnNgayKetThuc1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel7.add(btnNgayKetThuc1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 398, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btnSua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSua3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(myCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSua3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSua3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnNgayKetThuc;
    private GUI.panel.swing.MyButton btnNgayKetThuc1;
    private GUI.panel.swing.MyButton btnSua1;
    private GUI.panel.swing.MyButton btnSua3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbDenNgay;
    private javax.swing.JLabel lbDenNgay1;
    private GUI.panel.swing.MyCombobox myCombobox1;
    private javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtNgayKetThuc1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
