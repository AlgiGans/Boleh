/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM_OOPBAB7;

/**
 *
 * @author ASUS
 */
public class apel extends Buah {
    public apel(){
        this.nama="apel";
    }

    @Override
    void makanbuah() {
        System.out.println(nama+"dimakan dengan dikupas kulitnya atau dimakan langsung");
    }
    
}
