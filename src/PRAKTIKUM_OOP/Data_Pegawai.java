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
public class Data_Pegawai extends Sistem_Informasi1{
    int masuk,keluar,total;
    String nm,bagian,inputUser;
    private String id;
    
    public Data_Pegawai(){
        id="2218013";
    }
    String nm(){
        return nama();
    }
    String id(){
        return id;
    }
    String bagian(){
        return bagian;
    }
    int masuk (){
        return masuk;
    }
    int keluar (){
        return keluar;
    }
    int total (){
        int tot;
        tot=keluar-masuk;
        return tot;
    }
    
     public void setid(String id) {
        this.id = id;
    }
    
    public void setInputUser(String inputUser) {
        this.inputUser = inputUser;
    }
     
    
    String cocokanid(){
        if(id.compareTo(inputUser)==0){
            hasilcocok="LOGIN BERHASIL!!";
        }
        else{
            hasilcocok="LOGIN GAGAL!!";
        }
        return hasilcocok;
    }
}
