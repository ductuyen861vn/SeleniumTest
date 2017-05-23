/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay3;

/**
 *
 * @author hv
 */
public class HinhTron extends Hinh {
    float r;

    public HinhTron(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }
    
    

    @Override
    public double chuVi() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return r*Math.PI*2;
    }

    @Override
    public double dienTich() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return Math.pow(r, 2)*Math.PI;
    }
    
}
