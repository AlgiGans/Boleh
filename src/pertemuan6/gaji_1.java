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
public class gaji_1{
    int GajiPokok;
    int HrLembur;
    int HrHadir;
    int GajiTotal;
    int jmlhadir,Jlembur;
    String Nama;

    public gaji_1() {
        GajiPokok = 3000000;
        HrLembur = 50000;
        HrHadir = 15000;
        jmlhadir = 0;
        Jlembur = 0;
    }
    public void Jmlhadir(int jmlhadir) {
        this.jmlhadir = jmlhadir;
    }
    public void Jlembur(int Jlembur) {
        this.Jlembur = Jlembur;
    }
     int hitGaji(){
    GajiTotal=GajiPokok;
       return GajiTotal; }
     void Nama(String Nama){
        this.Nama = Nama;
    }
}
