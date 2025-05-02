package GUI.forms;

import GUI.PopupForm.PopupFormSearch;
import GUI.panel.swing.MyButton;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import java.awt.BorderLayout;
public class ThongTinDatVeForm extends javax.swing.JPanel {
    private PopupFormSearch bangLayMaVe;
    public ThongTinDatVeForm() {
        initComponents();
        intPopup();     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupLayMaVe = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtMaChuyenBay = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtMaVe = new javax.swing.JTextField();
        btnMaVe = new GUI.panel.swing.MyButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtCccd = new javax.swing.JTextField();
        btnKiemTracccd = new GUI.panel.swing.MyButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtGiaVe = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnThemVe = new GUI.panel.swing.MyButton();
        btnDatVe = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin đặc vé");
        jLabel1.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel3.add(jLabel1);

        add(jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1, 0, 12));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new javax.swing.BoxLayout(jPanel21, javax.swing.BoxLayout.LINE_AXIS));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Mã CB:");
        jLabel19.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel21.add(jLabel19);

        txtMaChuyenBay.setMaximumSize(new java.awt.Dimension(2147483647, 36));
        txtMaChuyenBay.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel21.add(txtMaChuyenBay);

        jPanel20.add(jPanel21);

        jPanel2.add(jPanel20);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Chọn Vé:");
        jLabel10.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel9.add(jLabel10);

        txtMaVe.setMaximumSize(new java.awt.Dimension(2147483647, 36));
        txtMaVe.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel9.add(txtMaVe);

        btnMaVe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnMaVe.setBorderColor(new java.awt.Color(204, 204, 204));
        btnMaVe.setColorClick(new java.awt.Color(0, 153, 255));
        btnMaVe.setColorOver(new java.awt.Color(0, 204, 255));
        btnMaVe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMaVe.setMaximumSize(new java.awt.Dimension(30, 36));
        btnMaVe.setMinimumSize(new java.awt.Dimension(30, 30));
        btnMaVe.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel9.add(btnMaVe);

        jPanel2.add(jPanel9);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("CCCD");
        jLabel14.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel13.add(jLabel14);

        txtCccd.setMargin(null);
        txtCccd.setMaximumSize(new java.awt.Dimension(2147483647, 36));
        txtCccd.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel13.add(txtCccd);

        btnKiemTracccd.setText("Kiểm tra");
        btnKiemTracccd.setBorderColor(new java.awt.Color(204, 204, 204));
        btnKiemTracccd.setColorClick(new java.awt.Color(0, 153, 255));
        btnKiemTracccd.setColorOver(new java.awt.Color(0, 204, 255));
        btnKiemTracccd.setMargin(null);
        btnKiemTracccd.setMaximumSize(new java.awt.Dimension(74, 36));
        btnKiemTracccd.setMinimumSize(new java.awt.Dimension(74, 30));
        btnKiemTracccd.setPreferredSize(new java.awt.Dimension(74, 30));
        jPanel13.add(btnKiemTracccd);

        jPanel2.add(jPanel13);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new javax.swing.BoxLayout(jPanel17, javax.swing.BoxLayout.LINE_AXIS));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Giá vé");
        jLabel17.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel17.setPreferredSize(new java.awt.Dimension(69, 30));
        jPanel17.add(jLabel17);

        txtGiaVe.setMaximumSize(new java.awt.Dimension(2147483647, 36));
        txtGiaVe.setPreferredSize(new java.awt.Dimension(71, 30));
        jPanel17.add(txtGiaVe);

        jPanel2.add(jPanel17);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 12, 0));

        btnThemVe.setText("Thêm Vé");
        btnThemVe.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThemVe.setColorClick(new java.awt.Color(0, 153, 255));
        btnThemVe.setColorOver(new java.awt.Color(0, 204, 255));
        btnThemVe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThemVe.setMaximumSize(new java.awt.Dimension(74, 36));
        btnThemVe.setMinimumSize(new java.awt.Dimension(74, 30));
        btnThemVe.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(btnThemVe);

        btnDatVe.setText("Đặt Vé");
        btnDatVe.setBorderColor(new java.awt.Color(204, 204, 204));
        btnDatVe.setColorClick(new java.awt.Color(0, 153, 255));
        btnDatVe.setColorOver(new java.awt.Color(0, 204, 255));
        btnDatVe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDatVe.setMaximumSize(new java.awt.Dimension(432423, 36));
        btnDatVe.setMinimumSize(new java.awt.Dimension(10, 10));
        btnDatVe.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(btnDatVe);

        jPanel2.add(jPanel1);

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents
    public void showPopBangLayMaVe() {
        popupLayMaVe.show(btnMaVe, -287, btnMaVe.getHeight() - 200);
    }
    
    private void intPopup() {
        bangLayMaVe = new PopupFormSearch();
        popupLayMaVe.setLayout(new BorderLayout());
        popupLayMaVe.add(bangLayMaVe, BorderLayout.CENTER);
    }
    public MyButton getBtnDatVe() {
        return btnDatVe;
    }

    public MyButton getBtnKiemTracccd() {
        return btnKiemTracccd;
    }

    public MyButton getBtnMaVe() {
        return btnMaVe;
    }

    public MyButton getBtnThemVe() {
        return btnThemVe;
    }

    public JTextField getTxtCccd() {
        return txtCccd;
    }

    public JTextField getTxtGiaVe() {
        return txtGiaVe;
    }

    public JTextField getTxtMaChuyenBay() {
        return txtMaChuyenBay;
    }

    public JTextField getTxtMaVe() {
        return txtMaVe;
    }
    
    public void addBtnThemveListener(ActionListener listener) {
        btnThemVe.addActionListener(listener);
    }
    
    public void addBtnDatVeListener(ActionListener listener) {
        btnDatVe.addActionListener(listener);
    }
    
    public void addBtnKiemTraKH(ActionListener listener) {
        btnKiemTracccd.addActionListener(listener);
    }
    
    public void addShowPopopMaVe(ActionListener listener) {
        btnMaVe.addActionListener(listener);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnDatVe;
    private GUI.panel.swing.MyButton btnKiemTracccd;
    private GUI.panel.swing.MyButton btnMaVe;
    private GUI.panel.swing.MyButton btnThemVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu popupLayMaVe;
    private javax.swing.JTextField txtCccd;
    private javax.swing.JTextField txtGiaVe;
    private javax.swing.JTextField txtMaChuyenBay;
    private javax.swing.JTextField txtMaVe;
    // End of variables declaration//GEN-END:variables
}
