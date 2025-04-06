DROP DATABASE QLCB
CREATE DATABASE QLCB
GO
USE QLCB;
GO
Drop table SanBay

CREATE TABLE SanBay (
    MaSanBay VARCHAR(10) PRIMARY KEY NOT NULL,
    TenSanBay NVARCHAR(255),
    DiaChi NVARCHAR(MAX) NOT NULL
);
GO
INSERT INTO SanBay (MaSanBay, TenSanBay, DiaChi)
VALUES 
('SBHV1A2B', N'Sân Bay Nội Bài',  N'Quốc lộ 2, Sóc Sơn, Hà Nội, Việt Nam'),
('SBHCM3C4D', N'Sân Bay Tân Sơn Nhất', N'Phường 2, Tân Bình, TP. Hồ Chí Minh, Việt Nam'),
('SBĐN5E6F', N'Sân Bay Đà Nẵng', N'Phường Hòa Thuận Đông, Hải Châu, Đà Nẵng, Việt Nam'),
('SBCT7G8H', N'Sân Bay Cát Bi', N'Quán Trữ, Kiến An, Hải Phòng, Việt Nam'),
('SBNV9I0J', N'Sân Bay Phú Bài', N'Xã Phú Bài, Hương Thủy, Thừa Thiên-Huế, Việt Nam'),
('SBQT1K2L', N'Sân Bay Quốc tế Cam Ranh', N'Xã Cam Hải Đông, Cam Lâm, Khánh Hòa, Việt Nam'),
('SBVQ3M4N', N'Sân Bay Vinh', N'Phường Quán Bàu, Vinh, Nghệ An, Việt Nam'),
('SBBL5O6P', N'Sân Bay Buôn Ma Thuột', N'Phường Tân Lập, Buôn Ma Thuột, Đắk Lắk, Việt Nam'),
('SBHDB7Q8R', N'Sân Bay Phú Quốc', N'Dương Tơ, Phú Quốc, Kiên Giang, Việt Nam'),
('SBSG9T0U', N'Sân Bay Cần Thơ', N'Phường An Hòa, Cần Thơ, Việt Nam');

GO

CREATE TABLE LoaiVe (
    MaLoaiVe VARCHAR(10) PRIMARY KEY NOT NULL,
    TenLoaiVe VARCHAR(255) NOT NULL
);
GO

CREATE TABLE LoaiMayBay (
    MaLoai VARCHAR(10) PRIMARY KEY NOT NULL,
    TenLoai VARCHAR(255) NOT NULL,
    HeSoGiaThuong FLOAT NOT NULL,
    HeSoGiaVip FLOAT NOT NULL
);
GO

CREATE TABLE MayBay (
    MaMayBay VARCHAR(10) PRIMARY KEY NOT NULL,
    TenMayBay VARCHAR(255) NOT NULL,
    SoLuongGheThuong INT NOT NULL,
    SoLuongGheVip INT NOT NULL,
    TongSoLuongGhe INT NOT NULL,
    MaLoaiMayBay VARCHAR(10) NOT NULL,
    FOREIGN KEY (MaLoaiMayBay) REFERENCES LoaiMayBay(MaLoai)
);
GO

CREATE TABLE HanhTrinh (
    MaHanhTrinh VARCHAR(10) PRIMARY KEY NOT NULL,
    MaSanBayDen VARCHAR(10) NOT NULL,
    MaSanBayDi VARCHAR(10) NOT NULL,
    GiaCoBan DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (MaSanBayDi) REFERENCES SanBay(MaSanBay),
    FOREIGN KEY (MaSanBayDen) REFERENCES SanBay(MaSanBay)
);
GO

