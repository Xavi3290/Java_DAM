/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici5.arrays;

import java.util.Scanner;

/**
 *
 * @author usuari
 * Llegir 5 números per teclat i a continuació realitzar la mitja dels números positius,
la mitja dels números negatius i comptar el número de ceros.
 */
public class Ex08 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int cont, suma1 = 0, suma2 = 0, mitja1, mitja2, zero = 0, pos = 0, neg = 0;
        int[] llista = new int[5];

        for (cont = 0; cont < llista.length; cont++) {
            System.out.println("Escriu un número");
            llista[cont] = teclat.nextInt();
            if (llista[cont] > 0) {
                suma1 = suma1 + llista[cont];
                pos++;
            } else if (llista[cont] < 0) {
                suma2 = suma2 + llista[cont];
                neg++;
            } else {
                zero++;
            }
        }
        mitja1 = suma1 / pos;
        mitja2 = suma2 / neg;
        System.out.printf("Mitja positius = %d \nMitja negatius = %d \nZero = %d \n", mitja1, mitja2, zero);

    }

}
