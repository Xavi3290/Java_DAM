/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocaexercici8.recerques;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments Escriu un programa que demani les
     * notes que han obtingut una sèrie d'alumnes en el mòdul de programació;
     * posteriorment, el programa visualitzarà la posició on està col·locat el
     * primer alumne que hagi obtingut una determinada nota, que es demanarà a
     * través del teclat. Si no hi ha cap alumne amb aquesta nota, es
     * visualitzarà el missatge corresponent. Nota: S'ha de buscar l'element en
     * el vector no ordenat.
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int num, buscar, posicio = 0;

        System.out.println("Diguem l'allargada que vols per el vector");
        num = teclat.nextInt();
        int[] vector = new int[num];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(10);
        }
        System.out.println("Quina nota vols buscar");
        buscar = teclat.nextInt();
        boolean trobat = false;
        while (posicio < vector.length && trobat == false) { // trobat == false és el mateix que !trobat

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
