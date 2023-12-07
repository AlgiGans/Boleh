

















/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author ASUS
 */
public class PIN {
    
    String nama;
    private String inputUser;
    private String pin;
    String hasilcocok;
    
    public PIN() {
        pin = "2218013";
    }

    public void setInputUser(String inputUser) {
        this.inputUser = inputUser;
    }
    
    String cocokkanpin(){
        if(pin.compareTo(inputUser)==0){
            hasilcocok="LOGIN BERHASIL!!";
        }
        else{
            hasilcocok="LOGIN GAGAL!!";
        }
        return hasilcocok;
    }
    
}
