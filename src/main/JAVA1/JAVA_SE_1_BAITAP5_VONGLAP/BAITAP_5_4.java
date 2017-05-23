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
public class BAITAP_5_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap so x: ");
        double x=input.nextDouble();
        double tongChan=0, tongLe=0, tich=1, tichChia3=1;
        boolean chia3=false;
        
        for (int i=1; i<=x; i++){
            if (i%2==0) tongChan +=i;
            else tongLe +=i;
            tich *=i;
            if (i%3==0){
                chia3=true;
                tichChia3 *=i;
            }
            
        }
        
        if (chia3==false)tichChia3=0;
                
        System.out.println("Tong chan la:"+tongChan);
        System.out.println("Tong le la: "+tongLe);
        System.out.println("Tich den x la: "+tich);
        System.out.println("Tich chia het cho 3 la: "+tichChia3);
    }
    
}
