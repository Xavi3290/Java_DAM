/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocam3uf1pt1;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex02 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String vaixell, clase;
        double temps, resultat;
        final double LIMIT = 70;
        char ch;

        System.out.println("Nom vaixell:");
        vaixell = teclat.nextLine();
        System.out.println("Indica la classe:");
        clase = teclat.nextLine();
        ch = clase.charAt(0);
        System.out.println("Indica el temps que ha fet en minuts:");
        temps = teclat.nextDouble();

        if (ch == 'A') {
            resultat = temps * 1.2;
            System.out.printf("El temps obtingut és de: %.1f \n", resultat);
            if (resultat >= LIMIT) {
                System.out.printf("%s NO es classifica. \n", vaixell);
            } else {
                System.out.printf("%s es classifica\n", vaixell);
            }
        }
        if (ch == 'B') {
            resultat = temps * 1.1;
            System.out.printf("El temps obtingut és de: %.1f \n", resultat);
            if (resultat >= LIMIT) {
                System.out.printf("%s NO es classifica. \n", vaixell);
            } else {
                System.out.printf("%s es classifica \n", vaixell);
            }
        }
        if (ch == 'C') {
            System.out.printf("El temps obtingut és de: %.1f \n", temps);
            if (temps >= LIMIT) {
                System.out.printf("%s NO es classifica. \n", vaixell);
            } else {
                System.out.printf("%s es classifica. \n", vaixell);
            }
        }

    }

}
