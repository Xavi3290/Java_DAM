/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xaviroca;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex05 {

    public static void main(String[] args) {

        double num;
        Scanner teclat = new Scanner(System.in);
        System.out.println("Escriu un número amb 6 decimals");
        num = teclat.nextDouble();
        System.out.printf("El número es aquest amb 4 decimals %.4f \n", num);

    }
}
