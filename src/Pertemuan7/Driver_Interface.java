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
public class Driver_Interface {
    public static void main(String[]args){
        Mamalia toni = new Mamalia();
        toni.nama= "toni";
        System.out.println("Nama = "+toni.nama);
        System.out.println("Melihat Siaran TV");
        System.out.println("tegangan Listrik ="+DapatkomunikasiTV.teganganListrik);
        System.out.println(toni.menyalakanTV());
        System.out.println(toni.pilihchannel());
        System.out.println(toni.beasarkanVolumeSuara());
    }
}
