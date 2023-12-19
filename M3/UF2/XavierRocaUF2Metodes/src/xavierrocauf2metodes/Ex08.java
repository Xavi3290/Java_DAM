/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Scanner;

/**
 *
 * @author usuari Realitza una funció que sumi els N primers nombres senars.
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num1, suma;

        System.out.println("Diguem un número");
        num1 = teclat.nextInt();
        suma = sumSen(num1);
        System.out.printf("Sumem els %d primers senars i dona %d\n", num1, suma);

    }

    public static int sumSen(int v1) {

        int suma = 0, cont = 0, i = 0;

        while (cont < v1) {
            if (i % 2 != 0) {
                cont++;
                suma = suma + i;
            }
            i++;
        }

        return suma;

    }

}
