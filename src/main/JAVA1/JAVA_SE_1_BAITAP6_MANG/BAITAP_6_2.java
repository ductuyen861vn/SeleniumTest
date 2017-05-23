/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP6_MANG;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hv
 */
public class BAITAP_6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Nhap so n: ");
        int n = Integer.parseInt(input.nextLine());
        int []array1= new int [n];
        int max=0;
        int vitri=-1;
        int mangLonHonX[]=new int[n];
        int mangNhoHonX[]=new int[n];
        int viTriSoLonHonX=0;
        int viTriSoNhoHonX=0;
        String chuoiLon="";
        String chuoiBe="";
        
        //vong lap nhap gia tri cho mang
        System.out.println("Moi nhap gia tri cho mang array1: ");
        for (int i =0; i<array1.length; i++){ 
            array1[i]=input.nextInt();}
        
        
        System.out.println("Moi nhap gia tri x: ");
        int x = input.nextInt();
        
        //Xuat mang
        System.out.println("Mang Da Nhap: ");
        for(int i=0;i<array1.length; i++ ){
            System.out.print(array1[i]+" ");
            if (x==array1[i]) vitri=i;
            if (array1[i]>max) max=array1[i];
            if (array1[i]>x){
            mangLonHonX[viTriSoLonHonX]=array1[i];
            viTriSoLonHonX++;
            }else if (array1[i]<x){
            mangNhoHonX[viTriSoNhoHonX]=array1[i];
            viTriSoNhoHonX++;
            }  
        }
        
        //tìm những số lớn hơn x
        for (int y=0; y<viTriSoLonHonX; y++){
                
                chuoiLon += mangLonHonX[y] + " ";
            }
        for (int y=0; y<viTriSoNhoHonX; y++){
                
                chuoiBe += mangNhoHonX[y] + " ";
            }
        
        
        if (vitri>=0)
            System.out.println("\n" + "X xuat hien trai vitri: " + vitri);
        else 
            System.out.println("\n" + "X khong xuat hien trong mang");
            
        if (x>max)
            System.out.println("X la so lon nhat");
            
        
        else {
            System.out.println("X khong phai la so lon nhat");
            System.out.println("Những số lớn hơn x: "+ chuoiLon);
            System.out.println("Những số be hơn x: "+ chuoiBe);
        }
        
        
    }
}
        
            

