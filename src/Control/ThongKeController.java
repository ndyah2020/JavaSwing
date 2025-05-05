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
import java.util.List;

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

    private void hienThiThongKeQuy(int nam) {
        DefaultTableModel model = panelQuyTableForm.getModel();       
        model.setRowCount(0);

        List<Object[]> data = bus.thongKeChuyenBayTheoNam(nam);
        int[] tongQuy = new int[5];

        for (Object[] row : data) {
            model.addRow(row);

            for (int i = 1; i <= 5; i++) {
                tongQuy[i - 1] += (int) row[i];
            }
        }

        Object[] rowTong = new Object[6];
        rowTong[0] = "Tổng cộng";
        for (int i = 1; i <= 5; i++) {
            rowTong[i] = tongQuy[i - 1];
        }
        model.addRow(rowTong);
    }

    public void controll() {
        panelQuyForm.addCmbNamListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object selected = panelQuyForm.getCmbNam().getSelectedItem();
                int year;
                if (selected instanceof Integer) {
                    year = (Integer) selected;
                } else {
                    try {
                        year = Integer.parseInt(selected.toString());
                    } catch (NumberFormatException ex) {
                        return;
                    }
                }
                hienThiThongKeQuy(year);
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
