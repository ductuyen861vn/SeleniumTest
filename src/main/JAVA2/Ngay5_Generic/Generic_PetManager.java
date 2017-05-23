/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ngay5_Generic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author hv
 * @param <T>
 */
public class Generic_PetManager<T> {
    
    List<T> pets;

    public List<T> getPets() {
        if(pets==null){
        pets= new ArrayList<>();
        }
        return pets;
    }

    public void setPets(List<T> pets) {
        this.pets = pets;
    }
    
    public Stream streamcat (){
    return pets.stream();
    }
    
    
}
