/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class BAITAP_2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("so tien goi: ");
        double tienGoi = Double.parseDouble(input.readLine());
        System.out.println("so thang goi: ");
        int thang = Integer.parseInt(input.readLine());
        float laiXuatNam = 7.6F;
        double tienLai = (tienGoi*thang)* (laiXuatNam/100/12);
        double tongSoTien = tienGoi + tienLai;
        System.out.println("tien lai: " + String.format("%.2f",tienLai));
        System.out.println("Tien nhan cuoi ki: " + String.format("%.2f", tongSoTien));
    }
    
}
