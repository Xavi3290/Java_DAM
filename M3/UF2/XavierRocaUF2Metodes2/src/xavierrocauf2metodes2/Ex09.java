/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes2;

import java.util.Scanner;
import static xavierrocauf2metodes2.Util.*;


/**
 *
 * @author usuari Escriu un programa que demani la quantitat d’alumnes a
 * introduir i mitjançant el mètode «demanarAlumne» crei i retorni un objecte
 * Estudiant (nom, edat i notes de tres trimestres (que seran decimals amb
 * decimals) que guardarem en un array d’Alumnes. També implementarem el mètode
 * “calculNotaFinal”. Aquest mètode rep un objecte Estudiant i retorna la nota
 * final de l'alumne serà la mitjana aritmètica de les notes dels tres
 * trimestres. El programa principal ha de mostrar les notes finals de tots els
 * alumnes.
 */
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int alumnes;
        double notaFinal;

        alumnes = llegirInt("Alumnes a introduir:");

        Estudiant[] clase = new Estudiant[alumnes];
        for (int i = 0; i < clase.length; i++) {
            clase[i] = demanarAlumne();
        }
        for (int i = 0; i < clase.length; i++) {
            notaFinal = calculNotaFinal(clase[i]);
            System.out.printf("%s , %d , %.1f", clase[i].nom, clase[i].edat, notaFinal);
        }
        
    }

    /**
     * Metode que crea un objecte i l'hi afegirà informació
     * @return 
     */
    public static Estudiant demanarAlumne() {

        Scanner teclat = new Scanner(System.in);

        Estudiant estu = new Estudiant();

        System.out.println("Nom:");
        estu.nom = teclat.nextLine();
        estu.edat = llegirInt("Edat:");
        for (int i = 0; i < estu.notes.length; i++) {
            estu.notes[i] = llegirDouble("Nota " + (i + 1) + ":");
        }
        return estu;

    }

    /**
     * 
     * @param est
     * @return 
     */
    public static double calculNotaFinal(Estudiant est){
        
        double mitja;
        double suma = 0;
        
        for (int i = 0; i < est.notes.length; i++) {
            suma = suma + est.notes[i];
        }
        mitja = suma / est.notes.length;        
        return mitja;        
    }
}
