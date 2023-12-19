/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes2;

import static xavierrocauf2metodes2.Util.llegirInt;

/**
 *
 * @author usuari Llegir dos nombres per fer una divisió . Si el segon nombre és
 * zero , imprimiu divisió impossible.
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        int num1, num2;

        num1 = llegirInt("Primer número:");
        num2 = llegirInt("Segon número");
        divisio(num1, num2);

    }

    /**
     * Mostra la divisió entre dos números
     *
     * @param v1 el primer número de la divisió (dividendo)
     * @param v2 el segon número de la divisió (divisor)
     */
    public static void divisio(int v1, int v2) {

        double resu;

        if (v2 == 0) {
            System.out.println("Divisió impssible");
        } else {
            resu = v1 / v2;
            System.out.printf("El resultat de %d / %d = %.1f\n", v1, v2, resu);
        }
    }

}