CREATE TABLE ChuyenBay (
    MaChuyenBay VARCHAR(10) PRIMARY KEY NOT NULL,
    NgayXuatPhat DATE NOT NULL,
    GioXuatPhat TIME NOT NULL,
    NgayDenNoi DATE NOT NULL,
    GioDenNoi TIME NOT NULL,
    GiaThuong INT NOT NULL,
    GiaVip INT NOT NULL,
    TrangThaiChuyenBay VARCHAR(50) NOT NULL,
    TongSoLuongGhe INT NOT NULL,
    SoGheDaBan INT NOT NULL,
    SoChoConLai INT NOT NULL,
    MaMayBay VARCHAR(10) NOT NULL,
    MaHanhTrinh VARCHAR(10) NOT NULL,
    FOREIGN KEY (MaMayBay) REFERENCES MayBay(MaMayBay),
    FOREIGN KEY (MaHanhTrinh) REFERENCES HanhTrinh(MaHanhTrinh)
);
GO

CREATE TABLE Ve (
    MaVe VARCHAR(10) PRIMARY KEY NOT NULL,
    TrangThaiVe VARCHAR(50) NOT NULL,
    GiaVe INT NOT NULL,
    MaLoaiVe VARCHAR(10) NOT NULL,
    MaChuyenBay VARCHAR(10) NOT NULL,
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

CREATE TABLE TaiKhoan (
    MaTaiKhoan VARCHAR(10) PRIMARY KEY NOT NULL,
    Email VARCHAR(100) NOT NULL,
    MatKhau VARCHAR(255) NOT NULL,
    VaiTro VARCHAR(50) NOT NULL,
    OTP VARCHAR(10),
    HanOTP DATETIME,
    TrangThai VARCHAR(50) NOT NULL
);
GO

CREATE TABLE NhanVien (
    MaNhanVien VARCHAR(10) PRIMARY KEY NOT NULL,
    Ho VARCHAR(50) NOT NULL,
    Ten VARCHAR(50) NOT NULL,
    GioiTinh VARCHAR(10) NOT NULL,
    SDT VARCHAR(15) NOT NULL,
    email VARCHAR(100) NOT NULL,
    ChucVu VARCHAR(50) NOT NULL,
    LuongCoBan DECIMAL(10,2) NOT NULL,
    MaTaiKhoan VARCHAR(10) NOT NULL,
    FOREIGN KEY (MaTaiKhoan) REFERENCES TaiKhoan(MaTaiKhoan)
);
GO

CREATE TABLE KhuyenMai (
    MaKhuyenMai VARCHAR(10) PRIMARY KEY NOT NULL,
    NgayBatDau DATE NOT NULL,
    NgayKetThuc DATE NOT NULL,
    PhanTramGiamGia VARCHAR(10) NOT NULL
);
GO

CREATE TABLE CTKhuyenMai (
    MaCTKhuyenMai VARCHAR(10) PRIMARY KEY NOT NULL,
    MaHanhTrinh VARCHAR(10) NOT NULL,
    MaKhuyenMai VARCHAR(10) NOT NULL,
    FOREIGN KEY (MaHanhTrinh) REFERENCES HanhTrinh(MaHanhTrinh),
    FOREIGN KEY (MaKhuyenMai) REFERENCES KhuyenMai(MaKhuyenMai)
);
GO

CREATE TABLE HoaDon (
    MaHoaDon VARCHAR(10) PRIMARY KEY NOT NULL,
    ThoiGian DATETIME NOT NULL,
    TongTien DECIMAL(10,2) NOT NULL,
    MaNV VARCHAR(10) NOT NULL,
    MaKhuyenMai VARCHAR(10),
    MaKhachHang VARCHAR(10) NOT NULL,
    FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang),
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNhanVien),
    FOREIGN KEY (MaKhuyenMai) REFERENCES KhuyenMai(MaKhuyenMai)
);
GO

CREATE TABLE CTHoaDon (
    MaCTHD VARCHAR(10) PRIMARY KEY NOT NULL,
    SoLuong INT NOT NULL,
    Gia INT NOT NULL,
    MaHoaDon VARCHAR(10) NOT NULL,
    MaVe VARCHAR(10) NOT NULL,
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
('KH1B8D4E3', 'Tran', 'Tam', 'Nu', '1997-08-22', '0976123456', 'trantam10@gmail.com');
