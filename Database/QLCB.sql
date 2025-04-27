﻿﻿DROP DATABASE QLCB
CREATE DATABASE QLCB
GO
USE QLCB;
GO
Drop table SanBay

CREATE TABLE SanBay (
    MaSanBay VARCHAR(20) PRIMARY KEY NOT NULL,
    TenSanBay NVARCHAR(255),
    DiaChi NVARCHAR(MAX) NOT NULL
);
GO
INSERT INTO SanBay (MaSanBay, TenSanBay, DiaChi)
VALUES 
('SB-HV1A2B', N'Sân Bay Nội Bài',  N'Quốc lộ 2, Sóc Sơn, Hà Nội, Việt Nam'),
('SB-HCM3C4D', N'Sân Bay Tân Sơn Nhất', N'Phường 2, Tân Bình, TP. Hồ Chí Minh, Việt Nam'),
('SB-DN5E6F', N'Sân Bay Đà Nẵng', N'Phường Hòa Thuận Đông, Hải Châu, Đà Nẵng, Việt Nam'),
('SB-CT7G8H', N'Sân Bay Cát Bi', N'Quán Trữ, Kiến An, Hải Phòng, Việt Nam'),
('SB-NV9I0J', N'Sân Bay Phú Bài', N'Xã Phú Bài, Hương Thủy, Thừa Thiên-Huế, Việt Nam'),
('SB-QT1K2L', N'Sân Bay Quốc tế Cam Ranh', N'Xã Cam Hải Đông, Cam Lâm, Khánh Hòa, Việt Nam'),
('SB-VQ3M4N', N'Sân Bay Vinh', N'Phường Quán Bàu, Vinh, Nghệ An, Việt Nam'),
('SB-BL5O6P', N'Sân Bay Buôn Ma Thuột', N'Phường Tân Lập, Buôn Ma Thuột, Đắk Lắk, Việt Nam'),
('SB-HDB7Q8R', N'Sân Bay Phú Quốc', N'Dương Tơ, Phú Quốc, Kiên Giang, Việt Nam'),
('SB-SG9T0U', N'Sân Bay Cần Thơ', N'Phường An Hòa, Cần Thơ, Việt Nam');

GO

CREATE TABLE LoaiVe (
    MaLoaiVe VARCHAR(20) PRIMARY KEY NOT NULL,
    TenLoaiVe NVARCHAR(255) NOT NULL
);
INSERT INTO LoaiVe (MaLoaiVe, TenLoaiVe) VALUES ('LV-THU', N'Ve Thường');
INSERT INTO LoaiVe (MaLoaiVe, TenLoaiVe) VALUES ('LV-VIP', N'Ve VIP');
GO
Drop TABLE LoaiMayBay
CREATE TABLE LoaiMayBay (
    MaLoai VARCHAR(20) PRIMARY KEY NOT NULL,
    TenLoai VARCHAR(255) NOT NULL,
    HeSoGiaThuong FLOAT NOT NULL,
    HeSoGiaVip FLOAT NOT NULL
);
GO

INSERT INTO LoaiMayBay (MaLoai, TenLoai, HeSoGiaThuong, HeSoGiaVip)
VALUES
('LMB-A1B2C3D4', N'Boeing 737 MAX', 1.2, 1.8),
('LMB-E5F6G7H8', N'Airbus A320neo', 1.15, 1.75),
('LMB-J9K0L1M2', N'Embraer E195-E2', 1.1, 1.6),
('LMB-N3O4P5Q6', N'Boeing 787 Dreamliner', 1.4, 2.0),
('LMB-R7S8T9U0', N'Airbus A350 XWB', 1.45, 2.1),
('LMB-V1W2X3Y4', N'Bombardier CS300', 1.1, 1.65),
('LMB-Z5A6B7C8', N'Sukhoi Superjet 100', 1.05, 1.55),
('LMB-D9E0F1G2', N'Mitsubishi SpaceJet', 1.08, 1.6),
('LMB-H3I4J5K6', N'Tupolev Tu-204', 1.12, 1.68),
('LMB-L7M8N9O0', N'Comac C919', 1.18, 1.7);

GO

