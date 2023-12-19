/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes2;

import static xavierrocauf2metodes2.Util.llegirInt;

/**
 *
 * @author usuari Llegir x , y i z compareu i si almenys dos són iguals.
 * Implementeu el mètode fan_parella.
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int x = 0, y = 0, z = 0;
        boolean parella = true;
        
        x = llegirInt("Valor de x:");        
        y = llegirInt("Valor de y:");        
        z = llegirInt("Valor de z:");

        fan_parella(x, y, z);

        if (parella) {
            System.out.println("És parella");
        } else {
            System.out.println("No es parella");
        }

    }

    /**
     * Verifica un boolean de si dos números de tres són iguals
     * @param v1 valor 1
     * @param v2 valor 2
     * @param v3 valor 3
     * @return true o false
     */
    
    public static boolean fan_parella(int v1, int v2, int v3) {

        boolean parella;

        if (v1 == v2 || v1 == v3 || v2 == v3) {
            parella = true;
        } else {
            parella = false;
        }

        return parella;
    }

}
