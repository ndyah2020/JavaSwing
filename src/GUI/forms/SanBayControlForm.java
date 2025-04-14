package GUI.forms;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.JTextField;

public class SanBayControlForm extends javax.swing.JPanel {
    
    public SanBayControlForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectedDate1 = new GUI.panel.swing.dateChooser.SelectedDate();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenSanBay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        btnThem = new GUI.panel.swing.MyButton();
        btnSua = new GUI.panel.swing.MyButton();
        btnXoa = new GUI.panel.swing.MyButton();
        comboTimKiem = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        lblTimKiem = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1054, 300));
        setPreferredSize(new java.awt.Dimension(500, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Danh sách sân bay");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên sân bay:");
        jLabel2.setPreferredSize(new java.awt.Dimension(43, 31));

        txtTenSanBay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenSanBay.setPreferredSize(new java.awt.Dimension(200, 31));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Địa chỉ:");
        jLabel4.setPreferredSize(new java.awt.Dimension(43, 31));

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDiaChi.setPreferredSize(new java.awt.Dimension(200, 31));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThem.setColorClick(new java.awt.Color(0, 153, 255));
        btnThem.setColorOver(new java.awt.Color(0, 204, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setPreferredSize(new java.awt.Dimension(100, 31));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSua.setColorClick(new java.awt.Color(0, 153, 255));
        btnSua.setColorOver(new java.awt.Color(0, 204, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setPreferredSize(new java.awt.Dimension(100, 31));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/Xoa.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorderColor(new java.awt.Color(204, 204, 204));
        btnXoa.setColorClick(new java.awt.Color(0, 153, 255));
        btnXoa.setColorOver(new java.awt.Color(0, 204, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setPreferredSize(new java.awt.Dimension(100, 31));

        comboTimKiem.setPreferredSize(new java.awt.Dimension(250, 31));
        comboTimKiem.setLayout(new javax.swing.BoxLayout(comboTimKiem, javax.swing.BoxLayout.LINE_AXIS));

        txtTimKiem.setPreferredSize(new java.awt.Dimension(200, 31));
        txtTimKiem.setSelectionColor(new java.awt.Color(0, 153, 204));
        comboTimKiem.add(txtTimKiem);

        lblTimKiem.setBackground(new java.awt.Color(0, 204, 255));
        lblTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/search.png"))); // NOI18N
        lblTimKiem.setOpaque(true);
        comboTimKiem.add(lblTimKiem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTenSanBay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(230, 230, 230)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenSanBay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public JTextField getTxtDiaChi() {
        return txtDiaChi;
    }

    public JTextField getTxtTenSanBay() {
        return txtTenSanBay;
    }
    
    public JTextField getTxtTimKiem() {
        return txtTimKiem;
    }
    public void setFormData(String ten, String diaChi){
        txtTenSanBay.setText(ten);
        txtDiaChi.setText(diaChi);
    }
    public void clearFormData() {
        txtTenSanBay.setText("");
        txtDiaChi.setText("");
    }
    public void addThemListener(ActionListener listener) {
        btnThem.addActionListener(listener);
    }
    public void addXoaListener(ActionListener listener) {
        btnXoa.addActionListener(listener);
    }
    public void addSuaListener(ActionListener listener) {
        btnSua.addActionListener(listener);
    }
    public void addTimKiemListenter(KeyAdapter listener){
        txtTimKiem.addKeyListener(listener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnSua;
    private GUI.panel.swing.MyButton btnThem;
    private GUI.panel.swing.MyButton btnXoa;
    private javax.swing.JPanel comboTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblTimKiem;
    private GUI.panel.swing.dateChooser.SelectedDate selectedDate1;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtTenSanBay;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
