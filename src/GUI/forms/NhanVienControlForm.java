package GUI.forms;

import GUI.panel.swing.MyCombobox;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import javax.swing.JTextField;

public class NhanVienControlForm extends javax.swing.JPanel {
    public NhanVienControlForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbMucLuongTu = new GUI.panel.swing.MyCombobox();
        cmbGioiTinh = new GUI.panel.swing.MyCombobox();
        jPanel1 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnThem = new GUI.panel.swing.MyButton();
        btnSua = new GUI.panel.swing.MyButton();
        btnXoa = new GUI.panel.swing.MyButton();
        btnXoaForm = new GUI.panel.swing.MyButton();
        cmbLoaiTimKiem = new GUI.panel.swing.MyCombobox();
        cmbMucLuongDen = new GUI.panel.swing.MyCombobox();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1070, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh sách nhân viên");

        cmbMucLuongTu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mức lương Từ", "5000000", "7000000", "9000000", "1000000", "15000000", "20000000" }));
        cmbMucLuongTu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbMucLuongTu.setPreferredSize(new java.awt.Dimension(150, 31));

        cmbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Giới tính", "Nam", "Nữ" }));
        cmbGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbGioiTinh.setPreferredSize(new java.awt.Dimension(120, 31));

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
        btnSua.setPreferredSize(new java.awt.Dimension(72, 31));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/Xoa.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorderColor(new java.awt.Color(204, 204, 204));
        btnXoa.setColorClick(new java.awt.Color(0, 153, 255));
        btnXoa.setColorOver(new java.awt.Color(0, 204, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setPreferredSize(new java.awt.Dimension(100, 31));

        btnXoaForm.setText("Xóa Form");
        btnXoaForm.setBorderColor(new java.awt.Color(204, 204, 204));
        btnXoaForm.setColorClick(new java.awt.Color(0, 153, 255));
        btnXoaForm.setColorOver(new java.awt.Color(0, 204, 255));
        btnXoaForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoaForm.setPreferredSize(new java.awt.Dimension(100, 31));

        cmbLoaiTimKiem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Loại Tìm kiếm", "Theo Họ và tên", "Theo SDT" }));
        cmbLoaiTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbLoaiTimKiem.setPreferredSize(new java.awt.Dimension(150, 31));

        cmbMucLuongDen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mức lương đến", "5000000", "7000000", "9000000", "10000000", "15000000", "20000000" }));
        cmbMucLuongDen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbMucLuongDen.setPreferredSize(new java.awt.Dimension(150, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbLoaiTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(cmbMucLuongTu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbMucLuongDen, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbMucLuongTu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMucLuongDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLoaiTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public MyCombobox getCmbGioiTinh() {
        return cmbGioiTinh;
    }

    public MyCombobox getCmbMucLuongTu() {
        return cmbMucLuongTu;
    }
    
    public MyCombobox getCmbMucLuongDen() {
        return cmbMucLuongDen;
    }
    public JTextField getTxtSearch() {
        return txtSearch;
    }
    
    public void addTxtSearchListener(KeyAdapter listener) {
        txtSearch.addKeyListener(listener);
    }
    
    public void addThemListener(ActionListener listener) {
        btnThem.addActionListener(listener);
    }
    
    public void addSuaListener(ActionListener listener) {
        btnSua.addActionListener(listener);
    }
    
    public void addXoaFormListener(ActionListener listener) {
        btnXoaForm.addActionListener(listener);
    }
    
    public void addXoaListener(ActionListener listener) {
        btnXoa.addActionListener(listener);
    }
    
    public MyCombobox getCmbLoaiTimKiem(){
        return cmbLoaiTimKiem;
    }
    
    public void addItemCmbGioiTinhListener(ItemListener listener) {
        cmbGioiTinh.addItemListener(listener);
    }
    
    public void addItemCmbMucLuongTu(ItemListener listener) {
        cmbMucLuongTu.addItemListener(listener);
    }
    
    public void addItemCmbMucLuongDen(ItemListener listener) {
        cmbMucLuongDen.addItemListener(listener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnSua;
    private GUI.panel.swing.MyButton btnThem;
    private GUI.panel.swing.MyButton btnXoa;
    private GUI.panel.swing.MyButton btnXoaForm;
    private GUI.panel.swing.MyCombobox cmbGioiTinh;
    private GUI.panel.swing.MyCombobox cmbLoaiTimKiem;
    private GUI.panel.swing.MyCombobox cmbMucLuongDen;
    private GUI.panel.swing.MyCombobox cmbMucLuongTu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
