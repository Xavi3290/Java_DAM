/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici3;

import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public class Ex14 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String txt1, txt2;
        char ch1, ch2;

        System.out.println("Escriu dos caracters \nEl primer");
        txt1 = teclat.nextLine();
        ch1 = txt1.charAt(0);
        System.out.println("El segon");
        txt2 = teclat.nextLine();
        ch2 = txt2.charAt(0);
        if (ch1 < ch2) {
            System.out.printf("El caratcter %s està avans que %s \n", txt1, txt2);
        } else {
            System.out.printf("\"El caratcter %s està avans que %s \n", txt2, txt1);
        }

    }

}
