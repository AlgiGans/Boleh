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
public class Lingkaran {
    //atribut
    double r,luas,keliling;
    
    //method
    double hitluas(){
        luas = 3.14 *r*r;
        return luas;
    }
    double hitkeliling(){
        keliling = 2*3.14*r;
        return keliling;
    }
    //konstruktor
    public Lingkaran(){
        r=5;
    }
}
