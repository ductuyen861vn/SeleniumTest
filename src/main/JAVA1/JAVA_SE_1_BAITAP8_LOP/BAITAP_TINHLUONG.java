/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP8_LOP;

/**
 *
 * @author hv
 */
public class BAITAP_TINHLUONG {
    
    
    String maNV;
    int soSP;
    boolean tangCa;
    final double dongia=30000;
    final int dinhMucSP=200;

    public BAITAP_TINHLUONG(String maNV, int soSP, boolean tangCa) {
        this.maNV = maNV;
        this.soSP = soSP;
        this.tangCa = tangCa;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }

    public boolean isTangCa() {
        return tangCa;
    }

    public void setTangCa(boolean tangCa) {
        this.tangCa = tangCa;
    }

    
    
    
    
    public double tienThuong(){
//        if (soSP>dinhMucSP)
//        return (soSP-dinhMucSP)*this.dongia*0.05;
//        else 
//        return 0;
        return (soSP>dinhMucSP)?((soSP-dinhMucSP)*this.dongia*0.05):0;
        
    }
    
    
    public double tienLuong(){
        return soSP*dongia +tienThuong();
    }
    
    
    public double troCap(){
        return(tangCa)? 1000000:500000;
    }
    
    
    public String thongTinNV(){
        return maNV+ " - " + soSP + " - " + ((tangCa)?"Khong tang ca":"Tang ca")+ " - "+String.format("%.2f",tienLuong())+" - "+troCap();
    }
    
    
    
}
