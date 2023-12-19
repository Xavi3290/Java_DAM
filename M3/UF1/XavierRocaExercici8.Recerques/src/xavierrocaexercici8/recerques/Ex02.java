/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici8.recerques;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuari Enunciat 1, l’usuari introduïra les notes de forma ascendent.
 * Nota: Cerca lineal vector ordenat
 */
public class Ex02 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int num, buscar, posicio = 0;

        System.out.println("Diguem l'allargada que vols per el vector");
        num = teclat.nextInt();
        int[] vector = new int[num];
        System.out.println("Omplim el vector de forma ascendent");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(10);
        }
        Arrays.sort(vector);  // Ordenar vector
        System.out.println("Quina nota vols buscar");
        buscar = teclat.nextInt();
        boolean trobat = false;
        while (posicio < vector.length && trobat == false && vector[posicio] <= buscar) { // trobat == false és el mateix que !trobat

            if (vector[posicio] == buscar) {
                trobat = true;
            } else {
                posicio++;
            }
        }
        System.out.println("");
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%5d", vector[i]);
        }
        System.out.println("");
        if (trobat) { //trobat == true és el mateix que trobat
            System.out.printf("S'ha trobat el %d a la posició %d.", buscar, posicio);
        } else {
            System.out.println("No trobat");
        }

    }

}
