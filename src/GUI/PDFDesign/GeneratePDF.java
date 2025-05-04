package GUI.PDFDesign;

import DTO.KhachHangDTO;
import DTO.KhuyenMaiDTO;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import java.io.File;
import java.io.FileOutputStream;
import javax.swing.table.DefaultTableModel;

public class GeneratePDF {

    public static void xuatPDFHoaDon(KhachHangDTO khachHangDTO, KhuyenMaiDTO khuyenMaiDTO, DefaultTableModel model, int tongSoTien, int tienPhaiTra) {
        try {
            // Tạo file PDF
            Document document = new Document();
            String fileName = "hoa_don.pdf";
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            document.open();

            // Font hỗ trợ tiếng Việt
            BaseFont bf = BaseFont.createFont("src/GUI/forms/arial/ARIAL.TTF", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font normalFont = new Font(bf, 12);
            Font boldFont = new Font(bf, 12, Font.BOLD);
            Font titleFont = new Font(bf, 20, Font.BOLD);
            Font sectionFont = new Font(bf, 14, Font.BOLD);

            // Tiêu đề
            Paragraph title = new Paragraph("HÓA ĐƠN BÁN HÀNG", titleFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            document.add(new Paragraph(" ", normalFont));

            // Bảng thông tin khách hàng
            PdfPTable thongTin = new PdfPTable(2);
            thongTin.setWidthPercentage(50);
            thongTin.setHorizontalAlignment(Element.ALIGN_LEFT);

            PdfPCell[] thongTinKH = {
                new PdfPCell(new Phrase("Mã khách hàng:", normalFont)),
                new PdfPCell(new Phrase(khachHangDTO.getMaKhachHang(), normalFont)),
                new PdfPCell(new Phrase("Họ và tên:", normalFont)),
                new PdfPCell(new Phrase(khachHangDTO.getHo() + " " + khachHangDTO.getTen(), normalFont)),
                new PdfPCell(new Phrase("Email:", normalFont)),
                new PdfPCell(new Phrase(khachHangDTO.getEmail(), normalFont)),
                new PdfPCell(new Phrase("Giới tính:", normalFont)),
                new PdfPCell(new Phrase(khachHangDTO.getGioiTinh(), normalFont)),};

            for (PdfPCell cell : thongTinKH) {
                cell.setBorder(Rectangle.NO_BORDER);
                thongTin.addCell(cell);
            }

            document.add(thongTin);
            document.add(new Paragraph(" ", normalFont));

            // Phần tiêu đề hóa đơn
            Paragraph subTitle = new Paragraph("Thông tin vé đã mua", sectionFont);
            subTitle.setAlignment(Element.ALIGN_CENTER);
            document.add(subTitle);
            document.add(new Paragraph(" ", normalFont));

            // Bảng chi tiết vé
            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            String[] headers = {"Mã chuyến bay", "Số lượng", "Mã vé", "Đơn giá"};
            for (String header : headers) {
                PdfPCell cell = new PdfPCell(new Phrase(header, boldFont));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(cell);
            }

            // Dữ liệu vé (có thể lặp danh sách ở đây sau này)
            for (int row = 0; row < model.getRowCount(); row++) {
                for (int col = 0; col < model.getColumnCount(); col++) {
                    table.addCell(new Phrase(model.getValueAt(row, col).toString(), normalFont));
                }
            }

            document.add(table);

            // Bảng tổng kết
            PdfPTable tableRight = new PdfPTable(2);
            tableRight.setWidthPercentage(40);
            tableRight.setHorizontalAlignment(Element.ALIGN_RIGHT);

            PdfPCell[] summaryCells;

            if (khuyenMaiDTO != null) {
                int phanTramGiam = Integer.parseInt(khuyenMaiDTO.getPhanTramGiamGia());
                int soTienGiam = tongSoTien * phanTramGiam / 100;             

                summaryCells = new PdfPCell[]{
                    new PdfPCell(new Phrase("Tổng tiền:", normalFont)),
                    new PdfPCell(new Phrase("" + tongSoTien + " đ", boldFont)),
                    new PdfPCell(new Phrase("Mã khuyến mãi:", normalFont)),
                    new PdfPCell(new Phrase(khuyenMaiDTO.getMaKhuyenMai(), boldFont)),
                    new PdfPCell(new Phrase("Giảm giá:", normalFont)),
                    new PdfPCell(new Phrase("" + soTienGiam  + " đ", boldFont)),
                    new PdfPCell(new Phrase("Tiền phải trả:", normalFont)),
                    new PdfPCell(new Phrase("" + tienPhaiTra  + " đ", boldFont))
                };
            } else {
                summaryCells = new PdfPCell[]{
                    new PdfPCell(new Phrase("Tổng tiền:", normalFont)),
                    new PdfPCell(new Phrase("" + tongSoTien  + " đ", boldFont)),
                    new PdfPCell(new Phrase("Mã khuyến mãi:", normalFont)),
                    new PdfPCell(new Phrase("", boldFont)),
                    new PdfPCell(new Phrase("Giảm giá:", normalFont)),
                    new PdfPCell(new Phrase("0 đ" , boldFont)),
                    new PdfPCell(new Phrase("Tiền phải trả:", normalFont)),
                    new PdfPCell(new Phrase("" + tongSoTien + " đ", boldFont))
                };
            }

            for (PdfPCell cell : summaryCells) {
                cell.setBorder(Rectangle.NO_BORDER);
                cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                tableRight.addCell(cell);
            }

            document.add(tableRight);
            document.add(new Paragraph(" ", normalFont));

            // Lời cảm ơn
            Paragraph thankYou = new Paragraph("Cảm ơn quý khách đã mua hàng!", normalFont);
            thankYou.setAlignment(Element.ALIGN_CENTER);
            document.add(thankYou);

            document.close();

            System.out.println("Tạo file PDF thành công.");
            System.out.println("PDF được lưu tại: " + new File(fileName).getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
