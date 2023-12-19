/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici8.recerques;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuari Escriu un programa que demani les notes que han obtingut cinc
 * alumnes en els tres mòduls en els que estan matriculats. Els alumnes
 * s'enumeren de l'1 al 5 i els mòduls, de l'1 al 3. Un cop inserides les notes,
 * el programa ha de visualitzar el número d'alumne i el número del mòdul on
 * s'ha obtingut un 10. Si aquesta nota estigués repetida, es visualitzarà la
 * posició del primer 10 que trobem, recorrent la taula per alumnes.
 */
public class Ex04 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int[][] matriu = new int[5][3];
        int buscar = 10;
        int fila = -1, col = -1;
        int posF = 0, posC = 0;

        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                matriu[f][c] = rnd.nextInt(11);
                System.out.printf("Alumne %d ,Modul %d, Nota %5d\n", f, c, matriu[f][c]);
            }
        }
        boolean trobat = false;
        while (posF < matriu.length && trobat == false) { // trobat == false és el mateix que !trobat
            posC = 0;
            while (posC < matriu[posF].length && trobat == false) {
                if (matriu[posF][posC] == buscar) {
                    fila = posF;
                    col = posC;
                    trobat = true;
                }
                posC++;
            }
            posF++;
        }
        if (trobat) { //trobat == true és el mateix que trobat
            System.out.printf("Primer->S'ha trobat el %d a la posició [%d,%d]\n", buscar, fila, col);
        } else {
            System.out.println("No trobat");
        }

    }

}
