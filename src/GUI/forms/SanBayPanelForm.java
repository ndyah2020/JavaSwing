package GUI.forms;

import BUS.SanBayBUS;
import DTO.SanBayDTO;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SanBayGroupForm extends javax.swing.JPanel {
    private DefaultTableModel model;
    private ArrayList<SanBayDTO> dsSanBay;
    
    public SanBayGroupForm() {
        initComponents();
        if(model == null){
            String[] columnNames = {"Mã Sân Bay", "Tên Sân Bay", "Địa Chỉ"};
            model = new DefaultTableModel(columnNames, 0);
        }
        layDanhSachSanBay();
    }
    
    private void layDanhSachSanBay() {
        SanBayBUS dsSanBayFromBUS = new SanBayBUS();
        if(dsSanBay == null) 
            dsSanBay = dsSanBayFromBUS.layDanhSachSanBay();
        for(SanBayDTO sb: dsSanBay){
            Vector row = new Vector();
            row.add(sb.getMaSanBay());
            row.add(sb.getTenSanBay());
            row.add(sb.getDiaChi());
            model.addRow(row);
        }
        tbSanBay.setModel(model);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sanBayControlForm1 = new GUI.forms.SanBayControlForm();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanBay = new GUI.panel.swing.MyTable();

        setMaximumSize(new java.awt.Dimension(1065, 800));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1065, 800));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tbSanBay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbSanBay.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        tbSanBay.setGridColor(new java.awt.Color(255, 255, 255));
        tbSanBay.setPreferredScrollableViewportSize(new java.awt.Dimension(450, 660));
        tbSanBay.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tbSanBay);
        tbSanBay.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sanBayControlForm1, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sanBayControlForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private GUI.forms.SanBayControlForm sanBayControlForm1;
    private GUI.panel.swing.MyTable tbSanBay;
    // End of variables declaration//GEN-END:variables
}
