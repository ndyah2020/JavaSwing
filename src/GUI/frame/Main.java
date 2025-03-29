package GUI.frame;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        header.initMoving(Main.this);
        this.setTitle("Quản Lý Chuyến Bay");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTrangChu = new GUI.panel.swing.PanelBoderPanel();
        header = new GUI.panel.swing.HeaderPanel();
        menuContainer = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        trangChuMenu = new javax.swing.JLabel();
        banVeMenu = new javax.swing.JLabel();
        khachHangMenu = new javax.swing.JLabel();
        nhanVienMenu = new javax.swing.JLabel();
        loaiMayBayMenu = new javax.swing.JLabel();
        mayBayMenu = new javax.swing.JLabel();
        sanBayMenu = new javax.swing.JLabel();
        chuyenBayMenu = new javax.swing.JLabel();
        lichBayMenu = new javax.swing.JLabel();
        veMenu = new javax.swing.JLabel();
        hoaDonMenu = new javax.swing.JLabel();
        khuyenMaiMenu = new javax.swing.JLabel();
        taiKhoanMenu = new javax.swing.JLabel();
        thongTinTaiKhoan = new javax.swing.JPanel();
        hienHinhTK = new GUI.panel.draw.HinhTron();
        duongThang1 = new GUI.panel.draw.DuongThang();
        hienThiTenTK = new javax.swing.JLabel();
        hienThiChucVuTK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelTrangChu.setBackground(new java.awt.Color(204, 204, 204));

        menuContainer.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new java.awt.GridLayout(0, 1, 0, 10));

        trangChuMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trangChuMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/TrangChu.png"))); // NOI18N
        trangChuMenu.setText("Trang Chủ");
        menu.add(trangChuMenu);

        banVeMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        banVeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/BanveMayBay.png"))); // NOI18N
        banVeMenu.setText("Bán Vé");
        menu.add(banVeMenu);

        khachHangMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        khachHangMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/KhachHang.png"))); // NOI18N
        khachHangMenu.setText("Khách Hàng");
        menu.add(khachHangMenu);

        nhanVienMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nhanVienMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/NhanVien.png"))); // NOI18N
        nhanVienMenu.setText("Nhân Viên");
        menu.add(nhanVienMenu);

        loaiMayBayMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loaiMayBayMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/LoaiMayBay.png"))); // NOI18N
        loaiMayBayMenu.setText("Loại Máy bay");
        menu.add(loaiMayBayMenu);

        mayBayMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mayBayMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/MayBay.png"))); // NOI18N
        mayBayMenu.setText("Máy Bay");
        menu.add(mayBayMenu);

        sanBayMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sanBayMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/SanBay.png"))); // NOI18N
        sanBayMenu.setText("Sân Bay");
        menu.add(sanBayMenu);

        chuyenBayMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chuyenBayMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/ChuyenBay.png"))); // NOI18N
        chuyenBayMenu.setText("Chuyến bay");
        menu.add(chuyenBayMenu);

        lichBayMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lichBayMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/LichBay.png"))); // NOI18N
        lichBayMenu.setText("Lịch Bay");
        menu.add(lichBayMenu);

        veMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        veMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/VeMayBay.png"))); // NOI18N
        veMenu.setText("Vé");
        menu.add(veMenu);

        hoaDonMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hoaDonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/HoaDon.png"))); // NOI18N
        hoaDonMenu.setText("Hóa Đơn");
        menu.add(hoaDonMenu);

        khuyenMaiMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        khuyenMaiMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/KhuyenMai.png"))); // NOI18N
        khuyenMaiMenu.setText("Khuyến Mãi");
        menu.add(khuyenMaiMenu);

        taiKhoanMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        taiKhoanMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/TaiKHoan.png"))); // NOI18N
        taiKhoanMenu.setText("Tài Khoản");
        menu.add(taiKhoanMenu);

        thongTinTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout hienHinhTKLayout = new javax.swing.GroupLayout(hienHinhTK);
        hienHinhTK.setLayout(hienHinhTKLayout);
        hienHinhTKLayout.setHorizontalGroup(
            hienHinhTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        hienHinhTKLayout.setVerticalGroup(
            hienHinhTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        duongThang1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout duongThang1Layout = new javax.swing.GroupLayout(duongThang1);
        duongThang1.setLayout(duongThang1Layout);
        duongThang1Layout.setHorizontalGroup(
            duongThang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        duongThang1Layout.setVerticalGroup(
            duongThang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        hienThiTenTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hienThiTenTK.setText("Tên Tài Khoản");

        hienThiChucVuTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hienThiChucVuTK.setText("Chức Vụ");

        javax.swing.GroupLayout thongTinTaiKhoanLayout = new javax.swing.GroupLayout(thongTinTaiKhoan);
        thongTinTaiKhoan.setLayout(thongTinTaiKhoanLayout);
        thongTinTaiKhoanLayout.setHorizontalGroup(
            thongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thongTinTaiKhoanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(duongThang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(thongTinTaiKhoanLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(thongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hienThiTenTK)
                    .addComponent(hienHinhTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(thongTinTaiKhoanLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(hienThiChucVuTK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thongTinTaiKhoanLayout.setVerticalGroup(
            thongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongTinTaiKhoanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hienHinhTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hienThiTenTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hienThiChucVuTK)
                .addGap(1, 1, 1)
                .addComponent(duongThang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout menuContainerLayout = new javax.swing.GroupLayout(menuContainer);
        menuContainer.setLayout(menuContainerLayout);
        menuContainerLayout.setHorizontalGroup(
            menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuContainerLayout.createSequentialGroup()
                .addGroup(menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(menuContainerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuContainerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(thongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        menuContainerLayout.setVerticalGroup(
            menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuContainerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(thongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout PanelTrangChuLayout = new javax.swing.GroupLayout(PanelTrangChu);
        PanelTrangChu.setLayout(PanelTrangChuLayout);
        PanelTrangChuLayout.setHorizontalGroup(
            PanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTrangChuLayout.createSequentialGroup()
                .addComponent(menuContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTrangChuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 1276, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelTrangChuLayout.setVerticalGroup(
            PanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTrangChuLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menuContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
             
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.PanelBoderPanel PanelTrangChu;
    private javax.swing.JLabel banVeMenu;
    private javax.swing.JLabel chuyenBayMenu;
    private GUI.panel.draw.DuongThang duongThang1;
    private GUI.panel.swing.HeaderPanel header;
    private GUI.panel.draw.HinhTron hienHinhTK;
    private javax.swing.JLabel hienThiChucVuTK;
    private javax.swing.JLabel hienThiTenTK;
    private javax.swing.JLabel hoaDonMenu;
    private javax.swing.JLabel khachHangMenu;
    private javax.swing.JLabel khuyenMaiMenu;
    private javax.swing.JLabel lichBayMenu;
    private javax.swing.JLabel loaiMayBayMenu;
    private javax.swing.JLabel mayBayMenu;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuContainer;
    private javax.swing.JLabel nhanVienMenu;
    private javax.swing.JLabel sanBayMenu;
    private javax.swing.JLabel taiKhoanMenu;
    private javax.swing.JPanel thongTinTaiKhoan;
    private javax.swing.JLabel trangChuMenu;
    private javax.swing.JLabel veMenu;
    // End of variables declaration//GEN-END:variables
}
