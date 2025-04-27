package GUI.forms;

public class NhanVienPanelForm extends javax.swing.JPanel {
    public NhanVienPanelForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nhanVienControlForm = new GUI.forms.NhanVienControlForm();
        nhanVienTableForm = new GUI.forms.NhanVienTableForm();
        nhanVienForm = new GUI.forms.NhanVienForm();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1070, 800));

        nhanVienTableForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        nhanVienForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nhanVienControlForm, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nhanVienTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nhanVienForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(nhanVienControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nhanVienTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nhanVienForm, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public NhanVienControlForm getNhanVienControlForm() {
        return nhanVienControlForm;
    }

    public NhanVienForm getNhanVienForm() {
        return nhanVienForm;
    }

    public NhanVienTableForm getNhanVienTableForm() {
        return nhanVienTableForm;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.forms.NhanVienControlForm nhanVienControlForm;
    private GUI.forms.NhanVienForm nhanVienForm;
    private GUI.forms.NhanVienTableForm nhanVienTableForm;
    // End of variables declaration//GEN-END:variables
}
