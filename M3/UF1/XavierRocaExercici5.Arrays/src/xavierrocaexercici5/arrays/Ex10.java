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
 * Realitza un programa que calculi el doble de un vector de 10 sencers, ho
emmagatzemi en altre vector i ho mostri per pantalla.
 */
public class Ex10 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int[] llista = new int[10];
        int[] doble = new int[10];
        int cont;

        for (cont = 0; cont < llista.length; cont++) {
            llista[cont] = rnd.nextInt(20);
        }
        for (cont = 0; cont < llista.length; cont++) {
            doble[cont] = llista[cont] * 2;
            System.out.printf("%d * 2 = %d\n", llista[cont], doble[cont]);
        }

    }

}
