/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici5.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Xavi
 * Realitza un programa que calculi la suma i el producte de dos vectors de 5
sencers.
 */
public class Ex11 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int[] llista = new int[5];
        int[] llista2 = new int[5];
        int cont, suma, multi;

        for (cont = 0; cont < llista.length; cont++) {
            llista[cont] = rnd.nextInt(20);
            llista2[cont] = rnd.nextInt(20);
        }
        for (cont = 0; cont < llista.length; cont++) {
            suma = llista[cont] + llista2[cont];
            multi = llista[cont] * llista2[cont];
            System.out.printf("La suma de %d i %d és %d\n", llista[cont], llista2[cont], suma);
            System.out.printf("La multiplicació de %d i %d és %d\n", llista[cont], llista2[cont], multi);
        }

    }

}
