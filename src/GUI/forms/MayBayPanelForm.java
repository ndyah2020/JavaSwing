package GUI.forms;
public class MayBayPanelForm extends javax.swing.JPanel {
    public MayBayPanelForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mayBayControlForm = new GUI.forms.MayBayControlForm();
        mayBayTableForm = new GUI.forms.MayBayTableForm();

        setBackground(new java.awt.Color(204, 204, 204));

        mayBayControlForm.setPreferredSize(new java.awt.Dimension(1065, 150));

        mayBayTableForm.setBackground(new java.awt.Color(255, 255, 255));
        mayBayTableForm.setPreferredSize(new java.awt.Dimension(1065, 640));

        javax.swing.GroupLayout mayBayTableFormLayout = new javax.swing.GroupLayout(mayBayTableForm);
        mayBayTableForm.setLayout(mayBayTableFormLayout);
        mayBayTableFormLayout.setHorizontalGroup(
            mayBayTableFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1065, Short.MAX_VALUE)
        );
        mayBayTableFormLayout.setVerticalGroup(
            mayBayTableFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mayBayControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(mayBayTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mayBayControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mayBayTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 45, Short.MAX_VALUE))
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
