/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

/**
 *
 * @author ASUS
 */
public class Gaji {
    
    //atribut
    int Gapok;
    int  T_hadir;
    int J_lembur;
    int Gatot;
    
    //konstruktor
    public Gaji(){
        Gapok=3200000;
        T_hadir=15000;
        J_lembur=40000;
    }
    
    //method hitung gaji (1)-->Karyawan
    int hitGaji(){
        Gatot=Gapok;
        return Gatot;
    }
     //method hitung gaji (2)-->Sekertaris
    int hitGaji(int jmlhadir){
        Gatot=Gapok + (jmlhadir * T_hadir);
        return Gatot;
    }
      //method hitung gaji (3)-->Manager
    int hitGaji(int jmlhadir,int jmlLembur){
        Gatot=Gapok + (jmlhadir * T_hadir)+(jmlLembur*J_lembur);
        return Gatot;
    }
}
