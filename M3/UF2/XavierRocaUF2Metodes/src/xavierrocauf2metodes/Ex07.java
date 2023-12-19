/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Scanner;

/**
 *
 * @author usuari Realitza un mètode que calculi an.
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num1, num2, mult;

        System.out.println("Diguem un número");
        num1 = teclat.nextInt();
        System.out.println("Donam el número al que l'elevarem");
        num2= teclat.nextInt();
        mult= elevat (num1, num2);
        System.out.printf("El %d elevat a %d és %d\n", num1, num2, mult);

    }

    public static int elevat(int v1, int v2) {

        int resultat = 1;

        for (int i = 0; i < v2; i++) {
            resultat = resultat * v1;
        }

        return resultat;

    }

}
