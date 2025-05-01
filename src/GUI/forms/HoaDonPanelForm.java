package GUI.forms;
public class HoaDonPanelForm extends javax.swing.JPanel {
    public HoaDonPanelForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hoaDonControlForm = new GUI.forms.HoaDonControlForm();
        hoaDonTableForm = new GUI.forms.HoaDonTableForm();
        hoaDonCTTableForm = new GUI.forms.HoaDonCTTableForm();
        thongTinNhanVienForm = new GUI.forms.ThongTinNhanVienForm();
        thongTinKhachHangForm = new GUI.forms.ThongTinKhachHangForm();

        setBackground(new java.awt.Color(204, 204, 204));

        hoaDonTableForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        hoaDonCTTableForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        thongTinNhanVienForm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(hoaDonTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hoaDonCTTableForm, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thongTinKhachHangForm, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thongTinNhanVienForm, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(hoaDonControlForm, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(hoaDonControlForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(thongTinKhachHangForm, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thongTinNhanVienForm, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
                    .addComponent(hoaDonTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hoaDonCTTableForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    public HoaDonCTTableForm getHoaDonCTTableForm() {
        return hoaDonCTTableForm;
    }

    public HoaDonTableForm getHoaDonTableForm() {
        return hoaDonTableForm;
    }

    public ThongTinKhachHangForm getThongTinKhachHangForm() {
        return thongTinKhachHangForm;
    }

    public ThongTinNhanVienForm getThongTinNhanVienForm() {
        return thongTinNhanVienForm;
    }

    public HoaDonControlForm getHoaDonControlForm() {
        return hoaDonControlForm;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.forms.HoaDonCTTableForm hoaDonCTTableForm;
    private GUI.forms.HoaDonControlForm hoaDonControlForm;
    private GUI.forms.HoaDonTableForm hoaDonTableForm;
    private GUI.forms.ThongTinKhachHangForm thongTinKhachHangForm;
    private GUI.forms.ThongTinNhanVienForm thongTinNhanVienForm;
    // End of variables declaration//GEN-END:variables
}
