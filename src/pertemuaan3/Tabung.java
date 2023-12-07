/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuaan3;

/**
 *
 * @author ASUS
 */
public class Tabung extends Lingkaran {
     //atribut
    double luaspermukaan,volume,t;
    
    //method
    double hitluaspermukaan(){
        luaspermukaan = (2*hitluas())+(2*hitluas());
        return luaspermukaan;
    }
        double hitvolume(){
        volume = 3.14 *r*r*t;
        return volume;
    }

    //konstruktor
    public Tabung(){
        r=5;
        t=10;
    }
}
