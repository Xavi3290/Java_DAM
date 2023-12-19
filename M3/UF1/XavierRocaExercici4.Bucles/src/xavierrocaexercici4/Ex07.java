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
public class Ex07 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num, cont, res = 1;

        System.out.println("Diguem un número que calcularem el factorial");
        num = teclat.nextInt();
        for (cont = 1; cont <= num; cont++) {
            res = res * cont;
        }
        System.out.printf("%d \n", res);

    }

}
