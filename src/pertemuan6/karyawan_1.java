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
public class karyawan_1 extends gaji_1{
    String id,nm;
    int jmlhadir;
     void nm(String nm){
        this.nm = nm;
    }

    public karyawan_1() {
        GajiPokok = 3000000;
    }
    String Id(){
        return id;
    }
    void Id(String Id_karyawan){
        this.id = id;
    }
    @Override
    int hitGaji() {
        GajiTotal=GajiPokok;
        return GajiTotal; 
    }
}
