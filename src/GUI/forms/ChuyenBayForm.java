package GUI.forms;

import GUI.PopupForm.PopupFormSearch;
import GUI.panel.swing.MyButton;
import GUI.panel.swing.dateChooser.DateChooser;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

public class ChuyenBayForm extends javax.swing.JPanel {
    private DateChooser ngayDiDateChooser;
    private DateChooser ngayDenDateChooser;
    private PopupFormSearch bangLayMaMayBay;
    private PopupFormSearch bangLayMaHanhTrinh;

    public ChuyenBayForm() {
        initComponents();
        initSpinerTime();
        initDateChoosers();
        initBangLayMa();
        txtNgayXuatPhat.setEditable(false);
        txtNgayDenNoi.setEditable(false);
        txtMaMayBay.setEditable(false);
        txtMaHanhTrinh.setEditable(false);
        txtGiaThuong.setEditable(false);
        txtGiaVip.setEditable(false);
        txtSoGheConLai.setEditable(false);
        txtTongSLGhe.setEditable(false);
        txtTrangThai.setEditable(false);
        txtSoGheDaBan.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMaHanhTrinh = new javax.swing.JPopupMenu();
        popupMaMayBay = new javax.swing.JPopupMenu();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaChuyenBay = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNgayXuatPhat = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        spinnerGioXuatPhat = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtNgayDenNoi = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        spinnerGioDenNoi = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtGiaThuong = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtGiaVip = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtTrangThai = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtTongSLGhe = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtSoGheDaBan = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtSoGheConLai = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtMaHanhTrinh = new javax.swing.JTextField();
        btnMaHanhTrinh = new GUI.panel.swing.MyButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtMaMayBay = new javax.swing.JTextField();
        btnMaMayBay = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setLayout(new java.awt.GridLayout(1, 0));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createMatteBorder(6, 6, 6, 6, new java.awt.Color(255, 255, 255)));
        jPanel14.setForeground(new java.awt.Color(204, 204, 204));
        jPanel14.setLayout(new java.awt.GridLayout(0, 1, 0, 6));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông tin chuyến bay");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel14.add(jPanel15);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã chuyến bay:");
        jLabel2.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel1.add(jLabel2);

        txtMaChuyenBay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaChuyenBay.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel1.add(txtMaChuyenBay);

        jPanel14.add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ngày xuất phát:");
        jLabel3.setPreferredSize(new java.awt.Dimension(113, 20));
        jPanel2.add(jLabel3);

        txtNgayXuatPhat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayXuatPhat.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel2.add(txtNgayXuatPhat);

        jPanel14.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Giờ xuất phát:");
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel3.add(jLabel4);

        spinnerGioXuatPhat.setToolTipText("");
        spinnerGioXuatPhat.setDoubleBuffered(true);
        spinnerGioXuatPhat.setOpaque(true);
        jPanel3.add(spinnerGioXuatPhat);

        jPanel14.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ngày đến nơi:");
        jLabel5.setPreferredSize(new java.awt.Dimension(113, 31));
        jPanel4.add(jLabel5);

        txtNgayDenNoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayDenNoi.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel4.add(txtNgayDenNoi);

        jPanel14.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Giờ đến nơi:");
        jLabel6.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel5.add(jLabel6);
        jPanel5.add(spinnerGioDenNoi);

        jPanel14.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Giá thường:");
        jLabel7.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel6.add(jLabel7);

        txtGiaThuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGiaThuong.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel6.add(txtGiaThuong);

        jPanel14.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Giá Vip:");
        jLabel8.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel7.add(jLabel8);

        txtGiaVip.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGiaVip.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel7.add(txtGiaVip);

        jPanel14.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Trạng Thái:");
        jLabel9.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel8.add(jLabel9);

        txtTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTrangThai.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel8.add(txtTrangThai);

        jPanel14.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Tổng SL ghế:");
        jLabel10.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel9.add(jLabel10);

        txtTongSLGhe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTongSLGhe.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel9.add(txtTongSLGhe);

        jPanel14.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Số ghế đã bán:");
        jLabel11.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel10.add(jLabel11);

        txtSoGheDaBan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoGheDaBan.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel10.add(txtSoGheDaBan);

        jPanel14.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Số ghế còn lại:");
        jLabel12.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel11.add(jLabel12);

        txtSoGheConLai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoGheConLai.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel11.add(txtSoGheConLai);

        jPanel14.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel12.setLayout(new javax.swing.BoxLayout(jPanel12, javax.swing.BoxLayout.LINE_AXIS));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Mã hành trình:");
        jLabel13.setPreferredSize(new java.awt.Dimension(113, 31));
        jPanel12.add(jLabel13);

        txtMaHanhTrinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaHanhTrinh.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel12.add(txtMaHanhTrinh);

        btnMaHanhTrinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnMaHanhTrinh.setBorderColor(new java.awt.Color(204, 204, 204));
        btnMaHanhTrinh.setColorClick(new java.awt.Color(0, 153, 255));
        btnMaHanhTrinh.setColorOver(new java.awt.Color(0, 204, 255));
        btnMaHanhTrinh.setMaximumSize(new java.awt.Dimension(30, 1000));
        btnMaHanhTrinh.setPreferredSize(new java.awt.Dimension(31, 31));
        jPanel12.add(btnMaHanhTrinh);

        jPanel14.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(100, 31));
        jPanel13.setLayout(new javax.swing.BoxLayout(jPanel13, javax.swing.BoxLayout.LINE_AXIS));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Mã máy bay:");
        jLabel14.setPreferredSize(new java.awt.Dimension(113, 31));
        jPanel13.add(jLabel14);

        txtMaMayBay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaMayBay.setPreferredSize(new java.awt.Dimension(150, 31));
        jPanel13.add(txtMaMayBay);

        btnMaMayBay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnMaMayBay.setBorderColor(new java.awt.Color(204, 204, 204));
        btnMaMayBay.setColorClick(new java.awt.Color(0, 153, 255));
        btnMaMayBay.setColorOver(new java.awt.Color(0, 204, 255));
        btnMaMayBay.setMaximumSize(new java.awt.Dimension(100, 100));
        btnMaMayBay.setPreferredSize(new java.awt.Dimension(31, 31));
        jPanel13.add(btnMaMayBay);

        jPanel14.add(jPanel13);

        add(jPanel14);
    }// </editor-fold>//GEN-END:initComponents
    private void initSpinerTime() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date gioMacDinh = cal.getTime();

        SpinnerDateModel model = new SpinnerDateModel(gioMacDinh, null, null, Calendar.MINUTE);
        spinnerGioXuatPhat.setModel(model);
        JSpinner.DateEditor editor = new JSpinner.DateEditor(spinnerGioXuatPhat, "HH:mm");
        spinnerGioXuatPhat.setEditor(editor);

        SpinnerDateModel modelGioDenNoi = new SpinnerDateModel(gioMacDinh, null, null, Calendar.MINUTE);
        spinnerGioDenNoi.setModel(modelGioDenNoi);
        JSpinner.DateEditor editorGioDen = new JSpinner.DateEditor(spinnerGioDenNoi, "HH:mm");
        spinnerGioDenNoi.setEditor(editorGioDen);
    }
    private void initBangLayMa() {
        bangLayMaMayBay = new PopupFormSearch();
        bangLayMaHanhTrinh = new PopupFormSearch();
        
        popupMaHanhTrinh.setLayout(new BorderLayout());
        popupMaHanhTrinh.add(bangLayMaHanhTrinh, BorderLayout.CENTER);
        
        popupMaMayBay.setLayout(new BorderLayout());
        popupMaMayBay.add(bangLayMaMayBay, BorderLayout.CENTER);
    }
    
    private void initDateChoosers() {
        ngayDiDateChooser = new DateChooser();
        ngayDiDateChooser.setTextRefernce(txtNgayXuatPhat);
        ngayDiDateChooser = new DateChooser();
        ngayDiDateChooser.setTextRefernce(txtNgayDenNoi);
    }
    
    public void showPopBangLayMaHanhTrinh() {
        popupMaHanhTrinh.show(btnMaHanhTrinh, -287, btnMaHanhTrinh.getHeight() - 477);
    }
    
    public void showPopBangLayMaMayBay() {
        popupMaMayBay.show(btnMaMayBay, -400, btnMaMayBay.getHeight() - 477);
    }
    
    public PopupFormSearch getBangLayMaMayBay() {
        return bangLayMaMayBay;
    }
    
    public PopupFormSearch getBangLayMaHanhTrinh() {
        return bangLayMaHanhTrinh;
    }
    
    public DateChooser getNgayDiDateChooser() {
        return ngayDiDateChooser;
    }

    public DateChooser getNgayDenDateChooser() {
        return ngayDenDateChooser;
    }
    
    public MyButton getBtnMaHanhTrinh() {
        return btnMaHanhTrinh;
    }

    public MyButton getBtnMaMayBay() {
        return btnMaMayBay;
    }


    public JSpinner getSpinnerGioDenNoi() {
        return spinnerGioDenNoi;
    }

    public JSpinner getSpinnerGioXuatPhat() {
        return spinnerGioXuatPhat;
    }

    public JTextField getTxtGiaThuong() {
        return txtGiaThuong;
    }

    public JTextField getTxtGiaVip() {
        return txtGiaVip;
    }

    public JTextField getTxtMaChuyenBay() {
        return txtMaChuyenBay;
    }

    public JTextField getTxtMaHanhTrinh() {
        return txtMaHanhTrinh;
    }

    public JTextField getTxtMaMayBay() {
        return txtMaMayBay;
    }

    public JTextField getTxtNgayDenNoi() {
        return txtNgayDenNoi;
    }

    public JTextField getTxtNgayXuatPhat() {
        return txtNgayXuatPhat;
    }

    public JTextField getTxtSoGheConLai() {
        return txtSoGheConLai;
    }

    public JTextField getTxtSoGheDaBan() {
        return txtSoGheDaBan;
    }

    public JTextField getTxtTongSLGhe() {
        return txtTongSLGhe;
    }

    public JTextField getTxtTrangThai() {
        return txtTrangThai;
    }   
    public void addShowPopupMaHanhTrinh(ActionListener listener) {
        btnMaHanhTrinh.addActionListener(listener);
    }

    public void addShowPopupMaMayBay(ActionListener listener) {
        btnMaMayBay.addActionListener(listener);
    }

    public void clearForm() {
        initSpinerTime();
        initDateChoosers();
        txtGiaThuong.setText("");
        txtGiaVip.setText("");
        txtMaChuyenBay.setText("");
        txtMaHanhTrinh.setText("");
        txtMaMayBay.setText("");
        txtSoGheConLai.setText("");
        txtSoGheDaBan.setText("");
        txtTongSLGhe.setText("");
        txtTrangThai.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnMaHanhTrinh;
    private GUI.panel.swing.MyButton btnMaMayBay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu popupMaHanhTrinh;
    private javax.swing.JPopupMenu popupMaMayBay;
    private javax.swing.JSpinner spinnerGioDenNoi;
    private javax.swing.JSpinner spinnerGioXuatPhat;
    private javax.swing.JTextField txtGiaThuong;
    private javax.swing.JTextField txtGiaVip;
    private javax.swing.JTextField txtMaChuyenBay;
    private javax.swing.JTextField txtMaHanhTrinh;
    private javax.swing.JTextField txtMaMayBay;
    private javax.swing.JTextField txtNgayDenNoi;
    private javax.swing.JTextField txtNgayXuatPhat;
    private javax.swing.JTextField txtSoGheConLai;
    private javax.swing.JTextField txtSoGheDaBan;
    private javax.swing.JTextField txtTongSLGhe;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}
