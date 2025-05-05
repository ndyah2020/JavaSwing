package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.sql.Date;
import javax.swing.table.DefaultTableModel;

import BUS.ThongKeBUS;
import BUS.ThongKeKhachHangBUS;
import GUI.forms.HomePanelForm;
import GUI.forms.HomeThongKeKhoangNgayForm;
import GUI.forms.HomeThongKeKhoangNgayTableForm;
import GUI.forms.HomeThongKeQuyForm;
import GUI.forms.HomeThongKeTheoQuyTableForm;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class ThongKeController {

    private final ThongKeBUS bus = new ThongKeBUS();
    private final ThongKeKhachHangBUS thongKeKHBUS = new ThongKeKhachHangBUS();
    private final HomeThongKeTheoQuyTableForm panelQuyTableForm;
    private final HomeThongKeQuyForm panelQuyForm;
    private final HomeThongKeKhoangNgayForm panelKhoanNgay;
    private final HomeThongKeKhoangNgayTableForm panelTableKhoanNgay;
    
    public ThongKeController(HomePanelForm panel) {
        this.panelQuyForm = panel.getThongKeQuyForm();
        this.panelQuyTableForm = panelQuyForm.getHomeThongKeTheoQuyTableForm();
        this.panelKhoanNgay = panel.getHomeThongKeKhoangNgayForm1();
        this.panelTableKhoanNgay = panelKhoanNgay.getHomeThongKeKhoangNgayTableForm1();
    }

    public void hienThiThongKeQuy(int nam) {
        DefaultTableModel model = panelQuyTableForm.getModel();
        model.setRowCount(0); 

        Map<String, Map<Integer, Integer>> duLieu = bus.thongKeHoaDonTheoQuy(nam);

        int tongQ1 = 0;
        int tongQ2 = 0;
        int tongQ3 = 0;
        int tongQ4 = 0;
        int tongAll = 0;

        for (Map.Entry<String, Map<Integer, Integer>> entry : duLieu.entrySet()) {
            String maChuyenBay = entry.getKey();
            Map<Integer, Integer> thongKeQuy = entry.getValue();

            int q1 = thongKeQuy.getOrDefault(1, 0);
            int q2 = thongKeQuy.getOrDefault(2, 0);
            int q3 = thongKeQuy.getOrDefault(3, 0);
            int q4 = thongKeQuy.getOrDefault(4, 0);
            int tong = q1 + q2 + q3 + q4;

            
            tongQ1 += q1;
            tongQ2 += q2;
            tongQ3 += q3;
            tongQ4 += q4;
            tongAll += tong;

            Object[] row = new Object[]{
                maChuyenBay, q1, q2, q3, q4, tong
            };
            model.addRow(row);
        }
        Object[] rowTong = new Object[]{
            "Tổng", tongQ1, tongQ2, tongQ3, tongQ4, tongAll
        };
        model.addRow(rowTong);
    }

    public void controll() {
        panelQuyForm.addCmbNamListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int yearChooser = (int) panelQuyForm.getCmbNam().getSelectedItem();
                hienThiThongKeQuy(yearChooser);
            }
        });
        panelKhoanNgay.addBtnThongKeListener(e -> {
            java.util.Date ngayBatDauUtil = panelKhoanNgay.getNgayBatDau();
            java.util.Date ngayKetThucUtil = panelKhoanNgay.getNgayKetThuc();
            
            if (ngayBatDauUtil != null && ngayKetThucUtil != null) {
                Date ngayBatDauSQL = new java.sql.Date(ngayBatDauUtil.getTime());
                Date ngayKetThucSQL = new java.sql.Date(ngayKetThucUtil.getTime());
                ArrayList<Object[]> ketQuaThongKe = thongKeKHBUS.thongKeKhachHangTheoHoaDon(ngayBatDauSQL, ngayKetThucSQL);
                DefaultTableModel model = panelTableKhoanNgay.getModel();
                model.setRowCount(0);
                for (Object[] obj : ketQuaThongKe) {
                    model.addRow(obj);
                }      
            }
        });
    }

}
