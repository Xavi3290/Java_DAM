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
 * Realitzar un programa que demani a l'usuari dues matrius de dimensions N x M, i
construeixi una nova matriu representant la suma de les matrius inicials

 */
public class Ex16 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int x, y;

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
        System.out.println("Matriu bidimensional 2\nDonam la x:");
        x = teclat.nextInt();
        System.out.println("Donam la y:");
        y = teclat.nextInt();
        int[][] matriu2 = new int[x][y];
        for (int f = 0; f < matriu2.length; f++) {
            for (int c = 0; c < matriu2[f].length; c++) {
                matriu2[f][c] = rnd.nextInt(10);
            }
        }
        System.out.println("Primera Matriu");
        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                System.out.printf("%5d", matriu[f][c]);
            }
            System.out.println();
        }
        System.out.println("Segona Matriu");
        for (int f = 0; f < matriu2.length; f++) {
            for (int c = 0; c < matriu2[f].length; c++) {
                System.out.printf("%5d", matriu2[f][c]);
            }
            System.out.println();
        }
        System.out.println("Matriu suma");
        int[][] suma = new int[x][y];
        for (int f = 0; f < suma.length; f++) {
            for (int c = 0; c < suma[f].length; c++) {
                suma[f][c] = matriu[f][c] + matriu2[f][c];
                System.out.printf("%5d ", suma[f][c]);
            }
            System.out.println();
        }

    }

}
