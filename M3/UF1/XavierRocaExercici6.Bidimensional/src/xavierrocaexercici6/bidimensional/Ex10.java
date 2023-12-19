/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici6.bidimensional;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Xavi
 * Realitzar un programa que demani a l'usuari una matriu de dimensions N x M, i
comprovi si la matriu és nul·la. (Tots els seus elements iguals a 0)
 */
public class Ex10 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int cont = 0, x, y;

        System.out.println("Matriu bidimensional\nDonam la x:");
        x = teclat.nextInt();
        System.out.println("Donam la y:");
        y = teclat.nextInt();
        int[][] matriu = new int[x][y];
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
        boolean nula=true;
        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                if (matriu[f][c] != 0) {
                    nula=false;
                }
            }
        }
        if (nula==true) {
            System.out.println("La matriu és nul·la");
        } else {
            System.out.println("La matriu no és nu·la");
        }        
   /*     for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                if (matriu[f][c] >= 0) {
                    cont++;
                }
            }
        }
        if (cont == x*y) {
            System.out.println("La matriu és nul·la");
        } else {
            System.out.println("La matriu no és nul·la");
        }*/
    }

}
