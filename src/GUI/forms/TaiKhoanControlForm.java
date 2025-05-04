package GUI.forms;

import java.awt.event.ActionListener;

public class TaiKhoanControlForm extends javax.swing.JPanel {
    public TaiKhoanControlForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnThem = new GUI.panel.swing.MyButton();
        btnSua = new GUI.panel.swing.MyButton();
        myCombobox1 = new GUI.panel.swing.MyCombobox();
        myCombobox2 = new GUI.panel.swing.MyCombobox();
        comboSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnThem1 = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh Sách Tài Khoản");
        jLabel1.setPreferredSize(new java.awt.Dimension(153, 30));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThem.setColorClick(new java.awt.Color(0, 153, 255));
        btnThem.setColorOver(new java.awt.Color(0, 204, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setPreferredSize(new java.awt.Dimension(99, 31));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/khoa.png"))); // NOI18N
        btnSua.setText("Khóa / Mở Khóa");
        btnSua.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSua.setColorClick(new java.awt.Color(0, 153, 255));
        btnSua.setColorOver(new java.awt.Color(0, 204, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setPreferredSize(new java.awt.Dimension(72, 31));

        myCombobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tăng Dần" }));
        myCombobox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        myCombobox1.setPreferredSize(new java.awt.Dimension(100, 31));

        myCombobox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Xắp Xếp Theo: Mã TK" }));
        myCombobox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        myCombobox2.setPreferredSize(new java.awt.Dimension(100, 31));

        comboSearch.setLayout(new javax.swing.BoxLayout(comboSearch, javax.swing.BoxLayout.LINE_AXIS));

        txtSearch.setPreferredSize(new java.awt.Dimension(71, 30));
        comboSearch.add(txtSearch);

        jLabel2.setBackground(new java.awt.Color(0, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/search.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel2.setOpaque(true);
        jLabel2.setPreferredSize(new java.awt.Dimension(30, 30));
        comboSearch.add(jLabel2);

        btnThem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/hidden.png"))); // NOI18N
        btnThem1.setText("Ẩn");
        btnThem1.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThem1.setColorClick(new java.awt.Color(0, 153, 255));
        btnThem1.setColorOver(new java.awt.Color(0, 204, 255));
        btnThem1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem1.setPreferredSize(new java.awt.Dimension(99, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(myCombobox2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(myCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(myCombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(myCombobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public void addThemListener(ActionListener listener) {
        btnThem.addActionListener(listener);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnSua;
    private GUI.panel.swing.MyButton btnThem;
    private GUI.panel.swing.MyButton btnThem1;
    private javax.swing.JPanel comboSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private GUI.panel.swing.MyCombobox myCombobox1;
    private GUI.panel.swing.MyCombobox myCombobox2;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
