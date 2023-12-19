/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici4;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex11 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num;

        for (num = 1; num < 100; num++) {
            System.out.printf("%d ", num);
            if (num % 10 == 0) {
                System.out.println(" ");
            }
        }
        System.out.println("\n\nFinal del programa");
    }

}
