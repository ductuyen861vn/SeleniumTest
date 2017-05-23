/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author hv
 */
public class BAITAP_2_1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /* TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Nhap so luong: ");
        int soLuong = input.nextInt();
        System.out.print("Don gia: ");
        double donGia = input.nextDouble();
        double tongThanhTien = soLuong * donGia;
        System.out.print("Tong Thanh Tien: " + tongThanhTien);*/
        
        
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nhap So Luong: ");
        int soLuong = Integer.parseInt(input.readLine());
        System.out.print("Don Gia: ");
        double donGia = Integer.parseInt(input.readLine());
        double tongThanhTien = soLuong * donGia;
        System.out.print("Tong Thanh Tien: " + tongThanhTien);
        
        
    }
    
}
