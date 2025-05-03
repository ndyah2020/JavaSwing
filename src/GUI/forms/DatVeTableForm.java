package GUI.forms;

import GUI.panel.swing.MyTable;
import java.awt.event.MouseAdapter;
import javax.swing.table.DefaultTableModel;

public class DatVeTableForm extends javax.swing.JPanel {
    private DefaultTableModel model;
    public DatVeTableForm() {
        initComponents();
        String[] columnNames = {
            "Mã CB",
            "Ngày đi",
            "Ngày đến",
            "Hành Trình",
            "Số vé thường",
            "Sô vé Vip",
            "Giá Thường",
            "Giá VIP",
        };
        model = new DefaultTableModel(columnNames, 0);
        myTable.setModel(model);
    }
    public DefaultTableModel getModel() {
        return model;
    }

    public MyTable getMyTable() {
        return myTable;
    }
    
    public void addRowClickListener(MouseAdapter listener) {
        myTable.addMouseListener(listener);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new GUI.panel.swing.MyTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

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
        jScrollPane1.setViewportView(myTable);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.panel.swing.MyTable myTable;
    // End of variables declaration//GEN-END:variables
}
