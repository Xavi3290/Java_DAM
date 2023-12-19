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
public class Condicional03 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String nom1, nom2;
        char ch1, ch2, chf1, chf2;

        System.out.println("Dime dos nombres y veremos sus coincidencias \nPrimer nombre");
        nom1 = teclat.nextLine();
        ch1 = nom1.charAt(0);
        chf1 = nom1.charAt(nom1.length()-1);
        System.out.println("Segundo nombre");
        nom2 = teclat.nextLine();
        ch2 = nom2.charAt(0);
        chf2 = nom2.charAt(nom2.length()-1);
        if (ch1 == ch2) {
            System.out.println("La primera letra coinciden");
        } else if (chf1 == chf2) {
            System.out.println("La última letra coinciden");
        } else {
            System.out.println("No tienen ninguna coincidencia");
        }

    }

}
