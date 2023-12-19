/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes2;

import java.util.Scanner;
import static xavierrocauf2metodes2.Ex09.calculNotaFinal;
import static xavierrocauf2metodes2.Ex09.demanarAlumne;
import static xavierrocauf2metodes2.Util.llegirDouble;
import static xavierrocauf2metodes2.Util.llegirInt;

/**
 *
 * @author usuari Continuat l'exercici anterior afegeix al programa un mètode
 * “notaMesAlta”. Aquest mètode rep un array d'estudiants. I retornarà la nota
 * final més alta de tots els estudiants de l'array. Ara fes un altre mètode
 * “alumneNotaMesAlta”, que et retorni l'estudiant amb nota més alta. Per
 * visualitzar l’alumne utilitzarem el mètode «mostraAlumne».
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int alumnes;
        double notaFinal;
        double notMesAlta;

        alumnes = llegirInt("Alumnes a introduir:");

        Estudiant[] clase = new Estudiant[alumnes];
        for (int i = 0; i < clase.length; i++) {
            clase[i] = demanarAlumne();
        }
        for (int i = 0; i < clase.length; i++) {
            notaFinal = calculNotaFinal(clase[i]);
            System.out.printf("%s , %d , %.1f\n", clase[i].nom, clase[i].edat, notaFinal);
        }
        notMesAlta = notaMesAlta(clase);
        System.out.printf("Nota mitjana més alta = %.1f\n", notMesAlta);
        Estudiant alumne = alumneNotaMesAlta(clase);
        mostrarAlumne(alumne);

    }

    /**
     * Metode que crea un objecte i l'hi afegirà informació
     *
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
    public static double calculNotaFinal(Estudiant est) {

        double mitja;
        double suma = 0;

        for (int i = 0; i < est.notes.length; i++) {
            suma = suma + est.notes[i];
        }
        mitja = suma / est.notes.length;
        return mitja;
    }

    public static double notaMesAlta(Estudiant[] vector) {

        double max = 0;

        for (int i = 0; i < vector.length; i++) {
            double nota = calculNotaFinal(vector[i]);
            if (max < nota) {
                max = nota;
            }

        }
        return max;
    }

    public static Estudiant alumneNotaMesAlta(Estudiant[] vector) {

        double max = 0;
        int pos = 0;

        for (int i = 0; i < vector.length; i++) {
            double nota = calculNotaFinal(vector[i]);
            if (max < nota) {
                max = nota;
                pos = i;
            }
        }
        return vector[pos];
    }

    public static void mostrarAlumne(Estudiant alu) {

        System.out.println(alu.nom);
        System.out.println(alu.edat);
        for (int i = 0; i < alu.notes.length; i++) {
            System.out.println(alu.notes[i]);
        }

    }
}
