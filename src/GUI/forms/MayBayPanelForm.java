package GUI.forms;
public class MayBayPanelForm extends javax.swing.JPanel {
    public MayBayPanelForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mayBayTableForm = new GUI.forms.MayBayTableForm();
        mayBayControlForm = new GUI.forms.MayBayControlForm();

        setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mayBayControlForm, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
            .addComponent(mayBayTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mayBayControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mayBayTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public MayBayControlForm getMayBayControlForm() {
        return mayBayControlForm;
    }
    
    public MayBayTableForm getMayBayTableForm() {
        return mayBayTableForm;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.forms.MayBayControlForm mayBayControlForm;
    private GUI.forms.MayBayTableForm mayBayTableForm;
    // End of variables declaration//GEN-END:variables
}
