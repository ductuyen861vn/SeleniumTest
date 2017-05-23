/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP2;

import java.util.Scanner;

/**
 *
 * @author hv
 */
public class BAITAP_2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Chu Vi hinh Tron: ");
        int banKinh = input.nextInt();
        final float PI=3.14F;
        float chuVi= 2*PI*banKinh;
        float dienTich = PI*banKinh*banKinh;
        System.out.println("chu vi: " + chuVi);
        System.out.println("dien tich: " + dienTich);
        
    }
    
}
