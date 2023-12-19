/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes2;

import static xavierrocauf2metodes2.Util.llegirInt;

/**
 *
 * @author usuari Tenim el següent menú: 1.Suma 2.Resta 3.Producte 4.Divisió
 * 5.Potència. Escollir una opció i realitzar l'operació amb dos nombres que
 * seran llegits de teclat . Implementeu 1 mètode per opció.
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1 = 0, num2 = 0, ele = 0;
        double resu;
       
        num1 = llegirInt("Primer número:");        
        num2 = llegirInt("Segon número");        
        ele = llegirInt("1.Suma\n2.Resta\n3.Producte\n4.Divisió\n5.Potència");
        switch (ele) {
            case 1:
                resu = suma(num1, num2);
                System.out.println(resu);
                break;
            case 2:
                resu = resta(num1, num2);
                System.out.println(resu);
                break;
            case 3:
                resu = producte(num1, num2);
                System.out.println(resu);
                break;
            case 4:
                resu = divisio(num1, num2);
                System.out.println(resu);
                break;
            case 5:
                resu = potencia(num1, num2);
                System.out.println(resu);
                break;
            default:
                System.out.println("Error");
                break;
        }

    }

    /**
     * Calcula la suma entre dos valors
     *
     * @param v1 primer valor
     * @param v2 segon valor
     * @return la suma
     */
    public static int suma(int v1, int v2) {
        int suma;
        suma = v1 + v2;
        return suma;
    }

    /**
     * Calcula la resta entre dos valors
     *
     * @param v1 primer valor
     * @param v2 segon valor
     * @return la resta
     */
    public static int resta(int v1, int v2) {
        int resta;
        resta = v1 - v2;
        return resta;
    }

    /**
     * Calcula el producte entre dos valors
     *
     * @param v1 primer valor
     * @param v2 segon valor
     * @return el producte
     */
    public static double producte(int v1, int v2) {
        double mult;
        mult = v1 * v2;
        return mult;
    }

    /**
     * Calcula la divisió entre dos valors, si el segon valor és 0 et retorna
     * 0000
     *
     * @param v1 primer valor
     * @param v2 segon valor
     * @return la divisio
     */
    public static double divisio(int v1, int v2) {
        double div;
        if (v2 == 0) {
            div = 0000;
        } else {
            div = v1 / v2;
        }
        return div;
    }

    /**
     * Calcula la potencia entre dos valors
     *
     * @param v1 primer valor
     * @param v2 segon valor
     * @return la potencia
     */
    public static double potencia(int v1, int v2) {
        double pot = 1;
        for (int i = 0; i < v2; i++) {
            pot = pot * v1;
        }
        return pot;
    }
}
