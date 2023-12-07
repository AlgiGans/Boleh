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
public class Olahraga {

    public static void main(String[] args) {
        Sepatu SepatuOlahraga = new Sepatu();
        SepatuOlahraga.bahan = "Kulit";
        SepatuOlahraga.jenis = "Formmal";
        SepatuOlahraga.ukuran = "36-43";
        SepatuOlahraga.warna = "Hitam putih";
        System.out.println("bahan Sepatu = " + SepatuOlahraga.bahan);
        System.out.println("jenis Sepatu = " + SepatuOlahraga.jenis);
        System.out.println("ukuran Sepatu = " + SepatuOlahraga.ukuran);
        System.out.println("warna Sepatu = " + SepatuOlahraga.warna);
    }
}
