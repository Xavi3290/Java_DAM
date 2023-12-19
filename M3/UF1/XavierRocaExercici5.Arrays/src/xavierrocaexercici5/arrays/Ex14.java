/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici5.arrays;

import java.util.Scanner;

/**
 *
 * @author usuari
 * Llegir per teclat dos vectors de 10 números i barrejar-los en un tercer vector de
manera que: el 1r de A, el 1r de B, el 2n de A, el 2n de B, etc.

 */
public class Ex14 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int[] llista = new int[10];
        int[] llista2 = new int[10];
        int[] llista3 = new int[20];
        int cont, cont2;

        System.out.println("Primera llista");
        for (cont = 0; cont < llista.length; cont++) {
            System.out.println("Digues un número");
            llista[cont] = teclat.nextInt();
        }
        System.out.println("");
        System.out.println("Segona llista");
        for (cont = 0; cont < llista2.length; cont++) {
            System.out.println("Digues un número");
            llista2[cont] = teclat.nextInt();
        }
        cont2 = 0;
        for (cont = 0; cont < llista.length; cont++) {
            llista3[cont2] = llista[cont];
            cont2++;
            llista3[cont2] = llista2[cont];
            cont2++;
        }
        System.out.println("");
        for (cont = 0; cont < llista3.length; cont++) {
            System.out.println(llista3[cont]);
        }

    }

}
