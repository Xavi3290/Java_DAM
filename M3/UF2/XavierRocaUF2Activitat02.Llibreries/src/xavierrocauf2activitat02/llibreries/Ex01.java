/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2activitat02.llibreries;

/**
 *
 * @author usuari Busca en la classe Character en java.lang els següents
 * mètodes: IsDigit, IsLetter, isWhiteSpace i genera un programa que fent servir
 * aquest mètodes determini quin tipus de caràcter ha introduït l'usuari.
 */
import java.util.Scanner;
import java.lang.Character;

public class Ex01 {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String car;
        char ch;

        System.out.println("Introdueix un caràcter:");
        car = teclat.nextLine();
        ch = car.charAt(0);
        if (Character.isDigit(ch) == true) {
            System.out.println("És un número");
        }
        if (Character.isLetter(ch) == true) {
            System.out.println("És una lletra");
        }
        if (Character.isWhitespace(ch) == true) {
            System.out.println("És un espai en blanc");
        }

    }

}
