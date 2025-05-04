/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.forms;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class KhachHangControlForm extends javax.swing.JPanel {

    /**
     * Creates new form KhachHangSearchForm
     */
    public KhachHangControlForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnXoaForm = new GUI.panel.swing.MyButton();
        btnThem = new GUI.panel.swing.MyButton();
        btnSua1 = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh Sách Khách Hàng");
        jLabel1.setPreferredSize(new java.awt.Dimension(153, 30));

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

        btnXoaForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/reloadNhanVien.png"))); // NOI18N
        btnXoaForm.setText("Tải lại");
        btnXoaForm.setBorderColor(new java.awt.Color(204, 204, 204));
        btnXoaForm.setColorClick(new java.awt.Color(0, 153, 255));
        btnXoaForm.setColorOver(new java.awt.Color(0, 204, 255));
        btnXoaForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoaForm.setPreferredSize(new java.awt.Dimension(72, 31));

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThem.setColorClick(new java.awt.Color(0, 153, 255));
        btnThem.setColorOver(new java.awt.Color(0, 204, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setPreferredSize(new java.awt.Dimension(99, 31));

        btnSua1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/edit.png"))); // NOI18N
        btnSua1.setText("Sửa");
        btnSua1.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSua1.setColorClick(new java.awt.Color(0, 153, 255));
        btnSua1.setColorOver(new java.awt.Color(0, 204, 255));
        btnSua1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua1.setPreferredSize(new java.awt.Dimension(72, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnSua1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoaForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSua1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnXoaForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void addThemListener(ActionListener listener) {
        btnThem.addActionListener(listener);
    }
    
    public void addSuaListener(ActionListener  listener) {
        btnSua1.addActionListener(listener);
    }
    
    public void addTxtTimKiemListener(KeyAdapter listener) {
        txtSearch.addKeyListener(listener);
    }
    
    public void addXoaFormListener(ActionListener listner) {
        btnXoaForm.addActionListener(listner);
    }
    
public JTextField getTxtTimKiem() {
        return txtSearch;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnSua1;
    private GUI.panel.swing.MyButton btnThem;
    private GUI.panel.swing.MyButton btnXoaForm;
    private javax.swing.JPanel comboSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
