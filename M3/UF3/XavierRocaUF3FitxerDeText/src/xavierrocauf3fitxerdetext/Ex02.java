/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf3fitxerdetext;

import java.io.*;
import java.util.Scanner;

import static xavierrocauf3fitxerdetext.Util.llegirInt;

/**
 *
 * @author usuari
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;

        do {
            do {
                menu = llegirInt("\nMenu\n1- Llegir dades\n2- Escriure dades\n3- Afegir una alumne\n4- Calcular mitjana edat\n5- Sortir");
            } while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5);
            switch (menu) {
                case 1:
                    llegirDadesAlumnes("Alumnes.txt");
                    break;
                case 2:
                    dadesAlumne("Alumnes.txt");
                    break;
                case 3:
                    afegirAlumne("Alumnes.txt");
                    break;
                case 4:
                    calcularMitjanaAlumneEdat("Alumnes.txt");
                    break;
            }
        } while (menu != 5);
    }

    public static void llegirDadesAlumnes(String fnom) {
        File fi = new File(fnom);
        Scanner lector = null;
        System.out.printf("\nArxiu: %s\n", fi.getAbsoluteFile());
        try {
            lector = new Scanner(fi);
            while (lector.hasNext()) {
                String linea = lector.next();
                System.out.println(linea);
            }

        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }

    public static void dadesAlumne(String fnom) {
        Scanner teclat = new Scanner(System.in);

        String nom;
        int edat, num;
        double mNota;
        System.out.println("Quants alumnes vols apuntar");
        num = teclat.nextInt();
        teclat.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Nom:");
            nom = teclat.nextLine();
            System.out.println("Edat:");
            edat = teclat.nextInt();
            System.out.println("Nota mitja:");
            mNota = teclat.nextDouble();
            teclat.nextLine();
            escriureAlumne(fnom, nom, edat, mNota);
        }
    }

    static void escriureAlumne(String fnom, String nom, int edat, double mNota) {
        PrintStream escr = null;
        try {
            File fo = new File(fnom);
            escr = new PrintStream(fo);
            escr.printf("%s %d %.1f\n", nom, edat, mNota);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (escr != null) {
            escr.close();
        }
    }

    static void afegirAlumne(String fnom) {
        PrintStream escr = null;
        Scanner teclat = new Scanner(System.in);

        String nom;
        int edat, num;
        double mNota;
        try {
            File fo = new File(fnom);
            FileOutputStream fos = new FileOutputStream(fo, true);
            System.out.println("Nom:");
            nom = teclat.nextLine();
            System.out.println("Edat:");
            edat = teclat.nextInt();
            System.out.println("Nota mitja:");
            mNota = teclat.nextDouble();
            escr = new PrintStream(fos);
            escr.printf("%s %d %.1f\n", nom, edat, mNota);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (escr != null) {
            escr.close();
        }
    }

    static void calcularMitjanaAlumneEdat(String fnom) {
        File fi = new File(fnom);
        Scanner lector = null;
        int suma = 0, cont = 0;
        double mitja = 0;        
        try {
            lector = new Scanner(fi);
            while (lector.hasNext()) {                               
                int valor = lector.nextInt();
                System.out.println(valor);
                cont++;
                suma += valor;                   
            }
            mitja = suma / cont;
            System.out.printf("La mitjana d'edat és %.1f", mitja);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }
}
