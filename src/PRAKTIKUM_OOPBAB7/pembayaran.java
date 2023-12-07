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
public abstract class pembayaran {
    abstract double hitpembayaran(double bayar);
     abstract double cekkode(String input);
      abstract void tampilkanmember();
      
      String member(G0001 member){
          return "gold";
      }
      String member(P0001 member){
          return "platinum";
      }
      String member(S0001 member){
          return "silver";
      }
}
