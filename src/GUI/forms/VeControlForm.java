package GUI.forms;

import GUI.panel.swing.MyCombobox;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import javax.swing.JTextField;

public class VeControlForm extends javax.swing.JPanel {
    public VeControlForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbTrangThai = new GUI.panel.swing.MyCombobox();
        cmbGiaVe = new GUI.panel.swing.MyCombobox();
        cmbLoaiVe = new GUI.panel.swing.MyCombobox();
        cmbLoaiTimKiem = new GUI.panel.swing.MyCombobox();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh Sách Vé");
        jLabel1.setPreferredSize(new java.awt.Dimension(153, 30));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        txtSearch.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel1.add(txtSearch);

        jLabel2.setBackground(new java.awt.Color(0, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/search.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel1.add(jLabel2);

        cmbTrangThai.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Trạng thái", "Chưa Đặt", "Đã Đặt" }));
        cmbTrangThai.setPreferredSize(new java.awt.Dimension(250, 30));

        cmbGiaVe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Giá Vé", "Dưới 1TR", "1TR-2TR", "Trên 2TR" }));
        cmbGiaVe.setPreferredSize(new java.awt.Dimension(250, 30));

        cmbLoaiVe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Loại Vé", "Vé Thường", "Vé VIP" }));
        cmbLoaiVe.setMinimumSize(new java.awt.Dimension(250, 30));
        cmbLoaiVe.setPreferredSize(new java.awt.Dimension(250, 30));

        cmbLoaiTimKiem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tìm Kiếm Theo", "Mã Chuyến Bay", "Trạng Thái Vé", "Loại Vé" }));
        cmbLoaiTimKiem.setPreferredSize(new java.awt.Dimension(250, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbLoaiTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cmbGiaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cmbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cmbLoaiVe, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGiaVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLoaiVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLoaiTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void addTxtTimKiemVe (KeyAdapter listener) {
        txtSearch.addKeyListener(listener);
    }
    
    public MyCombobox getCmbGiaVe() {
        return cmbGiaVe;
    }

    public MyCombobox getCmbLoaiVe() {
        return cmbLoaiVe;
    }

    public MyCombobox getCmbTrangThai() {
        return cmbTrangThai;
    }
    
    public MyCombobox getCmbLoaiTimKiem() {
        return cmbLoaiTimKiem;
    }
    
    public JTextField getTxtSearch() {
        return txtSearch;
    }
    public void addCmbGiaVeListener (ItemListener listener) {
        cmbGiaVe.addItemListener(listener);
    }
    
    public void addCmbLoaiVeListener (ItemListener listener) {
        cmbLoaiVe.addItemListener(listener);
    }
    
    public void addCmbTrangThaiListener (ItemListener listener) {
        cmbTrangThai.addItemListener(listener);
    }
    
    public void addtxtSearch(KeyAdapter listener) {
        txtSearch.addKeyListener(listener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyCombobox cmbGiaVe;
    private GUI.panel.swing.MyCombobox cmbLoaiTimKiem;
    private GUI.panel.swing.MyCombobox cmbLoaiVe;
    private GUI.panel.swing.MyCombobox cmbTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
