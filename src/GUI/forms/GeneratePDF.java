package GUI.forms;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.File;
import java.io.FileOutputStream;

public class GeneratePDF {
    public static void main(String[] args) {
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream("hoa_don.pdf"));
            document.open();

            // Load font Arial hỗ trợ tiếng Việt
            BaseFont bf = BaseFont.createFont("src/GUI/forms/arial/ARIAL.TTF", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font normalFont = new Font(bf, 12);
            Font normalFontBold = new Font(bf, 12, Font.BOLD);
            Font mediumFont = new Font(bf, 14, Font.BOLD);
            Font boldFont = new Font(bf, 20, Font.BOLD);

            // Tiêu đề
            Paragraph title = new Paragraph("HÓA ĐƠN BÁN HÀNG", boldFont);
            title.setAlignment(Element.ALIGN_CENTER);
            document.add(title);
            document.add(new Paragraph(" ", normalFont));

            // Thông tin khách hàng
            PdfPTable thongTin = new PdfPTable(2); // 2 cột
            thongTin.setWidthPercentage(50);
            thongTin.setHorizontalAlignment(Element.ALIGN_LEFT);

            // Không có viền
            PdfPCell[] thongTinKhachHang = {
                new PdfPCell(new Phrase("Mã khách hàng:", normalFont)),
                new PdfPCell(new Phrase("KH0001", normalFont)),
                new PdfPCell(new Phrase("Họ và tên:", normalFont)),
                new PdfPCell(new Phrase("Nguyễn Văn A", normalFont)),
                new PdfPCell(new Phrase("Email:", normalFont)),
                new PdfPCell(new Phrase("nguyenvana@gmail.com", normalFont)),
                new PdfPCell(new Phrase("Giới tính:", normalFont)),
                new PdfPCell(new Phrase("Nam", normalFont))
            };

            for (PdfPCell cell : thongTinKhachHang) {
                cell.setBorder(Rectangle.NO_BORDER);
            }
            for (PdfPCell cell : thongTinKhachHang) {
                thongTin.addCell(cell);
            }

            document.add(thongTin);

            
            document.add(new Paragraph(" ", normalFont));
            
            Paragraph thongTinHoaDon = new Paragraph("Thông tin vé đã mua", mediumFont);
            thongTinHoaDon.setAlignment(Element.ALIGN_CENTER);
            document.add(thongTinHoaDon);
            document.add(new Paragraph(" ", normalFont));

            // Bảng sản phẩm
            PdfPTable table = new PdfPTable(4);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            String[] headers = {"Mã Chuyến bay", "Mã vé", "Số lượng", "Đơn giá"};
            for (String header : headers) {
                PdfPCell cell = new PdfPCell(new Phrase(header, normalFont));
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                table.addCell(cell);
            }

            // Dữ liệu sản phẩm
            table.addCell(new Phrase("Laptop Dell XPS 13", normalFont));
            table.addCell(new Phrase("1", normalFont));
            table.addCell(new Phrase("30,000,000", normalFont));
            table.addCell(new Phrase("30,000,000", normalFont));

            table.addCell(new Phrase("Chuột không dây", normalFont));
            table.addCell(new Phrase("2", normalFont));
            table.addCell(new Phrase("300,000", normalFont));
            table.addCell(new Phrase("600,000", normalFont));

            document.add(table);

            PdfPTable tableRight = new PdfPTable(2);
            tableRight.setWidthPercentage(40); // Chiếm 40% chiều ngang trang
            tableRight.setHorizontalAlignment(Element.ALIGN_RIGHT); // Canh phải

            // Không viền, canh phải từng ô
            PdfPCell tongTienLabel = new PdfPCell(new Phrase("Tổng tiền:", normalFont));
            PdfPCell tongTien = new PdfPCell(new Phrase("30,600,000", normalFontBold));
            
            PdfPCell maKhuyenMaiLabel = new PdfPCell(new Phrase("Mã khuyến mãi:", normalFont));           
            PdfPCell maKhuyenMai = new PdfPCell(new Phrase("KM0001", normalFontBold));
            
            PdfPCell giamGiaLabel = new PdfPCell(new Phrase("Giảm giá:", normalFont));            
            PdfPCell giamGia = new PdfPCell(new Phrase("600,000", normalFontBold));
            
            PdfPCell tienPhaiTraLabel = new PdfPCell(new Phrase("Tiền phải trả:", normalFont));
            PdfPCell tienPhaiTra = new PdfPCell(new Phrase("30,000,000", normalFontBold));

            // Set căn phải và không viền cho từng ô
            PdfPCell[] cells = {tongTienLabel, tongTien, 
                                maKhuyenMaiLabel, maKhuyenMai, 
                                giamGiaLabel, giamGia, 
                                tienPhaiTraLabel, tienPhaiTra};
            for (PdfPCell cell : cells) {
                cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
                cell.setBorder(Rectangle.NO_BORDER);
                tableRight.addCell(cell);
            }

            document.add(tableRight);

            // Ghi chú
            document.add(new Paragraph("", normalFont));
            document.add(new Paragraph("Cảm ơn quý khách đã mua hàng!", normalFont));

            document.close();
            System.out.println("Tạo file PDF thành công.");
            System.out.println("PDF được tạo tại: " + new File("hoa_don.pdf").getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
