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
public class Mamalia extends MakhlukHidup implements DapatkomunikasiTV{
        //atribut
        int jmlkaki;
        String suara;

    @Override
    public String bernafas(String organbernafas) {
        return "Bernafas Menggunakan Paru-paru";
    }
        
    @Override
    public String menyalakanTV() {
      return"Tekan tombol simbol lingkaran bergaris tengah vertikal";
    }

    @Override
    public String pilihchannel() {
       return"Tekan tombol antara 0 - 9";
    }

    @Override
    public String beasarkanVolumeSuara() {
       return"Tekan sebelah kanan tombol segitiga";
    }
      
    
    
}
