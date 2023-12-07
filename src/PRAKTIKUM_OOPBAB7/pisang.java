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
public class pisang extends Buah {
    public pisang(){
        this.nama= "pisang";
    }

    @Override
    void makanbuah() {
       System.out.println(nama+"dimakan dengan dikupas kulit pisang sebelum dimakan");
    }
}
