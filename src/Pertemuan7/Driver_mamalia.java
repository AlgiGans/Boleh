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
public class Driver_mamalia {
    public static void main(String[] args) {
        Mamalia kuda = new Mamalia();
        kuda.panjang = 2;
        kuda.tinggi= 1;
        kuda.berat= 150;
        kuda.warna= "coklat";
        kuda.jmlkaki= 4;
        kuda.suara= "mihahaha";
        System.out.println("panjang kuda = "+kuda.panjang);
        System.out.println("tinggi kuda = "+kuda.tinggi);
        System.out.println("berat kuda = "+kuda.berat);
        System.out.println("warna kuda = "+kuda.warna);
        System.out.println("jnlkaki kuda = "+kuda.jmlkaki);
        System.out.println("suara kuda = "+kuda.suara);
        System.out.println("cara bernafas = "+kuda.bernafas());
    }
    
}
