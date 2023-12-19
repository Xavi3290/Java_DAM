/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici5.arrays;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex07 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int cont;
        int[] llista = new int[5];

        for (cont = 0; cont < llista.length; cont++) {
            System.out.println("Escriu un número");
            llista[cont] = teclat.nextInt();
        }
        for (cont = llista.length - 1; cont >= 0; cont--) {
            System.out.println(llista[cont]);
        }

    }

}
