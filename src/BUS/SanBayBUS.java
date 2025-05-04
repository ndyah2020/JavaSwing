package BUS;

import DAO.SanBayDAO;
import DTO.SanBayDTO;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SanBayBUS {
    private ArrayList<SanBayDTO> danhSachSanBay;
    private final SanBayDAO dao;
    
    public SanBayBUS() {
        dao = new SanBayDAO();
        danhSachSanBay = new ArrayList<>();
        layDanhSachSanBay();
    }
    
    private void layDanhSachSanBay() {
        danhSachSanBay = dao.layDanhSach();
    }
    
    public ArrayList<SanBayDTO> getDanhSachSanBay() {
        if(danhSachSanBay.isEmpty()){
            layDanhSachSanBay();
        }
        return danhSachSanBay;
    }
    
    public void themSanBay(SanBayDTO sanBay) {
        if(dao.themSanBay(sanBay)){
            danhSachSanBay.add(sanBay);
        }
    }
    public void xoaSanBay(String maSanBay) {
        if(dao.xoaSanBay(maSanBay)){
            danhSachSanBay.removeIf(sb -> sb.getMaSanBay().equals(maSanBay));
        }
    }
    public void suaSanBay(SanBayDTO sanBay) {
        if(dao.suaSanBay(sanBay)){
            for(int i = 0; i < danhSachSanBay.size(); i++){
                if(danhSachSanBay.get(i).getMaSanBay().equals(sanBay.getMaSanBay())){
                   danhSachSanBay.set(i, sanBay);
                   break;
                }
            }
        }
    }
    public ArrayList<SanBayDTO> danhSachTimTheoTenSanBay(String tenSanBay) {
        if(danhSachSanBay.isEmpty()){
            layDanhSachSanBay();
        }
        ArrayList<SanBayDTO> danhSachTimThay = new ArrayList<>();
            for (SanBayDTO sb : danhSachSanBay) {
                if (sb.getTenSanBay().toLowerCase().trim().contains(tenSanBay.toLowerCase().trim())) {
                    danhSachTimThay.add(sb);
                }
            }
        return danhSachTimThay;
    }

    public void importFromExcel(File file) {
        try (FileInputStream fis = new FileInputStream(file);
            Workbook workbook = WorkbookFactory.create(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            boolean firstRow = true;
            for (Row row : sheet) {
                if (firstRow) {
                    firstRow = false;
                    continue;
                }

                SanBayDTO sb = new SanBayDTO();
                sb.setMaSanBay(row.getCell(0).toString());
                sb.setTenSanBay(row.getCell(1).toString());
                sb.setDiaChi(row.getCell(2).toString());

                danhSachSanBay.add(sb);
                dao.themSanBay(sb);
            }
            JOptionPane.showMessageDialog(null, "Import thành công từ Excel!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi khi import file Excel");
        }
    }
}
