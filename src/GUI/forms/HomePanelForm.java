/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.forms;

/**
 *
 * @author Lenovo
 */
public class HomePanelForm extends javax.swing.JPanel {

    
    public HomePanelForm() {
        initComponents();
    }

    public HomeThongKeQuyForm getThongKeQuyForm() {
        return homeThongKeQuyForm1;
    }

    public HomeThongKeKhoangNgayForm getHomeThongKeKhoangNgayForm1() {
        return homeThongKeKhoangNgayForm1;
    }

    public HomeThongKeQuyForm getHomeThongKeQuyForm1() {
        return homeThongKeQuyForm1;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        homeThongKeKhoangNgayForm1 = new GUI.forms.HomeThongKeKhoangNgayForm();
        homeThongKeQuyForm1 = new GUI.forms.HomeThongKeQuyForm();

        homeThongKeKhoangNgayForm1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        homeThongKeQuyForm1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homeThongKeQuyForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homeThongKeKhoangNgayForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(homeThongKeKhoangNgayForm1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(homeThongKeQuyForm1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private GUI.forms.HomeThongKeKhoangNgayForm homeThongKeKhoangNgayForm1;
    private GUI.forms.HomeThongKeQuyForm homeThongKeQuyForm1;
    // End of variables declaration//GEN-END:variables
}
