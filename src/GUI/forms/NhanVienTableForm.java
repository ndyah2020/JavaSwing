package GUI.forms;

import GUI.panel.swing.MyTable;
import java.awt.event.MouseAdapter;
import javax.swing.table.DefaultTableModel;

public class NhanVienTableForm extends javax.swing.JPanel {
    private DefaultTableModel model;
    public NhanVienTableForm() {
        initComponents();
        String []tenCot = {"Mã NV", "Họ NV", "Tên NV", "Giới Tính", "SDT", "Email", "Chức Vụ", "Lương Cơ Bản", "Mã Tài Khoản"};
        model = new DefaultTableModel(tenCot, 0);
        myTable.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new GUI.panel.swing.MyTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setBorder(null);

        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        myTable.setPreferredSize(new java.awt.Dimension(759, 152));
        jScrollPane1.setViewportView(myTable);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    public DefaultTableModel getModel() {
        return model;
    }

    public MyTable getMyTable() {
        return myTable;
    }

    public void addRowClick(MouseAdapter listener) {
        myTable.addMouseListener(listener);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.panel.swing.MyTable myTable;
    // End of variables declaration//GEN-END:variables
}
