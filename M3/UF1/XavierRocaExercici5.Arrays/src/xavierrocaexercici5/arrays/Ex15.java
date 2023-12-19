/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici5.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuari
 * Realitzar un programa que llegeixi 20 números (entre 1 i el 10) i mostri aquell o
aquells que hagin aparegut més vegades.
El programa preguntarà si es vol introduir els 20 números i en el cas en que la
resposta sigui negativa omplirà l'array amb números aleatoris.
 */
public class Ex15 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int[] llista = new int[20];
        int[] contadors = new int[10];
        int cont, cont2;
        String sino;

        System.out.println("Vols omplir la llista (si o no)");
        sino = teclat.nextLine();
        switch (sino) {
            case "Si":
            case "si":
                for (cont = 0; cont < llista.length; cont++) {
                    do {
                        System.out.printf("Valor %d: Digues un número entre 1 i 10\n", cont);
                        llista[cont] = teclat.nextInt();
                        if (llista[cont] < 1 || llista[cont] > 10) {
                            System.out.println("Fora dels parametres");
                        }
                    } while (llista[cont] < 1 || llista[cont] > 1);                               
                }
                System.out.println("Et mostrarem quin a aparegut més");
                
                for (cont = 0; cont < llista.length; cont++) {
                
                }
                break;
            case "No":
            case "no":
                for (cont = 0; cont < llista.length; cont++) {
                    llista[cont] = rnd.nextInt(10);
                }
                System.out.println("Et mostrarem quin a aparegut més");
                
                break;
            default:
               System.out.println("ERROR"); 
        }

    }

}


