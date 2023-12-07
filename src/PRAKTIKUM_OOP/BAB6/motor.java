/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM_OOP.BAB6;

/**
 *
 * @author ASUS
 */
public class motor extends KENDARAAN{
    String jenis,warna;
    int Jmlhroda;

    @Override
    String nyala() {
       return "bergerak";
    }

    boolean bergerak() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
