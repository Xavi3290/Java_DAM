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
public class Ex14 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        double num, num2, cont, resu, resu2;

        do {
            System.out.println("Diguem un número");
            num = teclat.nextDouble();
            if (num <= 0) {
                System.out.println("Error!!");
            }
        } while (num <= 0);
        num2 = num;
        System.out.println("Al quadrat");
        for (cont = 0; cont <= 5; cont++) {
            resu = num * num;
            System.out.printf("%.2f al quadrat és %.2f\n", num, resu);
            num++;
        }
        System.out.println("Al cub");
        for (cont = 0; cont <= 5; cont++) {
            resu2 = num2 * num2 * num2;
            System.out.printf("%.2f al cub és %.2f\n", num2, resu2);
            num2++;
        }

    }

}
