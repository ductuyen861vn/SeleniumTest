/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author hv
 */
public class BAITAP_4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try{
        Scanner input = new Scanner (System.in);
        System.out.print("Nhap Loai Xe: ");
        int loaiXe= input.nextInt();
        System.out.print("Nhap So KM: ");
        float soKM= input.nextFloat();
        double thanhTien;
        
        final double giaMoCua=11000;
        
        if(loaiXe!=4 && loaiXe!=7) throw new Exception();
        
        if (loaiXe==7){
            if(soKM<0.8)thanhTien=giaMoCua;
            else if (soKM<30)thanhTien=17000*soKM;
            else thanhTien=giaMoCua+14400*soKM;
        }
        else {
            if(soKM<0.8)thanhTien=giaMoCua;
            else if (soKM<30)thanhTien=16500*soKM;
            else thanhTien=giaMoCua+12400*soKM;
        }
        System.out.println("Tong Thanh Tien: "+ thanhTien);
        }
        catch (Exception ex){
            System.out.println("ERROR: Loai xe phai la 4 hoac 7");
        }
    }
    
}
