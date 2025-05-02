package GUI.forms;

import GUI.panel.swing.MyTable;
import javax.swing.table.DefaultTableModel;

public class HoaDonCTTableForm extends javax.swing.JPanel {
    private DefaultTableModel model;
    public HoaDonCTTableForm() {
        initComponents();
        String[] columnNames = {
            "Mã CTHD", // MaCTHD
            "Số lượng", // SoLuong
            "Đơn Giá", // Gia
            "Mã hóa đơn", // MaHoaDon
            "Mã vé" // MaVe
        };
        model = new DefaultTableModel(columnNames, 0);
        myTable.setModel(model);
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
    public MyTable getMyTable() {
        return myTable;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.panel.swing.MyTable myTable;
    // End of variables declaration//GEN-END:variables
}
