/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2activitat02.llibreries;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rnd = new Random();
        Scanner teclat = new Scanner(System.in);

        int[] numeros = new int[30];

        int num;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rnd.nextInt(30);
        }
        /* System.out.print("Array inicial:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
        }*/

        System.out.print("Array inicial:");
        System.out.println(Arrays.toString(numeros));
        System.out.print("Array ordenat:");
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        System.out.println("Introdueix el numero a buscar:");
        num = teclat.nextInt();
        System.out.println(Arrays.binarySearch(numeros, num));
        

    }

}
