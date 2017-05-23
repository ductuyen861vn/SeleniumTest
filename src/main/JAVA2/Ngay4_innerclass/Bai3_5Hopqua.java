/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay4_innerclass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 */
public class Bai3_5Hopqua {
    String hinhDangHop, mauSac;
    final double phiLamHop=10000;
    List<qua> listQua = new ArrayList<>();

    public Bai3_5Hopqua(String hinhDangHop, String mauSac) {
        this.hinhDangHop = hinhDangHop;
        this.mauSac = mauSac;
    }

    public String getHinhDangHop() {
        return hinhDangHop;
    }

    public void setHinhDangHop(String hinhDangHop) {
        this.hinhDangHop = hinhDangHop;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    
    public int tongQua(){
        return listQua.size();
    }
    
    public String tenQua(){
        String chuoi = "";
        for (qua gift : listQua){
            chuoi +=gift.getTen()+"\n";
        }
        return chuoi;
    }
    
    class qua{
        String ten;
        double trongLuong;
        final int donGia = 200;

        public qua(String ten, double trongLuong) {
            this.ten = ten;
            this.trongLuong = trongLuong;
        }

        public String getTen() {
            return ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }

        public double getTrongLuong() {
            return trongLuong;
        }

        public void setTrongLuong(double trongLuong) {
            this.trongLuong = trongLuong;
        }
        
        public double tienGoiQua(){
            return trongLuong*donGia+phiLamHop;
        }
    
    }
}
