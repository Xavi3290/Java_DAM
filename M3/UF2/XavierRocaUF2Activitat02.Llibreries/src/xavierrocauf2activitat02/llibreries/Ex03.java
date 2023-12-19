/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2activitat02.llibreries;

import java.util.Scanner;
import java.lang.Math;
import static xavierrocauf2activitat02.llibreries.Util.llegirDouble;

/**
 *
 * @author usuari
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        double num1, num2;

        num1 = llegirDouble("nº1:");
        num2 = llegirDouble("nº2:");

        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1, num2));
        System.out.println(Math.pow(num1, num2));
        System.out.println(Math.round(num1));
        System.out.println(Math.round(num2));

    }

}
