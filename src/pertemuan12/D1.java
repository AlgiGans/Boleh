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
public class D1 {
    public static void main(String[] args) {
        lat1 obj = new lat1();
        obj.bil1 = 20;
        obj.bil2 =0;
        try{
            System.out.println("hasil pembagian :"+obj.pembagian());
        }catch(ArithmeticException A) {
            System.out.println("kesalahan karena dibagi dengan 0");
        }
        
    }
}
