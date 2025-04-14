package Control;

import DTO.SanBayDTO;
import BUS.HanhTrinhBUS;
import BUS.SanBayBUS;
import DTO.HanhTrinhDTO;
import GUI.forms.HanhTrinhControlForm;
import GUI.forms.HanhTrinhPanelForm;
import GUI.forms.HanhTrinhTableForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HanhTrinhController {

    private ArrayList<HanhTrinhDTO> dsHanhTrinh;
    private final HanhTrinhTableForm panelTable;
    private final HanhTrinhControlForm panelControl;
    private String popupModel = "";

    public HanhTrinhController(HanhTrinhPanelForm panel) {
        this.panelTable = panel.getHanhTrinhTableForm();
        this.panelControl = panel.getHanhTrinhControlForm();

        panelControl.getTxtSanBayDi().setEditable(false);
        panelControl.getTxtSanBayDen().setEditable(false);
    }

    private void taiDuLieuLenTabel(DefaultTableModel model, ArrayList<HanhTrinhDTO> danhSach) {
        model.setRowCount(0);
        for (HanhTrinhDTO ht : danhSach) {
            Vector row = new Vector();
            row.add(ht.getMaHanhTrinh());
            row.add(ht.getTenHanhTrinh());
            row.add(ht.getSanBayDi());
            row.add(ht.getSanBayDen());
            row.add(ht.getGiaCoBan());
            model.addRow(row);
        }
    }

    private void setModelSanBay(DefaultTableModel model, ArrayList<SanBayDTO> danhSach) {
        model.setRowCount(0);
        for (SanBayDTO sb : danhSach) {
            Vector<String> row = new Vector();
            row.add(sb.getMaSanBay());
            row.add(sb.getTenSanBay());
            model.addRow(row);
        }
    }

    private void layDanhSachSanBayVaHienThiLenPopup() {
        String[] tenCot = {"Mã Sân Bay", "Tên Sân Bay"};
        panelControl.getBangLayMa().setcolumnDefaultTableModel(tenCot);
        DefaultTableModel model = panelControl.getBangLayMa().getModel();
        SanBayBUS bus = new SanBayBUS();
        ArrayList<SanBayDTO> dsSanBay = bus.getDanhSachSanBay();
        setModelSanBay(model, dsSanBay);
        panelControl.getBangLayMa().getMyTable().setModel(model);
    }

    public void hienThiDanhSachHanhTrinh() {
        HanhTrinhBUS bus = new HanhTrinhBUS();
        DefaultTableModel modelDsHT = panelTable.getModel();
        dsHanhTrinh = bus.getDanhSachHanhTrinhBUS();
        taiDuLieuLenTabel(modelDsHT, dsHanhTrinh);
        panelTable.getMyTable().setModel(modelDsHT);
    }

    //Tạo ra mã hành tình
    public String generateRandom() {
        String prefix = "HT";
        String random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8).toUpperCase();
        while (isCodeDuplicate(random)) {
            random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8).toUpperCase();
        }
        return prefix + "-" + random;
    }

    //Kiểm tra mã duy nhất
    private boolean isCodeDuplicate(String code) {
        for (HanhTrinhDTO ht : dsHanhTrinh) {
            if (ht.getMaHanhTrinh().equals(code)) {
                return true;
            }
        }
        return false;
    }

    public void xuLySuKienHanhTrinhConTrol() {

        panelTable.addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int rowSeleted = panelTable.getMyTable().getSelectedRow();
                if (rowSeleted != -1) {
                    HanhTrinhDTO hanhTrinh = dsHanhTrinh.get(rowSeleted);
                    panelControl.getTxtTenHanhTrinh().setText(hanhTrinh.getTenHanhTrinh());
                    panelControl.getTxtSanBayDi().setText(hanhTrinh.getSanBayDi());
                    panelControl.getTxtSanBayDen().setText(hanhTrinh.getSanBayDen());
                    panelControl.getTxtGiaCoBan().setText("" + hanhTrinh.getGiaCoBan());

                }
            }
        });
        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sanBayDi = panelControl.getTxtSanBayDi().getText();
                String sanBayDen = panelControl.getTxtSanBayDen().getText();
                String tenHanhTrinh = panelControl.getTxtTenHanhTrinh().getText();
                int giaCoBan = Integer.parseInt(panelControl.getTxtGiaCoBan().getText());

                if (sanBayDi.isEmpty() || sanBayDen.isEmpty() || giaCoBan < 0) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;
                }
                if (sanBayDi.equals(sanBayDen)) {
                    JOptionPane.showMessageDialog(null, "Mã sân bay đi và sân bay đến không được trùng nhau");
                    return;
                }

                HanhTrinhDTO hanhTrinh = new HanhTrinhDTO();
                hanhTrinh.setMaHanhTrinh(generateRandom());
                hanhTrinh.setTenHanhTrinh(tenHanhTrinh);
                hanhTrinh.setSanBayDi(sanBayDi);
                hanhTrinh.setSanBayDen(sanBayDen);
                hanhTrinh.setGiaCoBan(giaCoBan);

                HanhTrinhBUS bus = new HanhTrinhBUS();
                bus.themHanhTrinhBUS(hanhTrinh);
                panelControl.clearFormData();
                hienThiDanhSachHanhTrinh();
            }
        });
        //Xoa hanh Trinh
        panelControl.addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowSeleted = panelTable.getMyTable().getSelectedRow();
                if (rowSeleted != -1) {
                    String maHanhTrinh = panelTable.getMyTable().getValueAt(rowSeleted, 0).toString();
                    HanhTrinhBUS bus = new HanhTrinhBUS();
                    bus.xoaHanhTrinhBUS(maHanhTrinh);
                    panelControl.clearFormData();
                    hienThiDanhSachHanhTrinh();
                }

            }
        });
        //Sua hanh Trinh

        panelControl.addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int rowSeleted = panelTable.getMyTable().getSelectedRow();
                if (rowSeleted != -1) {
                    String maHanhTrinh = panelTable.getMyTable().getValueAt(rowSeleted, 0).toString();
                    HanhTrinhDTO hanhTrinh = new HanhTrinhDTO();
                    hanhTrinh.setMaHanhTrinh(maHanhTrinh);
                    hanhTrinh.setTenHanhTrinh(panelControl.getTxtTenHanhTrinh().getText());
                    hanhTrinh.setSanBayDi(panelControl.getTxtSanBayDi().getText());
                    hanhTrinh.setSanBayDen(panelControl.getTxtSanBayDen().getText());
                    hanhTrinh.setGiaCoBan(Integer.parseInt(panelControl.getTxtGiaCoBan().getText()));

                    HanhTrinhBUS bus = new HanhTrinhBUS();
                    bus.suaHanhTrinhBUS(hanhTrinh);
                    panelControl.clearFormData();
                    hienThiDanhSachHanhTrinh();
                }
            }
        });
        //Hiển thị poup và đưa danh sách lên popup
        panelControl.addShowPopupSanBayDiListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelControl.getTxtSanBayDi().setText("");
                panelControl.showPopupSanBayDi();
                layDanhSachSanBayVaHienThiLenPopup();
                popupModel = "di";
            }
        });
        panelControl.addShowPopupSanBayDenListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelControl.getTxtSanBayDen().setText("");
                panelControl.showPopupSanBayDen();
                layDanhSachSanBayVaHienThiLenPopup();
                popupModel = "den";
            }
        });
        panelControl.getBangLayMa().addRowClickPopup(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String maSanBayPopup = panelControl.getBangLayMa().getMyTable().getValueAt(panelControl.getBangLayMa().getMyTable().getSelectedRow(), 0).toString();
                if ("di".equals(popupModel)) {
                    panelControl.getTxtSanBayDi().setText(maSanBayPopup);
                } else {
                    panelControl.getTxtSanBayDen().setText(maSanBayPopup);
                }
            }
        });
        panelControl.addTxtTimKiemListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e){
                DefaultTableModel modeTimKiem = panelTable.getModel();
                String tenHanhTrinhTimKiem = panelControl.getTxtTenHanhTrinh().getText();
                //mai code tiếp giờ đi ngủ mệt vl
                 
            }
        });
    }
}
