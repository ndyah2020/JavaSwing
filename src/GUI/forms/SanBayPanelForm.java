package GUI.forms;

public class SanBayPanelForm extends javax.swing.JPanel {
    public SanBayPanelForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        sanBayControlForm = new GUI.forms.SanBayControlForm();
        sanBayTableForm = new GUI.forms.SanBayTableForm();

        setMaximumSize(new java.awt.Dimension(1065, 800));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(1065, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sanBayControlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sanBayTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sanBayControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(sanBayTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public SanBayControlForm getSanBayControlForm() {
        return sanBayControlForm;
    }

    public SanBayTableForm getSanBayTableForm() {
        return sanBayTableForm;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar jScrollBar1;
    private GUI.forms.SanBayControlForm sanBayControlForm;
    private GUI.forms.SanBayTableForm sanBayTableForm;
    // End of variables declaration//GEN-END:variables
}
