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
public class Ex06 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num1, num2, num3;
        System.out.println("Escriuras tres números \nEscriu el primer número");
        num1 = teclat.nextInt();
        System.out.println("Escriu el segon número");
        num2 = teclat.nextInt();
        System.out.println("Escriu el tercer número");
        num3 = teclat.nextInt();
        if (num1 < num2 && num1 < num3) {
            System.out.println("El primer número introduit es el més petit que es " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("El segon número introduit és el mes petit que es " + num2);
        } else {
            System.out.println("El tercer número introduit és el mes petit que es " + num3);
        }
    }

}


