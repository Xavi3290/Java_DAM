/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici9objectes;

import java.util.Scanner;

/**
 *
 * @author usuari Desenvolupeu un programa que defineixi els tipus de dades
 * InfoPersona amb els camps: tipus (client o empleat), nom, cognom i adreça i
 * obtingui de l'entrada estàndard una sèrie de (com a màxim) MAX empleats i
 * (com màxim) MAX clients i mostri tots els empleats junts (una línia per cada
 * empleat) i després tots els clients junts (una línia per cada client). 1.
 * Nota: MAX ha de ser una constant definida al programa i es tindrà que
 * controlar el màxim de empleats i clients.
 */
public class Ex05 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        final int MAXEMPLEATS = 2, MAXCLIENTS = 2;
        String tipus;

        do {//cambiar a switch
            System.out.println("Tipus: ");
            tipus = teclat.nextLine();

        } while (tipus != "client" || tipus != "empleat");
        
        
        
        
        
    }

}
