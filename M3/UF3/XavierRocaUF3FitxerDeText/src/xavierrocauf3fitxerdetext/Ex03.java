/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf3fitxerdetext;

import java.io.*;
import java.util.Scanner;
import static xavierrocauf3fitxerdetext.Util.llegirDouble;
import static xavierrocauf3fitxerdetext.Util.llegirInt;

/**
 *
 * @author usuari
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;

        do {
            do {
                menu = llegirInt("\nMenu\n1- Llegir dades\n2- Escriure dades\n3- Afegir una alumne\n4- Calcular mitjana edat\n5- Buscar alumne amb codi\n6- Sortir");
            } while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu != 6);
            switch (menu) {
                case 1:
                    llegirDadesAlumnes("alumnes.txt");
                    break;
                case 2:
                    escriureDadesAlumne("alumnes.txt");
                    break;
                case 3:
                    afegirAlumne("alumnes.txt");
                    break;
                case 4:
                    calcularMitjanaAlumneEdat("alumnes.txt");
                    break;
                case 5:
                    llegirAlumneCodi("alumnes.txt");
                    break;

            }
        } while (menu != 6);
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

    public static void escriureDadesAlumne(String fnom) {
        Scanner teclat = new Scanner(System.in);

        String nom;
        int edat, num, codi;
        double mNota;
        System.out.println("Quants alumnes vols apuntar");
        num = teclat.nextInt();
        teclat.nextLine();
        PrintStream escr = null;
        try {
            File fo = new File(fnom);
            escr = new PrintStream(fo);
            for (int i = 0; i < num; i++) {
                codi = llegirInt("Codi");
                System.out.println("Nom:");
                nom = teclat.nextLine();
                edat = llegirInt("Edat");
                mNota = llegirDouble("Nota mitja");
                escr.printf("%d\n%s\n%d %.2f\n", codi, nom, edat, mNota);
            }
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
        int edat, num, codi;
        double mNota;
        try {
            File fo = new File(fnom);
            FileOutputStream fos = new FileOutputStream(fo, true);
            codi = llegirInt("Codi");
            System.out.println("Nom:");
            nom = teclat.nextLine();
            edat = llegirInt("Edat");
            mNota = llegirDouble("Nota mitja");
            escr.printf("%d\n%s\n%d %.2f\n", codi, nom, edat, mNota);
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
                String nom = lector.nextLine().trim();  // trim para que no haya espacios
                int edat = lector.nextInt();
                double nota = lector.nextDouble();
                lector.nextLine();
                cont++;
                suma += edat;
            }
            mitja = suma / cont;
            System.out.printf("La mitjana d'edat és %.2f", mitja);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }

    static void llegirAlumneCodi(String fnom) {
        int codiA;
        codiA = llegirInt("Codi alumne: ");
        File fi = new File(fnom);
        Scanner lector = null;
        boolean trobat = false;
        System.out.printf("\nArxiu: %s\n", fi.getAbsoluteFile());
        int codi = 0, edat = 0;
        String nom = "";
        double mNota = 0;
        try {
            lector = new Scanner(fi);
            while (lector.hasNext() && trobat == false) {
                codi = lector.nextInt();
                lector.nextLine();
                nom = lector.nextLine().trim();  // trim para que no haya espacios
                edat = lector.nextInt();
                mNota = lector.nextDouble();
                if (codi == codiA) {
                    trobat = true;
                }
            }
            if (trobat == true) {
                System.out.printf("%d\n%s\n%d %.2f\n", codi, nom, edat, mNota);
            } else {
                System.out.println("Codi no trobat");
            }
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }
}
