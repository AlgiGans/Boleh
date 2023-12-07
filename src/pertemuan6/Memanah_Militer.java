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
public class Memanah_Militer {
    public static void main(String[] args) {
        karyawan abc = new karyawan();
        sekretaris def = new sekretaris();
        manager ghi = new manager();
        System.out.println("Karyawan = "+abc.fokus()+", "+abc.membidik()+", "+abc.menggunakanbusur());
        System.out.println("Sekretaris = "+def.fokus()+", "+def.membidik()+", "+def.menggunakanbusur());
        System.out.println("Manager = "+ghi.KuatFisik()+", "+ghi.MemegangSenjata()+", "+ghi.Terlatih()+", \n          "+ghi.Tertib()+", "+ghi.fokus()+", "+ghi.membidik()+", "+ghi.menggunakanbusur());
    }
}
