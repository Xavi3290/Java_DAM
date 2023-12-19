/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aceptaelreto;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class piramidearray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int blanc, negra, alt, num;

        System.out.println("Donam un número");
        num = teclat.nextInt();

        for (alt = 0; alt < num; alt++) {
            for (blanc = 0; blanc < num - alt - 1; blanc++) {
                System.out.printf(" ");
            }
            for (negra = 0; negra < (alt * 2) + 1; negra++) {
                System.out.printf("*");
            }
            System.out.println("");
        }

        char[][] matriu = new char[num][(2 * num) - 1];
        for (int f = 0; f < matriu.length; f++) {
            int c = 0;
            for (int i = 0; i < matriu.length - f - 1; i++) {
                matriu[f][c] = ' ';
                c++;
            }
            for (int i = 0; i < (f * 2) + 1; i++) {
                matriu[f][c] = '*';
                c++;
            }
        }
        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                System.out.printf("%5c", matriu[f][c]);
            }
            System.out.println();
        }

    }

}
