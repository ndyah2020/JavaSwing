package Control;

import BUS.ChuyenBayBUS;
import BUS.HanhTrinhBUS;
import BUS.MayBayBUS;
import DTO.ChuyenBayDTO;
import DTO.HanhTrinhDTO;
import DTO.MayBayDTO;
import GUI.forms.ChuyenBayControlForm;
import GUI.forms.ChuyenBayForm;
import GUI.forms.ChuyenBayPanelForm;
import GUI.forms.ChuyenBayTableForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.sql.Time;

public class ChuyenBayController {
    private ArrayList<ChuyenBayDTO> dsChuyenBay;
    private final ChuyenBayForm panelForm;
    private final ChuyenBayControlForm panelControl;
    private final ChuyenBayTableForm panelTable;
    private String popupModel = "";
    
    public ChuyenBayController(ChuyenBayPanelForm panel) {
        this.panelForm = panel.getChuyenBayForm();
        this.panelControl = panel.getChuyenBayControlForm();
        this.panelTable = panel.getChuyenBayTableForm();
    }
    
    
    public void layDanhSachChuyenBay() {
        DefaultTableModel modelDS = panelTable.getModel();
        ChuyenBayBUS bus = new ChuyenBayBUS();
        dsChuyenBay = bus.getDanhSachChuyenBay();
        HienThiTable.taiDuLieuTableChuyenBay(modelDS, dsChuyenBay);
        panelTable.getMyTable().setModel(modelDS);
    }
    
    private ChuyenBayDTO layMotChuyenBay(String maChuyenBay) {
        ChuyenBayDTO chuyenBay = new ChuyenBayDTO();
        for (ChuyenBayDTO cb : dsChuyenBay) {
            if (cb.getMaChuyenBay().equals(maChuyenBay)) {
                chuyenBay = cb;
                break;
            }
        }
        return chuyenBay;
    }
    
    private void setForm(ChuyenBayDTO chuyenBay) {
        panelForm.getTxtMaChuyenBay().setText(chuyenBay.getMaChuyenBay());
        
        
        panelForm.getTxtNgayXuatPhat().setText(chuyenBay.getNgayXuatPhat().toString());
        Time gioDi = chuyenBay.getGioXuatPhat();
        panelForm.getSpinnerGioXuatPhat().setValue(new java.util.Date(gioDi.getTime()));

        
        panelForm.getTxtNgayDenNoi().setText(chuyenBay.getNgayDenNoi().toString());
        panelForm.getSpinnerGioDenNoi().setValue(chuyenBay.getGioDenNoi());
        
        panelForm.getTxtGiaThuong().setText(String.valueOf(chuyenBay.getGiaThuong()));
        panelForm.getTxtGiaVip().setText(String.valueOf(chuyenBay.getGiaVip()));
        panelForm.getTxtTrangThai().setText(chuyenBay.getTrangThaiChuyenBay());
        panelForm.getTxtTongSLGhe().setText(String.valueOf(chuyenBay.getTongSoLuongGhe()));
        panelForm.getTxtSoGheDaBan().setText(String.valueOf(chuyenBay.getSoGheDaBan()));
        panelForm.getTxtSoGheConLai().setText(String.valueOf(chuyenBay.getSoGheConLai()));
        panelForm.getTxtMaMayBay().setText(chuyenBay.getMaMayBay());
        panelForm.getTxtMaHanhTrinh().setText(chuyenBay.getMaHanhTrinh());
    }


    public void xuLySuKien() {
        //set các dữ liệu lên text field
        panelTable.addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowSelected = panelTable.getMyTable().getSelectedRow();
                if(rowSelected != -1 ) {
                  String maChuyenBay = panelTable.getMyTable().getValueAt(rowSelected, 0).toString();
                  setForm(layMotChuyenBay(maChuyenBay));
                }
            } 
        });
        //Xóa form
        panelControl.addXoaFormListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelForm.clearForm();
            }
        });
        //show pop
        panelForm.addShowPopupMaHanhTrinh(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelForm.showPopBangLayMaHanhTrinh();
                String[] tenCot = {"Mã Hành Trình", "Tên Hành Trình"};
                panelForm.getBangLayMaHanhTrinh().setcolumnDefaultTableModel(tenCot);
                DefaultTableModel model = panelForm.getBangLayMaHanhTrinh().getModel();
                HanhTrinhBUS bus = new HanhTrinhBUS();
                ArrayList<HanhTrinhDTO> hanHTrinh = bus.getDanhSachHanhTrinhBUS();
                HienThiTable.taiDuLieuTableHanhTrinh(model, hanHTrinh);
            }
        });
        
        panelForm.addShowPopupMaMayBay(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelForm.showPopBangLayMaMayBay();
                String[] tenCot = {"Mã Máy Bay", "Tên Máy Bay"};
                panelForm.getBangLayMaMayBay().setcolumnDefaultTableModel(tenCot);
                DefaultTableModel model = panelForm.getBangLayMaMayBay().getModel();
                MayBayBUS bus = new MayBayBUS();
                ArrayList<MayBayDTO> mayBay = bus.getDanhSachMayBayBUS();
                HienThiTable.taiDuLieuTabelMayBay(model, mayBay);
            }
        });
    }
}
