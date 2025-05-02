package GUI.forms;
public class DatVePanelForm extends javax.swing.JPanel {
    public DatVePanelForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datVeControlForm = new GUI.forms.DatVeControlForm();
        datVeTableForm = new GUI.forms.DatVeTableForm();
        datVeTableThemForm = new GUI.forms.DatVeTableThemForm();
        khachHangForm = new GUI.forms.KhachHangForm();
        thongTinDatVeForm = new GUI.forms.ThongTinDatVeForm();

        setBackground(new java.awt.Color(204, 204, 204));

        datVeTableThemForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        khachHangForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(datVeControlForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datVeTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                    .addComponent(datVeTableThemForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(khachHangForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(thongTinDatVeForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(datVeControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(datVeTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datVeTableThemForm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(thongTinDatVeForm, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(khachHangForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    public DatVeControlForm getDatVeControlForm() {
        return datVeControlForm;
    }

    public DatVeTableForm getDatVeTableForm() {
        return datVeTableForm;
    }

    public DatVeTableThemForm getDatVeTableThemForm() {
        return datVeTableThemForm;
    }

    public KhachHangForm getKhachHangForm() {
        return khachHangForm;
    }

    public ThongTinDatVeForm getThongTinDatVeForm() {
        return thongTinDatVeForm;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.forms.DatVeControlForm datVeControlForm;
    private GUI.forms.DatVeTableForm datVeTableForm;
    private GUI.forms.DatVeTableThemForm datVeTableThemForm;
    private GUI.forms.KhachHangForm khachHangForm;
    private GUI.forms.ThongTinDatVeForm thongTinDatVeForm;
    // End of variables declaration//GEN-END:variables
}
