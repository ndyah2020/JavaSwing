
package Control;
import BUS.ChuyenBayBUS;
import BUS.HanhTrinhBUS;
import BUS.KhachHangBUS;
import BUS.NhanVienBUS;
import BUS.VeBUS;
import DTO.ChuyenBayDTO;
import DTO.HanhTrinhDTO;
import DTO.KhachHangDTO;
import DTO.VeDTO;
import GUI.forms.DatVeControlForm;
import GUI.forms.DatVePanelForm;
import GUI.forms.DatVeTableForm;
import GUI.forms.DatVeTableThemForm;
import GUI.forms.KhachHangForm;
import GUI.forms.ThongTinDatVeForm;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class DatVeController {
    private final DatVeControlForm panelControl;
    private final DatVeTableForm panelTable;
    private final DatVeTableThemForm panelTableThem;
    private final KhachHangForm panelFormKH;
    private final ThongTinDatVeForm panelDatVe;
    private ChuyenBayBUS chuyenBayBUS = new ChuyenBayBUS();
    private HanhTrinhBUS hanhTrinhBUS = new HanhTrinhBUS();
    private VeBUS veBUS = new VeBUS();
    private NhanVienBUS nhanVienBUS = new NhanVienBUS();
    private KhachHangBUS khachHangBUS = new KhachHangBUS();
    
    private ArrayList<ChuyenBayDTO> dsChuyenBay;
    public DatVeController(DatVePanelForm panel) {
        this.panelControl = panel.getDatVeControlForm();
        this.panelTable = panel.getDatVeTableForm();
        this.panelTableThem = panel.getDatVeTableThemForm();
        this.panelFormKH = panel.getKhachHangForm();
        this.panelDatVe = panel.getThongTinDatVeForm();
    }
    
    private void HienThiCacThongTin(ArrayList<ChuyenBayDTO> dsChuyenBay, DefaultTableModel model) {
        model.setRowCount(0);
        for(ChuyenBayDTO cb : dsChuyenBay) {
            HanhTrinhDTO hanhTrinh = hanhTrinhBUS.layMotHanhTrinh(cb.getMaHanhTrinh());
            int veThuong = veBUS.soLuongVeThuongConLaiMoiChuyenBay(cb.getMaChuyenBay());
            int veVip = veBUS.soLuongVeVipConLaiMoiChuyenBay(cb.getMaChuyenBay());
            Vector row = new Vector();
            row.add(cb.getMaChuyenBay());
            row.add(cb.getNgayXuatPhat());
            row.add(cb.getNgayDenNoi());
            row.add(hanhTrinh.getTenHanhTrinh());
            row.add(veThuong);
            row.add(veVip);
            row.add(cb.getGiaThuong());
            row.add(cb.getGiaVip());
            model.addRow(row);
        }
    }
    
    private void hienThiVe(String maChuyenBay, int indexLoaiVe) {
        String[] tenCot = {"Mã Vé", "Loại Vé"};
        panelDatVe.getBangLayMaVe().setcolumnDefaultTableModel(tenCot);
        DefaultTableModel model = panelDatVe.getBangLayMaVe().getModel();
        if(indexLoaiVe == 1) {
            HienThiTable.taiDuLieuTableVepopup(model, veBUS.timKiemVeTHTheoMaChuyenBayChuaDat(maChuyenBay));
        }else if (indexLoaiVe == 2){
            HienThiTable.taiDuLieuTableVepopup(model, veBUS.timKiemVeVipTheoMaChuyenBayChuaDat(maChuyenBay));
        }
     
        panelDatVe.getBangLayMaVe().getMyTable().setModel(model);
    }
    
    public void layDanhSachChuyenBayVaVe() {
        DefaultTableModel model = panelTable.getModel();
        dsChuyenBay = chuyenBayBUS.getDanhSachChuyenBay();
        HienThiCacThongTin(dsChuyenBay, model);
        panelTable.getMyTable().setModel(model);
    }
    
    private void setFormKH(KhachHangDTO kh) {
        panelFormKH.getMa().setText(kh.getMaKhachHang());
        panelFormKH.getHo().setText(kh.getHo());
        panelFormKH.getTen().setText(kh.getTen());
        panelFormKH.setGioiTinh(kh.getGioiTinh());
        panelFormKH.getNgaySinh().setText(kh.getNgaySinh().toString());
        panelFormKH.getSdt().setText(kh.getSdt());
        panelFormKH.getEmail().setText(kh.getEmail());
        panelFormKH.getCccd().setText(kh.getCccd());
    }

    public void xuLySuKien() {
        panelDatVe.addShowPopopMaVe((e) -> {
            panelDatVe.showPopBangLayMaVe();
            String maChuyenBay = panelDatVe.getTxtMaChuyenBay().getText();
            int indexLoaiVe = panelDatVe.getCmbLoaiVe().getSelectedIndex();
           
            if (indexLoaiVe == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn loại vé");
            } else if(maChuyenBay.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn chuyến bay cần đặt");
            } else{
                hienThiVe(maChuyenBay, indexLoaiVe);
            } 
        });
        
     
        panelDatVe.getBangLayMaVe().addRowClickPopup(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int row = panelDatVe.getBangLayMaVe().getMyTable().getSelectedRow();
                if (row != -1) {
                    String maVe = panelDatVe.getBangLayMaVe().getMyTable().getValueAt(row, 0).toString();
                    panelDatVe.getTxtMaVe().setText(maVe);
                    

                }
            }
        });
        
        panelDatVe.addShowPopupMaNhanVien(e -> {
            panelDatVe.showPopBangLayMaNV();
        });
        
        panelDatVe.addCmbLoaiVeListener(e -> {
            panelDatVe.getTxtMaVe().setText("");
            panelDatVe.getTxtGiaVe().setText("");
        });
        
        panelTable.addRowClickListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int row = panelTable.getMyTable().getSelectedRow();
                if(row != -1) {
                    String maChuyenBay = panelTable.getMyTable().getValueAt(row, 0).toString();
                    panelDatVe.getTxtMaChuyenBay().setText(maChuyenBay);
                }
            }
        });
        
        panelDatVe.addBtnKiemTraKH(e -> {
            String cccd = panelDatVe.getTxtCccd().getText();
            System.out.println(cccd);
            if(cccd.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập căn cước công dân");
            }else {
                KhachHangDTO khachHang = khachHangBUS.layMotKhachHangTheoCccd(cccd);
                
                if(khachHang != null) {
                    System.out.println("khach hang kh null");
                    setFormKH(khachHang);
                }else {
                    JOptionPane.showMessageDialog(null, "Khách Hàng không tồn tại vui lòng nhập thông tin mới cho khách hàng");
                }
            }
        });
        
    }   
}
