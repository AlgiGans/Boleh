/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS2;

/**
 *
 * @author ASUS
 */
public class Sepatu {

    //atribut
    String ukuran;
    String warna, bahan, jenis;

    //method
    String gerakan() {
        return "Mengamankan Kaki";
    }

    String koleksi() {
        return "Beragam jenisnya";
    }

    //konstruktor
    public Sepatu() {
        this.ukuran = "36-43";
        this.bahan = "Kulit";
        this.jenis = "Formal";
        this.warna = "Hitam putih";
    }
}