CREATE TABLE MayBay (
    MaMayBay VARCHAR(20) PRIMARY KEY NOT NULL,
    TenMayBay VARCHAR(255) NOT NULL,
    SoLuongGheThuong INT NOT NULL,
    SoLuongGheVip INT NOT NULL,
    TongSoLuongGhe INT NOT NULL,
    MaLoaiMayBay VARCHAR(20) NOT NULL,
    FOREIGN KEY (MaLoaiMayBay) REFERENCES LoaiMayBay(MaLoai)
);
INSERT INTO MayBay (MaMayBay, TenMayBay, SoLuongGheThuong, SoLuongGheVip, TongSoLuongGhe, MaLoaiMayBay)
VALUES
('MB-001', N'Boeing 737 MAX - A', 120, 30, 150, 'LMB-A1B2C3D4'),
('MB-002', N'Airbus A320neo - B', 115, 35, 150, 'LMB-E5F6G7H8'),
('MB-003', N'Embraer E195-E2 - C', 110, 30, 140, 'LMB-J9K0L1M2'),
('MB-004', N'Boeing 787 Dreamliner - D', 180, 70, 250, 'LMB-N3O4P5Q6'),
('MB-005', N'Airbus A350 XWB - E', 190, 60, 250, 'LMB-R7S8T9U0'),
('MB-006', N'Bombardier CS300 - F', 100, 20, 120, 'LMB-V1W2X3Y4'),
('MB-007', N'Sukhoi Superjet 100 - G', 90, 20, 110, 'LMB-Z5A6B7C8'),
('MB-008', N'Mitsubishi SpaceJet - H', 95, 25, 120, 'LMB-D9E0F1G2'),
('MB-009', N'Tupolev Tu-204 - I', 100, 30, 130, 'LMB-H3I4J5K6'),
('MB-010', N'Comac C919 - J', 110, 40, 150, 'LMB-L7M8N9O0');
GO
DROP table HanhTrinh
CREATE TABLE HanhTrinh (
    MaHanhTrinh VARCHAR(20) PRIMARY KEY NOT NULL,
	TenHanhTrinh NVARCHAR(255) NOT NULL,
	MaSanBayDi VARCHAR(20) NOT NULL,
    MaSanBayDen VARCHAR(20) NOT NULL,
    GiaCoBan int NOT NULL,
    FOREIGN KEY (MaSanBayDi) REFERENCES SanBay(MaSanBay),
    FOREIGN KEY (MaSanBayDen) REFERENCES SanBay(MaSanBay)
);
GO
INSERT INTO HanhTrinh (MaHanhTrinh,TenHanhTrinh ,MaSanBayDi, MaSanBayDen, GiaCoBan)
VALUES
('HT-0001',N'Nội Bài - Tân Sơn Nhất','SB-HV1A2B', 'SB-HCM3C4D', 1500000), 
('HT-0002', N'Tân Sơn Nhất - Đà Nẵng','SB-HCM3C4D', 'SB-DN5E6F', 1200000), 
('HT-0003',N'Đà Nẵng - Cát Bi','SB-DN5E6F', 'SB-CT7G8H', 1000000), 
('HT-0004',N'Phú Bài - Cam Ranh','SB-NV9I0J', 'SB-QT1K2L', 1100000),
('HT-0005',N'Phú Quốc - Cần Thơ','SB-HDB7Q8R', 'SB-SG9T0U', 1300000);
GO
DROP TABLE ChuyenBay
CREATE TABLE ChuyenBay (
    MaChuyenBay VARCHAR(20) PRIMARY KEY NOT NULL,
    NgayXuatPhat DATE NOT NULL,
    GioXuatPhat TIME NOT NULL,
    NgayDenNoi DATE NOT NULL,
    GioDenNoi TIME NOT NULL,
    GiaThuong INT NOT NULL,
    GiaVip INT NOT NULL,
    TrangThaiChuyenBay NVARCHAR(50) NOT NULL,
    TongSoLuongGhe INT NOT NULL,
    SoGheDaBan INT NOT NULL,
    SoGheConLai INT NOT NULL,
    MaMayBay VARCHAR(20) NOT NULL,
    MaHanhTrinh VARCHAR(20) NOT NULL,
    FOREIGN KEY (MaMayBay) REFERENCES MayBay(MaMayBay),
    FOREIGN KEY (MaHanhTrinh) REFERENCES HanhTrinh(MaHanhTrinh)
);
INSERT INTO ChuyenBay (MaChuyenBay, NgayXuatPhat, GioXuatPhat, NgayDenNoi, GioDenNoi, GiaThuong, GiaVip, TrangThaiChuyenBay, TongSoLuongGhe, SoGheDaBan, SoGheConLai, MaMayBay, MaHanhTrinh)
VALUES
('CB-0001', '2025-05-01', '08:00:00', '2025-05-01', '10:00:00', 1800000, 2500000, N'Đang mở bán', 150, 0, 150, 'MB-001', 'HT-0001'),
('CB-0002', '2025-05-02', '14:30:00', '2025-05-02', '16:00:00', 1500000, 2100000, N'Đang mở bán', 120, 0, 120, 'MB-002', 'HT-0002'),
('CB-0003', '2025-05-03', '06:00:00', '2025-05-03', '07:30:00', 1300000, 1900000, N'Đang mở bán', 100, 0, 100, 'MB-003', 'HT-0003'),
('CB-0004', '2025-05-04', '18:00:00', '2025-05-04', '19:30:00', 1400000, 2000000, N'Đang mở bán', 90, 0, 90, 'MB-004', 'HT-0004'),
('CB-0005', '2025-05-05', '10:15:00', '2025-05-05', '11:45:00', 1600000, 2200000, N'Đang mở bán', 130, 0, 130, 'MB-005', 'HT-0005');
GO
DROP TABLE Ve

