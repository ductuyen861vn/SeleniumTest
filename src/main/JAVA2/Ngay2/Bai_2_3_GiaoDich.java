/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay2;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Bai_2_3_GiaoDich {
    String maGD;
    int soLuong;
    double rate;
    Date ngay;
    String loai;

    public Bai_2_3_GiaoDich(String maGD, int soLuong, double rate, Date ngay, String loai) {
        this.maGD = maGD;
        this.soLuong = soLuong;
        this.rate = rate;
        this.ngay = ngay;
        this.loai = loai;
    }

    public Bai_2_3_GiaoDich() {
    }
    
    

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

//    @Override
//    public String toString() {
//       // return super.toString(); //To change body of generated methods, choose Tools | Templates.
//       return this.maGD + " - " + FormatDate.dateToString(this.ngay) + " - " + this.loai + " - " +this.soLuong + " - " + this.rate + " - " + String.format("%.0f",this.ThanhTien());
//    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return this.maGD + " - " + FormatDate.dateToString(this.ngay) + " - " + this.loai + " - " +this.soLuong + " - " + this.rate + " - " + String.format("%.0f",this.ThanhTien());
    }
    
    
    
    
    public double ThanhTien(){
    return this.soLuong*this.rate;
    }
    
    
}
