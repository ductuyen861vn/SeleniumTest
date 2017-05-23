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
public class BAITAP_4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        Scanner input = new Scanner (System.in);
        System.out.println("Nhap a");
        float soA=input.nextFloat();
        System.out.println("Nhap b");
        float soB=input.nextFloat();
        System.out.println("Nhap c");
        float soC=input.nextFloat();
        System.out.println("Nhap d");
        float soD=input.nextFloat();
        
        float max = soA;
        float min = soA;
        
        if (soB>max) max = soB;
        if (soC>max) max = soC;
        if (soD>max) max = soD;
        
        if (soB<min) min = soB;
        if (soC<min) min = soC;
        if (soC<min) min = soC;
        
        System.out.println("So Lon Nhat La: " + max);
        System.out.println("So Be Nhat La: " + min);
        }
        catch (InputMismatchException ex){
            System.out.println("Cac so A B C D phai la so!");
        }}
        
}