package GUI.forms;

import GUI.PopupForm.PopupFormSearch;
import GUI.panel.swing.dateChooser.DateChooser;
import GUI.panel.swing.MyButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
public class KhuyenMaiControlForm extends javax.swing.JPanel {
    private DateChooser dateChooserStart;
    private DateChooser dateChooserEnd;
    private DateChooser dateChooserSearchStart;
    private DateChooser dateChooserSearchEnd;
    private final PopupFormSearch bangLayMa = new PopupFormSearch();
    
    public KhuyenMaiControlForm() {
        initComponents();
        initDateChoosers();
        setupDateChoosers();
        jPopupMenu.setLayout(new BorderLayout());
        jPopupMenu.add(bangLayMa, BorderLayout.CENTER);
    }
    
    public PopupFormSearch getBangLayMa() {
        return bangLayMa;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPopupMenu = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        btnThem = new GUI.panel.swing.MyButton();
        btnSua = new GUI.panel.swing.MyButton();
        jPanel1 = new javax.swing.JPanel();
        lbMaKhuyenMai = new javax.swing.JLabel();
        txtMaKhuyenMai = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lbTenKhuyenMai = new javax.swing.JLabel();
        txtTenKhuyenMai = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbMaHanhTrinh = new javax.swing.JLabel();
        txtMaHanhTrinh = new javax.swing.JTextField();
        btnMaHanhTrinh = new GUI.panel.swing.MyButton();
        jPanel6 = new javax.swing.JPanel();
        lbDenNgay = new javax.swing.JLabel();
        txtNgayKetThuc = new javax.swing.JTextField();
        btnNgayKetThuc = new GUI.panel.swing.MyButton();
        jPanel7 = new javax.swing.JPanel();
        lbDenNgay1 = new javax.swing.JLabel();
        txtNgayBatDau = new javax.swing.JTextField();
        btnNgayBatDau = new GUI.panel.swing.MyButton();
        btnXoa = new GUI.panel.swing.MyButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lbPhanTramKhuyenMai = new javax.swing.JLabel();
        txtPhanTramKhuyenMai = new javax.swing.JTextField();
        btnTimKiemNangCao = new GUI.panel.swing.MyButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTimKiemNgayKetThuc = new javax.swing.JTextField();
        btnTimKiemNgayKetThuc = new GUI.panel.swing.MyButton();
        txtTimKiem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTimKiemNgayBatDau = new javax.swing.JTextField();
        btnTimKiemNgayBatDau = new GUI.panel.swing.MyButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTimKiemTenKhuyenMai = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTimKiemMaKhuyenMai = new javax.swing.JTextField();
        btnReloadForm = new GUI.panel.swing.MyButton();

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1065, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Danh sách khuyến mãi");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThem.setColorClick(new java.awt.Color(0, 153, 255));
        btnThem.setColorOver(new java.awt.Color(0, 204, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setPreferredSize(new java.awt.Dimension(99, 31));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSua.setColorClick(new java.awt.Color(0, 153, 255));
        btnSua.setColorOver(new java.awt.Color(0, 204, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setPreferredSize(new java.awt.Dimension(72, 31));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        lbMaKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMaKhuyenMai.setText("Mã khuyến mãi:");
        lbMaKhuyenMai.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel1.add(lbMaKhuyenMai);

        txtMaKhuyenMai.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel1.add(txtMaKhuyenMai);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        lbTenKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTenKhuyenMai.setText("Tên khuyến mãi:");
        lbTenKhuyenMai.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel2.add(lbTenKhuyenMai);

        txtTenKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenKhuyenMai.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel2.add(txtTenKhuyenMai);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        lbMaHanhTrinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbMaHanhTrinh.setText("Mã hành trình:");
        lbMaHanhTrinh.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel4.add(lbMaHanhTrinh);

        txtMaHanhTrinh.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaHanhTrinh.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel4.add(txtMaHanhTrinh);

        btnMaHanhTrinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnMaHanhTrinh.setBorderColor(new java.awt.Color(204, 204, 204));
        btnMaHanhTrinh.setColorClick(new java.awt.Color(0, 153, 255));
        btnMaHanhTrinh.setColorOver(new java.awt.Color(0, 204, 255));
        btnMaHanhTrinh.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMaHanhTrinh.setPreferredSize(new java.awt.Dimension(32, 31));
        jPanel4.add(btnMaHanhTrinh);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new javax.swing.BoxLayout(jPanel6, javax.swing.BoxLayout.LINE_AXIS));

        lbDenNgay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDenNgay.setText("Đến ngày:");
        lbDenNgay.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel6.add(lbDenNgay);

        txtNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayKetThuc.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel6.add(txtNgayKetThuc);

        btnNgayKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnNgayKetThuc.setBorderColor(new java.awt.Color(204, 204, 204));
        btnNgayKetThuc.setColorClick(new java.awt.Color(0, 153, 255));
        btnNgayKetThuc.setColorOver(new java.awt.Color(0, 204, 255));
        btnNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNgayKetThuc.setMaximumSize(new java.awt.Dimension(99, 30));
        btnNgayKetThuc.setMinimumSize(new java.awt.Dimension(99, 30));
        btnNgayKetThuc.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel6.add(btnNgayKetThuc);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new javax.swing.BoxLayout(jPanel7, javax.swing.BoxLayout.LINE_AXIS));

        lbDenNgay1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDenNgay1.setText("Từ ngày:");
        lbDenNgay1.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel7.add(lbDenNgay1);

        txtNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayBatDau.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel7.add(txtNgayBatDau);

        btnNgayBatDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnNgayBatDau.setBorderColor(new java.awt.Color(204, 204, 204));
        btnNgayBatDau.setColorClick(new java.awt.Color(0, 153, 255));
        btnNgayBatDau.setColorOver(new java.awt.Color(0, 204, 255));
        btnNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnNgayBatDau.setMaximumSize(new java.awt.Dimension(99, 30));
        btnNgayBatDau.setMinimumSize(new java.awt.Dimension(99, 30));
        btnNgayBatDau.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel7.add(btnNgayBatDau);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/hidden.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorderColor(new java.awt.Color(204, 204, 204));
        btnXoa.setColorClick(new java.awt.Color(0, 153, 255));
        btnXoa.setColorOver(new java.awt.Color(0, 204, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoa.setPreferredSize(new java.awt.Dimension(72, 31));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        lbPhanTramKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbPhanTramKhuyenMai.setText("% Khuyến mãi:");
        lbPhanTramKhuyenMai.setPreferredSize(new java.awt.Dimension(120, 30));
        jPanel3.add(lbPhanTramKhuyenMai);

        txtPhanTramKhuyenMai.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel3.add(txtPhanTramKhuyenMai);

        btnTimKiemNangCao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/search.png"))); // NOI18N
        btnTimKiemNangCao.setText("Tìm kiếm");
        btnTimKiemNangCao.setBorderColor(new java.awt.Color(204, 204, 204));
        btnTimKiemNangCao.setColorClick(new java.awt.Color(0, 153, 255));
        btnTimKiemNangCao.setColorOver(new java.awt.Color(0, 204, 255));
        btnTimKiemNangCao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiemNangCao.setPreferredSize(new java.awt.Dimension(121, 31));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Đến ngày:");
        jLabel4.setPreferredSize(new java.awt.Dimension(70, 30));
        jPanel8.add(jLabel4);

        txtTimKiemNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimKiemNgayKetThuc.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel8.add(txtTimKiemNgayKetThuc);

        btnTimKiemNgayKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnTimKiemNgayKetThuc.setBorderColor(new java.awt.Color(204, 204, 204));
        btnTimKiemNgayKetThuc.setColorClick(new java.awt.Color(0, 153, 255));
        btnTimKiemNgayKetThuc.setColorOver(new java.awt.Color(0, 204, 255));
        btnTimKiemNgayKetThuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiemNgayKetThuc.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel8.add(btnTimKiemNgayKetThuc);

        txtTimKiem.setPreferredSize(new java.awt.Dimension(71, 30));

        jLabel3.setBackground(new java.awt.Color(0, 204, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/search.png"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel3.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 30));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new javax.swing.BoxLayout(jPanel9, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Từ ngày:");
        jLabel5.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel9.add(jLabel5);

        txtTimKiemNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimKiemNgayBatDau.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel9.add(txtTimKiemNgayBatDau);

        btnTimKiemNgayBatDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnTimKiemNgayBatDau.setBorderColor(new java.awt.Color(204, 204, 204));
        btnTimKiemNgayBatDau.setColorClick(new java.awt.Color(0, 153, 255));
        btnTimKiemNgayBatDau.setColorOver(new java.awt.Color(0, 204, 255));
        btnTimKiemNgayBatDau.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimKiemNgayBatDau.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel9.add(btnTimKiemNgayBatDau);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new javax.swing.BoxLayout(jPanel10, javax.swing.BoxLayout.LINE_AXIS));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tên KM:");
        jLabel6.setPreferredSize(new java.awt.Dimension(55, 30));
        jPanel10.add(jLabel6);

        txtTimKiemTenKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimKiemTenKhuyenMai.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel10.add(txtTimKiemTenKhuyenMai);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new javax.swing.BoxLayout(jPanel11, javax.swing.BoxLayout.LINE_AXIS));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Mã KM:");
        jLabel7.setPreferredSize(new java.awt.Dimension(52, 30));
        jPanel11.add(jLabel7);

        txtTimKiemMaKhuyenMai.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimKiemMaKhuyenMai.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel11.add(txtTimKiemMaKhuyenMai);

        btnReloadForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/reloadNhanVien.png"))); // NOI18N
        btnReloadForm.setText("Reload Form");
        btnReloadForm.setBorderColor(new java.awt.Color(204, 204, 204));
        btnReloadForm.setColorClick(new java.awt.Color(0, 153, 255));
        btnReloadForm.setColorOver(new java.awt.Color(0, 204, 255));
        btnReloadForm.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(317, 317, 317)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTimKiemNangCao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReloadForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReloadForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1))
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTimKiemNangCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed
    private void initDateChoosers() {
        dateChooserStart = new DateChooser();
        dateChooserEnd = new DateChooser();
        dateChooserSearchStart = new DateChooser();
        dateChooserSearchEnd = new DateChooser();
    }
    private void setupDateChoosers() {
        setupDateChooser(btnNgayBatDau, dateChooserStart, txtNgayBatDau);
        setupDateChooser(btnNgayKetThuc, dateChooserEnd, txtNgayKetThuc);
        setupDateChooser(btnTimKiemNgayBatDau, dateChooserSearchStart, txtTimKiemNgayBatDau);
        setupDateChooser(btnTimKiemNgayKetThuc, dateChooserSearchEnd, txtTimKiemNgayKetThuc);
    }

    private void setupDateChooser(MyButton button, DateChooser chooser, JTextField textField) {
        chooser.setTextRefernce(textField);
        button.addActionListener(evt -> chooser.showPopup());
    }
    
    public Date getNgayBatDau() {
        String text = txtNgayBatDau.getText().trim();
        if (text.isEmpty()) {
            return null;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            return sdf.parse(text);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,
            "Ngày bắt đầu không đúng định dạng yyyy-MM-dd.\n" + "Vui lòng chọn lại.", 
            "Lỗi định dạng ngày",
            JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public Date getNgayKetThuc() {
        String text = txtNgayKetThuc.getText().trim();
        if (text.isEmpty()) {
            return null;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            return sdf.parse(text);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,
            "Ngày bắt đầu không đúng định dạng yyyy-MM-dd.\n" + "Vui lòng chọn lại.", 
            "Lỗi định dạng ngày",
            JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void setNgayBatDau(Date ngayBatDau) {
        if (ngayBatDau != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            txtNgayBatDau.setText(sdf.format(ngayBatDau));
        }
    }
    
    public void setNgayKetThuc(Date ngayKetThuc) {
        if (ngayKetThuc != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            txtNgayKetThuc.setText(sdf.format(ngayKetThuc));
        }
    }
    
    public Date getTimKiemNgayBatDau() {
        String text = txtTimKiemNgayBatDau.getText().trim();
        if (text.isEmpty()) {
            return null;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            return sdf.parse(text);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,
            "Ngày bắt đầu không đúng định dạng yyyy-MM-dd.\n" + "Vui lòng chọn lại.", 
            "Lỗi định dạng ngày",
            JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public Date getTimKiemNgayKetThuc() {
        String text = txtTimKiemNgayKetThuc.getText().trim();
        if (text.isEmpty()) {
            return null;
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            sdf.setLenient(false);
            return sdf.parse(text);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null,
            "Ngày bắt đầu không đúng định dạng yyyy-MM-dd.\n" + "Vui lòng chọn lại.", 
            "Lỗi định dạng ngày",
            JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public JTextField getTxtTimKiemMaKhuyenMai() {
        return txtTimKiemMaKhuyenMai;
    }
    
    public JTextField getTxtTimKiemTenKhuyenMai() {
        return txtTimKiemTenKhuyenMai;
    }
    
    public MyButton getBtnTimKiemNangCao() {
        return btnTimKiemNangCao;
    }
    
    public MyButton getBtnReloadForm() {
        return btnReloadForm;
    }
    
    public JTextField getTxtMaKhuyenMai() {
        return txtMaKhuyenMai;
    }
    
    public JTextField getTxtTenKhuyenMai() {
        return txtTenKhuyenMai;
    }
    
    public JTextField getTxtPhanTramKhuyenMai() {
        return txtPhanTramKhuyenMai;
    }
    
    public JTextField getTxtNgayBatDau() {
        return txtNgayBatDau;
    }
    
    public JTextField getTxtNgayKetThuc() {
        return txtNgayKetThuc;
    }
    
    public JTextField getTxtMaHanhTrinh() {
        return txtMaHanhTrinh;
    }
    
    public JTextField getTxtTimKiem() {
        return txtTimKiem;
    }
    
    public JPopupMenu getJPopupMenu() {
        return jPopupMenu;
    }
    
    public MyButton getBtnMaHanhTrinh() {
        return btnMaHanhTrinh;
    }
    
    public void showPopupMaHanhTrinh() {
        jPopupMenu.show(btnMaHanhTrinh, -300, btnMaHanhTrinh.getWidth());
    }
    
    public void resetForm() {
        txtMaKhuyenMai.setText("");
        txtTenKhuyenMai.setText("");
        txtPhanTramKhuyenMai.setText("");
        txtNgayBatDau.setText("");
        txtNgayKetThuc.setText("");
        txtMaHanhTrinh.setText("");
        txtTimKiemMaKhuyenMai.setText("");
        txtTimKiemTenKhuyenMai.setText("");
        txtTimKiemNgayBatDau.setText("");
        txtTimKiemNgayKetThuc.setText("");
    }
    
    public void addThemListener(ActionListener al) {
        btnThem.addActionListener(al);
    }
    
    public void addXoaListener(ActionListener al) {
        btnXoa.addActionListener(al);
    }
    
    public void addSuaListener(ActionListener al) {
        btnSua.addActionListener(al);
    }
    
    public void addTimKiemListener(KeyAdapter ka) {
        txtTimKiem.addKeyListener(ka);
    }
    
    public void addShowPopupMaHanhTrinh(ActionListener al) {
        btnMaHanhTrinh.addActionListener(al);
    }
    
    public void addTimKiemNangCaoListener(ActionListener al) {
        btnTimKiemNangCao.addActionListener(al);
    }
    
    public void addReloadFormLisener(ActionListener al) {
        btnReloadForm.addActionListener(al);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.MyButton btnMaHanhTrinh;
    private GUI.panel.swing.MyButton btnNgayBatDau;
    private GUI.panel.swing.MyButton btnNgayKetThuc;
    private GUI.panel.swing.MyButton btnReloadForm;
    private GUI.panel.swing.MyButton btnSua;
    private GUI.panel.swing.MyButton btnThem;
    private GUI.panel.swing.MyButton btnTimKiemNangCao;
    private GUI.panel.swing.MyButton btnTimKiemNgayBatDau;
    private GUI.panel.swing.MyButton btnTimKiemNgayKetThuc;
    private GUI.panel.swing.MyButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JPopupMenu jPopupMenu;
    private javax.swing.JLabel lbDenNgay;
    private javax.swing.JLabel lbDenNgay1;
    private javax.swing.JLabel lbMaHanhTrinh;
    private javax.swing.JLabel lbMaKhuyenMai;
    private javax.swing.JLabel lbPhanTramKhuyenMai;
    private javax.swing.JLabel lbTenKhuyenMai;
    private javax.swing.JTextField txtMaHanhTrinh;
    private javax.swing.JTextField txtMaKhuyenMai;
    private javax.swing.JTextField txtNgayBatDau;
    private javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtPhanTramKhuyenMai;
    private javax.swing.JTextField txtTenKhuyenMai;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTimKiemMaKhuyenMai;
    private javax.swing.JTextField txtTimKiemNgayBatDau;
    private javax.swing.JTextField txtTimKiemNgayKetThuc;
    private javax.swing.JTextField txtTimKiemTenKhuyenMai;
    // End of variables declaration//GEN-END:variables
}
