/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay2;

import java.util.Date;

/**
 *
 * @author hv
 */
public class Bai_2_4_SGK extends Bai_2_4_ClassSach {
    String status;

    public Bai_2_4_SGK(String status, String maSach, String tenSach, String nXB, int soLuong, double donGia, Date ngayNhap) {
        super(maSach, tenSach, nXB, soLuong, donGia, ngayNhap);
        this.status = status;
    }

    public Bai_2_4_SGK(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public double thanhTien() {
        //return super.thanhTien(); //To change body of generated methods, choose Tools | Templates.
        return (this.status.equals("Mới"))?this.soLuong*this.donGia:this.soLuong*this.donGia*50/100;
        
    }
    
    
    
}
