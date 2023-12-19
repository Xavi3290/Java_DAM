/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocaexercici3;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num;
        System.out.println("Escriu un número positiu o negatiu");
        num = teclat.nextInt();
        if (num < 0) {
            System.out.println("El número és negatiu");
        } else {
            System.out.println("el número es positu");
        }
    }

}
