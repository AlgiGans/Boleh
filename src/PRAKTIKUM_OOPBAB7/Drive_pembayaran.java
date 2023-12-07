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
public class Drive_pembayaran {
    public static void main(String[] args) {
        pembayaran payment;
        payment= new P0001();
        payment.tampilkanmember();
        if(payment instanceof P0001){
            P0001 p0001=(P0001)payment;
            System.out.println("jenis member "+p0001.member(p0001));
            System.out.println("Total pembelian "+p0001.hitpembayaran(50000));
            System.out.println("sisa saldo "+p0001.potsaldo());
        }
        
    }
    
}
