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
public class Ex13 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int ele;
        double costat1, costat2, base, altura, radi;
        final double PI = 3.14;

        System.out.println("Calcularem l'àrea de una de les seguents figures \n1.Quadrat \n2.Cercle \n3.Triangle");
        ele = teclat.nextInt();
        if (ele == 1) {
            System.out.println("Donam un costat");
            costat1 = teclat.nextDouble();
            System.out.println("Donam l'altre costat");
            costat2 = teclat.nextDouble();
            System.out.printf("L'àrea del quadrat és %.2f \n", costat1 * costat2);
        } else if (ele == 2) {
            System.out.println("Donam el radi del cercle");
            radi = teclat.nextDouble();
            System.out.printf("L'àrea del cercle és %.2f \n", PI * radi * radi);
        } else if (ele == 3) {
            System.out.println("Donam la base");
            base = teclat.nextDouble();
            System.out.println("Donam l'altura");
            altura = teclat.nextDouble();
            System.out.printf("L'àrea del triangle és %.2f \n", (altura * base) / 2);
        } else {
            System.out.println("Error");
        }
        System.out.println("Calcularem l'àrea de una de les seguents figures \n1.Quadrat \n2.Cercle \n3.Triangle");
        ele = teclat.nextInt();
        switch (ele) {
            case 1:
                System.out.println("Donam un costat");
                costat1 = teclat.nextDouble();
                System.out.println("Donam l'altre costat");
                costat2 = teclat.nextDouble();
                System.out.printf("L'àrea del quadrat és %.2f \n", costat1 * costat2);
                break;
            case 2:
                System.out.println("Donam el radi del cercle");
                radi = teclat.nextDouble();
                System.out.printf("L'àrea del cercle és %.2f \n", PI * radi * radi);
                break;
            case 3:
                System.out.println("Donam la base");
                base = teclat.nextDouble();
                System.out.println("Donam l'altura");
                altura = teclat.nextDouble();
                System.out.printf("L'àrea del triangle és %.2f \n", (altura * base) / 2);
                break;
            default:
                System.out.println("Error");
                break;
        }

    }

}
