/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici6.bidimensional;

import java.util.Random;

/**
 *
 * @author Xavi
 * Realitza un programa que generi una matriu 4 x 4. Dir si aquesta matriu és
simètrica o no, és a dir, si s'obté la mateixa taula al canviar les files per les
columnes i per tant m[f][c] es igual a m[c][f].

 */
public class Ex09 {

    public static void main(String[] args) {

        Random rnd = new Random();

        int[][] matriu = new int[4][4];
        int cont = 0;

        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                matriu[f][c] = rnd.nextInt(10);
            }
        }
        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                System.out.printf("%5d", matriu[f][c]);
            }
            System.out.println();
        }
        System.out.println("");
        for (int c = 0; c < matriu[0].length; c++) {
            for (int f = 0; f < matriu.length; f++) {
                System.out.printf("%5d", matriu[f][c]);
            }
            System.out.println();
        }
        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                if (matriu[f][c] == matriu[c][f]) {
                    cont++;
                }
            }
        }
        if (cont == 16) {
            System.out.println("És simetrica");
        } else {
            System.out.println("No es simetrica");
        }
    }

}
