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
public class BTTHEM_HoaDon {
    
    String maHD, ngayHD, tenKhach, maPhong;
    int soLuong;
    

    public BTTHEM_HoaDon() {
    }
    
    

    public BTTHEM_HoaDon(String maHD, String ngayHD, String tenKhach, String maPhong, int soLuong) {
        this.maHD = maHD;
        this.ngayHD = ngayHD;
        this.tenKhach = tenKhach;
        this.maPhong = maPhong;
        this.soLuong = soLuong;
    }
    
    

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(String ngayHD) {
        this.ngayHD = ngayHD;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public double thanhTien(){
    return 0;
    }
    
    public String thongTinKH(){
        return " maHD: "+ this.maHD + " ngayHD: "+this.ngayHD + " tenKH: "+this.tenKhach+" maPhong: "+this.maPhong
                +" SL thue: " + this.soLuong + " Thanh tien: " + thanhTien()+ "\n";
    }
    
    
    
    
}
