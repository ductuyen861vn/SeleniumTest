/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA_SE_1_BAITAP9_KETHUA;

/**
 *
 * @author hv
 */
public class BAITAP_9_1_kibinh extends BAITAP_9_1_nguoilinh {

    public BAITAP_9_1_kibinh() {
    }

    public BAITAP_9_1_kibinh(String ten, String vuKhi, int sucManh) {
        super(ten, vuKhi, sucManh);
    }

    @Override
    public void setSucManh(int sucManh) {
        this.sucManh-=3;
    }
    
    
    
}
