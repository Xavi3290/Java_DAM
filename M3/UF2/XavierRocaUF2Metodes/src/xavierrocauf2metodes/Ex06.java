/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Scanner;

/**
 *
 * @author usuari Realitza un mètode que retorni true o false si un nombre és
 * parell.
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num;
        boolean verificar;

        System.out.println("Diguem un número i et direm si es parell");
        num = teclat.nextInt();
        verificar = parell(num);
        System.out.printf("El número %d és %b (true si es parell, false si no ho es)\n", num, verificar);

    }

    public static boolean parell(int v1) {

        boolean esParell = false;

        if (v1 % 2 == 0) {
            esParell = true;
        }

        return esParell;

    }

}
