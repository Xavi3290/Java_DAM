/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici6.bidimensional;

/**
 *
 * @author usuari
 */
public class Ex02 {

    public static void main(String[] args) {

        int matriu[][] = {{1, 2, 3}, {4, 5, 6}};

        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                System.out.print(matriu[f][c]);
            }
            System.out.println();
        }
        System.out.println("");
        for (int c = 0; c < matriu[0].length; c++) {
            for (int f = 0; f < matriu.length; f++) {
                System.out.print(matriu[f][c]);
            }
            System.out.println();
        }
    }

}
