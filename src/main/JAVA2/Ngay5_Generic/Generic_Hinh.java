/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay5_Generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hv
 * @param <T>
 */
public class Generic_Hinh<T extends Ngay5_Hinh> {
    List <T> hinhs = new ArrayList<>() ;

//    public Generic_Hinh() {
//        hinhs = new ArrayList<>();
//    }

    public List<T> getHinhs() {
        return hinhs;
    }

    public void setHinhs(List<T> hinhs) {
        this.hinhs = hinhs;
    }
    
    public void themHinh (T t){
        hinhs.add(t);
    }
    
    public int soLuongHinh (){
        return hinhs.size();
    }
    
    public double dienThichMax(){
        double max = hinhs.get(0).dienTich();
        for(T hinh:hinhs){
            if(hinh.dienTich()>max)max = hinh.dienTich();
        }
        return max ;
    }
            
    
    
    
}
