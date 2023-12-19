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
public class Ex12 {
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        
        double preu, marge, venda;
        
        System.out.println("Donam el preu de fàbrica del producte");
        preu = teclat.nextDouble();
        System.out.println("Donam el marge de benefici que vols obtenir en 0.");
        marge = teclat.nextDouble();
        venda = preu * marge;
        System.out.printf("Donant aquest preu %.2f i volen aquest marge %.2f el preu de venda seria %.2f", preu, marge, venda);
        
        
    }
    
}
