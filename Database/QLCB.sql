CREATE DATABASE QLCB
GO
USE QLCB
GO
CREATE TABLE SanBay (
    MaSanBay VARCHAR(10) PRIMARY KEY,
    TenSanBay VARCHAR(255),
    DiaChi TEXT
);
GO
CREATE TABLE LoaiVe (
    MaLoaiVe VARCHAR(10) PRIMARY KEY,
    TenLoaiVe VARCHAR(255)
);
GO
CREATE TABLE LoaiMayBay (
    MaLoai VARCHAR(10) PRIMARY KEY,
    TenLoai VARCHAR(255),
    HeSoGiaThuong FLOAT,
    HeSoGiaVip FLOAT
);
GO
CREATE TABLE MayBay (
    MaMayBay VARCHAR(10) PRIMARY KEY,
    TenMayBay VARCHAR(255),
    SoLuongGheThuong INT,
    SoLuongGheVip INT,
    TongSoLuongGhe INT,
    MaLoaiMayBay VARCHAR(10),
    FOREIGN KEY (MaLoaiMayBay) REFERENCES LoaiMayBay(MaLoai)
);
GO
CREATE TABLE HanhTrinh (
    MaHanhTrinh VARCHAR(10) PRIMARY KEY,
    MaSanBayDen VARCHAR(10),
    MaSanBayDi VARCHAR(10),
    GiaCoBan DECIMAL(10,2),
    FOREIGN KEY (MaSanBayDi) REFERENCES SanBay(MaSanBay),
    FOREIGN KEY (MaSanBayDen) REFERENCES SanBay(MaSanBay)
);
GO
CREATE TABLE ChuyenBay (
    MaChuyenBay VARCHAR(10) PRIMARY KEY,
    NgayXuatPhat DATE,
    GioXuatPhat TIME,
    NgayDenNoi DATE,
    GioDenNoi TIME,
    GiaThuong INT,
	GiaVip INT,
    TrangThaiChuyenBay VARCHAR(50),
    TongSoLuongGhe INT,
    SoGheDaBan INT,
    SoChoConLai INT,
    MaMayBay VARCHAR(10),
	MaHanhTrinh VARCHAR(10),
    FOREIGN KEY (MaMayBay) REFERENCES MayBay(MaMayBay),
	FOREIGN KEY (MaHanhTrinh) REFERENCES HanhTrinh(MaHanhTrinh)
);
GO
CREATE TABLE Ve (
    MaVe VARCHAR(10) PRIMARY KEY,
    TrangThaiVe VARCHAR(50),
    GiaVe INT,
    MaLoaiVe VARCHAR(10),
    MaChuyenBay VARCHAR(10),
    FOREIGN KEY (MaLoaiVe) REFERENCES LoaiVe(MaLoaiVe),
    FOREIGN KEY (MaChuyenBay) REFERENCES ChuyenBay(MaChuyenBay)
);
CREATE TABLE KhachHang (
    MaKhachHang VARCHAR(10) PRIMARY KEY,
    Ho VARCHAR(50),
    Ten VARCHAR(50),
    GioiTinh VARCHAR(10),
    NgaySinh DATE,
    SDT VARCHAR(15),
    email VARCHAR(100)
);
GO
CREATE TABLE TaiKhoan (
    MaTaiKhoan VARCHAR(10) PRIMARY KEY,
    Email VARCHAR(100),
    MatKhau VARCHAR(255),
    VaiTro VARCHAR(50),
    OTP VARCHAR(10),
    HanOTP DATETIME,
    TrangThai VARCHAR(50)
);
GO
CREATE TABLE NhanVien (
    MaNhanVien VARCHAR(10) PRIMARY KEY,
    Ho VARCHAR(50),
    Ten VARCHAR(50),
	GioiTinh VARCHAR(10),
    SDT VARCHAR(15),
    email VARCHAR(100),
    ChucVu VARCHAR(50),
    LuongCoBan DECIMAL(10,2),
    MaTaiKhoan VARCHAR(10),
    FOREIGN KEY (MaTaiKhoan) REFERENCES TaiKhoan(MaTaiKhoan)
);
GO
CREATE TABLE KhuyenMai (
    MaKhuyenMai VARCHAR(10) PRIMARY KEY,
    NgayBatDau DATE,
    NgayKetThuc DATE,
    PhanTramGiamGia VARCHAR(10)
);
GO
CREATE TABLE CTKhuyenMai(
	MaCTKhuyenMai VARCHAR(10) PRIMARY KEY,
	MaHanhTrinh VARCHAR(10),
	MaKhuyenMai VARCHAR(10),
	FOREIGN KEY (MaHanhTrinh)  REFERENCES HanhTrinh(MaHanhTrinh),
	FOREIGN KEY (MaKhuyenMai) REFERENCES KhuyenMai(MaKhuyenMai),
)
GO
CREATE TABLE HoaDon (
    MaHoaDon VARCHAR(10) PRIMARY KEY,
    ThoiGian DATETIME,
    TongTien DECIMAL(10,2),
    MaNV VARCHAR(10),
    MaKhuyenMai VARCHAR(10),
	MaKhachHang VARCHAR(10),
	FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang),
    FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNhanVien),
    FOREIGN KEY (MaKhuyenMai) REFERENCES KhuyenMai(MaKhuyenMai)
);
GO
CREATE TABLE CTHoaDon (
    MaCTHD VARCHAR(10) PRIMARY KEY,
    SoLuong INT,
    Gia INT,
    MaHoaDon VARCHAR(10),
    MaVe VARCHAR(10),
    FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon),
    FOREIGN KEY (MaVe) REFERENCES Ve(MaVe)
);







