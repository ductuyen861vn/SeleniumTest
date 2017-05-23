/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay1;

/**
 *
 * @author hv
 */
public class Taikhoan {
    String soTaiKhoan;
    double soTien;
    final double phiRut = 4000;
    final double phiChuyen = 10000;

    public Taikhoan(String soTaiKhoan, double soTien) {
        this.soTaiKhoan = soTaiKhoan;
        this.soTien = soTien;
    }

    public Taikhoan() {
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(String soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }
    
    public String thongTinTK(){
        return "SoTK: "+ soTaiKhoan+ " - " + "So Tien:"+ soTien + "\n";
    }        
     public boolean guiTien(double tienGoi){
            if(tienGoi>0)
            {
                this.soTien+=tienGoi;
                return true;
            }
            else
                return false;
     }
     
     public boolean rutTien (double tienRut){
            if(tienRut>0 && tienRut+phiRut<soTien)
            {
                this.soTien-=(tienRut+phiRut);
                return true;
            }else
                return false;
            
     }
     
     public boolean chuyenTien(Taikhoan tk2, double tienChuyen){
            if(tienChuyen>0 && tienChuyen+phiChuyen<this.soTien){
            this.soTien-=(tienChuyen+phiChuyen);
            tk2.soTien+=tienChuyen;
                return true;
            }else
                return false;
     }
}
