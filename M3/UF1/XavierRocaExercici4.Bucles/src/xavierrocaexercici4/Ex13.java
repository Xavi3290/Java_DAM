/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici4;

import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public class Ex13 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        double num, resu;
        int mult;

        do {
            System.out.println("Diguem un número");
            num = teclat.nextDouble();
            if (num <= 0) {
                System.out.println("Error!!");
            }
        } while (num <= 0);
        System.out.printf("La taula de multiplicar del %.2f\n", num);
        for (mult = 1; mult <= 10; mult++) {
            resu = num * mult;
            System.out.printf("%.2f * %d = %.2f\n", num, mult, resu);
        }

    }

}
