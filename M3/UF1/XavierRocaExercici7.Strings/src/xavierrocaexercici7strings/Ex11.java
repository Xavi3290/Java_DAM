/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici7strings;

import java.util.Scanner;

/**
 *
 * @author usuari
 * Algorisme que donat un text, canvii totes les y per i. L'usuari introduirà el text i ha
de sortir el text modificat.
Nota: Per a fer proves pots fer servir “Y com que era alt y valent, es va enfrontar
al gegant, gran y pelut”

 */
public class Ex11 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String text;

        System.out.println("Diguem una frase:");
        text = teclat.nextLine();
        System.out.println(text.replace("y", "i"));

    }

}
