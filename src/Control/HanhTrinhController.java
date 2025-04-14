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
    
    public HanhTrinhController(HanhTrinhPanelForm panel) {
        this.panelTable = panel.getHanhTrinhTableForm();     
        this.panelControl = panel.getHanhTrinhControlForm();

        panelControl.getTxtSanBayDi().setEditable(false);
        panelControl.getTxtSanBayDen().setEditable(false);
    }

    
    private void taiDuLieuLenTabel(DefaultTableModel model, ArrayList<HanhTrinhDTO> danhSach) {
        model.setRowCount(0);
        for(HanhTrinhDTO ht : danhSach) {
            Vector row = new Vector();
            row.add(ht.getMaHanhTrinh());
            row.add(ht.getSanBayDi());
            row.add(ht.getSanBayDen());
            row.add(ht.getGiaCoBan());
            model.addRow(row);
        }
    }
    private void setModelSanBay(DefaultTableModel model, ArrayList<SanBayDTO> danhSach){
        model.setRowCount(0);
        for(SanBayDTO sb : danhSach) {
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
                int giaCoBan =Integer.parseInt(panelControl.getTxtGiaCoBan().getText());
                if (sanBayDi.isEmpty() || sanBayDen.isEmpty() || giaCoBan < 0) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;
                }
                HanhTrinhDTO hanhTrinh = new HanhTrinhDTO();
                hanhTrinh.setMaHanhTrinh(generateRandom());
                hanhTrinh.setSanBayDi(sanBayDi);
                hanhTrinh.setSanBayDen(sanBayDen);
                hanhTrinh.setGiaCoBan(giaCoBan);
                
                HanhTrinhBUS bus = new HanhTrinhBUS();
                bus.themHanhTrinh(hanhTrinh);
                panelControl.clearFormData();
            }
        });
        panelControl.addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        //Hiển thị poup và đưa danh sách lên popup
        panelControl.addShowPopupSanBayDiListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelControl.showPopupSanBayDi();
                layDanhSachSanBayVaHienThiLenPopup();
                
                
            }
        });
        
        panelControl.addShowPopupSanBayDenListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelControl.showPopupSanBayDen();
                layDanhSachSanBayVaHienThiLenPopup();
            }
        });
    }
}
