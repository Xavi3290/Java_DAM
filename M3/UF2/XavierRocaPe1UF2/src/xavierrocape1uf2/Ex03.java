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
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int DIES = 7;
        final int HORES = 24;
        int dia = 0;
        double mitjanaDia;

        int[][] visitesWeb = omplirVisitesWeb(DIES, HORES);
        mostrarVisitesWeb(visitesWeb);
        dia = llegirInt("Quin dia vols veure: ");
        mostrarDia(visitesWeb, dia);
        mitjanaDia = calcularMitjanaDia(visitesWeb, dia);
        System.out.printf("\nLa mitjana del dia %d és %.1f\n", dia, mitjanaDia);
        calcularMitjaMesBaixa(visitesWeb);
        mostrarDiaYHoraAmbMesVisites(visitesWeb);
    }

    public static int[][] omplirVisitesWeb(int dies, int hores) {
        Random rnd = new Random();
        int[][] visitesWeb = new int[dies][hores];
        for (int f = 0; f < visitesWeb.length; f++) {
            for (int c = 0; c < visitesWeb[f].length; c++) {
                visitesWeb[f][c] = rnd.nextInt(1000);
            }
        }
        return visitesWeb;
    }

    public static void mostrarVisitesWeb(int[][] visitesWeb) {
        System.out.printf("  ");
        for (int f = 0; f < visitesWeb[0].length; f++) {
            System.out.printf("%4d", f + 1);
        }
        System.out.println(" ");
        for (int f = 0; f < visitesWeb.length; f++) {
            System.out.printf("%2d", f + 1);
            for (int c = 0; c < visitesWeb[f].length; c++) {
                System.out.printf("%4s", visitesWeb[f][c]);
            }
            System.out.println();
        }
    }

    public static void mostrarDia(int[][] visitesWeb, int dia) {
        for (int i = 0; i < visitesWeb.length; i++) {
            System.out.printf("%4s", visitesWeb[dia][i]);
        }
    }

    public static double calcularMitjanaDia(int[][] visitesWeb, int dia) {
        double suma = 0, mitjanaDia = 0;
        for (int i = 0; i < visitesWeb[0].length; i++) {
            suma += visitesWeb[dia][i];
        }
        mitjanaDia = suma / 24;
        return mitjanaDia;
    }

    public static void calcularMitjaMesBaixa(int[][] visitesWeb) {
        double mitja = 0, mitjaMin = 0;
        int dia = 0;
        for (int i = 1; i < 8; i++) {
            mitja = calcularMitjanaDia(visitesWeb, i);
            if (mitjaMin < mitja) {
                mitjaMin = mitja;
                dia = i;
            }
        }
        System.out.printf("\nLa mitja més petita és %.1f del dia %d", mitjaMin, dia);
    }

    public static void mostrarDiaYHoraAmbMesVisites(int[][] visitesWeb) {
        int max = 0, dia = 0, hora = 0;
        for (int f = 0; f < visitesWeb.length; f++) {
            for (int c = 0; c < visitesWeb[f].length; c++) {
                if (max > visitesWeb[f][c]) {
                    max = visitesWeb[f][c];
                    dia = f;
                    hora = c;
                }
            }
        }
        System.out.printf("El dia %d a la hora %d és el dia amb mes visites", dia, hora);
    }
}
