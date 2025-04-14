package GUI.forms;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import GUI.PopupForm.PopupFormSearch;
public class HanhTrinhControlForm extends javax.swing.JPanel {
    private final PopupFormSearch bangLayMa = new PopupFormSearch();
    
    public HanhTrinhControlForm() {
        initComponents();
        jPopupMenu.setLayout(new BorderLayout());
        jPopupMenu.add(bangLayMa, BorderLayout.CENTER);
    }
    
    public PopupFormSearch getBangLayMa() {
        return bangLayMa;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        ComboMaHanhTrinh = new javax.swing.JPanel();
        ComboGiaCoBan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtGiaCoBan = new javax.swing.JTextField();
        ComboSanBayDen = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSanBayDen = new javax.swing.JTextField();
        btnSanBayDen = new GUI.panel.swing.MyButton();
        btnThem = new GUI.panel.swing.MyButton();
        btnXoa = new GUI.panel.swing.MyButton();
        ComboTimKiemCoBan = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        lbTimKiem = new javax.swing.JLabel();
        cmbSapXep = new GUI.panel.swing.MyCombobox();
        ComboSanBayDi1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSanBayDi = new javax.swing.JTextField();
        btnSanBayDi = new GUI.panel.swing.MyButton();
        cmbSapXep1 = new GUI.panel.swing.MyCombobox();
        btnSua = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh Sách Hành Trình");

        ComboMaHanhTrinh.setBackground(new java.awt.Color(255, 255, 255));
        ComboMaHanhTrinh.setLayout(new javax.swing.BoxLayout(ComboMaHanhTrinh, javax.swing.BoxLayout.LINE_AXIS));

        ComboGiaCoBan.setBackground(new java.awt.Color(255, 255, 255));
        ComboGiaCoBan.setPreferredSize(new java.awt.Dimension(230, 31));
        ComboGiaCoBan.setLayout(new javax.swing.BoxLayout(ComboGiaCoBan, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Giá cơ bản: ");
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 31));
        ComboGiaCoBan.add(jLabel3);

        txtGiaCoBan.setPreferredSize(new java.awt.Dimension(200, 31));
        ComboGiaCoBan.add(txtGiaCoBan);

        ComboMaHanhTrinh.add(ComboGiaCoBan);

        ComboSanBayDen.setBackground(new java.awt.Color(255, 255, 255));
        ComboSanBayDen.setLayout(new javax.swing.BoxLayout(ComboSanBayDen, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Sân bay đến:");
        jLabel5.setPreferredSize(new java.awt.Dimension(80, 31));
        ComboSanBayDen.add(jLabel5);

        txtSanBayDen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSanBayDen.setPreferredSize(new java.awt.Dimension(200, 31));
        ComboSanBayDen.add(txtSanBayDen);

        btnSanBayDen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnSanBayDen.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSanBayDen.setColorClick(new java.awt.Color(0, 153, 255));
        btnSanBayDen.setColorOver(new java.awt.Color(0, 204, 255));
        btnSanBayDen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSanBayDen.setPreferredSize(new java.awt.Dimension(31, 31));
        ComboSanBayDen.add(btnSanBayDen);

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setPreferredSize(new java.awt.Dimension(100, 31));

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/Xoa.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorderColor(new java.awt.Color(204, 204, 204));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setPreferredSize(new java.awt.Dimension(100, 31));

        ComboTimKiemCoBan.setBackground(new java.awt.Color(255, 255, 255));
        ComboTimKiemCoBan.setPreferredSize(new java.awt.Dimension(300, 31));
        ComboTimKiemCoBan.setLayout(new javax.swing.BoxLayout(ComboTimKiemCoBan, javax.swing.BoxLayout.LINE_AXIS));

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimKiem.setPreferredSize(new java.awt.Dimension(250, 29));
        ComboTimKiemCoBan.add(txtTimKiem);

        lbTimKiem.setBackground(new java.awt.Color(0, 204, 255));
        lbTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/search.png"))); // NOI18N
        lbTimKiem.setOpaque(true);
        ComboTimKiemCoBan.add(lbTimKiem);

        cmbSapXep.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sắp xếp theo: Mã hành trình", "Sắp xếp theo: Giá cơ bản" }));
        cmbSapXep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbSapXep.setPreferredSize(new java.awt.Dimension(240, 31));

        ComboSanBayDi1.setBackground(new java.awt.Color(255, 255, 255));
        ComboSanBayDi1.setLayout(new javax.swing.BoxLayout(ComboSanBayDi1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Sân bay đi:");
        jLabel6.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(80, 31));
        ComboSanBayDi1.add(jLabel6);

        txtSanBayDi.setPreferredSize(new java.awt.Dimension(200, 31));
        ComboSanBayDi1.add(txtSanBayDi);

        btnSanBayDi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnSanBayDi.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSanBayDi.setColorClick(new java.awt.Color(0, 153, 255));
        btnSanBayDi.setColorOver(new java.awt.Color(0, 204, 255));
        btnSanBayDi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSanBayDi.setPreferredSize(new java.awt.Dimension(31, 31));
        ComboSanBayDi1.add(btnSanBayDi);

        cmbSapXep1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tăng dần", "Giảm dần" }));
        cmbSapXep1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbSapXep1.setPreferredSize(new java.awt.Dimension(240, 31));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setPreferredSize(new java.awt.Dimension(100, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboMaHanhTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ComboSanBayDen, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                        .addComponent(ComboSanBayDi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbSapXep1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cmbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                    .addComponent(ComboTimKiemCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboMaHanhTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ComboTimKiemCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSapXep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboSanBayDi1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboSanBayDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public JTextField getTxtGiaCoBan() {
        return txtGiaCoBan;
    }

    public JTextField getTxtSanBayDen() {
        return txtSanBayDen;
    }

    public JTextField getTxtSanBayDi() {
        return txtSanBayDi;
    }
    
    public JPopupMenu getjPopupMenu() {
        return jPopupMenu;
    }
    
    public void showPopupSanBayDi() {
        jPopupMenu.show(btnSanBayDi, btnSanBayDi.getWidth(), 0);
    }
    
    public void showPopupSanBayDen() {
        jPopupMenu.show(btnSanBayDen, btnSanBayDen.getWidth(), 0);
    }
    
    public void clearFormData() {
        txtGiaCoBan.setText("");
        txtSanBayDen.setText("");
        txtSanBayDi.setText("");
    }
    
    public void addThemListener(ActionListener listener) {
        btnThem.addActionListener(listener);
    }
    
    public void addSuaListener(ActionListener  listener) {
        btnSua.addActionListener(listener);
    }
    
    public void addXoaListener(ActionListener listener) {
        btnXoa.addActionListener(listener);
    } 
    
    public void addShowPopupSanBayDenListener(ActionListener listener) {
        btnSanBayDen.addActionListener(listener);
    }
    
    public void addTxtTimKiemListener(KeyAdapter listener) {
        txtTimKiem.addKeyListener(listener);
    }
    public void addShowPopupSanBayDiListener(ActionListener listener) {
        btnSanBayDi.addActionListener(listener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComboGiaCoBan;
    private javax.swing.JPanel ComboMaHanhTrinh;
    private javax.swing.JPanel ComboSanBayDen;
    private javax.swing.JPanel ComboSanBayDi1;
    private javax.swing.JPanel ComboTimKiemCoBan;
    private GUI.panel.swing.MyButton btnSanBayDen;
    private GUI.panel.swing.MyButton btnSanBayDi;
    private GUI.panel.swing.MyButton btnSua;
    private GUI.panel.swing.MyButton btnThem;
    private GUI.panel.swing.MyButton btnXoa;
    private GUI.panel.swing.MyCombobox cmbSapXep;
    private GUI.panel.swing.MyCombobox cmbSapXep1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JLabel lbTimKiem;
    private javax.swing.JTextField txtGiaCoBan;
    private javax.swing.JTextField txtSanBayDen;
    private javax.swing.JTextField txtSanBayDi;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
