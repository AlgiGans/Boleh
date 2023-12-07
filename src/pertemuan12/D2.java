/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan12;

/**
 *
 * @author ASUS
 */
public class D2 {
    public static void main(String[] args) {
        lat2 obj = new lat2();
        for (int i =0;i<=2;i++){
            System.out.println(obj.nama[i]);
      
        }
         //obj.nama[3]="odgj";
         //System.out.println(obj.nama[3]);
    try{
     obj.nama[3]="odgj";
         System.out.println(obj.nama[3]);
 
    }catch(ArithmeticException A){
        System.out.println("salah hitung");
    }
    catch(ArrayIndexOutOfBoundsException A){
        System.out.println("Index melebihi");
    }
}
}
