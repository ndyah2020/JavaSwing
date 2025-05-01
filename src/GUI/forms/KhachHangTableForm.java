/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.forms;

import GUI.panel.swing.MyTable;
import java.awt.event.MouseAdapter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thien
 */
public class KhachHangTableForm extends javax.swing.JPanel {

    private DefaultTableModel model;
    
    public KhachHangTableForm() {
        initComponents();
    String[] columnNames = {
            "Mã Khách Hàng",
            "Họ",
            "Tên",
            "Giới Tính",
            "Ngày Sinh",
            "Số Điện Thoại",
            "Email",
        };
        model = new DefaultTableModel(columnNames, 0);
        myTable1.setModel(model);
    }
    public MyTable getMyTable() {
        return myTable1;       
    }
    
    public DefaultTableModel getModel() {
        return model;
    }
    
    public void addRowClick(MouseAdapter listener) {
        myTable1.addMouseListener(listener);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        myTable1 = new GUI.panel.swing.MyTable();

        jScrollPane1.setBorder(null);

        myTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        myTable1.setPreferredSize(new java.awt.Dimension(759, 152));
        jScrollPane1.setViewportView(myTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.panel.swing.MyTable myTable1;
    // End of variables declaration//GEN-END:variables
}
