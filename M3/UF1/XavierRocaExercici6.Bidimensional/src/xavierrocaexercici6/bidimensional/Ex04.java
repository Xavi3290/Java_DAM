/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici6.bidimensional;

/**
 *
 * @author usuari
 */
public class Ex04 {

    public static void main(String[] args) {

        int[][] matriu = new int[5][8];

        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                matriu[f][c] = f + c;
            }
        }
        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                System.out.printf("%5d ", matriu[f][c]);
            }
            System.out.println();
        }

    }

}
