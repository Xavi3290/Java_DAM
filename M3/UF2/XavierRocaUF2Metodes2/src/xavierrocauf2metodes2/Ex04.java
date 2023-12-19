/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes2;

import static xavierrocauf2metodes2.Util.llegirInt;

/**
 *
 * @author usuari Un venedor realitza un negoci per X quantitat de diners i la
 * seva comissió serà pagada d'acord al següent: Menys de 20.000 rep bonificació
 * de 7000 més el 2 % de les vendes . Entre 20000 i 50000 rep una bonificació de
 * 15.000 més 3% de les vendes . Més de 50000 rep bonificació de 20.000 més el
 * 12 % de les vendes . Implementeu el mètode calcula_bonificació.
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int vendes = 0;
        double cobrar = 0;
       
        vendes = llegirInt("Diners que el venedor a fet venent:");
        cobrar = calcula_bonificació(vendes);
        System.out.printf("El venedor cobrara %.1f\n", cobrar);

    }

    /**
     * Et calcula la bonificació
     * @param v1 els diners que ha fet
     * @return els diners que cobrarà
     */
    
    public static double calcula_bonificació(int v1) {

        double diners = 0;

        if (v1 < 20000) {
            diners = v1 * 2 / 100 + 7000;
        } else if (v1 > 20000 && v1 < 50000) {
            diners = v1 * 3 / 100 + 15000;
        } else if (v1 > 50000) {
            diners = v1 * 12 / 100 + 20000;
        } 

        return diners;

    }

}
