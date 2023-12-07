/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM_OOP.BAB9;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Lat_Excaption {
    public static void main(String[] args) {
        try{
        int a,b,hasil;
     Scanner keyboard = new Scanner(System.in);
     System.out.print("=========Program Pembagian========");
     System.out.print("Masukkan angka 1 = ");
     a = Integer.parseInt(keyboard.next());
     System.out.print("Masukkan angka 2 = ");
     b = Integer.parseInt(keyboard.next());
    hasil = a/b;
    System.out.println(Integer.toString(hasil));
        }catch(ArithmeticException c){
            JOptionPane.showMessageDialog(null,"Nilai Pembagi tidak boleh 0 !!","Warning",2);
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(null,"Input yang anda masukkan huruf bukan angka !!","Warning",2);
        }finally{
            System.out.println("Trimakasi sudah menjalankan program");
        }
    }
}
