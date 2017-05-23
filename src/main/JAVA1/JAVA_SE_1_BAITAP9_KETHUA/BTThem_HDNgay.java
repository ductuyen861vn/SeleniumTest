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
public class BTThem_HDNgay extends BTTHEM_HoaDon {
    final double donGiaNgay=200000;
    float mucChietKhau=0.2F;

    public BTThem_HDNgay() {
    }

    public BTThem_HDNgay(String maHD, String ngayHD, String tenKhach, String maPhong, int soLuong) {
        super(maHD, ngayHD, tenKhach, maPhong, soLuong);
    }
    

    
    @Override
    public double thanhTien(){
//    if(this.soLuong<7)
//        return this.soLuong* this.donGia;
//    else
//        return (this.soLuong*7)+((this.soLuong-7)*(100-20));
        return (super.soLuong<7)?super.soLuong* this.donGiaNgay:(super.soLuong*7)+((super.soLuong-7)*(1-0.2)*this.donGiaNgay);
    
    }
    
    
    
}
