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
public class driverclass {
     public static void main(String[] args) {
        manusia Manusia = new manusia();
        Buah apel = new apel();
        Buah pisang = new pisang();
        Manusia.makanbuah(apel);
        Manusia.makanbuah(pisang);
    }
}
