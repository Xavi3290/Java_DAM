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
public class Ex06 {
     public static void main(String[] args) {
         
         int num1, num2, resultat;
         Scanner teclat = new Scanner(System.in);
         System.out.println("Escriu el primer número sencer de la suma");
         num1 = teclat.nextInt();
         System.out.println("Escriu el segon número sencer de la suma");
         num2 = teclat.nextInt();
         resultat = num1 + num2;
         System.out.println("El resultat de la suma és: "+ resultat);
     }
}
