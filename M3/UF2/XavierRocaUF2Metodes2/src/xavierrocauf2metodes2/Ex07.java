/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes2;

import java.util.Random;
import static xavierrocauf2metodes2.Util.llegirInt;

/**
 *
 * @author usuari Escriure un programa que emmagatzemi i extregui informació de
 * les temperatures que hi ha en una ciutat durant un any. Assumim que tots els
 * mesos tenen 30 dies i que les temperatures a la ciutat oscil·laran entre 0 i
 * 41 graus. Primer fes que el programa generi les temperatures de manera
 * aleatòria amb un random i les mostri per pantalla. Després implementa un menú
 * amb les següents opcions: • El dia més fred de l'any • El dia més calorós de
 * l' any. • La temperatura mitjana de cada mes . • La diferència entre el dia
 * més fred i més calorós de cada mes • Finalitzar el programa Cada opció estarà
 * implementada amb un mètode. El menú es repetirà fins que no es vulgui
 * finalitzar el programa
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        final int MES = 12, DIA = 30;
        int ele = 42;

        int[] mesDia = new int[3];
        double[] mitjanaMes = new double[12];
        int[] fredCalor = new int[12];

        int[][] temp = new int[MES][DIA];
        temp = omplirMatriuInt(temp);
        mostrarMatriuInt(temp);

        do {           
            ele = llegirInt("\nTemperatura en tot l'any\n1.El dia més fred de l'any\n2.El dia més calorós de l'any\n3.La temperatura mitjana de cada mes\n4.La diferència entre el dia més fred i més calorós de cada mes\n5.Finalitzar el programa");
            if (ele != 1 && ele != 2 && ele != 3 && ele != 4 && ele != 5) {
                System.out.println("Error, elegeix una opció");
            } else if (ele == 1) {
                mesDia = calcularDiaMinMatriuInt(temp);
                System.out.printf("El mes %d i el dia %d a temperatura %d", mesDia[0], mesDia[1], mesDia[2]);
            } else if (ele == 2) {
                mesDia = calcularDiaMaxMatriuInt(temp);
                System.out.printf("El mes %d i el dia %d a temperatura %d", mesDia[0], mesDia[1], mesDia[2]);
            } else if (ele == 3) {
                mitjanaMes = calcularMitjMesInt(temp);
                mostrarArrayDouble(mitjanaMes);
            } else if (ele == 4) {
                fredCalor = calcularRestaMaxMinInt(temp);
                mostrarArrayInt(fredCalor);
            } else if (ele == 5) {
                System.out.println("Fins un altre");
            }
        } while (ele != 5);

    }

    /**
     * Omple una matriu amb int amb números random de 0 a 42
     * @param matriu matriu int
     * @return matriu omplerta 
     */
    
    public static int[][] omplirMatriuInt(int[][] matriu) {

        Random rnd = new Random();

        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                matriu[f][c] = rnd.nextInt(42);
            }
        }
        return matriu;
    }

    /**
     * Mostra una matriu int
     * @param matriu int
     */
    
    public static void mostrarMatriuInt(int[][] matriu) {

        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                System.out.printf("%5d", matriu[f][c]);
            }
            System.out.println("");
        }

    }

    /**
     * Calcula el dia que te el min de temperatura en tota la matriu int
     * @param matriu int
     * @return vector[3] amb el dia, mes i la temperatura minima
     */
    
    public static int[] calcularDiaMinMatriuInt(int[][] matriu) {

        int min = 1000000;
        int[] minim = new int[3];

        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                if (matriu[f][c] < min) {
                    min = matriu[f][c];
                    minim[0] = f;
                    minim[1] = c;
                    minim[2] = min;
                }
            }
        }
        return minim;

    }

    /**
     * Calcula el dia que te el màxim que te la temperatura en tota la matriu int 
     * @param matriu int
     * @return vector[3] amb el dia, mes i la temperatura maxima 
     */
    
    public static int[] calcularDiaMaxMatriuInt(int[][] matriu) {

        int max = -1000000;
        int[] maxim = new int[3];

        for (int f = 0; f < matriu.length; f++) {
            for (int c = 0; c < matriu[f].length; c++) {
                if (matriu[f][c] > max) {
                    max = matriu[f][c];
                    maxim[0] = f;
                    maxim[1] = c;
                    maxim[2] = max;
                }
            }
        }
        return maxim;
    }

    /**
     * Calcula la mitjana de cada mes en una matriu int
     * @param matriu int
     * @return un vector[12] 
     */
    
    public static double[] calcularMitjMesInt(int[][] matriu) {

        final int DIA = 30;
        int suma;
        double mitja;
        double[] mitjana = new double[12];

        for (int f = 0; f < matriu.length; f++) {
            suma = 0;
            for (int c = 0; c < matriu[f].length; c++) {
                suma = suma + matriu[f][c];
            }
            mitja = suma / DIA;
            mitjana[f] = mitja;

        }
        return mitjana;
    }

    /**
     * Mostrar un vector double
     * @param vector double
     */
    
    public static void mostrarArrayDouble(double[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%5.1f", vector[i]);
        }

    }

    /**
     * Calcula la resta entre el minima i maxima temperatura de cada mes en int
     * @param matriu int
     * @return vector[12]
     */
    
    public static int[] calcularRestaMaxMinInt(int[][] matriu) {

        int[] vector = new int[12];
        int max, min, resta;

        for (int f = 0; f < matriu.length; f++) {
            max = -1;
            min = 43;
            for (int c = 0; c < matriu[f].length; c++) {
                if (max < matriu[f][c]) {
                    max = matriu[f][c];
                }
                if (min > matriu[f][c]) {
                    min = matriu[f][c];
                }
            }
            resta = max - min;
            vector[f] = resta;

        }
        return vector;

    }

    /**
     * Mostrar un vector int
     * @param vector 
     */
    
    public static void mostrarArrayInt(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%5d", vector[i]);
        }

    }

}
