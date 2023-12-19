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
public class Ex16 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int dia;

        System.out.println("Diguem un número del 1 al 7");
        dia = teclat.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Dilluns");
                break;
            case 2:
                System.out.println("Dimarts");
                break;
            case 3:
                System.out.println("Dimecres");
                break;
            case 4:
                System.out.println("Dijous");
                break;
            case 5:
                System.out.println("Divendres");
                break;
            case 6:
                System.out.println("Disabte");
                break;
            case 7:
                System.out.println("Diumenge");
                break;
            default:
                System.out.println("Error");
                break;
        }

    }

}
