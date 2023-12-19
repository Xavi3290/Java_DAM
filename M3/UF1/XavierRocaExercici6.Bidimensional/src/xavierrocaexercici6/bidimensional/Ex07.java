/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici6.bidimensional;

import java.util.Scanner;

/**
 *
 * @author Xavi
 * Realitza un programa que crei i carregui dues matrius de 3 x 3, demanant les
dades al usuari i desprès mostrar la matriu suma (sumar posició a posició).
 */
public class Ex07 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int[][] matriu = new int[3][3];
        int[][] matriu2 = new int[3][3];
        int[][] suma = new int[3][3];

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

    }

}
