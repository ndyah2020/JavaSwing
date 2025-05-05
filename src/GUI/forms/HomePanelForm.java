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

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        homeThongKeKhoangNgayForm1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 6, 0, new java.awt.Color(204, 204, 204)));
        add(homeThongKeKhoangNgayForm1);

        homeThongKeQuyForm1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 6, 6, 0, new java.awt.Color(204, 204, 204)));
        add(homeThongKeQuyForm1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private GUI.forms.HomeThongKeKhoangNgayForm homeThongKeKhoangNgayForm1;
    private GUI.forms.HomeThongKeQuyForm homeThongKeQuyForm1;
    // End of variables declaration//GEN-END:variables
}
