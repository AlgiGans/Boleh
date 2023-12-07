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
public class Prisma_segitiga extends Segitiga{
    double tinggiPrisma,vol;
    double volumePrisma(){
        vol = (luas()*tinggiPrisma);
        return vol;
    }
    
}
