package GUI.frame;

import Control.ChuyenBayController;
import Control.DatVeController;
import Control.HanhTrinhController;
import Control.HoaDonVaCTController;
import Control.KhachHangController;
import Control.KhuyenMaiController;
import Control.LoaiMayBayController;
import Control.MayBayController;
import Control.NhanVienController;
import Control.SanBayController;
import Control.TaiKhoanController;
import Control.VeController;
import GUI.forms.ChuyenBayPanelForm;
import GUI.forms.DatVePanelForm;
import GUI.forms.HomePanelForm;
import GUI.forms.HanhTrinhPanelForm;
import GUI.forms.HoaDonPanelForm;
import GUI.forms.KhachHangPanelForm;
import GUI.forms.KhuyenMaiPanelForm;
import GUI.forms.LoaiMayBayPanelForm;
import GUI.forms.MayBayPanelForm;
import GUI.forms.NhanVienPanelForm;
import GUI.forms.SanBayPanelForm;
import GUI.forms.TaiKhoanPanelForm;
import GUI.forms.VePanelForm;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public final class Home extends javax.swing.JFrame {

    Color defaultColor = Color.WHITE;
    Color hoverColor = new Color(0, 204, 255);
    private static JLabel selectedLabel = null;
    //Khoi tao các controller
    private SanBayController sanBayController;
    private HanhTrinhController hanhTrinhController;
    private LoaiMayBayController loaiMayBayController;
    private ChuyenBayController chuyenBayController;
    private MayBayController mayBayController;
    private VeController veController;
    private KhuyenMaiController khuyenMaiController;
    private NhanVienController nhanVienController;
    private TaiKhoanController taiKhoancontroller;
    private KhachHangController  khachHangController;
    private HoaDonVaCTController hoaDonVaCTController;
    private DatVeController datVeController;
    //Khoi tao cac panel
    private HomePanelForm formGroup;
    private DatVePanelForm datVeForm;
    private KhachHangPanelForm khachHangForm;
    private NhanVienPanelForm nhanVienForm;
    private LoaiMayBayPanelForm loaiMayBayForm;
    private MayBayPanelForm mayBayForm;
    private SanBayPanelForm sanBayForm;
    private ChuyenBayPanelForm chuyenBayForm;
    private HanhTrinhPanelForm hanhTrinhForm;
    private VePanelForm veForm;
    private HoaDonPanelForm hoaDonForm;
    private KhuyenMaiPanelForm khuyenMaiForm;
    private TaiKhoanPanelForm taiKhoanForm;

    //cac phuong thuc
    public Home() {
        initComponents();
        this.setTitle("Quản Lý Chuyến Bay");
        initForms();

        //Hiển thị home đầu tiên 
        headerPanel.initMoving(Home.this);
        desktopPanel.removeAll();
        desktopPanel.add(formGroup);
        desktopPanel.revalidate();
        desktopPanel.repaint();
        selectedLabel = trangChuMenu;
        trangChuMenu.setBorder(new MatteBorder(0, 5, 0, 0, hoverColor));

        //Xu ly khi click chuot vao tung menu
        handleEventHoverChuot();
    }

    private void initForms() {
        formGroup = new HomePanelForm();
        datVeForm = new DatVePanelForm();
        khachHangForm = new KhachHangPanelForm();
        nhanVienForm = new NhanVienPanelForm();
        loaiMayBayForm = new LoaiMayBayPanelForm();
        mayBayForm = new MayBayPanelForm();

        sanBayForm = new SanBayPanelForm();
        chuyenBayForm = new ChuyenBayPanelForm();
        hanhTrinhForm = new HanhTrinhPanelForm();
        veForm = new VePanelForm();
        hoaDonForm = new HoaDonPanelForm();
        khuyenMaiForm = new KhuyenMaiPanelForm();
        taiKhoanForm = new TaiKhoanPanelForm();
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTrangChu = new GUI.panel.swing.PanelBoderPanel();
        menuContainer = new javax.swing.JPanel();
        thongTinTaiKhoan = new javax.swing.JPanel();
        duongThang1 = new GUI.panel.draw.DuongThang();
        hienThiTenTK = new javax.swing.JLabel();
        hienThiChucVuTK = new javax.swing.JLabel();
        myImageAvatar2 = new GUI.panel.swing.MyImageAvatar();
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
        headerPanel = new GUI.panel.swing.HeaderPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        PanelTrangChu.setBackground(new java.awt.Color(204, 204, 204));

        menuContainer.setBackground(new java.awt.Color(255, 255, 255));

        thongTinTaiKhoan.setBackground(new java.awt.Color(255, 255, 255));

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

        myImageAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/avatar.png"))); // NOI18N

        javax.swing.GroupLayout thongTinTaiKhoanLayout = new javax.swing.GroupLayout(thongTinTaiKhoan);
        thongTinTaiKhoan.setLayout(thongTinTaiKhoanLayout);
        thongTinTaiKhoanLayout.setHorizontalGroup(
            thongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thongTinTaiKhoanLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(duongThang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(thongTinTaiKhoanLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(hienThiChucVuTK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(thongTinTaiKhoanLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(thongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myImageAvatar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hienThiTenTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thongTinTaiKhoanLayout.setVerticalGroup(
            thongTinTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thongTinTaiKhoanLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(myImageAvatar2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addGap(0, 0, 0)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        desktopPanel.setBackground(new java.awt.Color(255, 255, 255));
        desktopPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout PanelTrangChuLayout = new javax.swing.GroupLayout(PanelTrangChu);
        PanelTrangChu.setLayout(PanelTrangChuLayout);
        PanelTrangChuLayout.setHorizontalGroup(
            PanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTrangChuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelTrangChuLayout.createSequentialGroup()
                        .addComponent(menuContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(desktopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1054, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        PanelTrangChuLayout.setVerticalGroup(
            PanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTrangChuLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelTrangChuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(desktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(PanelTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   private void hienThiDanhSach() {
        if (selectedLabel == sanBayMenu) {
            sanBayController = new SanBayController(sanBayForm);
            
            sanBayController.hienThiDanhSachSanBay();
            sanBayController.xuLySuKien();
        } else if (selectedLabel == trangChuMenu) {
            System.out.println("Trang chủ");
            // có thể xử lý hiển thị form trang chủ nếu có
        } else if (selectedLabel == datVeMenu) {
            datVeController = new DatVeController(datVeForm);
            datVeController.layDanhSachChuyenBayVaVe();
            datVeController.xuLySuKien();
        } else if (selectedLabel == khachHangMenu) {
            khachHangController = new KhachHangController(khachHangForm);
            khachHangController.layDanhSachKhachHang();
            khachHangController.conTrol();
        } else if (selectedLabel == nhanVienMenu) {                  
            // Hiển thị form nhân viên
            nhanVienController = new NhanVienController(nhanVienForm);
            nhanVienController.layDanhSachNhanvien();
            nhanVienController.xuLySuKien();
        } else if (selectedLabel == loaiMayBayMenu) {
            loaiMayBayController = new LoaiMayBayController(loaiMayBayForm);
            loaiMayBayController.hienThiDanhSachLoaiMayBay();
            loaiMayBayController.xuLySuKienLoaiMayBay();
            
        } else if (selectedLabel == mayBayMenu) {
            mayBayController = new MayBayController(mayBayForm);
            mayBayController.hienThiDanhSachMayBay();
            mayBayController.xuLySuKienMayBayControl();
            // Hiển thị form máy bay
        } else if (selectedLabel == chuyenBayMenu) {
            
            chuyenBayController = new ChuyenBayController(chuyenBayForm);
            chuyenBayController.layDanhSachChuyenBay();
            chuyenBayController.xuLySuKien();
        } else if (selectedLabel == hanhTrinhMenu) {
            hanhTrinhController = new HanhTrinhController(hanhTrinhForm);
            
            hanhTrinhController.hienThiDanhSachHanhTrinh();
            hanhTrinhController.xuLySuKienHanhTrinhConTrol();
            
        } else if (selectedLabel == veMenu) {
            veController = new VeController(veForm);
            veController.layDanhSachVe();
            veController.xuLySuKien();
        } else if (selectedLabel == hoaDonMenu) {
            hoaDonVaCTController = new HoaDonVaCTController(hoaDonForm);
            hoaDonVaCTController.layDanhSachHoaDon();
            hoaDonVaCTController.xuLySuKien();
        } else if (selectedLabel == khuyenMaiMenu) {
            khuyenMaiController = new KhuyenMaiController(khuyenMaiForm);
            khuyenMaiController.hienThiKhuyenMai();
            khuyenMaiController.xuLySuKienKhuyenMai();
        } else if (selectedLabel == taiKhoanMenu) {
            taiKhoancontroller = new TaiKhoanController(taiKhoanForm);
            taiKhoancontroller.layDanhSachTaiKhoan();
            taiKhoancontroller.xuLySuKien();
        } else {
            System.out.println("Không có menu phù hợp");
        }
    }

    private void addHoverEffect(final JLabel label, final JPanel panel, final JPanel desktopPanel, final Color defaultColor, final Color hoverColor) {
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
            public void mouseClicked(MouseEvent evt) {
                if (selectedLabel != null) {
                    selectedLabel.setBorder(null);
                }
                label.setBorder(new MatteBorder(0, 5, 0, 0, hoverColor));
                selectedLabel = label;
                desktopPanel.removeAll();
                desktopPanel.add(panel);
                desktopPanel.revalidate();
                desktopPanel.repaint();
                hienThiDanhSach();
            }
        });
    }

    private void handleEventHoverChuot() {
        addHoverEffect(trangChuMenu, formGroup, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(datVeMenu, datVeForm, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(khachHangMenu, khachHangForm, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(nhanVienMenu, nhanVienForm, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(loaiMayBayMenu, loaiMayBayForm, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(mayBayMenu, mayBayForm, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(sanBayMenu, sanBayForm, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(chuyenBayMenu, chuyenBayForm, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(hanhTrinhMenu, hanhTrinhForm, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(veMenu, veForm, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(hoaDonMenu, hoaDonForm, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(khuyenMaiMenu, khuyenMaiForm, desktopPanel, defaultColor, hoverColor);
        addHoverEffect(taiKhoanMenu, taiKhoanForm, desktopPanel, defaultColor, hoverColor);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.panel.swing.PanelBoderPanel PanelTrangChu;
    private javax.swing.JLabel chuyenBayMenu;
    private javax.swing.JLabel datVeMenu;
    private javax.swing.JPanel desktopPanel;
    private GUI.panel.draw.DuongThang duongThang1;
    private javax.swing.JLabel hanhTrinhMenu;
    private GUI.panel.swing.HeaderPanel headerPanel;
    private javax.swing.JLabel hienThiChucVuTK;
    private javax.swing.JLabel hienThiTenTK;
    private javax.swing.JLabel hoaDonMenu;
    private javax.swing.JLabel khachHangMenu;
    private javax.swing.JLabel khuyenMaiMenu;
    private javax.swing.JLabel loaiMayBayMenu;
    private javax.swing.JLabel mayBayMenu;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuContainer;
    private GUI.panel.swing.MyImageAvatar myImageAvatar2;
    private javax.swing.JLabel nhanVienMenu;
    private javax.swing.JLabel sanBayMenu;
    private javax.swing.JLabel taiKhoanMenu;
    private javax.swing.JPanel thongTinTaiKhoan;
    private javax.swing.JLabel trangChuMenu;
    private javax.swing.JLabel veMenu;
    // End of variables declaration//GEN-END:variables
}
