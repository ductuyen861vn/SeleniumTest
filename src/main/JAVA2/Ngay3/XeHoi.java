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
public class XeHoi implements PhuongTienGiaoThong, DongCo {
    String tenXe, tenHang;

    public XeHoi(String tenXe, String tenHang) {
        this.tenXe = tenXe;
        this.tenHang = tenHang;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    
    
    
    
    @Override
    public double tinhVanToc(double quangDuong, double ThoiGian) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return quangDuong/ThoiGian;
    }

    @Override
    public double tinhNLTieuThu(double quangDuong, double soLit) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return quangDuong/soLit;
    }

   
    
}
