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
public class Ex04_Objecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        String fitxer = "treballadors.txt";
        File fi = new File(fitxer);
        String souGran = "sougran.txt";
        String souPetit = "soupetit.txt";
        File fiSouGran = new File(souGran);
        File fiSouPetit = new File(souPetit);
        String nouTreballadors = "treballadorsNou.txt";
        File treballadorsNou = new File(nouTreballadors);
        do {
            do {
                menu = llegirInt("\nMenu\n1- Llegir dades\n2- Escriure dades\n3- Afegir un treballador\n4- Calcular mitjana sou\n5- Buscar un treballador\n6- Llistar treballadors\n7- Escrirue sou gran sou petit\n8- Sou gran i sou petit en un\n9- Sortir");
            } while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu != 6 && menu != 7 && menu != 8);
            switch (menu) {
                case 1:
                    llegirDadesTreballadors(fi);
                    break;
                case 2:
                    escriureDadesTreballadors(fi, false);   // amb true afegeix amb false sobrescriu
                    break;
                case 3:
                    escriureDadesTreballadors(fi, true);    // amb true afegeix amb false sobrescriu
                    break;
                case 4:
                    calcularMitjanaTreballadorsSou(fi);
                    break;
                case 5:
                    llegirTreballadorCodi(fi);
                    break;
                case 6:
                    llistarTreballadors(fi);
                    break;
                case 7:
                    escriureTreballadorsSouGranSouPetit(fi, false, fiSouGran, fiSouPetit);
                    break;

            }

        } while (menu != 9);
    }

    public static Treballador demanarTreballador() {
        Scanner teclat = new Scanner(System.in);
        Treballador tre = new Treballador();
        tre.codi = llegirInt("Codi:");
        if (tre.codi > 0) {
            System.out.println("Nom:");
            tre.nom = teclat.nextLine();
            tre.edat = llegirInt("Edat:");
            tre.sou = llegirDouble("Sou:");
        }
        return tre;
    }

    public static boolean escriuTreballador(PrintStream f, Treballador t) {
        Boolean ret = true;
        try {
            f.printf("%d\n", t.codi);
            f.println(t.nom);
            f.printf("%d\n", t.edat);
            f.printf("%.2f\n", t.sou);
        } catch (Exception e) {
            System.out.println(e.toString());
            ret = false;
        }
        return ret;
    }

    public static Treballador llegirTreballador(Scanner f) {
        Treballador tre = new Treballador();
        tre.codi = f.nextInt();
        f.nextLine();
        tre.nom = f.nextLine();
        tre.edat = f.nextInt();
        tre.sou = f.nextDouble();
        return tre;
    }

    public static void mostraTreballador(Treballador tre) {
        System.out.printf("Codi: %d\n", tre.codi);
        System.out.printf("Nom: %s\n", tre.nom);
        System.out.printf("Edat: %d\n", tre.edat);
        System.out.printf("Sou: %.2f\n\n", tre.sou);
    }

    public static void llegirDadesTreballadors(File fi) {
        Scanner lector = null;
        Treballador tre = new Treballador();
        System.out.printf("\nArxiu: %s\n", fi.getAbsoluteFile());
        try {
            lector = new Scanner(fi);
            while (lector.hasNext()) {
                tre = llegirTreballador(lector);
                mostraTreballador(tre);
            }

        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }

    static void escriureDadesTreballadors(File fi, boolean afegir) {
        PrintStream escr = null;
        Treballador tre = new Treballador();

        try {
            FileOutputStream fos = new FileOutputStream(fi, afegir);
            escr = new PrintStream(fos);
            tre = demanarTreballador();
            if (!escriuTreballador(escr, tre)) {
                System.out.println("Error escrivint treballador");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        if (escr != null) {
            escr.close();
        }
    }

    static void calcularMitjanaTreballadorsSou(File fi) {
        Scanner lector = null;
        int suma = 0, cont = 0;
        double mitja = 0;
        Treballador tre = new Treballador();
        try {
            lector = new Scanner(fi);
            while (lector.hasNext()) {
                tre = llegirTreballador(lector);
                cont++;
                suma += tre.sou;
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

    static void llegirTreballadorCodi(File fi) {
        int codiT;
        codiT = llegirInt("Codi treballador: ");
        Scanner lector = null;
        boolean trobat = false;
        Treballador tre = new Treballador();
        System.out.printf("\nArxiu: %s\n", fi.getAbsoluteFile());
        try {
            lector = new Scanner(fi);
            while (lector.hasNext() && trobat == false) {
                tre = llegirTreballador(lector);
                if (tre.codi == codiT) {
                    trobat = true;
                }
            }
            if (trobat == true) {
                mostraTreballador(tre);
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

    public static void llistarTreballadors(File fi) {
        double souSup;
        souSup = llegirDouble("Sou superior a: ");
        Scanner lector = null;
        boolean trobat = false;
        System.out.printf("\nArxiu: %s\n", fi.getAbsoluteFile());
        Treballador tre = new Treballador();
        try {
            lector = new Scanner(fi);
            while (lector.hasNext() && trobat == false) {
                tre = llegirTreballador(lector);
                if (souSup < tre.sou) {
                    mostraTreballador(tre);
                }
            }
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }

    public static void escriureTreballadorsSouGranSouPetit(File fi, boolean afegir, File fiSouGran, File fiSouPetit) {

        double souSup;
        souSup = llegirDouble("Sou superior a: ");
        Scanner lector = null;
        boolean trobat = false;
        System.out.printf("\nArxiu: %s\n", fi.getAbsoluteFile());
        Treballador tre = new Treballador();
        try {
            lector = new Scanner(fi);
            while (lector.hasNext() && trobat == false) {
                tre = llegirTreballador(lector);
                if (souSup <= tre.sou) {
                    FileOutputStream fos = new FileOutputStream(fiSouGran, afegir);
                    PrintStream escr = new PrintStream(fos);
                    System.out.println("Superior");
                    mostraTreballador(tre);
                    if (!escriuTreballador(escr, tre)) {
                        System.out.println("Error escrivint treballador");
                    }
                    escr.close();
                } else {
                    FileOutputStream fos = new FileOutputStream(fiSouPetit, afegir);
                    PrintStream escr = new PrintStream(fos);
                    System.out.println("Inferior");
                    mostraTreballador(tre);
                    if (!escriuTreballador(escr, tre)) {
                        System.out.println("Error escrivint treballador");
                    }
                    escr.close();
                }
            }
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }

    public static void unirFitxerGranIPetit(File fiSouGran, File fiSouPetit, File treballadorsNou, boolean afegir) {
        Scanner lector = null;
        boolean trobat = false;
        System.out.printf("\nArxiu: %s\n", fiSouGran.getAbsoluteFile());
        System.out.printf("\nArxiu: %s\n", fiSouPetit.getAbsoluteFile());
        Treballador tre = new Treballador();
        try {
            lector = new Scanner(fiSouGran);
            while (lector.hasNext()) {
                tre = llegirTreballador(lector);
                FileOutputStream fos = new FileOutputStream(treballadorsNou, afegir);
                PrintStream escr = new PrintStream(fos);
                if (!escriuTreballador(escr, tre)) {
                    System.out.println("Error escrivint treballador");
                }
                escr.close();                
            }
            lector.close();
            lector = new Scanner(fiSouPetit);
            while (lector.hasNext()) {
                tre = llegirTreballador(lector);
                FileOutputStream fos = new FileOutputStream(treballadorsNou, afegir);
                PrintStream escr = new PrintStream(fos);
                if (!escriuTreballador(escr, tre)) {
                    System.out.println("Error escrivint treballador");
                }
                escr.close();                
            }            
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (lector != null) {
            lector.close();
        }

    }
}
