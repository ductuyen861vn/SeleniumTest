/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_PHUONGTHUC;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hv
 */
public class BAITAP_7_3 {

    /**
     * @param args the command line arguments
     */
    
    public static int timViTri (int x, int[]array){
        int vitri =-1;
        for (int i=0; i<array.length; i++){
            if (array[i]==x)
                vitri=i;
        }
        return vitri;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang: ");
        int n=input.nextInt();
        int [] array= new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Moi nhap du lieu cho vi tri "+ i + ":");
            array[i]=input.nextInt();
        }
        System.out.println("Mang la: "+Arrays.toString(array));
        
        System.out.println("Moi nhap x:");
        int x=input.nextInt();
        
        int vitri=timViTri(x, array);
        
        if (vitri==-1)
            System.out.println("Khong tim thay vi tri");
        else
            System.out.println("Vi tri cua X la: " + vitri);
    }   
    
}
