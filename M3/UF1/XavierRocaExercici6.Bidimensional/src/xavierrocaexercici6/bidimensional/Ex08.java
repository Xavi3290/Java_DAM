/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici6.bidimensional;

import java.util.Scanner;

/**
 *
 * @author Xavi
 * Crear i carregar una matriu 10 x 10, mostrar la suma de cada fila i de cada
columna (caldrà fer un recorregut per files i un altre per columnes)
 */
public class Ex08 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        /*-
        int[][] matriu = new int[10][10];
        int[][] matriu2 = new int[10][10];
        int[][] suma = new int[10][10];

        System.out.println("Primera matriu");
        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                System.out.printf("Esciu un numero en la posició %d, %d: \n", f, c);
                matriu[f][c] = teclat.nextInt();
            }
        }
        System.out.println("Segona matriu");
        for (int f = 0; f < matriu2.length; f++) {
            for (int c = 0; c < matriu2[f].length; c++) {
                System.out.printf("Esciu un numero en la posició %d, %d: \n", f, c);
                matriu2[f][c] = teclat.nextInt();
            }
        }
        System.out.println("Primera matriu");
        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                System.out.printf("%5d ", matriu[f][c]);
            }
            System.out.println();
        }
        System.out.println("Segona matriu");
        for (int f = 0; f < matriu2.length; f++) {
            for (int c = 0; c < matriu2[f].length; c++) {
                System.out.printf("%5d ", matriu2[f][c]);
            }
            System.out.println();
        }
        for (int f = 0; f < suma.length; f++) {
            for (int c = 0; c < suma[f].length; c++) {
                suma[f][c] = matriu[f][c] + matriu2[f][c];
            }
        }
        System.out.println("Suma de matrius");
        for (int f = 0; f < suma.length; f++) {
            for (int c = 0; c < suma[f].length; c++) {
                System.out.printf("%5d ", suma[f][c]);
            }
            System.out.println();
        }
        System.out.println("Per columnes");
        for (int c = 0; c < suma[0].length; c++) {
            for (int f = 0; f < suma.length; f++) {
                System.out.printf("%5d ", suma[f][c]);
            }
            System.out.println();
        }
         */
        int[][] matriu = new int[10][10];
        int suma;

        System.out.println("Primera matriu");
        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                System.out.printf("Esciu un numero en la posició %d, %d: \n", f, c);
                matriu[f][c] = teclat.nextInt();
            }
        }
        for (int f = 0; f < matriu.length; f++) {
            suma = 0;
            for (int c = 0; c < matriu[f].length; c++) {
                suma = suma + matriu[f][c];
                // suma+=matriu[f][c];  es lo mismo que la linea anterior
            }
            System.out.printf("La suma de la fila %d és %d\n", f, suma);
        }
        for (int c = 0; c < matriu[0].length; c++) {
            suma = 0;
            for (int f = 0; f < matriu[c].length; f++) {
                suma = suma + matriu[f][c];
            }
            System.out.printf("La suma de la columna %d és %d\n", c, suma);
        }
    }

}
