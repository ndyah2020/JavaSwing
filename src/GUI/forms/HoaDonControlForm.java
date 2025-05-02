package GUI.forms;

import GUI.panel.swing.MyButton;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyAdapter;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class HoaDonControlForm extends javax.swing.JPanel {
    public HoaDonControlForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnXoaForm = new GUI.panel.swing.MyButton();
        jPanel5 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtTuNgay = new javax.swing.JTextField();
        btnDenNgay = new GUI.panel.swing.MyButton();
        jPanel7 = new javax.swing.JPanel();
        lbDenNgay1 = new javax.swing.JLabel();
        txtDenNgay = new javax.swing.JTextField();
        btnTuNgay = new GUI.panel.swing.MyButton();
        txtMucGiaDen = new javax.swing.JSpinner();
        txtMucGiaTu = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Danh sách hóa đơn");

        btnXoaForm.setText("Xóa Form");
        btnXoaForm.setBorderColor(new java.awt.Color(204, 204, 204));
        btnXoaForm.setColorClick(new java.awt.Color(0, 153, 255));
        btnXoaForm.setColorOver(new java.awt.Color(0, 204, 255));
        btnXoaForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoaForm.setPreferredSize(new java.awt.Dimension(72, 31));

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

        txtTuNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTuNgay.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel6.add(txtTuNgay);

        btnDenNgay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnDenNgay.setBorderColor(new java.awt.Color(204, 204, 204));
        btnDenNgay.setColorClick(new java.awt.Color(0, 153, 255));
        btnDenNgay.setColorOver(new java.awt.Color(0, 204, 255));
        btnDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDenNgay.setMaximumSize(new java.awt.Dimension(30, 30));
        btnDenNgay.setMinimumSize(new java.awt.Dimension(30, 30));
        btnDenNgay.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel6.add(btnDenNgay);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        lbDenNgay1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDenNgay1.setText("Thời Gian");
        lbDenNgay1.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel7.add(lbDenNgay1);

        txtDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDenNgay.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel7.add(txtDenNgay);

        btnTuNgay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnTuNgay.setBorderColor(new java.awt.Color(204, 204, 204));
        btnTuNgay.setColorClick(new java.awt.Color(0, 153, 255));
        btnTuNgay.setColorOver(new java.awt.Color(0, 204, 255));
        btnTuNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTuNgay.setMaximumSize(new java.awt.Dimension(30, 30));
        btnTuNgay.setMinimumSize(new java.awt.Dimension(30, 30));
        btnTuNgay.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel7.add(btnTuNgay);

        txtMucGiaDen.setModel(new javax.swing.SpinnerNumberModel());
        txtMucGiaDen.setMinimumSize(new java.awt.Dimension(64, 30));
        txtMucGiaDen.setPreferredSize(new java.awt.Dimension(64, 30));

        txtMucGiaTu.setModel(new javax.swing.SpinnerNumberModel());
        txtMucGiaTu.setMinimumSize(new java.awt.Dimension(64, 30));
        txtMucGiaTu.setPreferredSize(new java.awt.Dimension(64, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mức Giá");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(368, 368, 368)))
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
                    .addComponent(btnXoaForm, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
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
                        .addComponent(btnXoaForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMucGiaDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMucGiaTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public MyButton getBtnDenNgay() {
        return btnDenNgay;
    }

    public MyButton getBtnTuNgay() {
        return btnTuNgay;
    }

    public MyButton getBtnXoaForm() {
        return btnXoaForm;
    }

    public JTextField getTxtDenNgay() {
        return txtDenNgay;
    }

    public JTextField getTxtSearch() {
        return txtSearch;
    }

    public JTextField getTxtTuNgay() {
        return txtTuNgay;
    }

    public JSpinner getTxtMucGiaDen() {
        return txtMucGiaDen;
    }

    public JSpinner getTxtMucGiaTu() {
        return txtMucGiaTu;
    }
    
    public void addTxtSearchListener(KeyAdapter listener) {
        txtSearch.addKeyListener(listener);
    }
    
    public void addTxtMucGiaTu(FocusAdapter listener) {
        txtMucGiaTu.addFocusListener(listener);
    }
    
    public void addTxtMucGiaDen(FocusAdapter listener) {
        txtMucGiaDen.addFocusListener(listener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnDenNgay;
    private GUI.panel.swing.MyButton btnTuNgay;
    private GUI.panel.swing.MyButton btnXoaForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
