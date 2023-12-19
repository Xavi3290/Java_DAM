/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rocapérezxavierm3uf1pe2;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int treb = 0, treb2 = 0;
        double des = 0, suma = 0, mitja = 0;
        final int MES = 3;

        boolean esNum = false;
        do {
            System.out.print("Nº de treballadors: ");
            if (teclat.hasNextInt()) {
                treb = teclat.nextInt();
                teclat.nextLine();
                esNum = true;
                if (treb <= 0) {
                    System.out.println("Error!! Al menys te que haber-hi un treballador");
                }
            } else {
                System.out.println("Error");
                teclat.nextLine();
            }

        } while (treb <= 0 || !esNum);

        int[][] matriu = new int[treb][MES];

        for (int f = 0; f < matriu.length; f++) {
            System.out.printf("Treballador %d \n", f + 1);
            for (int c = 0; c < matriu[f].length; c++) {

                esNum = false;
                do {

                    System.out.printf("Mes %d: ", c + 1);
                    if (teclat.hasNextDouble()) {
                        des = teclat.nextDouble();
                        teclat.nextLine();
                        esNum = true;
                        if (des < 0 || des > 400) {
                            System.out.println("Error!! Fora dels limits");
                        }
                    } else {
                        System.out.println("Error");
                        teclat.nextLine();
                    }

                } while (des < 0 || des > 400);
            }
            System.out.println();
        }

        for (int c = 0; c < matriu[0].length; c++) {
            suma = 0;
            for (int f = 0; f < matriu[c].length; f++) {
                suma = suma + matriu[f][c];
            }
            mitja = suma / treb;
            System.out.printf("Mitja mes %d: %.2f \n", c, mitja);
        }

        esNum = false;
        do {
            System.out.printf("Introdueix Treballador (de 1 a %d):\n", treb);
            if (teclat.hasNextInt()) {
                treb2 = teclat.nextInt();
                teclat.nextLine();
                esNum = true;
                if (treb2 <= 0 || treb2 > treb) {
                    System.out.println("Error!! No hi ha aquest treballador");
                }
            } else {
                System.out.println("Error");
                teclat.nextLine();
            }

        } while (treb2 <= 0 || treb2 > treb || !esNum);

        for (int c = treb2; c < c + 1; c++) {
            suma = 0;
            for (int f = 0; f < matriu[c].length; f++) {
                suma = suma + matriu[f][c];
            }
            System.out.printf("Despeses: %.2f \n", suma);
        }
    }

}