CREATE TABLE Ve (
    MaVe VARCHAR(20) PRIMARY KEY NOT NULL,
    TrangThaiVe NVARCHAR(50) NOT NULL,
    GiaVe INT NOT NULL,
    MaLoaiVe VARCHAR(20) NOT NULL,
    MaChuyenBay VARCHAR(20) NOT NULL,
    FOREIGN KEY (MaLoaiVe) REFERENCES LoaiVe(MaLoaiVe),
    FOREIGN KEY (MaChuyenBay) REFERENCES ChuyenBay(MaChuyenBay)
);
GO

CREATE TABLE KhachHang (
    MaKhachHang VARCHAR(10) PRIMARY KEY NOT NULL,
    Ho VARCHAR(50) NOT NULL,
    Ten VARCHAR(50) NOT NULL,
    GioiTinh VARCHAR(10) NOT NULL,
    NgaySinh DATE NOT NULL,
    SDT VARCHAR(15) NOT NULL,
    email VARCHAR(100) NOT NULL
);
GO
DROP TABLE TaiKhoan
CREATE TABLE TaiKhoan (
    MaTaiKhoan VARCHAR(20) PRIMARY KEY NOT NULL,
    Email VARCHAR(100) NOT NULL,
    MatKhau VARCHAR(255) NOT NULL,
    VaiTro VARCHAR(50) NOT NULL,
    OTP VARCHAR(10),
    HanOTP DATETIME,
    TrangThai VARCHAR(50) NOT NULL
);

GO
INSERT INTO TaiKhoan (MaTaiKhoan, Email, MatKhau, VaiTro, OTP, HanOTP, TrangThai) VALUES
('TK-001', 'admin@example.com', 'matkhau123', 'Admin', NULL, NULL, 'Hoạt Động'),
('TK-002', 'nhanvien1@example.com', 'matkhau123', 'Nhân Viên', NULL, NULL, 'Hoạt Động'),
('TK-003', 'nhanvien2@example.com', 'matkhau123', 'Nhân Viên', NULL, NULL, 'Hoạt Động'),
('TK-004', 'nhanvien3@example.com', 'matkhau123', 'Nhân Viên', NULL, NULL, 'Hoạt Động'),
('TK-005', 'nhanvien4@example.com', 'matkhau123', 'Nhân Viên', NULL, NULL, 'Hoạt Động');
GO
DROP TABLE NhanVien

