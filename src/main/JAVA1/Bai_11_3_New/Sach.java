/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai_11_3_New;

/**
 *
 * @author hv
 */
public class Sach {
    String tenSach;
    String nhaXB;
    String tacGia;
    double giaBan;
    String theLoai;

    public Sach(String tenSach, String nhaXB, String tacGia, double giaBan, String theLoai) {
        this.tenSach = tenSach;
        this.nhaXB = nhaXB;
        this.tacGia = tacGia;
        this.giaBan = giaBan;
        this.theLoai = theLoai;
    }
    public  String thongTin(){
        return this.tenSach+" - "+this.nhaXB+" - "+this.tacGia+" - "+this.giaBan;
    }
    
    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }
    
}
