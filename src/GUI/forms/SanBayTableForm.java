package GUI.forms;
import GUI.panel.swing.MyTable;
import java.awt.event.MouseAdapter;
import javax.swing.table.DefaultTableModel;

public class SanBayTableForm extends javax.swing.JPanel {
    private DefaultTableModel model;
    
    public SanBayTableForm() {
        initComponents();
        String[] columnNames = {"Mã Sân Bay", "Tên Sân Bay", "Địa Chỉ"};
        model = new DefaultTableModel(columnNames, 0);
        myTable.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        myTable = new GUI.panel.swing.MyTable();

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
        jScrollPane2.setViewportView(myTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public MyTable getMyTable() {
        return myTable;
    }
    public DefaultTableModel getModel() {
        return model;
    }
    public void addRowClick(MouseAdapter listener) {
        myTable.addMouseListener(listener);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private GUI.panel.swing.MyTable myTable;
    // End of variables declaration//GEN-END:variables
}
