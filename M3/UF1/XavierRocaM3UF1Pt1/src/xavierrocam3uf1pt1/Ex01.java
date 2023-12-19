/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocam3uf1pt1;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int dia, mes, any;

        System.out.println("Et demanarem que diguis un dia, un mes i un any \nIntrodueix el dia:");
        dia = teclat.nextInt();
        System.out.println("Introdueix el mes:");
        mes = teclat.nextInt();
        System.out.println("Introdueix l'any:");
        any = teclat.nextInt();
        if (dia >= 0 && dia <= 30 && mes >= 0 && mes <= 12 && any >= 1901 && any <= 2021) {
            System.out.println("La teva data és correcte.");
        } else {
            System.out.println("La data no es correcte.");
        }

    }

}
