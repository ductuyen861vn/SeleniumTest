/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay6_connection;

import java.io.Serializable;

/**
 *
 * @author hv
 */
public class Flower implements Serializable{
    
    String ten, link;
    double donGia;

    public Flower(String ten, String link, double donGia) {
        this.ten = ten;
        this.link = link;
        this.donGia = donGia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
    
    
}
