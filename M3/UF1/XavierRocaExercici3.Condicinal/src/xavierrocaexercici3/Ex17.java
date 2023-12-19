/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici3;

import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public class Ex17 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        double a, b, c, d;

        System.out.println("Donam quatre números \nPrimer");
        a = teclat.nextDouble();
        System.out.println("Segon");
        b = teclat.nextDouble();
        System.out.println("Tercer");
        c = teclat.nextDouble();
        System.out.println("Quart");
        d = teclat.nextDouble();
        if (b == 0 || d == 0) {
            System.out.println("No es pot dividir entre 0");
        } else if (a / b > c / d) {
            System.out.printf("%.2f \n", a + b + c + d);
        } else {
            System.out.printf("%.2f \n", b + d);
        }

    }
}
