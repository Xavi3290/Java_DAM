/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici4;

import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public class Ex17 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num, cont = 1, sou, souGran = 0;

        System.out.println("Diguem un número ");
        num = teclat.nextInt();
        while (cont <= num) {
            System.out.println("Diguem un sou");
            sou = teclat.nextInt();
            cont++;
            if (sou > souGran) {
                souGran = sou;
            }
        }
        System.out.printf("El sou mes gran és %d \n", souGran);

    }

}
