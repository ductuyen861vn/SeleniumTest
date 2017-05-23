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
public class BAITAP_8_1_DiaCD extends Exception {
    
    String maCD;
    String tenCD;
    String caSi;
    int soBaiHat;
    float giaThanh;

    public BAITAP_8_1_DiaCD(String maCD, String tenCD, String caSi, int soBaiHat, float giaThanh) {
        this.maCD = maCD;
        this.tenCD = tenCD;
        this.caSi = caSi;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public BAITAP_8_1_DiaCD() {
    }
    

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }
    
    
    public String xuat(){
        return "MA CD: " + this.maCD+ "TEN CD: " + this.tenCD+ "TEN CASI: "+ this.caSi+ "SO BAI HAT: " + String.valueOf(this.soBaiHat) +"Đơn Giá: "+String.valueOf(this.giaThanh) + "\n";
    }

    @Override
    public String getMessage() {
//        return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
        String chuoi="";
        if (maCD.length()!=5)
            chuoi="MaCD bao gom 5 ki tu";
        else if (soBaiHat<10)
            chuoi="So bai hat phai lon hon 10 bai";
        return
                chuoi;
    }
    
    
    
            
    
    
    
}
