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
public class PhepTinh {
    int so1;
    int so2;
    
    public PhepTinh (int nhapSo1, int nhapSo2){
        this.so1=nhapSo1;
        this.so2=nhapSo2;
    }
    
    
    
    public int tinhCong (){
        return this.so1+this.so2;
    }
    
    public int tinhTru (){
        return this.so1-this.so2;
    }
    
    public int tinhNhan (){
        return this.so1*this.so2;
    }
    
    public int tinhChia (){
        return this.so1/this.so2;
    }
    
    

    
    
    
}
