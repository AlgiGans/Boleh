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
public  class karyawan extends gaji implements Driver_Memanah{
    String id,nm;
    int jmlhadir;
     void nm(String nm){
        this.nm = nm;
    }

    public karyawan() {
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
        GajiTotal = GajiPokok;
        return GajiTotal;
    }

    @Override
    public  String fokus(){
         return "melihat satu arah";
    }

    @Override
    public  String menggunakanbusur(){
           return "Ahli dalam menggunakan busur";
    }

    @Override
    public  String membidik(){
         return "fokus menuju satu titik";
    }

    @Override
    int hitGaji(int jmlHariLembur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int hitGaji(int jmlHariLembur, int jmlHadir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
