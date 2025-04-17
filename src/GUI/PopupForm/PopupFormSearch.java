package GUI.PopupForm;

import GUI.panel.swing.MyTable;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PopupFormSearch extends javax.swing.JPanel {
    private DefaultTableModel model ;
    
    public PopupFormSearch() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        iconSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new GUI.panel.swing.MyTable();

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        txtSearch.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel1.add(txtSearch);

        iconSearch.setBackground(new java.awt.Color(0, 204, 255));
        iconSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/search.png"))); // NOI18N
        iconSearch.setMaximumSize(new java.awt.Dimension(30, 30));
        iconSearch.setMinimumSize(new java.awt.Dimension(30, 30));
        iconSearch.setOpaque(true);
        iconSearch.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel1.add(iconSearch);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public MyTable getMyTable(){
        return myTable;
    }
    
    public JTextField getTxtSearch(){
        return txtSearch;
    }
    
    public DefaultTableModel getModel() {
        return model;
    }
    
    public void addRowClickPopup(MouseAdapter listener) {
        myTable.addMouseListener(listener);
    }
    
    public void addSearchPopupListener(KeyAdapter listener) {
        txtSearch.addKeyListener(listener);
    }
    
    public void setcolumnDefaultTableModel(String[] columnNames){
        model = new DefaultTableModel(columnNames, 0);
        myTable.setModel(model);
        myTable.setAutoCreateColumnsFromModel(true);
        myTable.createDefaultColumnsFromModel();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.panel.swing.MyTable myTable;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
