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
('SB-SG9T0U', N'Sân Bay Cần Thơ', N'Phường An Hòa, Cần Thơ, Việt Nam'),
('SB-QN1A3B', N'Sân Bay Vân Đồn', N'Xã Đoàn Kết, Vân Đồn, Quảng Ninh, Việt Nam'),
('SB-LD2C4D', N'Sân Bay Liên Khương', N'Quốc lộ 20, Liên Nghĩa, Đức Trọng, Lâm Đồng, Việt Nam'),
('SB-PY3E5F', N'Sân Bay Tuy Hòa', N'Phường Phú Đông, Tuy Hòa, Phú Yên, Việt Nam'),
('SB-TH4G6H', N'Sân Bay Thọ Xuân', N'Xã Sao Vàng, Thọ Xuân, Thanh Hóa, Việt Nam'),
('SB-KG5I7J', N'Sân Bay Rạch Giá', N'Phường Vĩnh Lợi, Rạch Giá, Kiên Giang, Việt Nam'),
('SB-NT6K8L', N'Sân Bay Nha Trang', N'Phường Phước Hòa, Nha Trang, Khánh Hòa, Việt Nam'),
('SB-DL7M9N', N'Sân Bay Điện Biên Phủ', N'Phường Thanh Trường, TP. Điện Biên Phủ, Điện Biên, Việt Nam'),
('SB-HG8O0P', N'Sân Bay Hà Giang', N'TP. Hà Giang, Hà Giang, Việt Nam'),
('SB-BD9Q1R', N'Sân Bay Phú Tài', N'Phường Nhơn Bình, Quy Nhơn, Bình Định, Việt Nam'),
('SB-TT0S2T', N'Sân Bay Thành Sơn', N'Thanh Sơn, Phan Rang - Tháp Chàm, Ninh Thuận, Việt Nam');

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
('HT-0005',N'Phú Quốc - Cần Thơ','SB-HDB7Q8R', 'SB-SG9T0U', 1300000),
('HT-0006', N'Nội Bài - Đà Nẵng', 'SB-HV1A2B', 'SB-DN5E6F', 1250000),
('HT-0007', N'Tân Sơn Nhất - Phú Quốc', 'SB-HCM3C4D', 'SB-HDB7Q8R', 1350000),
('HT-0008', N'Đà Nẵng - Cần Thơ', 'SB-DN5E6F', 'SB-SG9T0U', 1200000),
('HT-0009', N'Cát Bi - Vinh', 'SB-CT7G8H', 'SB-VQ3M4N', 950000),
('HT-0010', N'Cam Ranh - Buôn Ma Thuột', 'SB-QT1K2L', 'SB-BL5O6P', 1150000),
('HT-0011', N'Phú Bài - Phú Quốc', 'SB-NV9I0J', 'SB-HDB7Q8R', 1400000),
('HT-0012', N'Vinh - Tân Sơn Nhất', 'SB-VQ3M4N', 'SB-HCM3C4D', 1250000),
('HT-0013', N'Buôn Ma Thuột - Nội Bài', 'SB-BL5O6P', 'SB-HV1A2B', 1350000),
('HT-0014', N'Phú Quốc - Cam Ranh', 'SB-HDB7Q8R', 'SB-QT1K2L', 1200000),
('HT-0015', N'Cần Thơ - Đà Nẵng', 'SB-SG9T0U', 'SB-DN5E6F', 1150000),
('HT-0016', N'Vân Đồn - Liên Khương', 'SB-QN1A3B', 'SB-LD2C4D', 1250000),
('HT-0017', N'Tuy Hòa - Thọ Xuân', 'SB-PY3E5F', 'SB-TH4G6H', 1100000),
('HT-0018', N'Rạch Giá - Nha Trang', 'SB-KG5I7J', 'SB-NT6K8L', 950000),
('HT-0019', N'Điện Biên - Hà Giang', 'SB-DL7M9N', 'SB-HG8O0P', 1000000),
('HT-0020', N'Phú Tài - Thành Sơn', 'SB-BD9Q1R', 'SB-TT0S2T', 1100000),
('HT-0021', N'Thanh Sơn - Vinh', 'SB-TT0S2T', 'SB-VQ3M4N', 1200000),
('HT-0022', N'Nội Bài - Vân Đồn', 'SB-HV1A2B', 'SB-QN1A3B', 900000),
('HT-0023', N'Cam Ranh - Liên Khương', 'SB-QT1K2L', 'SB-LD2C4D', 1000000),
('HT-0024', N'Buôn Ma Thuột - Tuy Hòa', 'SB-BL5O6P', 'SB-PY3E5F', 850000),
('HT-0025', N'Nha Trang - Tân Sơn Nhất', 'SB-NT6K8L', 'SB-HCM3C4D', 1150000);
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
Drop Table KhachHang
CREATE TABLE KhachHang (
    MaKhachHang VARCHAR(20) PRIMARY KEY NOT NULL,
    Ho VARCHAR(50) NOT NULL,
    Ten VARCHAR(50) NOT NULL,
    GioiTinh VARCHAR(10) NOT NULL,
    NgaySinh DATE NOT NULL,
    SDT VARCHAR(15) NOT NULL,
    email VARCHAR(100) NOT NULL,
	cccd VARCHAR(12) NOT NULL,
);
INSERT INTO KhachHang (MaKhachHang, Ho, Ten, GioiTinh, NgaySinh, SDT, email, cccd)
VALUES 
('KH8A7B3D1', 'Nguyen', 'An', 'Nam', '1990-05-10', '0912345678', 'nguyenan1@gmail.com', '012345678901'),
('KH1F29C83', 'Tran', 'Bich', 'Nu', '1992-02-22', '0934768543', 'tranbich2@gmail.com', '012345678902'),
('KH3D6C90E', 'Le', 'Hoang', 'Nam', '1985-09-11', '0901234567', 'lehoang3@gmail.com', '012345678903'),
('KH7E0A16F', 'Pham', 'Lan', 'Nu', '1994-03-14', '0978123456', 'phamlan4@gmail.com', '012345678904'),
('KH2B7F0D9', 'Nguyen', 'Phong', 'Nam', '1989-07-20', '0918765432', 'nguyenphong5@gmail.com', '012345678905'),
('KH5C6B7E8', 'Hoang', 'Mai', 'Nu', '1996-12-15', '0987654321', 'hoangmai6@gmail.com', '012345678906'),
('KH9E1D2F0', 'Le', 'Minh', 'Nam', '1991-11-25', '0945678910', 'leminh7@gmail.com', '012345678907'),
('KH3A8C5B2', 'Nguyen', 'Kien', 'Nam', '1995-04-07', '0935654321', 'nguyenkien8@gmail.com', '012345678908'),
('KH6F7D2C0', 'Phan', 'Nga', 'Nu', '1988-06-30', '0908123456', 'phannga9@gmail.com', '012345678909'),
('KH5F7A8C2', 'Nguyen', 'Linh', 'Nu', '1995-03-12', '0912345678', 'nglinh95@gmail.com', '012345678901'),
('KH9B2E6F1', 'Tran', 'Minh', 'Nam', '1994-11-05', '0987654321', 'minhtran94@gmail.com', '012345678902'),
('KH3C9D1A7', 'Le', 'Hoa', 'Nu', '1999-06-20', '0975123456', 'lehoa99@yahoo.com', '012345678903'),
('KH6A8F3B2', 'Pham', 'Tuan', 'Nam', '1992-08-14', '0908123456', 'ptuan92@outlook.com', '012345678904'),
('KH7B3D9E4', 'Dang', 'Thao', 'Nu', '2000-10-01', '0934123456', 'thaodang00@gmail.com', '012345678905'),
('KH1E2A6C9', 'Hoang', 'Long', 'Nam', '1996-12-25', '0945123456', 'hoanglong96@gmail.com', '012345678906'),
('KH4D5C7B1', 'Ngo', 'Trang', 'Nu', '1998-01-17', '0956123456', 'trangngo98@gmail.com', '012345678907'),
('KH8A7F2D3', 'Do', 'Khanh', 'Nam', '1993-07-09', '0967123456', 'khanhdo93@gmail.com', '012345678908'),
('KH2B4E6A8', 'Bui', 'Lan', 'Nu', '1997-04-30', '0978123456', 'lanbui97@yahoo.com', '012345678909'),
('KH9C1D7E5', 'Mai', 'Quang', 'Nam', '1991-05-11', '0989123456', 'quangmai91@gmail.com', '012345678910'),
('KH5D8C2A4', 'Trinh', 'Thu', 'Nu', '2001-09-18', '0910123456', 'thutrinh01@gmail.com', '012345678911'),
('KH6E3F1B7', 'Vu', 'Hung', 'Nam', '1989-02-02', '0921123456', 'hungvu89@outlook.com', '012345678912'),
('KH7F2A9C5', 'Ly', 'Ngoc', 'Nu', '1995-06-06', '0932123456', 'ngocly95@gmail.com', '012345678913'),
('KH1A9B7D3', 'Kieu', 'Tai', 'Nam', '1990-11-29', '0943123456', 'taikieu90@gmail.com', '012345678914'),
('KH3E4D6C8', 'Phan', 'Yen', 'Nu', '1996-08-13', '0954123456', 'yenphan96@gmail.com', '012345678915'),
('KH4B5A1F9', 'Nguyen', 'Quynh', 'Nu', '1998-12-04', '0965123456', 'quynhnguyen98@gmail.com', '012345678916'),
('KH2C6F3D7', 'Dao', 'Hieu', 'Nam', '1993-03-03', '0976123456', 'hieudao93@gmail.com', '012345678917'),
('KH8D7E1A2', 'Ton', 'Mai', 'Nu', '1999-07-27', '0987123456', 'maiton99@gmail.com', '012345678918'),
('KH9A1B6F4', 'Ha', 'Phong', 'Nam', '1992-09-15', '0998123456', 'phongha92@gmail.com', '012345678919'),
('KH5C2D8B1', 'Chau', 'Anh', 'Nu', '2000-05-07', '0909123456', 'anhchau00@gmail.com', '012345678920'),
('KH1B8D4E3', 'Tran', 'Tam', 'Nu', '1997-08-22', '0976123456', 'trantam10@gmail.com', '012345678910');
GO
DROP TABLE TaiKhoan
CREATE TABLE TaiKhoan (
    MaTaiKhoan VARCHAR(20) PRIMARY KEY NOT NULL,
    Email VARCHAR(100) NOT NULL,
    MatKhau VARCHAR(255) NOT NULL,
    VaiTro NVARCHAR(50) NOT NULL,
    OTP VARCHAR(10),
    HanOTP DATETIME,
    TrangThai NVARCHAR(50) NOT NULL
);

