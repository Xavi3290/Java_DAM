/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici8.recerques;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex05 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int[][] matriu = new int[5][3];
        int buscar = 10;
        int fila = -1, col = -1;
        int posF = 0, posC = 0;

        for (int c = 0; c < matriu[0].length; c++) {
            for (int f = 0; f < matriu.length; f++) {
                matriu[f][c] = rnd.nextInt(11);
                System.out.printf("Alumne %d ,Modul %d, Nota %5d\n", f, c, matriu[f][c]);
            }
        }
        boolean trobat = false;
        while (posC < matriu[0].length && trobat == false) { // trobat == false és el mateix que !trobat
            posF = 0;
            while (posF < matriu.length && trobat == false) {
                if (matriu[posF][posC] == buscar) {
                    fila = posF;
                    col = posC;
                    trobat = true;
                }
                posF++;
            }
            posC++;
        }
        if (trobat) { //trobat == true és el mateix que trobat
            System.out.printf("Primer->S'ha trobat el %d a la posició [%d,%d]\n", buscar, fila, col);
        } else {
            System.out.println("No trobat");
        }

    }

}
