/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici3;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex03 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num;
        System.out.println("Escriu un número");
        num = teclat.nextInt();
        if (num > 0 && num < 100) {
            System.out.println("El número es positiu y menor a 100");

        } else {
            System.out.println("Fora de rang");

        }

    }

}
