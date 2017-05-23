/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay4_innerclass;

/**
 *
 * @author hv
 */
public class Product {
    String maSP, tenSP, donVi, loaiSP;
    double gia;

    public Product(String maSP, String tenSP, String donVi, String loaiSP, double gia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donVi = donVi;
        this.loaiSP = loaiSP;
        this.gia = gia;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public String getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return this.maSP + " - " + this.tenSP + " - " + this.donVi + " - " + this.gia;
    }

    
    
    
    
}
