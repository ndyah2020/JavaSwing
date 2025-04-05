package GUI.frame;

import GUI.forms.ChuyenBayGroupForm;
import GUI.forms.DatVeGroupForm;
import GUI.forms.FormGroup;
import GUI.forms.HanhTrinhGroupForm;
import GUI.forms.HoaDonGroupForm;
import GUI.forms.HomeForm;
import GUI.forms.HomeForm1;
import GUI.forms.KhachHangGroupForm;
import GUI.forms.KhuyenMaiGroupForm;
import GUI.forms.LoaiMayBayGroupForm;
import GUI.forms.MayBayGroupForm;
import GUI.forms.NhanVienGroupForm;
import GUI.forms.SanBayGroupForm;
import GUI.forms.TaiKhoanGroupForm;
import GUI.forms.VeGroupForm;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
public final class Home extends javax.swing.JFrame {
    Color defaultColor = Color.WHITE;
    Color hoverColor = new Color(0, 204, 255);
    private static JLabel selectedLabel = null; 
    
    public void showPanel(JPanel panel) {
        desktopPanel.removeAll();
        desktopPanel.add(panel);
        desktopPanel.revalidate();
        desktopPanel.repaint(); 
       
    }
    public Home() {
        initComponents();
        header.initMoving(Home.this);
        showPanel(new FormGroup());
        this.setTitle("Quản Lý Chuyến Bay");
        handleEventHoverChuot();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        PanelTrangChu = new GUI.panel.swing.PanelBoderPanel();
        menuContainer = new javax.swing.JPanel();
        thongTinTaiKhoan = new javax.swing.JPanel();
        hienHinhTK = new GUI.panel.draw.HinhTron();
        duongThang1 = new GUI.panel.draw.DuongThang();
        hienThiTenTK = new javax.swing.JLabel();
        hienThiChucVuTK = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        trangChuMenu = new javax.swing.JLabel();
        datVeMenu = new javax.swing.JLabel();
        khachHangMenu = new javax.swing.JLabel();
        nhanVienMenu = new javax.swing.JLabel();
        loaiMayBayMenu = new javax.swing.JLabel();
        mayBayMenu = new javax.swing.JLabel();
        sanBayMenu = new javax.swing.JLabel();
        chuyenBayMenu = new javax.swing.JLabel();
        hanhTrinhMenu = new javax.swing.JLabel();
        veMenu = new javax.swing.JLabel();
        hoaDonMenu = new javax.swing.JLabel();
        khuyenMaiMenu = new javax.swing.JLabel();
        taiKhoanMenu = new javax.swing.JLabel();
        desktopPanel = new javax.swing.JPanel();
        header = new GUI.panel.swing.HeaderPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelTrangChu.setBackground(new java.awt.Color(204, 204, 204));

        menuContainer.setBackground(new java.awt.Color(255, 255, 255));

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
                .addGap(66, 66, 66)
                .addGroup(thongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hienThiTenTK)
                    .addComponent(hienHinhTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(thongTinTaiKhoanLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(hienThiChucVuTK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thongTinTaiKhoanLayout.setVerticalGroup(
            thongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongTinTaiKhoanLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(hienHinhTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hienThiTenTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hienThiChucVuTK)
                .addGap(1, 1, 1)
                .addComponent(duongThang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.setBackground(new java.awt.Color(255, 255, 255));
        menu.setLayout(new java.awt.GridLayout(0, 1, 0, 1));

        trangChuMenu.setBackground(new java.awt.Color(255, 255, 255));
        trangChuMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        trangChuMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/TrangChu.png"))); // NOI18N
        trangChuMenu.setText("Trang Chủ");
        trangChuMenu.setOpaque(true);
        menu.add(trangChuMenu);

        datVeMenu.setBackground(new java.awt.Color(255, 255, 255));
        datVeMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        datVeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/BanveMayBay.png"))); // NOI18N
        datVeMenu.setText("Bán Vé");
        datVeMenu.setOpaque(true);
        menu.add(datVeMenu);

        khachHangMenu.setBackground(new java.awt.Color(255, 255, 255));
        khachHangMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        khachHangMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/KhachHang.png"))); // NOI18N
        khachHangMenu.setText("Khách Hàng");
        khachHangMenu.setOpaque(true);
        menu.add(khachHangMenu);

        nhanVienMenu.setBackground(new java.awt.Color(255, 255, 255));
        nhanVienMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nhanVienMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/NhanVien.png"))); // NOI18N
        nhanVienMenu.setText("Nhân Viên");
        nhanVienMenu.setOpaque(true);
        menu.add(nhanVienMenu);

        loaiMayBayMenu.setBackground(new java.awt.Color(255, 255, 255));
        loaiMayBayMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loaiMayBayMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/LoaiMayBay.png"))); // NOI18N
        loaiMayBayMenu.setText("Loại Máy bay");
        loaiMayBayMenu.setOpaque(true);
        menu.add(loaiMayBayMenu);

        mayBayMenu.setBackground(new java.awt.Color(255, 255, 255));
        mayBayMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mayBayMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/MayBay.png"))); // NOI18N
        mayBayMenu.setText("Máy Bay");
        mayBayMenu.setOpaque(true);
        menu.add(mayBayMenu);

        sanBayMenu.setBackground(new java.awt.Color(255, 255, 255));
        sanBayMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sanBayMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/SanBay.png"))); // NOI18N
        sanBayMenu.setText("Sân Bay");
        sanBayMenu.setOpaque(true);
        menu.add(sanBayMenu);

        chuyenBayMenu.setBackground(new java.awt.Color(255, 255, 255));
        chuyenBayMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chuyenBayMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/ChuyenBay.png"))); // NOI18N
        chuyenBayMenu.setText("Chuyến bay");
        chuyenBayMenu.setOpaque(true);
        menu.add(chuyenBayMenu);

        hanhTrinhMenu.setBackground(new java.awt.Color(255, 255, 255));
        hanhTrinhMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hanhTrinhMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/LichBay.png"))); // NOI18N
        hanhTrinhMenu.setText("Hành trình");
        hanhTrinhMenu.setOpaque(true);
        menu.add(hanhTrinhMenu);

        veMenu.setBackground(new java.awt.Color(255, 255, 255));
        veMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        veMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/VeMayBay.png"))); // NOI18N
        veMenu.setText("Vé");
        veMenu.setOpaque(true);
        menu.add(veMenu);

        hoaDonMenu.setBackground(new java.awt.Color(255, 255, 255));
        hoaDonMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hoaDonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/HoaDon.png"))); // NOI18N
        hoaDonMenu.setText("Hóa Đơn");
        hoaDonMenu.setOpaque(true);
        menu.add(hoaDonMenu);

        khuyenMaiMenu.setBackground(new java.awt.Color(255, 255, 255));
        khuyenMaiMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        khuyenMaiMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/KhuyenMai.png"))); // NOI18N
        khuyenMaiMenu.setText("Khuyến Mãi");
        khuyenMaiMenu.setOpaque(true);
        menu.add(khuyenMaiMenu);

        taiKhoanMenu.setBackground(new java.awt.Color(255, 255, 255));
        taiKhoanMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        taiKhoanMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/TaiKHoan.png"))); // NOI18N
        taiKhoanMenu.setText("Tài Khoản");
        taiKhoanMenu.setOpaque(true);
        menu.add(taiKhoanMenu);

        javax.swing.GroupLayout menuContainerLayout = new javax.swing.GroupLayout(menuContainer);
        menuContainer.setLayout(menuContainerLayout);
        menuContainerLayout.setHorizontalGroup(
            menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(menuContainerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuContainerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(thongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        menuContainerLayout.setVerticalGroup(
            menuContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuContainerLayout.createSequentialGroup()
                .addComponent(thongTinTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        desktopPanel.setBackground(new java.awt.Color(255, 255, 255));
        desktopPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout PanelTrangChuLayout = new javax.swing.GroupLayout(PanelTrangChu);
        PanelTrangChu.setLayout(PanelTrangChuLayout);
        PanelTrangChuLayout.setHorizontalGroup(
            PanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTrangChuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menuContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(desktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelTrangChuLayout.setVerticalGroup(
            PanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTrangChuLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menuContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelTrangChuLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(desktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PanelTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(PanelTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void addHoverEffect(final JLabel label,final JPanel panel,final JPanel desktopPanel, final Color defaultColor, final Color hoverColor) {
        label.setBackground(defaultColor); 
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                label.setBackground(hoverColor);
                label.repaint();
            }
            @Override
            public void mouseExited(MouseEvent evt) {
                label.setBackground(defaultColor);
                label.repaint();
            }
            @Override
            public void mouseClicked(MouseEvent evt){
                if (selectedLabel != null) {
                    selectedLabel.setBorder(null);
                }
                label.setBorder(new MatteBorder(0, 5, 0, 0, hoverColor));
                selectedLabel = label;
                desktopPanel.removeAll();
                desktopPanel.add(panel);
                desktopPanel.revalidate();
                desktopPanel.repaint();
            }
        });
    }
    public void handleEventHoverChuot(){
        addHoverEffect(trangChuMenu, new FormGroup(), desktopPanel ,defaultColor, hoverColor);
        addHoverEffect(datVeMenu, new DatVeGroupForm(), desktopPanel ,defaultColor, hoverColor);
        addHoverEffect(khachHangMenu, new KhachHangGroupForm(), desktopPanel, defaultColor, hoverColor);
        addHoverEffect(nhanVienMenu, new NhanVienGroupForm(),desktopPanel ,defaultColor, hoverColor);
        addHoverEffect(loaiMayBayMenu, new LoaiMayBayGroupForm(), desktopPanel ,defaultColor, hoverColor);
        addHoverEffect(mayBayMenu, new MayBayGroupForm(), desktopPanel ,defaultColor, hoverColor);
        addHoverEffect(sanBayMenu, new SanBayGroupForm(),desktopPanel ,defaultColor, hoverColor);
        addHoverEffect(chuyenBayMenu, new ChuyenBayGroupForm(), desktopPanel,defaultColor, hoverColor);
        addHoverEffect(hanhTrinhMenu, new HanhTrinhGroupForm(), desktopPanel ,defaultColor, hoverColor);
        addHoverEffect(veMenu , new VeGroupForm(),desktopPanel, defaultColor, hoverColor);
        addHoverEffect(hoaDonMenu, new HoaDonGroupForm(), desktopPanel ,defaultColor, hoverColor);
        addHoverEffect(khuyenMaiMenu,new KhuyenMaiGroupForm(), desktopPanel ,defaultColor, hoverColor);
        addHoverEffect(taiKhoanMenu, new TaiKhoanGroupForm(), desktopPanel ,defaultColor, hoverColor);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.PanelBoderPanel PanelTrangChu;
    private javax.swing.JLabel chuyenBayMenu;
    private javax.swing.JLabel datVeMenu;
    private javax.swing.JPanel desktopPanel;
    private GUI.panel.draw.DuongThang duongThang1;
    private javax.swing.JLabel hanhTrinhMenu;
    private GUI.panel.swing.HeaderPanel header;
    private GUI.panel.draw.HinhTron hienHinhTK;
    private javax.swing.JLabel hienThiChucVuTK;
    private javax.swing.JLabel hienThiTenTK;
    private javax.swing.JLabel hoaDonMenu;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel khachHangMenu;
    private javax.swing.JLabel khuyenMaiMenu;
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
