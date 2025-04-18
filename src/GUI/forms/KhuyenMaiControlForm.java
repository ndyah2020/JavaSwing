package GUI.forms;

import GUI.PopupForm.PopupFormSearch;
import GUI.panel.swing.dateChooser.DateChooser;
import GUI.panel.swing.MyButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
public class KhuyenMaiControlForm extends javax.swing.JPanel {
    private DateChooser dateChooserStart;
    private DateChooser dateChooserEnd;
    private final PopupFormSearch bangLayMa = new PopupFormSearch();
    
    public KhuyenMaiControlForm() {
        initComponents();
        initDateChoosers();
        setupDateChoosers();
        jPopupMenu.setLayout(new BorderLayout());
        jPopupMenu.add(bangLayMa, BorderLayout.CENTER);
    }
    
    public PopupFormSearch getBangLayMa() {
        return bangLayMa;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPopupMenu = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        btnThem = new GUI.panel.swing.MyButton();
        btnSua = new GUI.panel.swing.MyButton();
        jPanel1 = new javax.swing.JPanel();
        lbMaKhuyenMai = new javax.swing.JLabel();
        txtMaKhuyenMai = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbTenKhuyenMai = new javax.swing.JLabel();
        txtTenKhuyenMai = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbMaHanhTrinh = new javax.swing.JLabel();
        txtMaHanhTrinh = new javax.swing.JTextField();
        btnMaHanhTrinh = new GUI.panel.swing.MyButton();
        jPanel6 = new javax.swing.JPanel();
        lbDenNgay = new javax.swing.JLabel();
        txtNgayKetThuc = new javax.swing.JTextField();
        btnNgayKetThuc = new GUI.panel.swing.MyButton();
        jPanel7 = new javax.swing.JPanel();
        lbDenNgay1 = new javax.swing.JLabel();
        txtNgayBatDau = new javax.swing.JTextField();
        btnNgayBatDau = new GUI.panel.swing.MyButton();
        btnXoa = new GUI.panel.swing.MyButton();
        jPanel5 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbPhanTramKhuyenMai = new javax.swing.JLabel();
        txtPhanTramKhuyenMai = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1065, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Danh sách khuyến mãi");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThem.setColorClick(new java.awt.Color(0, 153, 255));
        btnThem.setColorOver(new java.awt.Color(0, 204, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setPreferredSize(new java.awt.Dimension(99, 31));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSua.setColorClick(new java.awt.Color(0, 153, 255));
        btnSua.setColorOver(new java.awt.Color(0, 204, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setPreferredSize(new java.awt.Dimension(72, 31));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        lbMaKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMaKhuyenMai.setText("Mã khuyến mãi:");
        lbMaKhuyenMai.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(lbMaKhuyenMai);

        txtMaKhuyenMai.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(txtMaKhuyenMai);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        lbTenKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTenKhuyenMai.setText("Tên khuyến mãi:");
        lbTenKhuyenMai.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel2.add(lbTenKhuyenMai);

        txtTenKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenKhuyenMai.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel2.add(txtTenKhuyenMai);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        lbMaHanhTrinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMaHanhTrinh.setText("Mã hành trình:");
        lbMaHanhTrinh.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel4.add(lbMaHanhTrinh);

        txtMaHanhTrinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaHanhTrinh.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel4.add(txtMaHanhTrinh);

        btnMaHanhTrinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnMaHanhTrinh.setBorderColor(new java.awt.Color(204, 204, 204));
        btnMaHanhTrinh.setColorClick(new java.awt.Color(0, 153, 255));
        btnMaHanhTrinh.setColorOver(new java.awt.Color(0, 204, 255));
        btnMaHanhTrinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMaHanhTrinh.setPreferredSize(new java.awt.Dimension(32, 31));
        jPanel4.add(btnMaHanhTrinh);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        lbDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDenNgay.setText("Đến ngày:");
        lbDenNgay.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel6.add(lbDenNgay);

        txtNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayKetThuc.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel6.add(txtNgayKetThuc);

        btnNgayKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnNgayKetThuc.setBorderColor(new java.awt.Color(204, 204, 204));
        btnNgayKetThuc.setColorClick(new java.awt.Color(0, 153, 255));
        btnNgayKetThuc.setColorOver(new java.awt.Color(0, 204, 255));
        btnNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNgayKetThuc.setMaximumSize(new java.awt.Dimension(99, 30));
        btnNgayKetThuc.setMinimumSize(new java.awt.Dimension(99, 30));
        btnNgayKetThuc.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel6.add(btnNgayKetThuc);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        lbDenNgay1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDenNgay1.setText("Từ ngày:");
        lbDenNgay1.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel7.add(lbDenNgay1);

        txtNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayBatDau.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel7.add(txtNgayBatDau);

        btnNgayBatDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnNgayBatDau.setBorderColor(new java.awt.Color(204, 204, 204));
        btnNgayBatDau.setColorClick(new java.awt.Color(0, 153, 255));
        btnNgayBatDau.setColorOver(new java.awt.Color(0, 204, 255));
        btnNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNgayBatDau.setMaximumSize(new java.awt.Dimension(99, 30));
        btnNgayBatDau.setMinimumSize(new java.awt.Dimension(99, 30));
        btnNgayBatDau.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel7.add(btnNgayBatDau);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/hidden.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorderColor(new java.awt.Color(204, 204, 204));
        btnXoa.setColorClick(new java.awt.Color(0, 153, 255));
        btnXoa.setColorOver(new java.awt.Color(0, 204, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setPreferredSize(new java.awt.Dimension(72, 31));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        txtTimKiem.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel5.add(txtTimKiem);

        jLabel3.setBackground(new java.awt.Color(0, 204, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/search.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel5.add(jLabel3);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        lbPhanTramKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPhanTramKhuyenMai.setText("% Khuyến mãi:");
        lbPhanTramKhuyenMai.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel3.add(lbPhanTramKhuyenMai);

        txtPhanTramKhuyenMai.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel3.add(txtPhanTramKhuyenMai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(487, 487, 487)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed
    private void initDateChoosers() {
        dateChooserStart = new DateChooser();
        dateChooserEnd = new DateChooser();
    }
    private void setupDateChoosers() {
        setupDateChooser(btnNgayBatDau, dateChooserStart, txtNgayBatDau);
        setupDateChooser(btnNgayKetThuc, dateChooserEnd, txtNgayKetThuc);
    }

    private void setupDateChooser(MyButton button, DateChooser chooser, JTextField textField) {
        chooser.setTextRefernce(textField);
        button.addActionListener(evt -> chooser.showPopup());
    }
    
    public JTextField getTxtMaKhuyenMai() {
        return txtMaKhuyenMai;
    }
    
    public JTextField getTxtTenKhuyenMai() {
        return txtTenKhuyenMai;
    }
    
    public JTextField getTxtPhanTramKhuyenMai() {
        return txtPhanTramKhuyenMai;
    }
    
    public JTextField getTxtNgayBatDau() {
        return txtNgayBatDau;
    }
    
    public JTextField getTxtNgayKetThuc() {
        return txtNgayKetThuc;
    }
    
    public JTextField getTxtMaHanhTrinh() {
        return txtMaHanhTrinh;
    }
    
    public JTextField getTxtTimKiem() {
        return txtTimKiem;
    }
    
    public JPopupMenu getJPopupMenu() {
        return jPopupMenu;
    }
    
    public MyButton getBtnMaHanhTrinh() {
        return btnMaHanhTrinh;
    }
    
    public void showPopupMaHanhTrinh() {
        jPopupMenu.show(btnMaHanhTrinh, -300, btnMaHanhTrinh.getWidth());
    }
    
    public void resetForm() {
        txtMaKhuyenMai.setText("");
        txtTenKhuyenMai.setText("");
        txtPhanTramKhuyenMai.setText("");
        txtNgayBatDau.setText("");
        txtNgayKetThuc.setText("");
        txtMaHanhTrinh.setText("");
    }
    
    public void addThemListener(ActionListener al) {
        btnThem.addActionListener(al);
    }
    
    public void addXoaListener(ActionListener al) {
        btnXoa.addActionListener(al);
    }
    
    public void addSuaListener(ActionListener al) {
        btnSua.addActionListener(al);
    }
    
    public void addTimKiemListener(KeyAdapter ka) {
        txtTimKiem.addKeyListener(ka);
    }
    
    public void addShowPopupMaHanhTrinh(ActionListener al) {
        btnMaHanhTrinh.addActionListener(al);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnMaHanhTrinh;
    private GUI.panel.swing.MyButton btnNgayBatDau;
    private GUI.panel.swing.MyButton btnNgayKetThuc;
    private GUI.panel.swing.MyButton btnSua;
    private GUI.panel.swing.MyButton btnThem;
    private GUI.panel.swing.MyButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JLabel lbDenNgay;
    private javax.swing.JLabel lbDenNgay1;
    private javax.swing.JLabel lbMaHanhTrinh;
    private javax.swing.JLabel lbMaKhuyenMai;
    private javax.swing.JLabel lbPhanTramKhuyenMai;
    private javax.swing.JLabel lbTenKhuyenMai;
    private javax.swing.JTextField txtMaHanhTrinh;
    private javax.swing.JTextField txtMaKhuyenMai;
    private javax.swing.JTextField txtNgayBatDau;
    private javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtPhanTramKhuyenMai;
    private javax.swing.JTextField txtTenKhuyenMai;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
