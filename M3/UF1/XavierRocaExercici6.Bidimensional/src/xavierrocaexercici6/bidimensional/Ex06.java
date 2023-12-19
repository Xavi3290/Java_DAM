/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici6.bidimensional;

/**
 *
 * @author usuari
 * Crear una matriu “marc” de grandària 8 x 6: tots els seus elements han de valer 0
excepte els de les vores que han de valer 1. Visualitzar-la.
 */
public class Ex06 {

    public static void main(String[] args) {

        int[][] marc = new int[8][6];

        for (int f = 0; f < marc.length; f++) {
            for (int c = 0; c < marc[f].length; c++) {
                if (f == 0 || c == 0 || f == marc.length - 1 || c == marc[f].length - 1) {
                    marc[f][c] = 1;
                }
            }
        }
        for (int f = 0; f < marc.length; f++) {
            for (int c = 0; c < marc[f].length; c++) {
                System.out.printf("%5d ", marc[f][c]);
            }
            System.out.println();
        }

    }

}
