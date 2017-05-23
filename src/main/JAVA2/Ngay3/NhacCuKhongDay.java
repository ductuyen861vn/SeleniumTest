/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay3;

/**
 *
 * @author hv
 */
public class NhacCuKhongDay extends NhacCu {
    String suDung;

    public NhacCuKhongDay(String suDung, String ten, String hinh) {
        super(ten, hinh);
        this.suDung = suDung;
    }
    
    

    @Override
    public String choiNhac() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return "Phat ra am thanh khi tac dong vao "+ this.suDung;
    }
    
    
}
