/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay5_Generic;

/**
 *
 * @author hv
 */
public class Ngay5_HinhTron extends Ngay5_Hinh {
    double r;

    public Ngay5_HinhTron(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
    
    
    @Override
    public double dienTich() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Math.pow(r, 2)*Math.PI;
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "HinhTron  "+ " - " + "BanKinh: "+this.r+ " - " + "DienTich: "+ this.dienTich();
    }
    
    
    
}
