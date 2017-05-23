/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP5_VONGLAP;

import java.util.Scanner;

/**
 *
 * @author hv
 */
public class BAITAP_5_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap so x: ");
        double x=input.nextDouble();
        int dem=0;
        for (int i=1; i<=x; i++){
            if(x%i==0) 
                dem++;
        }
        System.out.println("dem la: "+dem);
        if (dem==2) System.out.println("x la so nguyen to");
        else System.out.println("x khong la so Nguyen to");
    }
    
}
