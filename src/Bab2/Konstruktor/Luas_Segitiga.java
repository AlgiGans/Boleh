/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab2.Konstruktor;

/**
 *
 * @author ASUS
 */
public class Luas_Segitiga {
    int alas,tinggi;
    double luas;
    
    public Luas_Segitiga(){
        this.alas=10;
    }
    public double Luas_Segitiga(){
        luas = (alas*tinggi)/2;
        return luas;
    }
}
