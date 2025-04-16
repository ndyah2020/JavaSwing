package GUI.forms;
public class HanhTrinhPanelForm extends javax.swing.JPanel {
    public HanhTrinhPanelForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hanhTrinhTableForm = new GUI.forms.HanhTrinhTableForm();
        hanhTrinhControlForm = new GUI.forms.HanhTrinhControlForm();

        hanhTrinhTableForm.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hanhTrinhTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, 1050, Short.MAX_VALUE)
            .addComponent(hanhTrinhControlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hanhTrinhControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(hanhTrinhTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public HanhTrinhControlForm getHanhTrinhControlForm(){
        return hanhTrinhControlForm;
    }
    public HanhTrinhTableForm getHanhTrinhTableForm() {
        return hanhTrinhTableForm;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.forms.HanhTrinhControlForm hanhTrinhControlForm;
    private GUI.forms.HanhTrinhTableForm hanhTrinhTableForm;
    // End of variables declaration//GEN-END:variables
}