CREATE TABLE NhanVien (
    MaNhanVien VARCHAR(20) PRIMARY KEY NOT NULL,
    Ho NVARCHAR(50) NOT NULL,
    Ten NVARCHAR(50) NOT NULL,
    GioiTinh NVARCHAR(10) NOT NULL,
    SDT VARCHAR(15) NOT NULL,
    email VARCHAR(100) NOT NULL,
    ChucVu NVARCHAR(50) NOT NULL,
    LuongCoBan INT NOT NULL,
    MaTaiKhoan VARCHAR(20) NOT NULL,
    FOREIGN KEY (MaTaiKhoan) REFERENCES TaiKhoan(MaTaiKhoan)
);
GO
INSERT INTO NhanVien (MaNhanVien, Ho, Ten, GioiTinh, SDT, Email, ChucVu, LuongCoBan, MaTaiKhoan) VALUES
('NV-001', N'Nguyễn', N'An', N'Nam', '0901234567', 'admin@example.com', N'Quản lý', 15000000, 'TK-001'),
('NV-002', N'Trần', N'Bình', N'Nam', '0912345678', 'nhanvien1@example.com', N'Nhân viên bán vé', 8000000, 'TK-002'),
('NV-003', N'Lê', N'Cúc', N'Nữ', '0923456789', 'nhanvien2@example.com', N'Nhân viên kiểm soát', 8500000, 'TK-003'),
('NV-004', N'Phạm', N'Dung', N'Nữ', '0934567890', 'nhanvien3@example.com', N'Nhân viên bán vé', 8000000, 'TK-004'),
('NV-005', N'Hoàng', N'Em', N'Nam', '0945678901', 'nhanvien4@example.com', N'Nhân viên hỗ trợ', 7800000, 'TK-005');


Drop Table KhuyenMai
CREATE TABLE KhuyenMai (
    MaKhuyenMai VARCHAR(20) PRIMARY KEY NOT NULL,
	TenKhuyenMai NVARCHAR(255) NOT NULL,
    NgayBatDau DATE NOT NULL,
    NgayKetThuc DATE NOT NULL,
    PhanTramGiamGia VARCHAR(10) NOT NULL
);
GO

INSERT INTO KhuyenMai (MaKhuyenMai, TenKhuyenMai, NgayBatDau, NgayKetThuc, PhanTramGiamGia) VALUES
('KM0001', N'Khuyến mãi Tết', '2025-01-01', '2025-02-01', '10'),
('KM0002', N'Ưu đãi Hè', '2025-06-01', '2025-06-30', '15'),
('KM0003', N'Giảm giá Quốc tế Lao động', '2025-04-25', '2025-05-05', '20'),
('KM0004', N'Black Friday', '2025-11-25', '2025-11-30', '30'),
('KM0005', N'Giáng sinh yêu thương', '2025-12-20', '2025-12-31', '25'),
('KM0006', N'Back to School', '2025-08-01', '2025-08-31', '18'),
('KM0007', N'Mùa du lịch', '2025-07-01', '2025-07-20', '12'),
('KM0008', N'Flash Sale tháng 9', '2025-09-10', '2025-09-15', '50'),
('KM0009', N'Tri ân khách VIP', '2025-10-01', '2025-10-15', '60'),
('KM0010', N'Khuyến mãi mùa xuân', '2025-03-01', '2025-03-31', '8');




Drop Table CTKhuyenMai
CREATE TABLE CTKhuyenMai (
    MaCTKhuyenMai VARCHAR(20) PRIMARY KEY NOT NULL,
    MaHanhTrinh VARCHAR(20) NOT NULL,
    MaKhuyenMai VARCHAR(20) NOT NULL,
    FOREIGN KEY (MaHanhTrinh) REFERENCES HanhTrinh(MaHanhTrinh),
    FOREIGN KEY (MaKhuyenMai) REFERENCES KhuyenMai(MaKhuyenMai)
);
GO

