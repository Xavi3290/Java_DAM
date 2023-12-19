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
public class Ex20 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int blanc, negra, alt, num;

        System.out.println("Donam un número");
        num = teclat.nextInt();
        for (alt = 1; alt <= num; alt++) {
            for (blanc = 1; blanc <= num - alt; blanc++) {
                System.out.printf(" ");
            }
            for (negra = 1; negra <= (alt * 2) - 1; negra++) {
                System.out.printf("*");
            }
            System.out.println("");
        }

    }

}
