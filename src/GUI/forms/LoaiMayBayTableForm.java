package GUI.forms;

import GUI.panel.swing.MyTable;
import java.awt.event.MouseAdapter;
import javax.swing.table.DefaultTableModel;

public class LoaiMayBayTableForm extends javax.swing.JPanel {
    private DefaultTableModel model;
    
    public LoaiMayBayTableForm() {
        initComponents();
        String[] columnNames = {"Mã loại máy bay", "Tên loại máy bay", "Hệ số giá thường", "Hệ số giá Vip"};
        model = new DefaultTableModel(columnNames, 0);
        myTable.setModel(model);
    }
        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new GUI.panel.swing.MyTable();

        setPreferredSize(new java.awt.Dimension(1065, 640));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1065, 640));
        jScrollPane1.setViewportView(myTable);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    public MyTable getMyTable () {
        return myTable;
    }
    
    public DefaultTableModel getModel () {
        return model;
    }
    
    public void addRowClick (MouseAdapter mouse) {
        myTable.addMouseListener(mouse);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.panel.swing.MyTable myTable;
    // End of variables declaration//GEN-END:variables
}
