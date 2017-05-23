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
public class BAITAP_2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap chuoi thu 1: ");
        String chuoi1=input.nextLine();
        System.out.println("Nhap chuoi thu 2: ");
        String chuoi2=input.nextLine();
        System.out.println("Nhap chuoi thu 3: ");
        String chuoi3=input.nextLine();
        System.out.println("Nhap vi tri: ");
        int viTri=input.nextInt();
        System.out.println("Chieu dai chuoi 1: " + chuoi1.length());
        System.out.println("Chieu dai chuoi 2: " + chuoi2.length());
        System.out.println("Chieu dai chuoi 3: " + chuoi3.length());
        System.out.println("Ket qua so sanh chuoi 2 so vs 1: "+ chuoi1.compareTo(chuoi2));
        System.out.println("Vi tri xuat hien cua chuoi 3 trong chuoi 1: "+ chuoi1.indexOf(chuoi3));
        System.out.println("Get chuoi tu vi tri chuoi 1: " + chuoi1.substring(viTri));
    }
    
}
