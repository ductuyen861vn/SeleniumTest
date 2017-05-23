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
public class Bai_9_2_giaovien extends Bai_9_2_connguoi {

    final double luongCanBan=1450000;
    String chuNhiem;
    float heSoLuong;
    double phuCap;
    
    
    public Bai_9_2_giaovien() {
    }

    public Bai_9_2_giaovien(String chuNhiem, float heSoLuong, double phuCap, String hoTen, String ngaySinh, String diaChi, String soDT) {
        super(hoTen, ngaySinh, diaChi, soDT);
        this.chuNhiem = chuNhiem;
        this.heSoLuong = heSoLuong;
        this.phuCap = phuCap;
    }

    public String getChuNhiem() {
        return chuNhiem;
    }

    public void setChuNhiem(String chuNhiem) {
        this.chuNhiem = chuNhiem;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }

    public double tinhLuong (){
        return (this.heSoLuong*this.luongCanBan)+this.phuCap;
    }

    
    public String thongTinGV(){
    return this.hoTen +" - "+ this.ngaySinh+ " - "+ this.diaChi+ " - "+ this.soDT+" - "+ "CN: " + getChuNhiem()+ " - "+ "HSL: "+getHeSoLuong()+ "PC: "+getPhuCap()+"Lương: "+tinhLuong();
    }
    
    
    
}
