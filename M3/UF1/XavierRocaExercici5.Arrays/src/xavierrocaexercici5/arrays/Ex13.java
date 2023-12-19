/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici5.arrays;

import java.util.Scanner;

/**
 *
 * @author usuari
 * Crear un programa que llegeixi per teclat un vector de 10 números sencers i el
desplaci una posició cap avall: el primer passa a ser el segon, el segon passa a
ser el tercer i així successivament. El darrer passa a ser el primer
 */
public class Ex13 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int[] llista = new int[10];
        int cont, primer = 0;

        for (cont = 0; cont < llista.length; cont++) {
            System.out.println("Digues un número");
            llista[cont] = teclat.nextInt();
        }
        System.out.println("");
        primer = llista[llista.length - 1];
        for (cont = llista.length - 1; cont > 0; cont--) {
            llista[cont] = llista[cont - 1];
        }
        llista[0] = primer;
        for (cont = 0; cont < llista.length; cont++) {
            System.out.println(llista[cont]);
        }

    }

}
