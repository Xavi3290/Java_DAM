/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Scanner;

/**
 *
 * @author usuari Realitzar un mètode que se li passin dos sencers i mostri tots
 * els nombres compresos entre ells, ambdós inclosos.
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num1, num2;

        System.out.println("Escriurem tots el numeros entre un número i un altre\nDonam el primer número:");
        num1 = teclat.nextInt();
        System.out.println("Segon número:");
        num2 = teclat.nextInt();

        contar(num1, num2);

    }

    public static void contar(int v1, int v2) {

        int aux;

        if (v1 > v2) {
            aux = v1;
            v1 = v2;
            v1 = aux;
        }

        for (int i = v1; i <= v2; i++) {
            System.out.printf("%2d", i);
        }

    }

}
