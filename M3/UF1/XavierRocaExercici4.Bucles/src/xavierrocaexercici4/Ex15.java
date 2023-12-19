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
public class Ex15 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String txt;
        char ch;
        int contA = 1;

        do {
            System.out.println("Escriu un caràcter");
            txt = teclat.nextLine();
            ch = txt.charAt(0);
            if (ch == 'a' || ch == 'A') {
                System.out.printf("Tienes %d a \n", contA);
                contA++;
            }
        } while (contA <= 10);

    }

}
