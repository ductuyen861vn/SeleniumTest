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
public class BAITAP_9_1_bobinh extends BAITAP_9_1_nguoilinh {

    public BAITAP_9_1_bobinh() {
    }

    public BAITAP_9_1_bobinh(String ten, String vuKhi, int sucManh) {
        super(ten, vuKhi, sucManh);
    }

    @Override
    public void phuongThucChienDau() {
        sucManh-=2;
    }
    
    
    
}
