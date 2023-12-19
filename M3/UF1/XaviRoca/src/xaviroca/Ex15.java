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
public class Ex15 {
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        double peseta, euro;
        final double EUPE = 166.386; 
        System.out.println("Convertirem el valor de pesetes a euros");
        System.out.println("Doname el valor en pesetes");
        peseta = teclat.nextDouble();
        euro = peseta / EUPE;
        System.out.printf("El valor en pesetes és %.2f i en euros és %.2f \n", peseta, euro);
        System.out.println("Ara convertirem el valor de euros a pesetes");
        System.out.println("Donem el valor en euros");
        euro = teclat.nextDouble();
        peseta = euro * EUPE;
        System.out.printf("El valor en euros és %.2f i en pesetes és %.2f ", euro, peseta);
        
        
    }
}
