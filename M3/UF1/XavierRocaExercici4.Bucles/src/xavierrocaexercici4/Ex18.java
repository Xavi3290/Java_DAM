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
public class Ex18 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num, cont, resu, mult, prova = 0;

        System.out.println("Programa per a aprendre les taules de multiplicar \n");
        System.out.println("Amb quin número vols practirar?");
        num = teclat.nextInt();
        for (cont = 1; cont <= 10; cont++) {
            System.out.printf("%d * %d = \n", num, cont);
            resu = teclat.nextInt();
            mult = num * cont;
            if (mult == resu) {
                System.out.println("Valor correcte");
                prova++;
            } else {
                System.out.printf("Ho sento,'s'ha equivocat.La resposta correcta era %d \n", mult);
            }
        }
        System.out.printf("Has encertat %d vegades de 10 números \n", prova);

    }

}
