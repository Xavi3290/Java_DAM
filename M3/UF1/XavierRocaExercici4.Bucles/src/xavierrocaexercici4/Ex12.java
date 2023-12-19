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
public class Ex12 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        double num, resu = 1;
        int elevat, cont;

        do {
            System.out.println("Diguem un número");
            num = teclat.nextDouble();
            if (num <= 0) {
                System.out.println("Error!!");
            }
        } while (num <= 0);
        do {
            System.out.println("Diguem un número al que l'elevarem");
            elevat = teclat.nextInt();
            if (elevat<= 0) {
                System.out.println("Error!!");
            }
        } while (num <= 0);
        for (cont = 1; cont <= elevat; cont++) {
            resu = resu * num;
        }
        System.out.printf("%.2f elevat a %d = %.2f \n", num, elevat, resu);
    }

}
