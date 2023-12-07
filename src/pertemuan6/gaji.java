/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;

/**
 *
 * @author ASUS
 */
public abstract class gaji {
    int GajiPokok;
    int HrLembur;
    int HrHadir;
    int GajiTotal;

    public gaji() {
        GajiPokok = 3000000;
        HrLembur = 50000;
        HrHadir = 15000;
    }
    
    abstract int hitGaji();
        //GajiTotal = GajiPokok;
        //return GajiTotal;
    //}
    
   abstract  int hitGaji(int jmlHariLembur) ;
        //GajiTotal = GajiPokok + (HrLembur * jmlHariLembur);
        //return GajiTotal;
    //}
    
    abstract int hitGaji(int jmlHariLembur, int jmlHadir) ;
     //   GajiTotal = GajiPokok + (HrLembur * jmlHariLembur) + (HrLembur * jmlHadir);
       // return GajiTotal;
    //}
}
