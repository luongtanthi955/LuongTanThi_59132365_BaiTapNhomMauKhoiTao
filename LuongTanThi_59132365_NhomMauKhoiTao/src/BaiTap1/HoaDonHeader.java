/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.Date;

/**
 *
 * @author Admin
 */
class HoaDonHeader {
    String MaHD;
    Date NgayBan;
    String TenKH;

    public HoaDonHeader() {
    }

    public HoaDonHeader(String MaHD, Date NgayBan, String TenKH) {
        this.MaHD = MaHD;
        this.NgayBan = NgayBan;
        this.TenKH = TenKH;
    }

    public String getMaHD() {
        return MaHD;
    }

    public Date getNgayBan() {
        return NgayBan;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setNgayBan(Date ngayBan) {
        this.NgayBan = ngayBan;
    }

    public void setTenKH(String tenKH) {
        this.TenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "MaHD=" + MaHD + ", ngayBan=" + NgayBan + ", tenKH=" + TenKH + '}';
    }
}
