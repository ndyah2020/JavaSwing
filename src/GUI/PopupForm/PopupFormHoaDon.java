
package GUI.PopupForm;

import GUI.forms.ThongTinKhachHangForm;
import GUI.panel.swing.MyButton;
import GUI.panel.swing.MyTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;

public class PopupFormHoaDon extends javax.swing.JPanel {

    private DefaultTableModel model;
    
    public PopupFormHoaDon() {
        initComponents();
        String[] tenCot = {"Mã Chuyến Bay", "Số Lượng", "Mã vé", "Đơn giá"};
        setcolumnDefaultTableModel(tenCot);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        thongTinKhachHangForm1 = new GUI.forms.ThongTinKhachHangForm();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new GUI.panel.swing.MyTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbTongTien = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbMaKhuyenMai = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbGiamGia = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lBTienPhaiTra = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        btnXuatPDF = new GUI.panel.swing.MyButton();
        btnXacNhan = new GUI.panel.swing.MyButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Xác nhận thông tin hóa đơn");
        jLabel1.setPreferredSize(new java.awt.Dimension(70, 31));
        jPanel8.add(jLabel1);

        add(jPanel8);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        add(jPanel1);
        add(thongTinKhachHangForm1);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Thông tin vé đã mua");
        jPanel7.add(jLabel3);

        add(jPanel7);

        jScrollPane1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(500, 270));
        jScrollPane1.setViewportView(myTable);

        add(jScrollPane1);

        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));
        add(jPanel9);

        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(12, 150, 12, 12, new java.awt.Color(255, 255, 255)));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(250, 30));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 30));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tổng tiền:");
        jLabel2.setMaximumSize(new java.awt.Dimension(130, 30));
        jLabel2.setMinimumSize(new java.awt.Dimension(130, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel4.add(jLabel2);

        lbTongTien.setMaximumSize(new java.awt.Dimension(80, 30));
        lbTongTien.setPreferredSize(new java.awt.Dimension(120, 30));
        lbTongTien.setRequestFocusEnabled(false);
        jPanel4.add(lbTongTien);

        jPanel2.add(jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Mã khuyến mãi:");
        jLabel4.setMaximumSize(new java.awt.Dimension(130, 30));
        jLabel4.setMinimumSize(new java.awt.Dimension(130, 30));
        jLabel4.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel3.add(jLabel4);

        lbMaKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMaKhuyenMai.setMaximumSize(new java.awt.Dimension(80, 30));
        lbMaKhuyenMai.setMinimumSize(new java.awt.Dimension(0, 30));
        lbMaKhuyenMai.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel3.add(lbMaKhuyenMai);

        jPanel2.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Giảm giá:");
        jLabel6.setMaximumSize(new java.awt.Dimension(130, 30));
        jLabel6.setMinimumSize(new java.awt.Dimension(130, 30));
        jLabel6.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel5.add(jLabel6);

        lbGiamGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbGiamGia.setMaximumSize(new java.awt.Dimension(80, 30));
        lbGiamGia.setMinimumSize(new java.awt.Dimension(0, 30));
        lbGiamGia.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel5.add(lbGiamGia);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Tiền phải trả:");
        jLabel8.setMaximumSize(new java.awt.Dimension(130, 30));
        jLabel8.setMinimumSize(new java.awt.Dimension(130, 30));
        jLabel8.setPreferredSize(new java.awt.Dimension(130, 30));
        jPanel6.add(jLabel8);

        lBTienPhaiTra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBTienPhaiTra.setMaximumSize(new java.awt.Dimension(80, 30));
        lBTienPhaiTra.setMinimumSize(new java.awt.Dimension(0, 30));
        lBTienPhaiTra.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel6.add(lBTienPhaiTra);

        jPanel2.add(jPanel6);

        jPanel11.add(jPanel2);

        add(jPanel11);

        jPanel10.setLayout(new java.awt.GridLayout());

        btnXuatPDF.setText("XUẤT PDF");
        btnXuatPDF.setBorderColor(new java.awt.Color(204, 204, 204));
        btnXuatPDF.setColorClick(new java.awt.Color(0, 153, 255));
        btnXuatPDF.setColorOver(new java.awt.Color(0, 204, 255));
        btnXuatPDF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatPDF.setMaximumSize(new java.awt.Dimension(110, 31));
        btnXuatPDF.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel10.add(btnXuatPDF);

        btnXacNhan.setText("XÁC NHẬN");
        btnXacNhan.setBorderColor(new java.awt.Color(204, 204, 204));
        btnXacNhan.setColorClick(new java.awt.Color(0, 153, 255));
        btnXacNhan.setColorOver(new java.awt.Color(0, 204, 255));
        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXacNhan.setMaximumSize(new java.awt.Dimension(110, 31));
        btnXacNhan.setPreferredSize(new java.awt.Dimension(110, 31));
        jPanel10.add(btnXacNhan);

        add(jPanel10);
    }// </editor-fold>//GEN-END:initComponents

    public MyTable getMyTable() {
        return myTable;
    }
    
    public DefaultTableModel getModel() {
        return model;
    }
    
    public void addRowClickPopup(MouseAdapter listener) {
        myTable.addMouseListener(listener);
    }
    
    public void addBtnXacNhanListener(ActionListener listener) {
        btnXacNhan.addActionListener(listener);
    }
    
    public void addBtnXuatPDFListener(ActionListener listener) {
        btnXuatPDF.addActionListener(listener);
    }
    
    private void setcolumnDefaultTableModel(String[] columnNames){
        model = new DefaultTableModel(columnNames, 0);
        myTable.setModel(model);
        myTable.setAutoCreateColumnsFromModel(true);
        myTable.createDefaultColumnsFromModel();
    }

    public MyButton getBtnXacNhan() {
        return btnXacNhan;
    }

    public MyButton getBtnXuatPDF() {
        return btnXuatPDF;
    }

    public JLabel getlBTienPhaiTra() {
        return lBTienPhaiTra;
    }

    public JLabel getLbGiamGia() {
        return lbGiamGia;
    }

    public JLabel getLbMaKhuyenMai() {
        return lbMaKhuyenMai;
    }

    public JLabel getLbTongTien() {
        return lbTongTien;
    }

    public ThongTinKhachHangForm getThongTinKhachHangForm1() {
        return thongTinKhachHangForm1;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnXacNhan;
    private GUI.panel.swing.MyButton btnXuatPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lBTienPhaiTra;
    private javax.swing.JLabel lbGiamGia;
    private javax.swing.JLabel lbMaKhuyenMai;
    private javax.swing.JLabel lbTongTien;
    private GUI.panel.swing.MyTable myTable;
    private GUI.forms.ThongTinKhachHangForm thongTinKhachHangForm1;
    // End of variables declaration//GEN-END:variables
}
