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
public class Ex09 {

    public static void main(String[] args) {

        double num1, num2, resultat;
        Scanner teclat = new Scanner(System.in);
        System.out.println("Escriu el primer número real; ");
        num1 = teclat.nextDouble();
        System.out.println("Escriu el segon número real: ");
        num2 = teclat.nextDouble();
        resultat = num1 + num2;
        System.out.printf("El resultat de la suma entre %.2f i %.2f és: %.2f \n", num1, num2, resultat);
        
        resultat = num1 * num2;
        System.out.printf("El resultat de la multiplicacó entre %.2f i %.2f és: %.2f \n", num1, num2, resultat);

    }
}
