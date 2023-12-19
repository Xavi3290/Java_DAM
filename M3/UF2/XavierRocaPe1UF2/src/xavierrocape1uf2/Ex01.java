/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocape1uf2;

import java.util.Random;
import static xavierrocape1uf2.Util.llegirInt;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = omplirVector();
        mostrarVector(vector);
        numeroMesGranDelVector(vector);

    }
    /**
     * Mostra el vector
     * @param vector int
     */
    public static void mostrarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%d ", vector[i]);
        }
        System.out.println("");
    }
    /**
     * Omple el vector aleatoriament de 10 a 500, tambe et demana la grandaria del vector
     * @return el vector
     */
    public static int[] omplirVector() {
        Random rnd = new Random();
        int dimensioV = 0;
        dimensioV = llegirInt("Grandaria del vector: ");
        int[] vector = new int[dimensioV];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(490) + 10;
        }
        return vector;
    }
    /**
     * Mostra el numero més gran dintre del vector
     * @param vector 
     */
    public static void numeroMesGranDelVector(int[] vector) {

        int max = 0;
        for (int i = 0; i < vector.length; i++) {
            if (max < vector[i]) {
                max = vector[i];
            }
        }
        System.out.printf("El número més gran del vector és %d\n", max);
    }
}
