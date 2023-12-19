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
public class Ex11 {
    public static void main(String[] args) {
        
        double radi, longitud, area;
        final double PI = 3.1416;
        Scanner teclat = new Scanner(System.in);
        System.out.println("Digues el valor del radi d'un cercle");
        radi = teclat.nextDouble();
        longitud = 2 * PI * radi;
        System.out.printf("El resultat de la longitud és %.2f \n", longitud);
        area = PI * radi * radi;
        System.out.printf("El resultat de l'àrea es 5.2f", area);
        
    }
    
}
