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
public class Ex03_Objecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        String fitxer = "alumnes.txt";
        File fi = new File(fitxer);
        do {
            do {
                menu = llegirInt("\nMenu\n1- Llegir dades\n2- Escriure dades\n3- Afegir una alumne\n4- Calcular mitjana edat\n5- Buscar alumne amb codi\n6- Sortir");
            } while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu != 6);
            switch (menu) {
                case 1:
                    llegirDadesAlumnes(fi);
                    break;
                case 2:
                    escriureDadesAlumne(fi);
                    break;
                case 3:
                    afegirAlumne(fi);
                    break;
                case 4:
                    calcularMitjanaAlumneEdat(fi);
                    break;
                case 5:
                    llegirAlumneCodi(fi);
                    break;

            }
        } while (menu != 6);
    }

    public static Alumne demanarAlumne() {
        Scanner teclat = new Scanner(System.in);
        Alumne alu = new Alumne();        
        alu.codi = llegirInt("Codi:");         
        if (alu.codi > 0) { 
            System.out.println("Nom:");
            alu.nom = teclat.nextLine();
            alu.edat = llegirInt("Edat:");
            alu.mNota = llegirDouble("Nota mitja:");            
        }
        return alu;
    }

    public static boolean escriuAlumne(PrintStream f, Alumne a) {
        Boolean ret = true;
        try {
            f.printf("%d\n", a.codi);
            f.println(a.nom);
            f.printf("%d\n", a.edat);
            f.printf("%.2f\n", a.mNota);
        } catch (Exception e) {
            System.out.println(e.toString());
            ret = false;
        }
        return ret;
    }

    public static Alumne llegirAlumne(Scanner f) {
        Alumne alu = new Alumne();
        alu.codi = f.nextInt();
        f.nextLine();
        alu.nom = f.nextLine();
        alu.edat = f.nextInt();
        alu.mNota = f.nextDouble();
        return alu;
    }

    public static void mostraAlumne(Alumne alu) {
        System.out.printf("Codi: %d\n", alu.codi);
        System.out.printf("Nom: %s\n", alu.nom);
        System.out.printf("Edat: %d\n", alu.edat);
        System.out.printf("Nota mitja: %.2f\n\n", alu.mNota);
    }

    public static void llegirDadesAlumnes(File fi) {
        Alumne alu = new Alumne();
        Scanner lector = null;
        System.out.printf("\nArxiu: %s\n\n", fi.getAbsoluteFile());
        try {
            lector = new Scanner(fi);
            while (lector.hasNext()) {
                alu = llegirAlumne(lector);
                mostraAlumne(alu);
            }
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }

    public static void escriureDadesAlumne(File fo) {
        Scanner teclat = new Scanner(System.in);

        Alumne alu = new Alumne();
        int num;
        System.out.println("\nQuants alumnes vols apuntar");
        num = teclat.nextInt();
        teclat.nextLine();
        PrintStream escr = null;
        try {
            escr = new PrintStream(fo);
            for (int i = 0; i < num; i++) {
                alu = demanarAlumne();
                if (!escriuAlumne(escr, alu)) {
                    System.out.println("Error llegint alumne");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (escr != null) {
            escr.close();
        }
    }

    static void afegirAlumne(File fi) {
        PrintStream escr = null;
        Alumne alu = new Alumne();

        try {
            FileOutputStream fos = new FileOutputStream(fi, true);
            escr = new PrintStream(fos);
            alu = demanarAlumne();
            if (!escriuAlumne(escr, alu)) {
                System.out.println("Error escrivint alumne");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (escr != null) {
            escr.close();
        }
    }

    static void calcularMitjanaAlumneEdat(File fi) {
        Scanner lector = null;
        int cont = 0;
        double mitja = 0, suma = 0;
        Alumne alu = new Alumne();
        try {
            lector = new Scanner(fi);
            while (lector.hasNext()) {
                alu = llegirAlumne(lector);
                cont++;
                suma += alu.edat;
            }
            mitja = suma / cont;
            System.out.printf("\nLa mitjana d'edat és %.2f\n", mitja);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }

    static void llegirAlumneCodi(File fi) {
        int codiA;
        codiA = llegirInt("\nCodi alumne: ");
        Scanner lector = null;
        boolean trobat = false;
        Alumne alu = new Alumne();
        System.out.printf("\nArxiu: %s\n\n", fi.getAbsoluteFile());
        try {
            lector = new Scanner(fi);
            while (lector.hasNext() && trobat == false) {
                alu = llegirAlumne(lector);
                if (alu.codi == codiA) {
                    trobat = true;
                }
            }
            if (trobat == true) {
                mostraAlumne(alu);
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
