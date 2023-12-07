/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuaan3;

/**
 *
 * @author ASUS
 */
public class B {
     public static void main(String[] args) {
        Tabung T1 = new Tabung();
        System.out.println("jari-jari="+T1.r);
        System.out.println("luaspermukaan tabung="+T1.hitluas());
        System.out.println("luas volume="+T1.hitvolume());
}
}
