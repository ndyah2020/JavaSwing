package GUI.forms;

public class KhuyenMaiPanelForm extends javax.swing.JPanel {

    public KhuyenMaiPanelForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        khuyenMaiTableForm = new GUI.forms.KhuyenMaiTableForm();
        khuyenMaiChiTietTableForm = new GUI.forms.KhuyenMaiChiTietTableForm();
        khuyenMaiControlForm = new GUI.forms.KhuyenMaiControlForm();

        jFormattedTextField1.setText("jFormattedTextField1");

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1069, 700));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1069, 700));

        khuyenMaiTableForm.setBackground(new java.awt.Color(255, 255, 255));
        khuyenMaiTableForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        khuyenMaiChiTietTableForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(khuyenMaiTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(khuyenMaiChiTietTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(khuyenMaiControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(khuyenMaiControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(khuyenMaiTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addComponent(khuyenMaiChiTietTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    public KhuyenMaiControlForm getKhuyenMaiControlForm() {
        return khuyenMaiControlForm;
    }
    
    public KhuyenMaiTableForm getKhuyenMaiTableForm() {
        return khuyenMaiTableForm;
    }
    
    public KhuyenMaiChiTietTableForm getKhuyenMaiChiTietTableForm() {
        return khuyenMaiChiTietTableForm;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private GUI.forms.KhuyenMaiChiTietTableForm khuyenMaiChiTietTableForm;
    private GUI.forms.KhuyenMaiControlForm khuyenMaiControlForm;
    private GUI.forms.KhuyenMaiTableForm khuyenMaiTableForm;
    // End of variables declaration//GEN-END:variables
}
