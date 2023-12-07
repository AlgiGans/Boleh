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
public  class manager extends gaji implements Driver_Memanah,Driver_Militer{
    String Id,nm;
    public manager() {
        GajiPokok = 3400000;
        HrHadir = 12000;
        HrLembur = 26000;
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
    int hitGaji(int jmlhadir, int Jlembur) {
        GajiTotal = GajiPokok + (HrLembur * Jlembur) + (HrHadir * jmlhadir);
        return GajiTotal;
    }

    @Override
    public  String fokus(){
        return "melihat satu arah";
    }

    @Override
    public String menggunakanbusur(){
        return "Ahli dalam menggunakan busur";
    }

    @Override
    public  String membidik(){
        return "fokus menuju satu titik";
    }

    @Override
    public  String Terlatih(){
        return "Mudah dalam menjalankan perintah";
    }

    @Override
    public  String Tertib(){
        return "Taat dalam aturan kantor";
    }

    @Override
    public  String KuatFisik(){
        return "Tidak cepat letih dalam pekerjaan";
    }

    @Override
    public  String MemegangSenjata(){
        return "Dapat ahli dalam menggunakan senjata";
    }

    @Override
    int hitGaji() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    int hitGaji(int jmlHariLembur) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
