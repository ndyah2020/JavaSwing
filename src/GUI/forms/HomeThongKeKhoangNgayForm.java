package GUI.forms;

import GUI.panel.swing.MyButton;
import GUI.panel.swing.dateChooser.DateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class HomeThongKeKhoangNgayForm extends javax.swing.JPanel {
    private DateChooser dateChooserStart;
    private DateChooser dateChooserEnd;
    
    public HomeThongKeKhoangNgayForm() {
        initComponents();
        initDateChoosers();
        setupDateChoosers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNgayBatDau = new javax.swing.JTextField();
        btnNgayBatDau = new GUI.panel.swing.MyButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNgayKetThuc = new javax.swing.JTextField();
        btnNgayKetThuc = new GUI.panel.swing.MyButton();
        homeThongKeKhoangNgayTableForm1 = new GUI.forms.HomeThongKeKhoangNgayTableForm();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("THỐNG KÊ TỪ NGÀY ĐẾN NGÀY");
        jLabel1.setMaximumSize(new java.awt.Dimension(230, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(230, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(230, 30));
        jPanel1.add(jLabel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Từ ngày: ");
        jLabel2.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel2.add(jLabel2);

        txtNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayBatDau.setMinimumSize(new java.awt.Dimension(130, 30));
        txtNgayBatDau.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel2.add(txtNgayBatDau);

        btnNgayBatDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnNgayBatDau.setBorderColor(new java.awt.Color(204, 204, 204));
        btnNgayBatDau.setColorClick(new java.awt.Color(0, 153, 255));
        btnNgayBatDau.setColorOver(new java.awt.Color(0, 204, 255));
        btnNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNgayBatDau.setMaximumSize(new java.awt.Dimension(30, 30));
        btnNgayBatDau.setMinimumSize(new java.awt.Dimension(30, 30));
        btnNgayBatDau.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel2.add(btnNgayBatDau);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Đến ngày:");
        jLabel3.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel3.add(jLabel3);

        txtNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayKetThuc.setMinimumSize(new java.awt.Dimension(130, 30));
        txtNgayKetThuc.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel3.add(txtNgayKetThuc);

        btnNgayKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnNgayKetThuc.setBorderColor(new java.awt.Color(204, 204, 204));
        btnNgayKetThuc.setColorClick(new java.awt.Color(0, 153, 255));
        btnNgayKetThuc.setColorOver(new java.awt.Color(0, 204, 255));
        btnNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNgayKetThuc.setMaximumSize(new java.awt.Dimension(30, 30));
        btnNgayKetThuc.setMinimumSize(new java.awt.Dimension(30, 30));
        btnNgayKetThuc.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel3.add(btnNgayKetThuc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeThongKeKhoangNgayTableForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(homeThongKeKhoangNgayTableForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    
    public Date getNgayBatDau() {
        String text = txtNgayBatDau.getText().trim();
        if (text.isEmpty()) {
            return null;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            return sdf.parse(text);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,
            "Ngày bắt đầu không đúng định dạng yyyy-MM-dd.\n" + "Vui lòng chọn lại.", 
            "Lỗi định dạng ngày",
            JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public Date getNgayKetThuc() {
        String text = txtNgayKetThuc.getText().trim();
        if (text.isEmpty()) {
            return null;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            return sdf.parse(text);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,
            "Ngày bắt đầu không đúng định dạng yyyy-MM-dd.\n" + "Vui lòng chọn lại.", 
            "Lỗi định dạng ngày",
            JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void setNgayBatDau(Date ngayBatDau) {
        if (ngayBatDau != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            txtNgayBatDau.setText(sdf.format(ngayBatDau));
        }
    }
    
    public void setNgayKetThuc(Date ngayKetThuc) {
        if (ngayKetThuc != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            txtNgayKetThuc.setText(sdf.format(ngayKetThuc));
        }
    }
    
    public JTextField getTxtNgayBatDau() {
        return txtNgayBatDau;
    }
    
    public JTextField getTxtNgayKetThuc() {
        return txtNgayKetThuc;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnNgayBatDau;
    private GUI.panel.swing.MyButton btnNgayKetThuc;
    private GUI.forms.HomeThongKeKhoangNgayTableForm homeThongKeKhoangNgayTableForm1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtNgayBatDau;
    private javax.swing.JTextField txtNgayKetThuc;
    // End of variables declaration//GEN-END:variables
}
