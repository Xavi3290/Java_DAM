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
public class Ex08 {
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        
        String txt;
        char ch;
        System.out.println("Escriu un càracter");
        txt = teclat.nextLine();
        ch = txt.charAt(0);
        if ( ch >= 'A' && ch <= 'Z' ){
            System.out.printf("El càracter %s està en majuscules \n", txt);
        } else if ( ch >= '0' && ch <= '9' ){
            System.out.printf("El càracter %s és un número \n", txt);
        } else if ( ch >= 'a' && ch <= 'z' ){
            System.out.printf("El càracter %s esta en minuscules \n", txt);
        } else {
            System.out.printf("El càracter %s es un altre caracter \n", txt);
        }
                          
    }
    
}
