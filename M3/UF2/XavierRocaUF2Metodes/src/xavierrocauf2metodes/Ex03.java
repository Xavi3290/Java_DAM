/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuari Realitzar un mètode que donat un vector de N elements m el
 * màxim de tots ells.
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     * Realitzar un mètode que donat un vector de N elements mostri el màxim de tots
ells. 
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int x = 0;

        System.out.println("De quina dimensió vols que sigui el vector");
        x = teclat.nextInt();
        int vector[] = new int[x];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(10);
        }

        maxAr(vector);

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%2d", vector[i]);
        }

    }

    public static void maxAr(int[] array) {

        int max = array[0];  // aixi sempre serà el mes petit el que posem

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.printf("\nEl valor màxim és %d\n", max);

    }
}
