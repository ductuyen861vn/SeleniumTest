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
public class BAITAP_9_1_nguoilinh {
    
    String ten, vuKhi;
    int sucManh;

    public BAITAP_9_1_nguoilinh() {
    }

    public BAITAP_9_1_nguoilinh(String ten, String vuKhi, int sucManh) {
        this.ten = ten;
        this.vuKhi = vuKhi;
        this.sucManh = sucManh;
    }
    
    
    public void phuongThucChienDau(){
     this.sucManh--;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getVuKhi() {
        return vuKhi;
    }

    public void setVuKhi(String vuKhi) {
        this.vuKhi = vuKhi;
    }

    public int getSucManh() {
        return sucManh;
    }

    public void setSucManh(int sucManh) {
        this.sucManh = sucManh;
    }
    
    
    
}
