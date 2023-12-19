/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici7strings;

import java.util.Scanner;

/**
 *
 * @author Xavi
 * Programa l'algorisme d'obtenció de la lletra del DNI.
La lletra del DNI s'obté a partir d'un algoritme conegut com a mòdul 23.
L'algorisme consisteix a aplicar l'operació aritmètica de mòdul 23 al número del
DNI. El mòdul 23 és el nombre enter obtingut com la resta de la divisió entera del
número del DNI entre 23 . El resultat és un nombre comprès entre el 0 i el 22 que
serveix com a posició per seleccionar la lletra en base a una cadena coneguda. La
combinació del número amb aquesta lletra és el DNI .
Nota: La cadena coneguda és: TRWAGMYFPDXBNJZSQVHLCKE

 */
public class Ex10 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni, resposta;

        System.out.println("Introdueix el numero del teu DNI:");
        dni = teclat.nextInt();
        resposta = dni % 23;
        System.out.println("La teva lletra del DNI és " + (cadena.charAt(resposta)));

    }

}
