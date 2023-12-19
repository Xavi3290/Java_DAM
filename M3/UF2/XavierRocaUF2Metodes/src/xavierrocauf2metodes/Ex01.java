/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Scanner;

/**
 *
 * @author usuari Realitzar un mètode, al que se li passi com a paràmetre un
 * nombre N demanat a l'usuari i mostri per pantalla N vegades el missatge:
 * “Mòdul executant-se”.
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner teclat = new Scanner(System.in);
        
        int numero;
        
        System.out.println("\nIntrodueix un número:");
        numero = teclat.nextInt();
        repetir(numero);         
                
    }
           
    public static void repetir(int num) {
       
        for (int i = 0; i < num; i++) {
            System.out.println("Mòdul executant-se,");
        }

    }

}
