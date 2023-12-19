/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rocapérezxavim3pe1;

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

        int num, cont = 0, suma = 0;
        double mitja;
        final int REP = 6;

        do {
            System.out.println("Introdueix un número:");
            num = teclat.nextInt();
            if (num < 0 || num > 10) {
                System.out.printf("Aquest úmero no el tindré en compte.\n");
                //cont--;
            } else {
                suma = suma + num;
                cont++;
            }
        } while (cont < REP);
        mitja = suma / REP;
        System.out.printf("La mitjana d'aquests números és %.2f(%d/%d)\n", mitja, suma, REP);
    }

}
