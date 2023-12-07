/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM_OOP.BAB5;

/**
 *
 * @author ASUS
 */
public class LuasPanjangPersegi extends BangunDatar{
    int panjang;
    int lebar;
    
   @Override
   public double luas(){
       return luas(panjang,lebar);
   }
    
}
