/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay1;

/**
 *
 * @author ADMIN
 */
public class Bai1_3_toantuException extends Exception{
    int so1;
    int so2;
   

    public Bai1_3_toantuException(int so1, int so2){
        this.so1 = so1;
        this.so2 = so2;
        
    }

    public Bai1_3_toantuException() {
    }

    @Override
    public String getMessage() {
        //return super.getMessage(); //To change body of generated methods, choose Tools | Templates.
        String chuoi = "";
        if(so1==0) chuoi = "Moi nhap so 1";
        else if (so2==0) chuoi = "Moi nhap so 2";
        return chuoi;
    }
    
    

    
}