GO
INSERT INTO TaiKhoan (MaTaiKhoan, Email, MatKhau, VaiTro, OTP, HanOTP, TrangThai) VALUES
('TK-001', 'admin@example.com', 'matkhau123', N'Admin', NULL, NULL, N'Hoạt Động'),
('TK-002', 'nhanvien1@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-003', 'nhanvien2@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-004', 'nhanvien3@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-005', 'nhanvien4@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-006', 'nhanvien5@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-007', 'nhanvien6@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-008', 'nhanvien7@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-009', 'nhanvien8@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-010', 'nhanvien9@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-011', 'nhanvien10@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-012', 'nhanvien11@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-013', 'nhanvien12@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-014', 'nhanvien13@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-015', 'nhanvien14@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-016', 'nhanvien15@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-017', 'nhanvien16@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-018', 'nhanvien17@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-019', 'nhanvien18@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-020', 'nhanvien19@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-021', 'nhanvien20@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-022', 'nhanvien21@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-023', 'nhanvien22@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-024', 'nhanvien23@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động'),
('TK-025', 'nhanvien24@example.com', 'matkhau123', N'Nhân Viên', NULL, NULL, N'Hoạt Động');
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
('NV-005', N'Hoàng', N'Em', N'Nam', '0945678901', 'nhanvien4@example.com', N'Nhân viên hỗ trợ', 7800000, 'TK-005'),
('NV-006', N'Võ', N'Phát', N'Nam', '0901111006', 'nhanvien5@example.com', N'Nhân viên bán vé', 8000000, 'TK-006'),
('NV-007', N'Đỗ', N'Thủy', N'Nữ', '0901111007', 'nhanvien6@example.com', N'Nhân viên hỗ trợ', 7800000, 'TK-007'),
('NV-008', N'Lý', N'Khánh', N'Nam', '0901111008', 'nhanvien7@example.com', N'Nhân viên kiểm soát', 8500000, 'TK-008'),
('NV-009', N'Ngô', N'Mai', N'Nữ', '0901111009', 'nhanvien8@example.com', N'Nhân viên bán vé', 8000000, 'TK-009'),
('NV-010', N'Tống', N'Bảo', N'Nam', '0901111010', 'nhanvien9@example.com', N'Nhân viên hỗ trợ', 7800000, 'TK-010'),
('NV-011', N'Tạ', N'Hiền', N'Nữ', '0901111011', 'nhanvien10@example.com', N'Nhân viên kiểm soát', 8500000, 'TK-011'),
('NV-012', N'Bùi', N'Giang', N'Nữ', '0901111012', 'nhanvien11@example.com', N'Nhân viên bán vé', 8000000, 'TK-012'),
('NV-013', N'Huỳnh', N'Vũ', N'Nam', '0901111013', 'nhanvien12@example.com', N'Nhân viên hỗ trợ', 7800000, 'TK-013'),
('NV-014', N'Trịnh', N'Linh', N'Nữ', '0901111014', 'nhanvien13@example.com', N'Nhân viên kiểm soát', 8500000, 'TK-014'),
('NV-015', N'Chu', N'Tuấn', N'Nam', '0901111015', 'nhanvien14@example.com', N'Nhân viên bán vé', 8000000, 'TK-015'),
('NV-016', N'Triệu', N'Hạnh', N'Nữ', '0901111016', 'nhanvien15@example.com', N'Nhân viên hỗ trợ', 7800000, 'TK-016'),
('NV-017', N'Đặng', N'Phong', N'Nam', '0901111017', 'nhanvien16@example.com', N'Nhân viên kiểm soát', 8500000, 'TK-017'),
('NV-018', N'Trần', N'Thảo', N'Nữ', '0901111018', 'nhanvien17@example.com', N'Nhân viên bán vé', 8000000, 'TK-018'),
('NV-019', N'Phan', N'Quốc', N'Nam', '0901111019', 'nhanvien18@example.com', N'Nhân viên hỗ trợ', 7800000, 'TK-019'),
('NV-020', N'Nguyễn', N'Yến', N'Nữ', '0901111020', 'nhanvien19@example.com', N'Nhân viên kiểm soát', 8500000, 'TK-020'),
('NV-021', N'Tô', N'Khoa', N'Nam', '0901111021', 'nhanvien20@example.com', N'Nhân viên bán vé', 8000000, 'TK-021'),
('NV-022', N'Lâm', N'Hà', N'Nữ', '0901111022', 'nhanvien21@example.com', N'Nhân viên hỗ trợ', 7800000, 'TK-022'),
('NV-023', N'Mai', N'Tiến', N'Nam', '0901111023', 'nhanvien22@example.com', N'Nhân viên kiểm soát', 8500000, 'TK-023'),
('NV-024', N'Từ', N'Như', N'Nữ', '0901111024', 'nhanvien23@example.com', N'Nhân viên bán vé', 8000000, 'TK-024'),
('NV-025', N'Giáp', N'Đạt', N'Nam', '0901111025', 'nhanvien24@example.com', N'Nhân viên hỗ trợ', 7800000, 'TK-025');


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
    NgayLap DATETIME NOT NULL,
    TongTien INT NOT NULL,
    MaNV VARCHAR(20) NOT NULL,
    MaKhuyenMai VARCHAR(20),
    MaKhachHang VARCHAR(20) NOT NULL,
    FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang),
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNhanVien),
    FOREIGN KEY (MaKhuyenMai) REFERENCES KhuyenMai(MaKhuyenMai)
);
GO
INSERT INTO HoaDon (MaHoaDon, NgayLap, TongTien, MaKhachHang, MaNV)
VALUES 
('HD001', '2025-05-01', 3600000, 'KH8A7B3D1','NV-001'),
('HD002', '2025-05-02', 4300000, 'KH1F29C83','NV-002');

