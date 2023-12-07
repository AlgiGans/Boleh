/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM_OOP;

/**
 *
 * @author ASUS
 */
public class Informasi_perbankan {
        public static void main(String[]args){
        Sistem_Informasi bank = new Sistem_Informasi();
        System.out.println("      Lengkapi Data Nasabah Bank");
        System.out.println("=======================================");
        bank.nama("Algiganteng");
        bank.rek("12345678");
        bank.atm("87654321");
        bank.CS("jessica");
        bank.teller("dewi");
        bank.pin("123456");
        bank.saldo(13000000);
        bank.nmbank("Mandiri");
        System.out.println("Nama Bank = "+bank.nmbank);
        System.out.println("Nama Nasabah = "+bank.nama);
        System.out.println("Nomor Rekening = "+bank.rek);
        System.out.println("Nomor Kartu ATM = "+bank.atm);
        System.out.println("Pin ATM = "+bank.atm);
        System.out.println("Nama Customer Service = "+bank.CS);
        System.out.println("Nama Teller = "+bank.teller);
        System.out.println("\n");
        System.out.println("========= Data Nasabah =========");
        System.out.println("Nama Bank = "+bank.nmbank());
        System.out.println("Nama Nasabah = "+bank.nama());
        System.out.println("Nomor Rekening = "+bank.rek());
        System.out.println("Nomor Kartu ATM = "+bank.atm());
        System.out.println("Pin ATM = "+bank.atm());
        System.out.println("Jumlah Saldo = "+bank.saldo());
        System.out.println("Nama Customer Service = "+bank.CS());
        System.out.println("Nama Teller = "+bank.teller());
    }
}