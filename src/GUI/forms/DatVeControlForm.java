package GUI.forms;

import GUI.panel.swing.MyButton;
import java.awt.event.ActionListener;

public class DatVeControlForm extends javax.swing.JPanel {
    public DatVeControlForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ComboSanBayDi = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSanBayDi = new javax.swing.JTextField();
        btnSanBayDi = new GUI.panel.swing.MyButton();
        ComboSanBayDi1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSanBayDen = new javax.swing.JTextField();
        btnSanBayDen = new GUI.panel.swing.MyButton();
        jPanel6 = new javax.swing.JPanel();
        lbDenNgay = new javax.swing.JLabel();
        txtNgayKhoiHanh = new javax.swing.JTextField();
        btnNgayKhoiHanh = new GUI.panel.swing.MyButton();
        btnTaiLai = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Đặt vé và thông tin các chuyến bay ");
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 30));

        ComboSanBayDi.setBackground(new java.awt.Color(255, 255, 255));
        ComboSanBayDi.setLayout(new javax.swing.BoxLayout(ComboSanBayDi, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Sân bay đi:");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 31));
        ComboSanBayDi.add(jLabel4);

        txtSanBayDi.setPreferredSize(new java.awt.Dimension(200, 31));
        ComboSanBayDi.add(txtSanBayDi);

        btnSanBayDi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnSanBayDi.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSanBayDi.setColorClick(new java.awt.Color(0, 153, 255));
        btnSanBayDi.setColorOver(new java.awt.Color(0, 204, 255));
        btnSanBayDi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSanBayDi.setPreferredSize(new java.awt.Dimension(31, 31));
        ComboSanBayDi.add(btnSanBayDi);

        ComboSanBayDi1.setBackground(new java.awt.Color(255, 255, 255));
        ComboSanBayDi1.setLayout(new javax.swing.BoxLayout(ComboSanBayDi1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Sân bay đến:");
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(120, 31));
        ComboSanBayDi1.add(jLabel5);

        txtSanBayDen.setPreferredSize(new java.awt.Dimension(200, 31));
        ComboSanBayDi1.add(txtSanBayDen);

        btnSanBayDen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnSanBayDen.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSanBayDen.setColorClick(new java.awt.Color(0, 153, 255));
        btnSanBayDen.setColorOver(new java.awt.Color(0, 204, 255));
        btnSanBayDen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSanBayDen.setPreferredSize(new java.awt.Dimension(31, 31));
        ComboSanBayDi1.add(btnSanBayDen);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        lbDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDenNgay.setText("Ngày khởi Hành:");
        lbDenNgay.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel6.add(lbDenNgay);

        txtNgayKhoiHanh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayKhoiHanh.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel6.add(txtNgayKhoiHanh);

        btnNgayKhoiHanh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnNgayKhoiHanh.setBorderColor(new java.awt.Color(204, 204, 204));
        btnNgayKhoiHanh.setColorClick(new java.awt.Color(0, 153, 255));
        btnNgayKhoiHanh.setColorOver(new java.awt.Color(0, 204, 255));
        btnNgayKhoiHanh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNgayKhoiHanh.setPreferredSize(new java.awt.Dimension(31, 31));
        jPanel6.add(btnNgayKhoiHanh);

        btnTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/reloadNhanVien.png"))); // NOI18N
        btnTaiLai.setText("Tải Lại");
        btnTaiLai.setBorderColor(new java.awt.Color(204, 204, 204));
        btnTaiLai.setColorClick(new java.awt.Color(0, 153, 255));
        btnTaiLai.setColorOver(new java.awt.Color(0, 204, 255));
        btnTaiLai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTaiLai.setPreferredSize(new java.awt.Dimension(72, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboSanBayDi1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ComboSanBayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboSanBayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboSanBayDi1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public MyButton getBtnTaiLai() {
        return btnTaiLai;
    }
    
    public void addBtnTaiLaiListener(ActionListener listener) {
        btnTaiLai.addActionListener(listener);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComboSanBayDi;
    private javax.swing.JPanel ComboSanBayDi1;
    private GUI.panel.swing.MyButton btnNgayKhoiHanh;
    private GUI.panel.swing.MyButton btnSanBayDen;
    private GUI.panel.swing.MyButton btnSanBayDi;
    private GUI.panel.swing.MyButton btnTaiLai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbDenNgay;
    private javax.swing.JTextField txtNgayKhoiHanh;
    private javax.swing.JTextField txtSanBayDen;
    private javax.swing.JTextField txtSanBayDi;
    // End of variables declaration//GEN-END:variables
}
