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
public class BAITAP_5_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner (System.in);
        System.out.println("Nhap so mu n: ");
        int n = input.nextInt();
        System.out.println("Nhap so x: ");
        double x=input.nextDouble();
        
        double tong1=1;
        double tong2=1;
        double tong;
        for (int i=1; i<=n; i++){
            tong1 *=(x*x+x+1);
            tong2 *=(x*x-x+1);
        }
        tong=tong1+tong2;
        System.out.println("tong la: "+tong);
    }
    
}
