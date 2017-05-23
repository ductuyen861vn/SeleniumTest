/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay2;

/**
 *
 * @author hv
 */
public class Tuvungtienganh_class {
    
    String word;
    String link;

    public Tuvungtienganh_class(String word, String link) {
        this.word = word;
        this.link = link;
    }

    public Tuvungtienganh_class() {
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
       // return super.toString(); //To change body of generated methods, choose Tools | Templates.
        //Phuong thuc xuat chuoi thong tin hay lam
        return this.word;
    }
    
    
    
}
