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
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        String nomArxiu = "treballadors.txt";
        do {
            do {
                menu = llegirInt("\nMenu\n1- Llegir dades\n2- Escriure dades\n3- Afegir un treballador\n4- Calcular mitjana sou\n5- Buscar un treballador\n6- Llistar treballadors\n7- Sortir");
            } while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu != 6 && menu != 7);
            switch (menu) {
                case 1:
                    llegirDadesTreballadors(nomArxiu);
                    break;
                case 2:
                    escriureDadesTreballadors(nomArxiu);
                    break;
                case 3:
                    afegirTreballador(nomArxiu);
                    break;
                case 4:
                    calcularMitjanaTreballadorsSou(nomArxiu);
                    break;
                case 5:
                    llegirTreballadorCodi(nomArxiu);
                    break;
                case 6:
                    llistarTreballadors(nomArxiu);
                    break;

            }
            
        }while(menu != 7);
    }
    
    public static void llegirDadesTreballadors(String fnom) {
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

    public static void escriureDadesTreballadors(String fnom) {
        Scanner teclat = new Scanner(System.in);

        String nom;
        int edat, num, codi;
        double sou;
        System.out.println("Quants treballadors vols apuntar");
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
                edat = llegirInt("Edat:");
                sou = llegirDouble("Sou:");
                escr.printf("%d\n%s\n%d %.2f\n", codi, nom, edat, sou);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (escr != null) {
            escr.close();
        }
    }

    static void afegirTreballador(String fnom) {
        PrintStream escr = null;
        Scanner teclat = new Scanner(System.in);

        String nom;
        int edat, num, codi;
        double sou;
        try {
            File fo = new File(fnom);
            FileOutputStream fos = new FileOutputStream(fo, true);
            codi = llegirInt("Codi");
            System.out.println("Nom:");
            nom = teclat.nextLine();
            edat = llegirInt("Edat:");
            sou = llegirDouble("Sou:");
            escr.printf("%d\n%s\n%d %.2f\n", codi, nom, edat, sou);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (escr != null) {
            escr.close();
        }
    }

    static void calcularMitjanaTreballadorsSou(String fnom) {
        File fi = new File(fnom);
        Scanner lector = null;
        int suma = 0, cont = 0;
        double mitja = 0;
        try {
            lector = new Scanner(fi);
            while (lector.hasNext()) {
                String nom = lector.nextLine().trim();  // trim para que no haya espacios
                int edat = lector.nextInt();
                double sou = lector.nextDouble();
                lector.nextLine();
                cont++;
                suma += sou;
            }
            mitja = suma / cont;
            System.out.printf("La mitjana del sou és %.2f", mitja);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }

    static void llegirTreballadorCodi(String fnom) {
        int codiT;
        codiT = llegirInt("Codi treballador: ");
        File fi = new File(fnom);
        Scanner lector = null;
        boolean trobat = false;
        System.out.printf("\nArxiu: %s\n", fi.getAbsoluteFile());
        int codi = 0, edat = 0;
        String nom = "";
        double sou = 0;
        try {
            lector = new Scanner(fi);
            while (lector.hasNext() && trobat == false) {
                codi = lector.nextInt();
                lector.nextLine();
                nom = lector.nextLine().trim();  // trim para que no haya espacios
                edat = lector.nextInt();
                sou = lector.nextDouble();
                if (codi == codiT) {
                    trobat = true;
                }
            }
            if (trobat == true) {
                System.out.printf("%d\n%s\n%d %.2f\n", codi, nom, edat, sou);
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
    
    public static void llistarTreballadors(String fnom){
        double souSup;
        souSup = llegirDouble("Sou superior a: ");
        File fi = new File(fnom);
        Scanner lector = null;
        boolean trobat = false;
        System.out.printf("\nArxiu: %s\n", fi.getAbsoluteFile());
        int codi = 0, edat = 0;
        String nom = "";
        double sou = 0;
        try {
            lector = new Scanner(fi);
            while (lector.hasNext() && trobat == false) {
                codi = lector.nextInt();
                lector.nextLine();
                nom = lector.nextLine().trim();  // trim para que no haya espacios
                edat = lector.nextInt();
                sou = lector.nextDouble();
                if (souSup < sou) {
                    System.out.printf("%d\n%s\n%d %.2f\n", codi, nom, edat, sou);
                }
            }            
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }
    
}
