/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM_OOP;

/**
 *
 * @author ASUS
 */
public class Data_Nasabah extends Sistem_Informasi1 implements Mahasiswa{
    String nama,rek,atm,inputUser,hasilcocok;
    private String sandi,pin;
    double saldo,bunga,hasil;
    
    public Data_Nasabah(){
        sandi="2218013";
        pin="2218013";
        bunga=0.1;
    }
    String nm(){
        return nama;
    }
    
    String norek(){
        return rek;
        
    }
    String sandi(){
        return sandi;
        
    }
    String noatm(){
        return atm;
        
    }
     public void setsandi(String sandi) {
        this.sandi = sandi;
    }
    
    public void setInputUser(String inputUser) {
        this.inputUser = inputUser;
    }
     
    
    String cocokanpin(){
        if(sandi.compareTo(inputUser)==0){
            hasilcocok="LOGIN BERHASIL!!";
        }
        else{
            hasilcocok="LOGIN GAGAL!!";
        }
        return hasilcocok;
    }

    @Override
    double saldo(double hasil) {
        double bung;
        bung= saldo()*bunga;
        hasil=saldo()-bung;
        return hasil; 
    }

    @Override
    public String Berpendidikan() {
        return "Mengerti banyak hal";
    }

    @Override
    public String Pelajar() {
       return "Memahami berbagaihal";
    }
    
}
