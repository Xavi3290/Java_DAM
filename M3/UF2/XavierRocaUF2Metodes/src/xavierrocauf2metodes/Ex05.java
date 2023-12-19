/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Scanner;

/**
 *
 * @author usuari
 * Realitzar un mètode retorni el doble del valor que se li passa com a paràmetre.
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num1, num2;

        System.out.println("Donam un número:");
        num1 = teclat.nextInt();
        num2 = doblar(num1);
        System.out.printf("El doble és %d\n", num2);

    }

    public static int doblar(int v1) {

        int v2;

        v2 = v1 * 2;

        return v2;

    }

}
