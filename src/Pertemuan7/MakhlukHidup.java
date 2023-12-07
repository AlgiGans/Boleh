/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan7;

/**
 *
 * @author ASUS
 */
 abstract public class MakhlukHidup {
    //atribut
    int panjang,berat,tinggi;
    String warna,nama;
    
    //method
    //abstract String bernafas();
    public abstract String bernafas(String organbernafas);
    //abstract String bergerak();
    
    String judul(){
        return "Makhluk Hidup";
    }
    
    //konstruktor
    
}
