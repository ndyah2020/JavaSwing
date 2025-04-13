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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hanhTrinhTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hanhTrinhControlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hanhTrinhControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(hanhTrinhTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
