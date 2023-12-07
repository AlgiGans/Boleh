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
public class Driver_Pisces {
     public static void main(String[] args) {
        Pisces mujair = new Pisces();
        mujair.panjang = 10;
        mujair.tinggi=5;
        mujair.berat=150;
        mujair.warna="Pink";
        mujair.jmlsirip=2;
        mujair.bentuk_ekor="Tiga Bersegi";
        System.out.println("panjang mujair = "+mujair.panjang);
        System.out.println("tinggi mujair = "+mujair.tinggi);
        System.out.println("berat mujair = "+mujair.berat);
        System.out.println("warna mujair = "+mujair.warna);
        System.out.println("jmlsirip mujair = "+mujair.jmlsirip);
        System.out.println("Bentuk ekor= "+mujair.bentuk_ekor);
        System.out.println("cara bernafas = "+mujair.bernafas());
    }
    
    
}
