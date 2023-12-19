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
public class Condicional02 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num;

        System.out.println("Te daremos el valor absoluto del número que escribas \nEscribe un número");
        num = teclat.nextInt();
        if (num >= 0) {
            System.out.printf("El valor absolut es %d \n", num);
        } else {
            System.out.printf("El valor absolut es %d \n", num * (-1));
        }

    }

}
