package GUI.forms;

import GUI.panel.swing.MyButton;
import GUI.panel.swing.MyCombobox;
import GUI.panel.swing.dateChooser.DateChooser;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class HoaDonControlForm extends javax.swing.JPanel {
    private DateChooser ngayTu;
    private DateChooser ngayDen;
    public HoaDonControlForm() {
        initComponents();
        initDateChoosers();
        txtDenNgay.setEditable(false);
        txtTuNgay.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTaiLai = new GUI.panel.swing.MyButton();
        jPanel5 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtDenNgay = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        lbDenNgay1 = new javax.swing.JLabel();
        txtTuNgay = new javax.swing.JTextField();
        txtMucGiaDen = new javax.swing.JSpinner();
        txtMucGiaTu = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        cbmKieuLoc = new GUI.panel.swing.MyCombobox();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Danh sách hóa đơn");

        btnTaiLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/reloadNhanVien.png"))); // NOI18N
        btnTaiLai.setText("Tải Lại");
        btnTaiLai.setBorderColor(new java.awt.Color(204, 204, 204));
        btnTaiLai.setColorClick(new java.awt.Color(0, 153, 255));
        btnTaiLai.setColorOver(new java.awt.Color(0, 204, 255));
        btnTaiLai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTaiLai.setPreferredSize(new java.awt.Dimension(72, 31));

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

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        txtDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDenNgay.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel6.add(txtDenNgay);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        lbDenNgay1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDenNgay1.setText("Thời Gian");
        lbDenNgay1.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel7.add(lbDenNgay1);

        txtTuNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTuNgay.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel7.add(txtTuNgay);

        txtMucGiaDen.setModel(new javax.swing.SpinnerNumberModel());
        txtMucGiaDen.setMinimumSize(new java.awt.Dimension(64, 30));
        txtMucGiaDen.setPreferredSize(new java.awt.Dimension(64, 30));

        txtMucGiaTu.setModel(new javax.swing.SpinnerNumberModel());
        txtMucGiaTu.setMinimumSize(new java.awt.Dimension(64, 30));
        txtMucGiaTu.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Kiểu Lọc");

        cbmKieuLoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "And", "OR" }));
        cbmKieuLoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbmKieuLoc.setPreferredSize(new java.awt.Dimension(100, 31));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Mức Giá");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(341, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbmKieuLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtMucGiaTu, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(txtMucGiaDen, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTaiLai, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
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
                        .addComponent(btnTaiLai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMucGiaDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMucGiaTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(cbmKieuLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void initDateChoosers() {
        ngayTu = new DateChooser();
        ngayTu.setTextRefernce(txtDenNgay);
        ngayDen = new DateChooser();
        ngayDen.setTextRefernce(txtTuNgay);
    }
    public DateChooser getNgayTu() {
        return ngayTu;
    }
    
    public DateChooser getNgayDen() {
        return ngayDen;
    }
    
    public MyButton getBtnXoaForm() {
        return btnTaiLai;
    }

    public JTextField getTxtTuNgay() {
        return txtTuNgay;
    }

    public JTextField getTxtSearch() {
        return txtSearch;
    }

    public JTextField getTxtDenNgay() {
        return txtDenNgay;
    }

    public JSpinner getTxtMucGiaDen() {
        return txtMucGiaDen;
    }

    public JSpinner getTxtMucGiaTu() {
        return txtMucGiaTu;
    }

    public MyCombobox getCbmKieuLoc() {
        return cbmKieuLoc;
    }
    
    public void addTxtSearchListener(KeyAdapter listener) {
        txtSearch.addKeyListener(listener);
    }
    
    public void addCbmKieuLocListener(ActionListener listener) {
        cbmKieuLoc.addActionListener(listener);
    }
    
    public void addBtnTaiLaiListener(ActionListener listener) {
        btnTaiLai.addActionListener(listener);
    }
    public void clearForm() {
        txtDenNgay.setText("");
        txtTuNgay.setText("");
        txtMucGiaDen.setValue(0);
        txtMucGiaTu.setValue(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnTaiLai;
    private GUI.panel.swing.MyCombobox cbmKieuLoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbDenNgay1;
    private javax.swing.JTextField txtDenNgay;
    private javax.swing.JSpinner txtMucGiaDen;
    private javax.swing.JSpinner txtMucGiaTu;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTuNgay;
    // End of variables declaration//GEN-END:variables
}
