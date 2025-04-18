package GUI.forms;

public class KhuyenMaiPanelForm extends javax.swing.JPanel {

    public KhuyenMaiPanelForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        khuyenMaiControlForm = new GUI.forms.KhuyenMaiControlForm();
        khuyenMaiTableForm = new GUI.forms.KhuyenMaiTableForm();
        khuyenMaiChiTietTableForm = new GUI.forms.KhuyenMaiChiTietTableForm();

        jFormattedTextField1.setText("jFormattedTextField1");

        setMaximumSize(new java.awt.Dimension(1069, 800));
        setMinimumSize(new java.awt.Dimension(1069, 800));
        setPreferredSize(new java.awt.Dimension(1069, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(khuyenMaiTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(khuyenMaiChiTietTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(khuyenMaiControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(khuyenMaiControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(khuyenMaiTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(khuyenMaiChiTietTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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
