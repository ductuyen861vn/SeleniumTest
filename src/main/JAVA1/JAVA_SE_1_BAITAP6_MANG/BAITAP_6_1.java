/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP6_MANG;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hv
 */
public class BAITAP_6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Nhap so x: ");
        int x = Integer.parseInt(input.nextLine());
        Random rand= new Random();
        int tong =0;
        String chuoi="";
        int []array1= new int [x]; //khai bao mang gom n phan tu
        for ( int i=0; i<x; i++){
            array1[i]=rand.nextInt(10); //phat sinh so ngau nhien 0-10 gan vao mang
            tong +=array1[i];
        }
        
        for (int i:array1){
            chuoi +=i +" ";
        }
        System.out.println("cac gia tri co trong mang cach 1: "+ chuoi);
        System.out.println("cac gia tri co trong mang cach 2: "+ Arrays.toString(array1));
        System.out.println("Tong cac gia tri random la: " +tong);
        
        }
    
    
    }
    
    