Drop Table CTHoaDon
CREATE TABLE CTHoaDon (
    MaCTHD VARCHAR(20) PRIMARY KEY NOT NULL,
    SoLuong INT NOT NULL,
    DonGia INT NOT NULL,
    MaHoaDon VARCHAR(10) NOT NULL,
    MaVe VARCHAR(20) NOT NULL,
    FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon),
    FOREIGN KEY (MaVe) REFERENCES Ve(MaVe)
);
GO
INSERT INTO CTHoaDon (MaCTHD, MaHoaDon, MaVe, SoLuong, DonGia)
VALUES 
('CTHD001', 'HD001', 'CB-001-TH-1', 1, 1680000),
('CTHD002', 'HD001', 'CB-001-TH-10', 1, 1680000),
('CTHD003', 'HD002', 'CB-001-VIP-2', 1, 2520000),
('CTHD004', 'HD002', 'CB-001-VIP-22', 1, 2520000);

--Lay Ma khuyenMai tu nhap vao va ma hanh trinh
SELECT km.*
FROM KhuyenMai km
Join CTKhuyenMai ctkm on km.MaKhuyenMai = ctkm.MaKhuyenMai
join ChuyenBay cb on ctkm.MaHanhTrinh = cb.MaHanhTrinh
Where km.MaKhuyenMai = 'KM0001'
	AND cb.MaHanhTrinh = 'HT-0002'
	AND GETDATE() BETWEEN km.NgayBatDau AND km.NgayKetThuc

SELECT kh.MaKhachHang, kh.Ho, kh.Ten, hd.NgayLap, hd.TongTien
FROM HoaDon hd 
join KhachHang kh on kh.MaKhachHang = hd.MaKhachHang

SELECT 
    cb.MaChuyenBay,
    QUARTER(hd.NgayLap) AS Quy,
    SUM(cthd.SoLuong * cthd.DonGia) AS TongTien
FROM HoaDon hd
JOIN CTHoaDon cthd ON hd.MaHoaDon = cthd.MaHoaDon
JOIN Ve v ON v.MaVe = cthd.MaVe
JOIN ChuyenBay cb ON cb.MaChuyenBay = v.MaChuyenBay
WHERE YEAR(hd.NgayLap) = ?
GROUP BY cb.MaChuyenBay, QUARTER(hd.NgayLap)
ORDER BY cb.MaChuyenBay, Quy;