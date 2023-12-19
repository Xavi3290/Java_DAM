/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocaexercici6.bidimensional;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float[][] notes = new float[6][3];

        for (int f = 0; f < notes.length; f++) {
            System.out.print("\nEls valors que hi ha a la fila " + f + " són: \n\n");
            for (int c = 0; c < notes[f].length; c++) {
                System.out.print("\n\tEl valor que hi ha a la columna " + c + " és " + notes[f][c]);
            }

        }

    }

}
