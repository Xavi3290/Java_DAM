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
public class Ex07 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        double a, b, c;
        System.out.println("Diguem els costats d'un triangle \nDiguem el costat a");
        a = teclat.nextDouble();
        System.out.println("Diguem el costat b");
        b = teclat.nextDouble();
        System.out.println("Diguem el costat c");
        c = teclat.nextDouble();
        if (a == b && b == c) {
            System.out.printf("Si a = %.2f a b = %.2f i a c = %.2f es un triangle equilàter", a, b, c);
        } else if (a == b || b == c || a == c) {
            System.out.printf("Si a = %.2f és igual a b = %.2f i diferents a c = %.2f és un triangle isòsceles", a, b, c);
        }else {
            System.out.printf("Si a = %.2f es diferent a b = %.2f i deferent a c = %.2f és un triangle escalè", a, b, c);
        }

    }

}
