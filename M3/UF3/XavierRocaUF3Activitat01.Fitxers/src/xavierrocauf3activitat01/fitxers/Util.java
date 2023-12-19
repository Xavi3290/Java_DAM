/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf3activitat01.fitxers;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Util {
    public static int llegirInt(String txt) {

        Scanner teclat = new Scanner(System.in);

        int numInt = 0;
        boolean esInt = false;
        do {
            System.out.println(txt);
            if (teclat.hasNextInt()) {
                numInt = teclat.nextInt();
                teclat.nextLine();
                esInt = true;
            } else {
                System.out.println("Error!!!");
                teclat.nextLine();
            }

        } while (!esInt);

        return numInt;

    }
}
