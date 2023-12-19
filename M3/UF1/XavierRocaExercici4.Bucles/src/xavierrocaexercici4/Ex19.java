/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici4;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex19 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num, nota, cont, aprovats = 0, suspes = 0;
        final int APROVAT = 4;

        System.out.println("Hem donaras 6 notas dels examens");
        for (cont = 1; cont <= 6; cont++) {
            System.out.printf("%d nota =\n", cont);
            nota = teclat.nextInt();
            if (nota > 0 && nota < 10) {
                if (nota >= APROVAT) {
                    aprovats++;
                } else {
                    suspes++;
                }
            } else {
                System.out.println("ERROR");
                cont--;
            }

        }
        System.out.printf("Els aprovats són %d i els suspesos són %d\n", aprovats, suspes);

    }

}
