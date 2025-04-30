package GUI.forms;
public class TaiKhoanPanelForm extends javax.swing.JPanel {
    public TaiKhoanPanelForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        taiKhoanControlForm = new GUI.forms.TaiKhoanControlForm();
        thongTinNhanVienForm = new GUI.forms.ThongTinNhanVienForm();
        taiKhoanTableForm = new GUI.forms.TaiKhoanTableForm();

        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(1069, 730));
        setMinimumSize(new java.awt.Dimension(1069, 730));
        setPreferredSize(new java.awt.Dimension(1069, 730));

        thongTinNhanVienForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        taiKhoanTableForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taiKhoanControlForm, javax.swing.GroupLayout.DEFAULT_SIZE, 1069, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(taiKhoanTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thongTinNhanVienForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(taiKhoanControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taiKhoanTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addComponent(thongTinNhanVienForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public TaiKhoanControlForm getTaiKhoanControlForm() {
        return taiKhoanControlForm;
    }

    public TaiKhoanTableForm getTaiKhoanTableForm() {
        return taiKhoanTableForm;
    }

    public ThongTinNhanVienForm getThongTinNhanVienForm() {
        return thongTinNhanVienForm;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.forms.TaiKhoanControlForm taiKhoanControlForm;
    private GUI.forms.TaiKhoanTableForm taiKhoanTableForm;
    private GUI.forms.ThongTinNhanVienForm thongTinNhanVienForm;
    // End of variables declaration//GEN-END:variables
}
