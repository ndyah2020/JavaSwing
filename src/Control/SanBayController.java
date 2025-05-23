package Control;

import BUS.HanhTrinhBUS;
import BUS.SanBayBUS;
import DTO.HanhTrinhDTO;
import DTO.SanBayDTO;
import GUI.forms.SanBayControlForm;
import GUI.forms.SanBayPanelForm;
import GUI.forms.SanBayTableForm;
import GUI.panel.swing.MyTable;
import org.apache.poi.ss.usermodel.Sheet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.Vector;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class SanBayController {

    private ArrayList<SanBayDTO> dsSanBay;
    private SanBayBUS bus = new SanBayBUS();
    private final SanBayTableForm panelTable;
    private final SanBayControlForm panelControl;
    private final SanBayBUS sanBayBUS = new SanBayBUS();
    
    public SanBayController(SanBayPanelForm panel) {
        this.panelTable = panel.getSanBayTableForm();
        this.panelControl = panel.getSanBayControlForm();
       
    } 
    
    public void hienThiDanhSachSanBay() {
        DefaultTableModel modelDs = panelTable.getModel();
        dsSanBay = sanBayBUS.getDanhSachSanBay();
         HienThiTable.taiDuLieuLenTabelSanBay(modelDs, dsSanBay);
        panelTable.getMyTable().setModel(modelDs);
    }

    private SanBayDTO layMotSanBay(String maSanBay) {
        SanBayDTO sanBay = new SanBayDTO();
        for (SanBayDTO sb : dsSanBay) {
            if (sb.getMaSanBay().equals(maSanBay)) {
                sanBay = sb;
                break;
            }
        }
        return sanBay;
    }
    
    //tạo mã random
    public String generateRandom() {
        String prefix = "SB";
        String random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8).toUpperCase();
        while (isCodeDuplicate(random)) {
            random = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8).toUpperCase();
        }
        return prefix + "-" + random;
    }

    //Kiểm tra mã duy nhất
    private boolean isCodeDuplicate(String code) {
        for (SanBayDTO sb : dsSanBay) {
            if (sb.getMaSanBay().equals(code)) {
                return true;
            }
        }
        return false;
    }
    private void setForm(SanBayDTO sanBay) {
        panelControl.getTxtTenSanBay().setText(sanBay.getTenSanBay());
        panelControl.getTxtDiaChi().setText(sanBay.getDiaChi());
    }
    
    private boolean kiemTraSanBayCoDuocSuDung(String maSanBay) {
        HanhTrinhBUS hanhTrinhBUS = new HanhTrinhBUS();
        ArrayList<HanhTrinhDTO> dsHanhTrinh = hanhTrinhBUS.getDanhSachHanhTrinhBUS();
        for (HanhTrinhDTO ht : dsHanhTrinh) {
            if (ht.getSanBayDen().equals(maSanBay) || ht.getSanBayDi().equals(maSanBay)) {              
                return true;
            }
        }
        return false;
    }

    public void exportToExcel() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn đường dẫn lưu file Excel");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("XLSX files", "xlsx");
        fileChooser.setFileFilter(filter);
        fileChooser.setAcceptAllFileFilterUsed(false);

        int userChoice = fileChooser.showSaveDialog(null);
        if (userChoice == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            if (!filePath.toLowerCase().endsWith(".xlsx")) {
                filePath += ".xlsx";
            }

            DefaultTableModel model = (DefaultTableModel) panelTable.getModel();
            Workbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = (XSSFSheet) workbook.createSheet("Sân bay");
//tao header row
            XSSFRow headerRow = sheet.createRow(0);
            for (int i = 0; i < model.getColumnCount(); i++) {
                headerRow.createCell(i).setCellValue(model.getColumnName(i));
            }
//tao data row
            for (int i = 0; i < model.getRowCount(); i++) {
                XSSFRow dataRow = sheet.createRow(i + 1);
                for (int j = 0; j < model.getColumnCount(); j++) {
                    TableModel tableModel = panelTable.getModel();
                    dataRow.createCell(j).setCellValue(tableModel.getValueAt(i, j).toString());
                }
            }
//chinh size cot
            for(int i = 0; i < model.getColumnCount(); i++){
                sheet.autoSizeColumn(i);
            }
//viet file
            JOptionPane.showMessageDialog(null, "Xuất file thành công");
            
            try {
                FileOutputStream fileOut = new FileOutputStream(filePath);
                workbook.write(fileOut);
                fileOut.close();
                workbook.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void xuLySuKien() {
        //tai du lieu lem text field
        panelTable.addRowClick(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int rowSeleted = panelTable.getMyTable().getSelectedRow();
                
                if (rowSeleted != -1) {
                    String maSanBay = panelTable.getMyTable().getValueAt(rowSeleted, 0).toString();
                    setForm(layMotSanBay(maSanBay));
                }
            }
        });
        //thêm sân bay mới
        panelControl.addThemListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ten = panelControl.getTxtTenSanBay().getText().trim();
                String diaChi = panelControl.getTxtDiaChi().getText().trim();

                if (ten.isEmpty() || diaChi.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;
                }
                SanBayDTO sanBay = new SanBayDTO();
                sanBay.setMaSanBay(generateRandom());
                sanBay.setTenSanBay(ten);
                sanBay.setDiaChi(diaChi);

              
                sanBayBUS.themSanBay(sanBay);

                panelControl.clearFormData();
                hienThiDanhSachSanBay();
            }
        });
        //Xóa sân bay
        panelControl.addXoaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {               
                int rowSeleted = panelTable.getMyTable().getSelectedRow();
                if (rowSeleted != -1) {
                    String maSanBay = panelTable.getMyTable().getValueAt(rowSeleted, 0).toString();
                    if(!kiemTraSanBayCoDuocSuDung(maSanBay)){
                        sanBayBUS.xoaSanBay(maSanBay);
                        panelControl.clearFormData();
                        hienThiDanhSachSanBay();
                    }else
                        JOptionPane.showMessageDialog(null, "Không thể xóa ! Sân Bay này đã được áp dụng vào hành trình ");
                    
                }
            }
        });
        //Sửa sân bay
        panelControl.addSuaListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ten = panelControl.getTxtTenSanBay().getText();
                String diaChi = panelControl.getTxtDiaChi().getText();

                if (ten.isEmpty() || diaChi.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin!");
                    return;
                }
                int selectedRow = panelTable.getMyTable().getSelectedRow();
                if (selectedRow != -1) {
                    String maSanBay = panelTable.getMyTable().getValueAt(selectedRow, 0).toString();
                    if (!kiemTraSanBayCoDuocSuDung(maSanBay)) {
                        SanBayDTO sanBay = new SanBayDTO();
                        sanBay.setMaSanBay(maSanBay);
                        sanBay.setTenSanBay(ten);
                        sanBay.setDiaChi(diaChi);
                        sanBayBUS.suaSanBay(sanBay);
                        panelControl.clearFormData();
                        hienThiDanhSachSanBay();
                    }else
                        JOptionPane.showMessageDialog(null, "Không thể sửa ! Sân Bay này đã được áp dụng vào hành trình ");          
                } else {
                    JOptionPane.showMessageDialog(null, "Vui lòng chọn một dòng để sửa!");
                }
            }
        });
        //tim kiem danh sach 
        panelControl.addTimKiemListenter(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                DefaultTableModel modelTimKiem = panelTable.getModel();
                String tenNhapVao = panelControl.getTxtTimKiem().getText();
                if(!tenNhapVao.isEmpty()){
                    ArrayList<SanBayDTO> danhSachSBMoi = sanBayBUS.danhSachTimTheoTenSanBay(tenNhapVao);
                    HienThiTable.taiDuLieuLenTabelSanBay(modelTimKiem, danhSachSBMoi);
                    panelTable.getMyTable().setModel(modelTimKiem);
                }else{
                    hienThiDanhSachSanBay();
                }
                
            }
        });

        panelControl.addExportListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                exportToExcel();
            }
        });

        panelControl.addImportListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Chọn file Excel để import");

                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();

                    bus.importFromExcel(file);
                    hienThiDanhSachSanBay();
                }
            }
        });
        
        panelControl.addTimKiemListenter(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                String tuKhoa = panelControl.getTxtTimKiem().getText().trim().toLowerCase();

                DefaultTableModel modelGoc = (DefaultTableModel) panelTable.getModel();
                int columnCount = panelTable.getMyTable().getColumnCount();

                String[] columnNames = new String[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    columnNames[i] = panelTable.getMyTable().getColumnName(i);
                }

                if (!tuKhoa.isEmpty()) {
                    DefaultTableModel modelLoc = new DefaultTableModel(columnNames, 0);

                    for (int i = 0; i < modelGoc.getRowCount(); i++) {
                        boolean match = false;

                        for (int j = 0; j < columnCount; j++) {
                            Object cell = modelGoc.getValueAt(i, j);
                            if (cell != null && cell.toString().toLowerCase().contains(tuKhoa)) {
                                match = true;
                            break;
                            }
                        }

                    if (match) {
                        Object[] rowData = new Object[columnCount];
                        for (int j = 0; j < columnCount; j++) {
                            rowData[j] = modelGoc.getValueAt(i, j);
                        }
                        modelLoc.addRow(rowData);
                    }
                }

                panelTable.getMyTable().setModel(modelLoc);
                } else {
                    hienThiDanhSachSanBay();
                }
            }
        });
    }
}
