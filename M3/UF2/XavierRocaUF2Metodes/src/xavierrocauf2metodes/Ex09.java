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
 * @author usuari Realitza un mètode que se li passa un vector de sencers i un
 * nombre. S'ha de buscar el número en la taula i indicar si es troba o no.
 */
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();
        

        int num;
        boolean verificar;
        int[] vector = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(10);
        }
        System.out.println("Quin número vols buscar dintre del vector, del 1 al 10");
        num = teclat.nextInt();
        verificar = buscarNumArr(vector, num);
        if (verificar == true) {
            System.out.printf("El %d si està al vector\n", num);
        } else {
            System.out.printf("El %d no està al vector\n", num);
        }

    }

   
}
