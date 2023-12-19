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
public class Ex08 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num;

        do {
            System.out.println("Diguem un número");
            num = teclat.nextInt();
            if (num > 0) {
                System.out.printf("%d \n", num * 2);
            } else if (num < 0) {
                System.out.printf("%d \n", num * 3);
            }
        } while (num != 0);

    }

}
