package GUI.forms;

import GUI.panel.swing.MyTable;
import java.awt.event.MouseAdapter;
import javax.swing.table.DefaultTableModel;

public class VeTableForm extends javax.swing.JPanel {
    private DefaultTableModel model;
    public VeTableForm() {
        initComponents();
        String[] columnNames = {"Mã vé", "Trạng Thái vé", "Giá Vé", "Loại Vé", "Mã Chuyến Bay"};
        model = new DefaultTableModel(columnNames, 0);
        myTable.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new GUI.panel.swing.MyTable();

        setLayout(new java.awt.CardLayout());

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

        add(jScrollPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents
    
    public DefaultTableModel getModel() {
        return model;
    }

    public MyTable getMyTable() {
        return myTable;
    }
    
    public void addClickRow(MouseAdapter listener) {
        myTable.addMouseListener(listener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.panel.swing.MyTable myTable;
    // End of variables declaration//GEN-END:variables
}
