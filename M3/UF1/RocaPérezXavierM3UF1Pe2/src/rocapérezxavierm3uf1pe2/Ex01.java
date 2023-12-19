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
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int dies = 0, cont = 0, pos = 0;
        double mitja = 0, suma = 0, tempMax = - 50;

        boolean esNum = false;
        do {
            System.out.println("De quants dies vols calcular la mitja?");
            if (teclat.hasNextInt()) {
                dies = teclat.nextInt();
                teclat.nextLine();
                esNum = true;
                if (dies <= 0) {
                    System.out.println("Error!! Fora de límits");
                }
            } else {
                System.out.println("Error");
                teclat.nextLine();
            }

        } while (dies <= 0 || !esNum);

        double[] temp = new double[dies];

        for (int i = 0; i < temp.length; i++) {

            esNum = false;
            do {
                System.out.printf("Dia %d: \n", i + 1);
                if (teclat.hasNextDouble()) {
                    temp[i] = teclat.nextDouble();
                    teclat.nextLine();
                    esNum = true;
                    if (temp[i] < -50 || temp[i] > 100) {
                        System.out.println("Error!! Fora de límits");
                    }
                } else {
                    System.out.println("Error");
                    teclat.nextLine();
                }

            } while (temp[i] < -50 || temp[i] > 100 || !esNum);

        }

        System.out.print("Vector generat:");

        for (int i = 0; i < temp.length; i++) {

            System.out.printf(" %.1f", temp[i]);

        }

        for (int i = 0; i < temp.length; i++) {
            suma = suma + temp[i];
        }

        mitja = suma / dies;

        System.out.printf("\nLa mitja és : %.1f", mitja);

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] < mitja) {
                cont++;
            }
        }

        System.out.printf("\nTemperatures inferiors a la mitja: %d\n", cont);

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > tempMax) {
                tempMax = temp[i];
                pos = i;
            }
        }

        System.out.printf("Temperatura màxima: %.1f (posició %d)\n", tempMax, pos);

    }
}
