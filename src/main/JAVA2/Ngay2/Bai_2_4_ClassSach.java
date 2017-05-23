/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay2;

import java.util.Date;

/**
 *
 * @author hv
 */
public class Bai_2_4_ClassSach {
    String maSach, tenSach, nXB ;
    int soLuong;
    double donGia;
    Date ngayNhap;

    public Bai_2_4_ClassSach(String maSach, String tenSach, String nXB, int soLuong, double donGia, Date ngayNhap) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nXB = nXB;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.ngayNhap = ngayNhap;
    }

    public Bai_2_4_ClassSach() {
    }
    
    

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getnXB() {
        return nXB;
    }

    public void setnXB(String nXB) {
        this.nXB = nXB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    

    @Override
    public String toString() {
       // return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return this.maSach + " - " + this.tenSach + " - " + FormatDate.dateToString(this.ngayNhap) + " - " + this.nXB + " - " + this.soLuong + " - " + String.format("%.0f",thanhTien());
    }
    
    public double thanhTien (){
        return 0;
    }
    
    
}
