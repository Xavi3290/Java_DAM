/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici9objectes;

import java.util.Scanner;

/**
 *
 * @author usuari
 * Desenvolupeu un programa que defineixi un tipus  RegistreCD  que tingui els
camps:   títol,   autor,   duració   i   quantitat   de   cançons   i   obtingui   de   l'entrada
estàndard una sèrie de (com a màxim) 100 CDs i mostri tots aquells que tinguin el
màxim número de cançons. (La entrada de dades finalitzarà al introduir un títol
buit o al arribar a 100 Cds).
 */
public class Ex04 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int cont = 0;

        RegistreCD[] cd = new RegistreCD[100];
        RegistreCD maxCançons = new RegistreCD();
        String titol;

        do {

            System.out.println("Dades del CD \nTítol: ");
            titol = teclat.nextLine();
            if (titol.length() != 0) {
                cd[cont] = new RegistreCD();
                cd[cont].titol = titol;
                System.out.println("Autor: ");
                cd[cont].autor = teclat.nextLine();
                System.out.println("Duració: ");
                cd[cont].duracio = teclat.nextDouble();
                System.out.println("Nº de cançóns: ");
                cd[cont].cançons = teclat.nextInt();
                teclat.nextLine();
                if (maxCançons.cançons < cd[cont].cançons) {
                    maxCançons = cd[cont];
                }
                cont++;
            }

        } while (titol.length() != 0 && cont < 100);

        for (int i = 0; i < cont; i++) {
            if (cd[i].cançons == maxCançons.cançons) {
                System.out.printf("Títol: %s, Autor: %s, Duració; %.1f, Nº de cançons: %d \n", cd[i].titol, cd[i].autor, cd[i].duracio, cd[i].cançons);
            }
        }

    }

}
