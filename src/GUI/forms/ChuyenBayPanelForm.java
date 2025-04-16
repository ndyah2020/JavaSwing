package GUI.forms;
public class ChuyenBayPanelForm extends javax.swing.JPanel {
    public ChuyenBayPanelForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chuyenBayControlForm = new GUI.forms.ChuyenBayControlForm();
        jPanel1 = new javax.swing.JPanel();
        chuyenBayTableForm = new GUI.forms.ChuyenBayTableForm();
        chuyenBayForm = new GUI.forms.ChuyenBayForm();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1069, 750));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));
        add(chuyenBayControlForm);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        chuyenBayTableForm.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        chuyenBayForm.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(chuyenBayTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chuyenBayForm, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chuyenBayTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
            .addComponent(chuyenBayForm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    public ChuyenBayControlForm getChuyenBayControlForm() {
        return chuyenBayControlForm;
    }

    public ChuyenBayForm getChuyenBayForm() {
        return chuyenBayForm;
    }

    public ChuyenBayTableForm getChuyenBayTableForm() {
        return chuyenBayTableForm;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.forms.ChuyenBayControlForm chuyenBayControlForm;
    private GUI.forms.ChuyenBayForm chuyenBayForm;
    private GUI.forms.ChuyenBayTableForm chuyenBayTableForm;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
