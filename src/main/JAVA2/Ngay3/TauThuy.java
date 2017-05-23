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
public class TauThuy implements PhuongTienGiaoThong, DongCo {
    
    double trongLuong;
    double sucTai;
    double vanTocXuoiDong;
    double vanTocNguocDong;
    double nLTieuHao;

    public TauThuy(double trongLuong, double sucTai, double vanTocXuoiDong, double vanTocNguocDong, double nLTieuHao) {
        this.trongLuong = trongLuong;
        this.sucTai = sucTai;
        this.vanTocXuoiDong = vanTocXuoiDong;
        this.vanTocNguocDong = vanTocNguocDong;
        this.nLTieuHao = nLTieuHao;
    }
    
    
    

    public double getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }

    public double getSucTai() {
        return sucTai;
    }

    public void setSucTai(double sucTai) {
        this.sucTai = sucTai;
    }

    public double getVanTocXuoiDong() {
        return vanTocXuoiDong;
    }

    public void setVanTocXuoiDong(double vanTocXuoiDong) {
        this.vanTocXuoiDong = vanTocXuoiDong;
    }

    public double getVanTocNguocDong() {
        return vanTocNguocDong;
    }

    public void setVanTocNguocDong(double vanTocNguocDong) {
        this.vanTocNguocDong = vanTocNguocDong;
    }

    public double getnLTieuHao() {
        return nLTieuHao;
    }

    public void setnLTieuHao(double nLTieuHao) {
        this.nLTieuHao = nLTieuHao;
    }
    
    
    
    
    @Override
    public double tinhVanToc(double quangDuong, double ThoiGian) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return quangDuong/ThoiGian+this.vanTocXuoiDong-this.vanTocNguocDong;
    }

    @Override
    public double tinhNLTieuThu(double quangDuong, double soLit) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return quangDuong/(soLit-this.nLTieuHao);
    }
    
    
    
}
