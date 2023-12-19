/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes2;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Util {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
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

    public static double llegirDouble(String txt) {

        Scanner teclat = new Scanner(System.in);

        double numDouble = 0;
        boolean esDouble = false;
        do {
            System.out.println(txt);
            if (teclat.hasNextDouble()) {
                numDouble = teclat.nextDouble();
                teclat.nextLine();
                esDouble = true;
            } else {
                System.out.println("Error!!!");
                teclat.nextLine();
            }

        } while (!esDouble);

        return numDouble;

    }
    
}
