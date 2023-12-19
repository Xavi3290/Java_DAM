/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Scanner;

/**
 *
 * @author usuari Realitzar un mètode que tingui com a paràmetres tres nombres
 * sencers demanats a l'usuari i mostri el màxim.
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0;

        System.out.println("Mostrarem el màxim de tres numeros.\nDonam el primer número:");
        num1 = teclat.nextInt();
        System.out.println("Segon número:");
        num2 = teclat.nextInt();
        System.out.println("Tercer número:");
        num3 = teclat.nextInt();

        maxim(num1, num2, num3);
             
                
    }

    public static void maxim(int v1, int v2, int v3) {

        int valorMaxim = 0;

        if (v1 > v2 && v1 > v3) {
            valorMaxim = v1;
        } else if (v2 > v1 && v2 > v3) {
            valorMaxim = v2;
        } else {
            valorMaxim = v3;
        }
        System.out.printf("El valor màxim entre %d i %d i %d és %d\n", v1, v2, v3, valorMaxim);

    }
}
