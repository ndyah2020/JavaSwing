package Control;
import DTO.SanBayDTO;
import BUS.HanhTrinhBUS;
import BUS.SanBayBUS;
import DTO.HanhTrinhDTO;
import GUI.forms.HanhTrinhPanelForm;
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
    private final HanhTrinhPanelForm hanhTrinhPanel;
    
    public HanhTrinhController(HanhTrinhPanelForm panel) {
        this.hanhTrinhPanel = panel;
        hanhTrinhPanel.getHanhTrinhControlForm().getTxtSanBayDi().setEditable(false);
        hanhTrinhPanel.getHanhTrinhControlForm().getTxtSanBayDen().setEditable(false);
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
        hanhTrinhPanel.getHanhTrinhControlForm().getBangLayMa().setcolumnDefaultTableModel(tenCot);

        DefaultTableModel model = hanhTrinhPanel.getHanhTrinhControlForm().getBangLayMa().getModel();
        SanBayBUS bus = new SanBayBUS();
        ArrayList<SanBayDTO> dsSanBay = bus.getDanhSachSanBay();
        setModelSanBay(model, dsSanBay);
        hanhTrinhPanel.getHanhTrinhControlForm().getBangLayMa().getMyTable().setModel(model);
    }
    
    public void hienThiDanhSachHanhTrinh() {
        HanhTrinhBUS bus = new HanhTrinhBUS();
        DefaultTableModel modelDsHT = hanhTrinhPanel.getHanhTrinhTableForm().getModel();
        dsHanhTrinh = bus.getDanhSachHanhTrinhBUS();
        taiDuLieuLenTabel(modelDsHT, dsHanhTrinh);
        hanhTrinhPanel.getHanhTrinhTableForm().getMyTable().setModel(modelDsHT);
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
        hanhTrinhPanel.getHanhTrinhTableForm().addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int rowSeleted = hanhTrinhPanel.getHanhTrinhTableForm().getMyTable().getSelectedRow();
                if (rowSeleted != -1) {
                    HanhTrinhDTO hanhTrinh = dsHanhTrinh.get(rowSeleted);
                    hanhTrinhPanel.getHanhTrinhControlForm().getTxtSanBayDi().setText(hanhTrinh.getSanBayDi());
                    hanhTrinhPanel.getHanhTrinhControlForm().getTxtSanBayDen().setText(hanhTrinh.getSanBayDen());
                    hanhTrinhPanel.getHanhTrinhControlForm().getTxtGiaCoBan().setText("" + hanhTrinh.getGiaCoBan());

                }
            }
        });
        hanhTrinhPanel.getHanhTrinhControlForm().addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sanBayDi = hanhTrinhPanel.getHanhTrinhControlForm().getTxtSanBayDi().getText();
                String sanBayDen = hanhTrinhPanel.getHanhTrinhControlForm().getTxtSanBayDen().getText();
                int giaCoBan =Integer.parseInt( hanhTrinhPanel.getHanhTrinhControlForm().getTxtGiaCoBan().getText());
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
                hanhTrinhPanel.getHanhTrinhControlForm().clearFormData();
            }
        });
        hanhTrinhPanel.getHanhTrinhControlForm().addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        //Hiển thị poup và đưa danh sách lên popup
        hanhTrinhPanel.getHanhTrinhControlForm().addShowPopupSanBayDiListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                hanhTrinhPanel.getHanhTrinhControlForm().showPopupSanBayDi();
                layDanhSachSanBayVaHienThiLenPopup();
            }
        });
        
        hanhTrinhPanel.getHanhTrinhControlForm().addShowPopupSanBayDenListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                hanhTrinhPanel.getHanhTrinhControlForm().showPopupSanBayDen();
                layDanhSachSanBayVaHienThiLenPopup();
            }
        });
    }
}
