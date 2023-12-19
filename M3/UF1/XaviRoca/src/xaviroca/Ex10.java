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
public class Ex10 {
    public static void main(String[] args) {
        
        double num1, num2, area;
        Scanner teclat = new Scanner(System.in);
        System.out.println("Calcularem l'àrea d'un rectangle");
        System.out.println("Digues el valor d'un costat");
        num1 = teclat.nextDouble();
        System.out.println("Digues el valor de l'altre costat");
        num2 = teclat.nextDouble();
        area = num1 * num2;
        System.out.printf("El valor de l'àrea entre el costat %.2f i %.2f és: %.2f", num1, num2, area);
        
    }
}
