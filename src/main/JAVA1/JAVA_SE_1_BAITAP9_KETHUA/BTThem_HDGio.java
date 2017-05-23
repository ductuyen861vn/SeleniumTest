/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP9_KETHUA;

/**
 *
 * @author QAVN
 */
public class BTThem_HDGio extends BTTHEM_HoaDon {
    final double donGiaGio=50000;
    

    public BTThem_HDGio() {
    }

    public BTThem_HDGio(String maHD, String ngayHD, String tenKhach, String maPhong, int soLuong) {
        super(maHD, ngayHD, tenKhach, maPhong, soLuong);
    }
    
    
    
    
    
    @Override
    public double thanhTien(){
//        if (this.soLuong<30 && this.soLuong>24)
//            return this.soLuong*24;
//        else
//            return this.soLuong*this.donGia;
        return (super.soLuong>24)?this.donGiaGio*24:super.soLuong*this.donGiaGio;
    }
    
    
}


