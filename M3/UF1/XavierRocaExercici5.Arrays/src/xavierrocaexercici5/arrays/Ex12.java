/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici5.arrays;

import java.util.Scanner;

/**
 *
 * @author usuari
 * Llegir per teclat un vector de 10 elements numèrics sencers i una posició (entre 0
i 9). Eliminar l'element situat en la posició donada sense deixar buits.

 */
public class Ex12 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int[] llista = new int[10];
        int cont, borrar;

        for (cont = 0; cont < llista.length; cont++) {
            System.out.println("Digues un número");
            llista[cont] = teclat.nextInt();
        }
        System.out.println("\nLlista\n");
        for (cont = 0; cont < llista.length; cont++) {
            System.out.println(llista[cont]);
        }
        System.out.println("\nQuina posició vols borrar\n");
        borrar = teclat.nextInt();
        System.out.println("");
        for (cont = borrar; cont < llista.length - 1; cont++) {
            llista[cont] = llista[cont + 1];

        }
        for (cont = 0; cont < llista.length - 1; cont++) {
            System.out.println(llista[cont]);
        }
    }

}
