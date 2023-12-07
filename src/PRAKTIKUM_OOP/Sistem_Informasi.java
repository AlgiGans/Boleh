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
public class Sistem_Informasi {
    //atribut
    String nama,rek,atm,CS,teller;
    double sal,bunga,hasil;
   
    String nmbank,inputUser,hasilcocok;
    private String pin;
  public Sistem_Informasi(){
      pin="2218013";
      bunga=0.1;
  }
    //method
    String nama(){
        return nama;}
    String rek(){
        return rek;}
    String atm(){
        return atm;}
    String pin(){
        return pin;}
    String CS(){
        return CS;}
    String teller(){
        return teller;}
    String nmbank(){
        return nmbank;}
    double saldo(){
        return sal;}
    double saldo(double sal){
        double bung;
        bung= saldo()*bunga;
        hasil=saldo()-bung;
        return hasil;
    }
    //konstruktor
    void nama(String nama){
        this.nama = nama;
    }
    void rek(String rek){
        this.rek = rek;
    }
    void atm(String atm){
        this.atm = atm;
    }
    void pin(String pin){
        this.pin = pin;
    }
    void CS(String CS){
        this.CS= CS;
    }
    void teller(String teller){
        this.teller = teller;
    }
    void nmbank(String nmbank){
        this.nmbank = nmbank;
    }
    void saldo(int saldo){
        this.sal= saldo;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
    
    public void setInputUser(String inputUser) {
        this.inputUser = inputUser;
    }
     
    
    String cocokanpin(){
        if(pin.compareTo(inputUser)==0){
            hasilcocok="LOGIN BERHASIL!!";
        }
        else{
            hasilcocok="LOGIN GAGAL!!";
        }
        return hasilcocok;
    }

    String getText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
