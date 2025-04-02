package GUI.forms;

import GUI.panel.swing.dateChooser.DateChooser;
import GUI.panel.swing.MyButton;
import javax.swing.JTextField;
public class KhuyenMaiControlForm extends javax.swing.JPanel {
    private DateChooser dateChooserStart;
    private DateChooser dateChooserEnd;
    
    public KhuyenMaiControlForm() {
        initComponents();
        initDateChoosers();
        setupDateChoosers();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnThem = new GUI.panel.swing.MyButton();
        btnAn = new GUI.panel.swing.MyButton();
        btnSua = new GUI.panel.swing.MyButton();
        jPanel1 = new javax.swing.JPanel();
        lbMaKhuyenMai = new javax.swing.JLabel();
        txtMaKhuyenMai = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbTenKhuyenMai = new javax.swing.JLabel();
        txtTenKhuyenMai = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lbPhanTramKhuyenMai = new javax.swing.JLabel();
        txtPhanTramKhuyenMai = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbMaHanhTrinh = new javax.swing.JLabel();
        txtMaHanhTrinh = new javax.swing.JTextField();
        btnMaHanhTrinh = new GUI.panel.swing.MyButton();
        jPanel5 = new javax.swing.JPanel();
        lbTuNgay = new javax.swing.JLabel();
        txtNgayBatDau = new javax.swing.JTextField();
        btnNgayBatDau = new GUI.panel.swing.MyButton();
        jPanel6 = new javax.swing.JPanel();
        lbDenNgay = new javax.swing.JLabel();
        txtNgayKetThuc = new javax.swing.JTextField();
        btnNgayKetThuc = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1065, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Danh sách khuyến mãi");

        btnThem.setBackground(new java.awt.Color(0, 204, 255));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setPreferredSize(new java.awt.Dimension(99, 31));

        btnAn.setBackground(new java.awt.Color(0, 204, 255));
        btnAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/hidden.png"))); // NOI18N
        btnAn.setText("Ẩn");
        btnAn.setBorderColor(new java.awt.Color(204, 204, 204));
        btnAn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAn.setPreferredSize(new java.awt.Dimension(99, 31));

        btnSua.setBackground(new java.awt.Color(0, 204, 255));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorderColor(new java.awt.Color(204, 204, 204));
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        lbPhanTramKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPhanTramKhuyenMai.setText("% Khuyến mãi:");
        lbPhanTramKhuyenMai.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel3.add(lbPhanTramKhuyenMai);

        txtPhanTramKhuyenMai.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel3.add(txtPhanTramKhuyenMai);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        lbMaHanhTrinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMaHanhTrinh.setText("Mã hành trình:");
        lbMaHanhTrinh.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel4.add(lbMaHanhTrinh);

        txtMaHanhTrinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaHanhTrinh.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel4.add(txtMaHanhTrinh);

        btnMaHanhTrinh.setBackground(new java.awt.Color(0, 204, 255));
        btnMaHanhTrinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnMaHanhTrinh.setBorderColor(new java.awt.Color(0, 204, 255));
        btnMaHanhTrinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMaHanhTrinh.setPreferredSize(new java.awt.Dimension(32, 31));
        jPanel4.add(btnMaHanhTrinh);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        lbTuNgay.setBackground(new java.awt.Color(255, 255, 255));
        lbTuNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTuNgay.setText("Từ ngày:");
        lbTuNgay.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel5.add(lbTuNgay);

        txtNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayBatDau.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel5.add(txtNgayBatDau);

        btnNgayBatDau.setBackground(new java.awt.Color(0, 204, 255));
        btnNgayBatDau.setText("Chọn Ngày");
        btnNgayBatDau.setBorderColor(new java.awt.Color(0, 204, 255));
        btnNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNgayBatDau.setMaximumSize(new java.awt.Dimension(99, 30));
        btnNgayBatDau.setMinimumSize(new java.awt.Dimension(99, 30));
        jPanel5.add(btnNgayBatDau);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        lbDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDenNgay.setText("Đến ngày:");
        lbDenNgay.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel6.add(lbDenNgay);

        txtNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayKetThuc.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel6.add(txtNgayKetThuc);

        btnNgayKetThuc.setBackground(new java.awt.Color(0, 204, 255));
        btnNgayKetThuc.setText("Chọn Ngày");
        btnNgayKetThuc.setBorderColor(new java.awt.Color(0, 204, 255));
        btnNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNgayKetThuc.setMaximumSize(new java.awt.Dimension(99, 30));
        btnNgayKetThuc.setMinimumSize(new java.awt.Dimension(99, 30));
        btnNgayKetThuc.setPreferredSize(new java.awt.Dimension(99, 30));
        jPanel6.add(btnNgayKetThuc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(74, 74, 74)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnAn;
    private GUI.panel.swing.MyButton btnMaHanhTrinh;
    private GUI.panel.swing.MyButton btnNgayBatDau;
    private GUI.panel.swing.MyButton btnNgayKetThuc;
    private GUI.panel.swing.MyButton btnSua;
    private GUI.panel.swing.MyButton btnThem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbDenNgay;
    private javax.swing.JLabel lbMaHanhTrinh;
    private javax.swing.JLabel lbMaKhuyenMai;
    private javax.swing.JLabel lbPhanTramKhuyenMai;
    private javax.swing.JLabel lbTenKhuyenMai;
    private javax.swing.JLabel lbTuNgay;
    private javax.swing.JTextField txtMaHanhTrinh;
    private javax.swing.JTextField txtMaKhuyenMai;
    private javax.swing.JTextField txtNgayBatDau;
    private javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtPhanTramKhuyenMai;
    private javax.swing.JTextField txtTenKhuyenMai;
    // End of variables declaration//GEN-END:variables
}