INSERT INTO CTKhuyenMai (MaCTKhuyenMai, MaHanhTrinh, MaKhuyenMai) VALUES
('CTKM-A12B3C4', 'HT-0001', 'KM0001'),
('CTKM-D56E7F8', 'HT-0002', 'KM0002'),
('CTKM-G91H2J3', 'HT-0003', 'KM0003'),
('CTKM-K45L6M7', 'HT-0004', 'KM0004'),
('CTKM-N89O0P1', 'HT-0005', 'KM0005'),
('CTKM-Q23R4S5', 'HT-0001', 'KM0006'),
('CTKM-T67U8V9', 'HT-0002', 'KM0007'),
('CTKM-W01X2Y3', 'HT-0003', 'KM0008'),
('CTKM-Z45A6B7', 'HT-0004', 'KM0009'),
('CTKM-C89D0E1', 'HT-0005', 'KM0010');


Drop Table HoaDon
CREATE TABLE HoaDon (
    MaHoaDon VARCHAR(10) PRIMARY KEY NOT NULL,
    ThoiGian DATETIME NOT NULL,
    TongTien DECIMAL(10,2) NOT NULL,
    MaNV VARCHAR(10) NOT NULL,
    MaKhuyenMai VARCHAR(20),
    MaKhachHang VARCHAR(10) NOT NULL,
    FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang),
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNhanVien),
    FOREIGN KEY (MaKhuyenMai) REFERENCES KhuyenMai(MaKhuyenMai)
);
GO

Drop Table CTHoaDon
CREATE TABLE CTHoaDon (
    MaCTHD VARCHAR(10) PRIMARY KEY NOT NULL,
    SoLuong INT NOT NULL,
    Gia INT NOT NULL,
    MaHoaDon VARCHAR(10) NOT NULL,
    MaVe VARCHAR(20) NOT NULL,
    FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon),
    FOREIGN KEY (MaVe) REFERENCES Ve(MaVe)
);
GO

INSERT INTO KhachHang (MaKhachHang, Ho, Ten, GioiTinh, NgaySinh, SDT, email)
VALUES 
('KH8A7B3D1', 'Nguyen', 'An', 'Nam', '1990-05-10', '0912345678', 'nguyenan1@gmail.com'),
('KH1F29C83', 'Tran', 'Bich', 'Nu', '1992-02-22', '0934768543', 'tranbich2@gmail.com'),
('KH3D6C90E', 'Le', 'Hoang', 'Nam', '1985-09-11', '0901234567', 'lehoang3@gmail.com'),
('KH7E0A16F', 'Pham', 'Lan', 'Nu', '1994-03-14', '0978123456', 'phamlan4@gmail.com'),
('KH2B7F0D9', 'Nguyen', 'Phong', 'Nam', '1989-07-20', '0918765432', 'nguyenphong5@gmail.com'),
('KH5C6B7E8', 'Hoang', 'Mai', 'Nu', '1996-12-15', '0987654321', 'hoangmai6@gmail.com'),
('KH9E1D2F0', 'Le', 'Minh', 'Nam', '1991-11-25', '0945678910', 'leminh7@gmail.com'),
('KH3A8C5B2', 'Nguyen', 'Kien', 'Nam', '1995-04-07', '0935654321', 'nguyenkien8@gmail.com'),
('KH6F7D2C0', 'Phan', 'Nga', 'Nu', '1988-06-30', '0908123456', 'phannga9@gmail.com'),
('KH1B8D4E3', 'Tran', 'Tam', 'Nu', '1997-08-22', '0976123456', 'trantam10@gmail.com')


--Triger ràng buộc dữ liệu

--Không được xóa mã sân bay khi sân bay đã được chọn ở hành trình
create trigger trg_KhongXoaSanBay
on SanBay instead of delete 
as
begin
	if exists(
		
	)
end


SELECT ht.GiaCoBan, mb.SoLuongGheThuong, mb.SoLuongGheVip,lmb.HeSoGiaThuong, lmb.HeSoGiaVip 
FROM ChuyenBay cb
JOIN HanhTrinh ht On cb.MaHanhTrinh = ht.MaHanhTrinh
JOIN MayBay mb ON cb.MaMayBay = mb.MaMaybay
JOIN LoaiMayBay lmb ON lmb.MaLoai = mb.MaLoaiMayBay
WHERE cb.MaChuyenBay = 'CB-0006';

SELECT *
FROM HanhTrinh