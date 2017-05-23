/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP5_VONGLAP;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Nhap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap so a: ");
        int soTP=input.nextInt();
        String soNP="";
//        
//        System.out.println("toan tu : "+ (a/=3));
        soNP=soNP+String.valueOf(soTP%2);
        System.out.println("ketqua la:"+ soNP);
    }
    
}
