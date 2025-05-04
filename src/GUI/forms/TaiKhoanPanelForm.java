package GUI.forms;
public class TaiKhoanPanelForm extends javax.swing.JPanel {
    public TaiKhoanPanelForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taiKhoanTableForm = new GUI.forms.TaiKhoanTableForm();
        taiKhoanForm2 = new GUI.forms.TaiKhoanForm();
        taiKhoanControlForm1 = new GUI.forms.TaiKhoanControlForm();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1069, 730));
        setMinimumSize(new java.awt.Dimension(1069, 730));
        setPreferredSize(new java.awt.Dimension(1069, 730));

        taiKhoanTableForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        taiKhoanForm2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(taiKhoanControlForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(taiKhoanTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(taiKhoanForm2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(taiKhoanControlForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taiKhoanTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addComponent(taiKhoanForm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public TaiKhoanControlForm getTaiKhoanControlForm() {
        return taiKhoanControlForm1;
    }

    public TaiKhoanTableForm getTaiKhoanTableForm() {
        return taiKhoanTableForm;
    }

    public TaiKhoanForm getTaiKhoanForm() {
        return taiKhoanForm2;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.forms.TaiKhoanControlForm taiKhoanControlForm1;
    private GUI.forms.TaiKhoanForm taiKhoanForm2;
    private GUI.forms.TaiKhoanTableForm taiKhoanTableForm;
    // End of variables declaration//GEN-END:variables
}
