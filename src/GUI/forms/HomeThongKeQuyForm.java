package GUI.forms;

import GUI.panel.swing.MyCombobox;
import java.awt.event.ActionListener;

public class HomeThongKeQuyForm extends javax.swing.JPanel {

    public HomeThongKeQuyForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cmbNam = new GUI.panel.swing.MyCombobox();
        homeThongKeTheoQuyTableForm2 = new GUI.forms.HomeThongKeTheoQuyTableForm();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("THỐNG KÊ THEO QUÝ");
        jPanel1.add(jLabel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Năm:");
        jLabel2.setMaximumSize(new java.awt.Dimension(70, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(70, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel2.add(jLabel2);

        cmbNam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn năm", "2021", "2022", "2023", "2024", "2025" }));
        cmbNam.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbNam.setMaximumSize(new java.awt.Dimension(130, 30));
        cmbNam.setMinimumSize(new java.awt.Dimension(130, 30));
        cmbNam.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel2.add(cmbNam);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(homeThongKeTheoQuyTableForm2, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(homeThongKeTheoQuyTableForm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public MyCombobox getCmbNam() {
        return cmbNam;
    }
    
    public void addCmbNamListener(ActionListener al) {
        cmbNam.addActionListener(al);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyCombobox cmbNam;
    private GUI.forms.HomeThongKeTheoQuyTableForm homeThongKeTheoQuyTableForm2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
