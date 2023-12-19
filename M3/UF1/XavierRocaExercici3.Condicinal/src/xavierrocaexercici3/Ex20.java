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
public class Ex20 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int a, b, c, gran, petit;
        
        System.out.println("Ordenarem de més gran a més petit els números escrits \nEscriu el primer número");
        a = teclat.nextInt();
        System.out.println("Escriu el segon número");
        b = teclat.nextInt();
        System.out.println("Escriu el tercer número");
        c = teclat.nextInt();
        if (a < b && a < c) {
            petit = a;
        } else if (b < a && b < c) {
            petit = b;
        } else {
            petit = c;
        }
        if (a > b && a > c) {
            gran = a;
        } else if (b > a && b > c) {
            gran = b;
        } else {
            gran = c;
        }
        if (petit == a && gran == b) {
            System.out.printf("%d,%d,%d \n", b, c, a);
        } else if (petit == b && gran == a) {
            System.out.printf("%d,%d,%d \n", a, c, b);
        } else if (petit == a && gran == c) {
            System.out.printf("%d,%d,%d \n", c, b, a);
        } else if (petit == b && gran == c) {
            System.out.printf("%d,%d,%d \n", c, a, b);
        } else if (petit == c && gran == a) {
            System.out.printf("%d,%d,%d \n", a, b, c);
        } else {
            System.out.printf("%d,%d,%d \n", b, a, c);
        }

    }

}
