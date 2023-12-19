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
 * Llegir 10 sencers. Llegir un número sencer N i buscar-lo en el vector. S'ha de
mostrar la posició en que es troba. Si no hi és, indicar-ho amb un missatge.

 */
public class Ex09 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        /*   int[] llista = new int[10];
        int cont, cont2, num, no;

        for (cont = 0; cont < llista.length; cont++) {
            llista[cont] = rnd.nextInt(20);
        }
        for (cont = 0; cont < llista.length; cont++) {
            System.out.println("Escriu un número de 0 al 20");
            num = teclat.nextInt();
            no = 0;
            for (cont2 = 0; cont2 < llista.length; cont2++) {
                if (llista[cont2] == num) {
                    System.out.printf("El número %d està en la posició %d de la llista \n", num, cont2);
                } else {
                    no++;
                }
            }
            if (no == 10) {
                System.out.printf("El numero %d no està en la llista\n", num);
            }
        }
         */
 /*
        int[] llista = new int[10];
        int cont, num, no;

        for (cont = 0; cont < llista.length; cont++) {
            System.out.println("Escriu un número");
            llista[cont] = teclat.nextInt();
        }
        System.out.println("Busquem el número a la llista");
        num = teclat.nextInt();
        no = 0;
        for (cont = 0; cont < llista.length; cont++) {
            if (llista[cont] == num) {
                System.out.printf("El número %d està en la posició %d de la llista \n", num, cont);
            } else {
                no++;
            }
        }
        if (no == 10) {
            System.out.printf("El numero %d no està en la llista\n", num);
        }
         */
        int[] llista = new int[10];
        int cont, num, pos = -1;

        for (cont = 0; cont < llista.length; cont++) {
            System.out.println("Escriu un número");
            llista[cont] = teclat.nextInt();
        }
        System.out.println("Busquem el número a la llista");
        num = teclat.nextInt();
        for (cont = 0; cont < llista.length; cont++) {
            if (num == llista[cont]) {
                pos = cont;
            }
        }
        if (pos == -1) {
            System.out.println("No esta en el array\n");
        } else {
            System.out.printf("El numero %d esta en la posició %d\n", num, pos);
        }

    }

}
