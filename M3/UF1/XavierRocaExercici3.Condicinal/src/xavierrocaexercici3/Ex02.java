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
public class Ex02 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num;
        System.out.println("Escriu un número");
        num = teclat.nextInt();
        if (num > 35) {
            System.out.println("El número es mes gran que 35");
        } else {
            System.out.println("El número es mes petit que 35");
        }

    }

}
