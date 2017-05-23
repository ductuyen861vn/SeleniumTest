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
public class Ngay5_HinhCN extends Ngay5_Hinh {
    double d;
    double r;

    public Ngay5_HinhCN(double d, double r) {
        this.d = d;
        this.r = r;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
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
        return (d+r)*2;
    }

    @Override
    public String toString() {
        //return super.toString(); //To change body of generated methods, choose Tools | Templates.
        return "Hinh CN: " + " - " + "Dai: " + this.d + " - " + "Rong: "+ this.r + " - " + "DienTich: " +this.dienTich();
    }
    
    
    
}
