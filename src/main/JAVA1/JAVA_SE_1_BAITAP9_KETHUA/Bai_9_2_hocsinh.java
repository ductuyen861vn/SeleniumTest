/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP9_KETHUA;

/**
 *
 * @author hv
 */
public class Bai_9_2_hocsinh extends Bai_9_2_connguoi {
    
    String hocSinhLop;
    int diemHK1, diemHK2;

    public Bai_9_2_hocsinh() {
    }

    public Bai_9_2_hocsinh(String hocSinhLop, int diemHK1, int diemHK2, String hoTen, String ngaySinh, String diaChi, String soDT) {
        super(hoTen, ngaySinh, diaChi, soDT);
        this.hocSinhLop = hocSinhLop;
        this.diemHK1 = diemHK1;
        this.diemHK2 = diemHK2;
    }

    public String getHocSinhLop() {
        return hocSinhLop;
    }

    public void setHocSinhLop(String hocSinhLop) {
        this.hocSinhLop = hocSinhLop;
    }

    public int getDiemHK1() {
        return diemHK1;
    }

    public void setDiemHK1(int diemHK1) {
        this.diemHK1 = diemHK1;
    }

    public int getDiemHK2() {
        return diemHK2;
    }

    public void setDiemHK2(int diemHK2) {
        this.diemHK2 = diemHK2;
    }
    
    public int tinhTB (){
        return (this.diemHK1+this.diemHK2)/2;
    }
    
    
    public String thongTinHS(){
        return this.hoTen +" - "+ this.ngaySinh+ " - "+ this.diaChi+ " - "+ this.soDT+" - "+ 
               this.hocSinhLop +" - HK1: "+ getDiemHK1()+ " - HK2: "+ getDiemHK2()+ " - Điểm TB: "+ tinhTB();
    }
    
}
