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
public class Ex10 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        double gastats;
        System.out.println("Donam el número de litres gastats");
        gastats = teclat.nextDouble();
        if (gastats < 50) {
            System.out.printf("Al haber gastat %.2f l et cobraran 6 euros \n", gastats);
        } else if (gastats >= 50 && gastats < 200) {
            System.out.printf("Al haber gastat %.2f l et cobraran %.2f euros \n", gastats, ((gastats - 50) * 0.1) + 6);
        } else {
            System.out.printf("Al habes gastat %.2f l et cobraran %.2f euros \n", gastats, ((gastats - 200) * 0.3) + ((gastats - 50) * 0.1) + 6);
        }
        double resultat;
         if (gastats < 50) {
             resultat = 6;
         }else if (gastats >= 50 && gastats < 200) {
             resultat = ((gastats - 50) * 0.1) + 6;
         }else {
             resultat = ((gastats - 200) * 0.3) + ((gastats - 50) * 0.1) + 6;
         }
         System.out.printf("Al habes gastat %.2f l et cobraran %.2f euros \n", gastats, resultat);
        
    }

}
