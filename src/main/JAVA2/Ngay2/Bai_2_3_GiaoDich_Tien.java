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
public class Bai_2_3_GiaoDich_Tien extends Bai_2_3_GiaoDich {
    String loaiGD;

    public Bai_2_3_GiaoDich_Tien(String loaiGD, String maGD, int soLuong, double rate, Date ngay, String loai) {
        super(maGD, soLuong, rate, ngay, loai);
        this.loaiGD = loaiGD;
    }

    @Override
    public double ThanhTien() {
        //return super.ThanhTien(); //To change body of generated methods, choose Tools | Templates.
        if(this.loaiGD.equalsIgnoreCase("mua"))
            return this.soLuong* this.rate;
        //if(this.loaiGD.equalsIgnoreCase("ban"))
        else
            return this.soLuong*this.rate+(this.soLuong*this.rate)*1/100;
        
                    
    }
    
    
    
}
