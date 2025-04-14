package GUI.forms;

public class LoaiMayBayPanelForm extends javax.swing.JPanel {

    public LoaiMayBayPanelForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loaiMayBayControlForm = new GUI.forms.LoaiMayBayControlForm();
        loaiMayBayTableForm = new GUI.forms.LoaiMayBayTableForm();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1069, 709));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loaiMayBayTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(loaiMayBayControlForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loaiMayBayControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loaiMayBayTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public LoaiMayBayControlForm getLoaiMayBayControlForm() {
        return loaiMayBayControlForm;
    }
    
    public LoaiMayBayTableForm getLoaiMayBayTableForm() {
        return loaiMayBayTableForm;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.forms.LoaiMayBayControlForm loaiMayBayControlForm;
    private GUI.forms.LoaiMayBayTableForm loaiMayBayTableForm;
    // End of variables declaration//GEN-END:variables
}
