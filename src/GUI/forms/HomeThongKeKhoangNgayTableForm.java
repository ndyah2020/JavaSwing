package GUI.forms;

import GUI.panel.swing.MyTable;
import java.awt.event.MouseAdapter;
import javax.swing.table.DefaultTableModel;

public class HomeThongKeKhoangNgayTableForm extends javax.swing.JPanel {
    private DefaultTableModel model;
    
    public HomeThongKeKhoangNgayTableForm() {
        initComponents();
        String []columnNames = {"Mã Khách hàng", "Họ Tên Khách Hàng", "Ngày Lặp", "Tổng tiền"};
        model = new DefaultTableModel(columnNames,0);
        myTable.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new GUI.panel.swing.MyTable();

        jScrollPane1.setPreferredSize(new java.awt.Dimension(530, 700));
        jScrollPane1.setViewportView(myTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public MyTable getMytable() {
        return myTable;
    }
    
    public DefaultTableModel getModel() {
        return model;
    }
    
    public void addRowClick (MouseAdapter ma) {
        myTable.addMouseListener(ma);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.panel.swing.MyTable myTable;
    // End of variables declaration//GEN-END:variables
}
