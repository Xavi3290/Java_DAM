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
public class Ex12 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String mes;
        System.out.println("Diguem un mes per saber la seva estació");
        mes = teclat.nextLine();
        switch (mes) {
            case "gener":
            case "febrer":
            case "decembre":
                System.out.println("Hivern");
                break;
            case "març":
            case "abril":
            case "maig":
                System.out.println("Prinavera");
                break;
            case "juny":
            case "juliol":
            case "agost":
                System.out.println("Estiu");
                break;
            case "setembre":
            case "octubre":
            case "novembre":
                System.out.println("Tardor");
                break;
            default:
                System.out.println("Error");
                break;
                    
        }

    }

}
