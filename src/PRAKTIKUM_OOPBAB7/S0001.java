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
public class S0001 extends pembayaran{
    public String nama,alamat,kode;
    public int saldo;
    double diskon,bayar,total;
    public S0001(){
        this.nama="1318";
        this.kode="S0001";
        this.saldo=200000;
        this.alamat="malang";
    }
    public double hasil(){
        return diskon;
    }
   double cekkode(String input){
       if(input.compareTo(kode)==0){
           diskon=0.1;
       }else{
           diskon=0;
       }
       return diskon;
   }
   double hitpembayaran (double bayar){
       diskon=bayar*diskon;
       total=bayar-diskon;
        return total;
   }
   double potsaldo(){
       return this.saldo-total;
   }
   void tampilkanmember(){
       System.out.println("member S0001 dengan diskon 10%");
   }
}
