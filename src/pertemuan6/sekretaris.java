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
public  class sekretaris extends gaji implements Driver_Memanah{
     String Id,nm;
    public sekretaris() {
        GajiPokok = 3300000;
        HrHadir = 15000;
    }
    void nm(String nm){
        this.nm = nm;
    }
    void Id(String Id){
        this.Id = Id;
    }
    String Id(){
        return Id;
    }
    @Override
    int hitGaji(int jmlhadir) {
        GajiTotal = GajiPokok + (HrHadir * jmlhadir);
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
    int hitGaji() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int hitGaji(int jmlHariLembur, int jmlHadir) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
