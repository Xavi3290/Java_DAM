/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici7strings;

import java.util.Scanner;

/**
 *
 * @author usuari
 * Algorisme per a calcular si una cadena introduïda és palíndrom o no.
Un palíndrom (del grec palíndroms, que torna enrere, que va i ve) és una paraula
o frase que pot ser llegida tant d'esquerra a dreta com de dreta a esquerra, usual
en els jocs de paraules. Es coneixen també com capicues, si bé aquesta
denominació s'utilitza més pels números que reuneixen la mateixa condició.
S'anomenen bifronts o falsos palíndroms dues paraules que són palíndroms entre
elles: Roma i amor.
 */
public class Ex12 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String text;
        int cont = 0;

        System.out.println("Escriu un palíndrom: ");
        text = teclat.nextLine();
        text = text.toLowerCase();
        text = text.replace(" ", "");
        text = text.replace(",", "");
        System.out.println(text);
        for (int f = 0; f < text.length(); f++) {
            if (text.charAt(f) == text.charAt(text.length() - f - 1)) {
                cont++;
            }
        }
        if (cont == text.length()) {
            System.out.println("És palíndrom");
        } else {
            System.out.println("No és palíndrom");
        }

        boolean pali = true;
        for (int f = 0; f < text.length(); f++) {
            if (text.charAt(f) != text.charAt(text.length() - f - 1)) {
                pali = false;
            }
        }
        if (pali == true) {
            System.out.println("És palíndrom");
        } else {
            System.out.println("No és palíndrom");
        }
    }
}
