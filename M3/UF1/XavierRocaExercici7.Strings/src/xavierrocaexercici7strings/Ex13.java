/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici7strings;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuari
 * Necessito un algoritme per fer còpies de seguretat d'uns fitxers de tal manera que
quan jo introdueixo un nom de fitxer la còpia el guardarà amb el nom al revés en
minúscules més un nombre aleatori entre el 0 i el 9.
Només has de fer l'algorisme que tradueix un nom en altre.
Exemple:
Digues el nom del fitxer: fotos
Sortida: sotof4 
 */
public class Ex13 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        String text, text2 = "";

        System.out.println("Digues el nom del fitxer: ");
        text = teclat.nextLine();
        for (int i = text.length() - 1; i >= 0; i--) {
            text2 = text2 + text.charAt(i);
        }
        text2 = text2.toLowerCase();
        System.out.println(text2 + rnd.nextInt(10));

    }

}
