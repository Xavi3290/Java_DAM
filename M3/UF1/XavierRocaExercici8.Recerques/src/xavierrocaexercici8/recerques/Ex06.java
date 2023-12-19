/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici8.recerques;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuari Generar, aleatòriament, una llista de 999 nombres sencers en
 * el rang de 0 a 9999. Ordenar de manera ascendent pel mètode de la bombolla.
 */
public class Ex06 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(9999);
        }
        boolean ordenat = false;
        int voltes = vector.length - 1, aux = 0;

        while (voltes > 0 && ordenat == false) {
            ordenat = true;
           /* for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + " ");
            }
            System.out.println("");*/ //Ho mostra per pantalla com ho ordena
            for (int pos = 0; pos < voltes; pos++) {

                if (vector[pos] > vector[pos + 1]) {
                    aux = vector[pos];
                    vector[pos] = vector[pos + 1];
                    vector[pos + 1] = aux;
                    ordenat = false;
                }
            }
            voltes--;
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");

        }

    }

}
