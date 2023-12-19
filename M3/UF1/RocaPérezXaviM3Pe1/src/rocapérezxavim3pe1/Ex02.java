/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocapérezxavim3pe1;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex02 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num, fila, cont;

        System.out.println("Números per fila:");
        fila = teclat.nextInt();
        cont = 0;
        for (num = 500; num <= 700; num++) {
            if (num % 5 == 0) {
                System.out.printf("%d ", num);
                cont++;
            }
            if (cont == fila) {
                System.out.println(" ");
                cont = 0;
            }
        }
        System.out.println(" ");
        cont = 0;
        for (num = 700; num >= 500; num--) {
            if (num % 5 == 0) {
                System.out.printf("%d ", num);
                cont++;
            } else if (cont == fila) {
                System.out.println(" ");
                cont = 0;
            }
        }

    }

}
