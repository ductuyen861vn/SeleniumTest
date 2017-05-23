/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay2;

import java.util.Date;

/**
 *
 * @author QAVN
 */
public class Bai_2_4_STK extends Bai_2_4_ClassSach{
    int thue;

    public Bai_2_4_STK(int thue, String maSach, String tenSach, String nXB, int soLuong, double donGia, Date ngayNhap) {
        super(maSach, tenSach, nXB, soLuong, donGia, ngayNhap);
        this.thue = thue;
    }

    public Bai_2_4_STK(int thue) {
        this.thue = thue;
    }

    public int getThue() {
        return thue;
    }

    public void setThue(int thue) {
        this.thue = thue;
    }

    @Override
    public double thanhTien() {
        //return super.thanhTien(); //To change body of generated methods, choose Tools | Templates.
        return (this.soLuong*this.donGia)+((this.soLuong*this.donGia)*this.thue/100);
    }
    
    
    
    
}
