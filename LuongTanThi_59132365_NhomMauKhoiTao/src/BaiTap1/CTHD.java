/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author Admin
 */
public class CTHD {
    String MaSanPham;
    String TenSanPham;
    int SoLuong;
    double DonGia;
    float ChietKhau;

    public CTHD() {
    }

    public CTHD(String MaSanPham, String TenSanPham, int SoLuong, double DonGia, float ChietKhau) {
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ChietKhau = ChietKhau;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public float getChietKhau() {
        return ChietKhau;
    }

    public void setMaSanPham(String maSanPham) {
        this.MaSanPham = maSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.TenSanPham = tenSanPham;
    }

    public void setSoLuong(int soLuong) {
        this.SoLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.DonGia = donGia;
    }

    public void setChietKhau(float chietKhau) {
        this.ChietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "CTHD{" + "maSanPham=" + MaSanPham + ", tenSanPham=" + TenSanPham + ", soLuong=" + SoLuong + ", donGia=" + DonGia + " VND" +", chietKhau=" + ChietKhau * 100 + "%" + '}';
    }
}
