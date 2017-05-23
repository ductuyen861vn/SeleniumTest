/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_PHUONGTHUC;

import java.util.Scanner;

/**
 *
 * @author hv
 */
public class BAITAP_7_2 {

    /**
     * @param args the command line arguments
     */
    
    public static double tinhA(double x, int n){
        double A=0;
        double A1=1;
        double A2=1;
        for (int i=1;i<=n; i++){
        A1 *=x*x+x+1;
        A2 *=x*x-x+1;
        }
        return A=A1+A2;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so x: ");
        double x = input.nextInt();
        System.out.println("Nhap mu n: ");
        int n = input.nextInt();
        double a=tinhA(x, n);
        System.out.println("Tong bieu thuc la: "+ a);
    }
    
}
