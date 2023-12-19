/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Util {

    /**
     * @param args the command line arguments
     */
    public static boolean buscarNumArr(int[] v1, int v2) {

        boolean trobat = false;

        for (int i = 0; i < v1.length; i++) {
            if (v2 == v1[i]) {
                trobat = true;
            }
        }

        return trobat;
    }

    public static int llegirInt(int v1) {

        Scanner teclat = new Scanner(System.in);

        int numInt = 0;
        boolean esInt = false;
        do {
            if (teclat.hasNextInt()) {
                numInt = teclat.nextInt();
                teclat.nextLine();
                esInt = true;
            } else {
                System.out.println("Error!!!");
                teclat.nextLine();
            }

        } while (!esInt);

        return numInt;

    }

    public static double llegirDouble(double v1) {

        Scanner teclat = new Scanner(System.in);

        double numDouble = 0;
        boolean esDouble = false;
        do {
            if (teclat.hasNextDouble()) {
                numDouble = teclat.nextDouble();
                teclat.nextLine();
                esDouble = true;
            } else {
                System.out.println("Error!!!");
                teclat.nextLine();
            }

        } while (!esDouble);

        return numDouble;

    }

}
