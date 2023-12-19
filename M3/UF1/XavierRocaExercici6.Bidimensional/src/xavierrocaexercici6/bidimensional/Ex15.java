/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici6.bidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuari
 * Realitzar un programa que demani a l'usuari una matriu de dimensions N x M, i
construeixi un vector (array unidimensional) amb la suma de totes les columnes
de la matriu inicial.
 */
public class Ex15 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int suma, x, y;

        System.out.println("Matriu bidimensional\nDonam la x:");
        x = teclat.nextInt();
        System.out.println("Donam la y:");
        y = teclat.nextInt();
        int[][] matriu = new int[x][y];
        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                matriu[f][c] = rnd.nextInt(10);
            }
        }
        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                System.out.printf("%5d", matriu[f][c]);
            }
            System.out.println();
        }
        int[] llista = new int[x];
        for (int c = 0; c < matriu[0].length; c++) {
            suma = 0;
            for (int f = 0; f < matriu.length; f++) {
                suma = suma + matriu[f][c];
             // suma+= matriu[f][c];
            }
            llista[c] = suma;
        }
        System.out.println("Llista suma");
        for (int c = 0; c < llista.length; c++) {
            System.out.printf("%5d", llista[c]);
        }
        System.out.println("");

    }

}
