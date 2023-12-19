/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocaexercici4;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num = 0;

        while (num <= 9) {
            System.out.printf("%d \n", num);
            num++;
        }
        System.out.println(" ");
        num = 0;
        do {
            System.out.printf("%d \n", num);
            num++;
        } while (num <= 9);
        System.out.println(" ");
        for (num = 0; num <= 9; num++) {
            System.out.printf("%d \n", num);
        }

    }

}
