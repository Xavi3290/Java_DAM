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
public class Ex11 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int a, b, c;
        System.out.println("Escriuras tres números \nEscriu el primer número");
        a = teclat.nextInt();
        System.out.println("Escriu el segon número");
        b = teclat.nextInt();
        System.out.println("Escriu el tercer número");
        c = teclat.nextInt();
        if (a < b && a < c) {
            System.out.println("El número més petit " + a);
        } else if (b < a && b < c) {
            System.out.println("El número més petit " + b);
        } else {
            System.out.println("El número més petit " + c);
        }
        if (a > b && a > c) {
            System.out.println("El número més gran " + a);
        } else if (b > a && b > c) {
            System.out.println("El número més gran " + b);
        } else {
            System.out.println("El número més gran " + c);
        }
    }

}
