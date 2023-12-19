/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes2;

import java.util.Scanner;
import static xavierrocauf2metodes2.Util.llegirInt;

/**
 *
 * @author usuari Escriu un programa que tingui un mètode “souAumentat”. Aquest
 * mètode rep un objecte Treballador. Del treballador guardarem el dni, el nom i
 * el sou actual. Si aquest any l'increment del sou és d'un 5%, fes que el
 * mètode et retorni el sou incrementat segons aquest tant per cent.
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Treballador treb = new Treballador();

        double souAum;

        System.out.println("DNI treballador:");
        treb.dni = teclat.nextLine();
        System.out.println("Nom treballador:");
        treb.nom = teclat.nextLine();        
        treb.sou = llegirInt("Sou treballador:");

        souAum = souAumentat(treb);

        System.out.printf("El sou aumentat es de %.1f\n", souAum);

    }

    /**
     * Aumenta el sou
     * @param tr
     * @return 
     */
    public static double souAumentat(Treballador tr) {

        double sou;

        sou = tr.sou * 1.05;

        return sou;
    }

}
