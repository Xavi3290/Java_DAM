/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici4;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex16 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String txt;
        char ch;
        int vocala = 0, vocale = 0, vocali = 0, vocalo = 0, vocalu = 0, vocals;

        do {
            System.out.println("Escriu un caràcter");
            txt = teclat.nextLine();
            ch = txt.charAt(0);
            switch (ch) {
                case 'a':
                case 'A':
                    vocala++;
                    System.out.printf("Tens %d a \n", vocala);
                    break;
                case 'e':
                case 'E':
                    vocale++;
                    System.out.printf("Tens %d e \n", vocale);
                    break;
                case 'i':
                case 'I':
                    vocali++;
                    System.out.printf("Tens %d i \n", vocali);
                    break;
                case 'o':
                case 'O':
                    vocalo++;
                    System.out.printf("Tens %d o \n", vocalo);
                    break;
                case 'u':
                case 'U':
                    vocalu++;
                    System.out.printf("Tens %d u \n", vocalu);
                    break;
            }

        } while (ch != '#');
        vocals = vocala + vocale + vocali + vocalo + vocalu;
        System.out.printf("Tens %d vocals, %d a, %d e, %d i, %d o, %d u \n", vocals, vocala, vocale, vocali, vocalo, vocalu);

        /*  if (ch == 'a' || ch == 'A') {
            vocala++;
            System.out.printf("Tens %d a \n", vocala);
        }
        if (ch == 'e' || ch == 'E') {
            vocale++;
            System.out.printf("Tens %d e \n", vocale);
        }
        if (ch == 'i' || ch == 'I') {
            vocali++;
            System.out.printf("Tens %d i \n", vocali);
        }
        if (ch == 'o' || ch == 'O') {
            vocalo++;
            System.out.printf("Tens %d o \n", vocalo);
        }
        if (ch == 'u' || ch == 'U') {
            vocalu++;
            System.out.printf("Tens %d u \n", vocalu);
        }
         */
    }

}
