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
public abstract class Sistem_Informasi1 {
    double sal;
    abstract double saldo(double sal);
    double saldo(){
        return sal;}
    void saldo(int saldo){
        this.sal= saldo;
    }
}