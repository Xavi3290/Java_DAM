/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Random;
import java.util.Scanner;
import static xavierrocauf2metodes.Util.buscarNumArr;

/**
 *
 * @author usuari Realitzar un mètode que pren com a paràmetres dos vectors. El
 * primer amb els sis nombres d'una aposta de la primitiva, i el segon amb els
 * sis nombres guanyadors. La funció ha de tornar el nombre d'encerts.
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Random rnd = new Random();

        int premiat;

        int[] vector1 = new int[6];
        int[] vector2 = new int[6];

        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = rnd.nextInt(10);
        }
        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = rnd.nextInt(10);
        }

        premiat = compararArr(vector1, vector2);
        System.out.printf("Has encertat %d\n", premiat);
        if (premiat == 0) {
            System.out.println("Prova un altre vegada");
        }

    }

    public static int compararArr(int[] v1, int[] v2) {

        int cont = 0;
        boolean verificar;

        for (int i = 0; i < v1.length; i++) {
            verificar = buscarNumArr(v2, v1[i]);
            if (verificar) {
                cont++;
            }
        }

        return cont;

        // Fet amb doble for
        /*  for (int i = 0; i < v1.length; i++) {

                for (int j = 0; j < v2.length && encontrado == false; j++) {  //Quan el troba para el bucle
                    if (v1[i] == v2[j]) {
                        cont++;
                        encontrado = true;
                    }
                }

                encontrado = false;
            }*/
    }

}
