CREATE DATABASE QLCB
USE QLCB
CREATE TABLE SanBay (
    MaSanBay CHAR(10) PRIMARY KEY,
    TenSanBay VARCHAR(100) NOT NULL,
    DiaChi VARCHAR(255) NOT NULL

);


CREATE TABLE LoaiMayBay (
    MaLoaiMayBay CHAR(10) PRIMARY KEY,
    TenLoai VARCHAR(100) NOT NULL,
    SucChua INT NOT NULL
);

CREATE TABLE MayBay (
    MaMayBay CHAR(10) PRIMARY KEY,
    MaLoaiMayBay CHAR(10),
    FOREIGN KEY (MaLoaiMayBay) REFERENCES LoaiMayBay(MaLoaiMayBay)
);

CREATE TABLE ChuyenBay (
    MaChuyenBay CHAR(10) PRIMARY KEY,
    MaSanBayDi CHAR(10),
    MaSanBayDen CHAR(10),
    FOREIGN KEY (MaSanBayDi) REFERENCES SanBay(MaSanBay),
    FOREIGN KEY (MaSanBayDen) REFERENCES SanBay(MaSanBay)
);

CREATE TABLE LichBay (
    MaLichBay CHAR(10) PRIMARY KEY,
    MaChuyenBay CHAR(10),
    MaMayBay CHAR(10),
    NgayGioKhoiHanh DATETIME NOT NULL,
    NgayGioDen DATETIME NOT NULL,
    FOREIGN KEY (MaChuyenBay) REFERENCES ChuyenBay(MaChuyenBay),
    FOREIGN KEY (MaMayBay) REFERENCES MayBay(MaMayBay),
    CONSTRAINT chk_lichbay_time CHECK (NgayGioDen > NgayGioKhoiHanh)
);

CREATE TABLE HangVe (
    MaHangVe CHAR(10) PRIMARY KEY,
    TenHangVe VARCHAR(100) NOT NULL
);

CREATE TABLE VE (
    MaVe CHAR(10) PRIMARY KEY,
    MaLichBay CHAR(10),
    MaHangVe CHAR(10),
    Gia DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (MaLichBay) REFERENCES LichBay(MaLichBay),
    FOREIGN KEY (MaHangVe) REFERENCES HangVe(MaHangVe)
);

CREATE TABLE KhachHang (
    MaKhachHang CHAR(10) PRIMARY KEY,
    HoTen VARCHAR(100) NOT NULL,
    SoGiayTo VARCHAR(20) UNIQUE NULL,
    SDT VARCHAR(15) NOT NULL,
    Email VARCHAR(100) NOT NULL
);

CREATE TABLE VeDaDuocDat (
    MaVeDaDat CHAR(10) PRIMARY KEY,
    MaVe CHAR(10),
    MaHangVe CHAR(10),
    MaLichBay CHAR(10),
    TrangThai VARCHAR(50) NOT NULL,
    FOREIGN KEY (MaVe) REFERENCES VE(MaVe),
    FOREIGN KEY (MaHangVe) REFERENCES HangVe(MaHangVe),
    FOREIGN KEY (MaLichBay) REFERENCES LichBay(MaLichBay),
    CONSTRAINT chk_trangthai CHECK (TrangThai IN ('Đã đặt', 'Đã hủy', 'Đã thanh toán'))
);

CREATE TABLE HoaDon (
    MaHoaDon CHAR(10) PRIMARY KEY,
    MaKhachHang CHAR(10),
    NgayLap DATE NOT NULL,
    TongTien DECIMAL(10,2) NOT NULL,
    FOREIGN KEY (MaKhachHang) REFERENCES KhachHang(MaKhachHang)
);

CREATE TABLE CTHoaDon (
    MaCTHoaDon CHAR(10) PRIMARY KEY,
    MaHoaDon CHAR(10),
    MaVe CHAR(10),
    FOREIGN KEY (MaHoaDon) REFERENCES HoaDon(MaHoaDon),
    FOREIGN KEY (MaVe) REFERENCES VE(MaVe)
);

CREATE TABLE NhanVien (
    MaNhanVien CHAR(10) PRIMARY KEY,
    HoTen VARCHAR(100) NOT NULL,
    ChucVu VARCHAR(50) NOT NULL,
    Luong DECIMAL(10,2) NOT NULL
);

CREATE TABLE TaiKhoan (
    MaTaiKhoan CHAR(10) PRIMARY KEY,
    TenDangNhap VARCHAR(50) UNIQUE NOT NULL,
    MatKhau VARCHAR(255) NOT NULL,
    MaNhanVien CHAR(10) UNIQUE NOT NULL,
    FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien)
);
