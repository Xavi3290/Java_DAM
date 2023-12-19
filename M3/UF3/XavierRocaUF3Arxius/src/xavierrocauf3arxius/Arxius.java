/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf3arxius;

import java.io.*;
import java.util.Scanner;
import static xavierrocauf3arxius.Util.*;

/**
 *
 * @author usuari
 */
public class Arxius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File arxiu;
        Producte pro = new Producte();
        int menu;

        arxiu = crearArxiu();
        do {
            do {
                menu = llegirInt("\nMenu\n1- Afegir Productes\n2- Mostra format taula\n3- Mostrar format fitxa\n4- Mostrar quantitat productes magatzem\n5- Eliminar un producte\n6- Mostrar quantitat per sota\n7- Sortir");
            } while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu != 6 && menu != 7);
            switch (menu) {
                case 1:
                    afegirDadesProducte(arxiu, true);
                    break;
                case 2:
                    mostraProductesTaula(arxiu);
                    break;
                case 3:
                    motraProductesFitxa(arxiu);
                    break;
                case 4:
                    mostrarQuantitatProducteICalcularImport(arxiu);
                    break;
                case 5:
                    eliminarProducte(arxiu);
                    break;
                case 6:
                    mostrarMenorYDemanarNouArxiu(arxiu);
                    break;
            }
        } while (menu != 7);

    }
    /**
     * Et crea un arxiu si no existeix, i si existeix et posa en el existent.
     * @return un arxiu
     */
    public static File crearArxiu() {
        String nom = "";
        File arxiu = new File(nom);
        do {
            nom = llegirString("Nom del arxiu:");
            arxiu = new File(nom);
            if (arxiu.exists()) {
                System.out.println("L'arxiu existeix");
            } else {
                if (confirmacio("Vols crear un nou arxiu? s/n")) {
                    try {
                        arxiu.createNewFile();
                    } catch (Exception e) {
                        System.out.printf("Error: %s", e.toString());
                    }
                }
            }
        } while (!arxiu.exists());
        return arxiu;
    }
    /**
     * Et demana els parametres de descripcio, preu i quantitat del producte.
     * @param pro descripcio, preu, quantitat
     * @return producte
     */
    public static Producte demanarProducte(Producte pro) {
        Scanner teclat = new Scanner(System.in);
        pro.descripcio = llegirString("Descripció: ");
        pro.preu = llegirDouble("Preu: ");
        pro.quantitat = llegirInt("Quantitat: ");

        return pro;
    }
    /**
     * Fa una boolean de si escriu o no el producte.
     * @param f PrintStream
     * @param p producte
     * @return true o false
     */
    public static boolean escriuProducte(PrintStream f, Producte p) {
        Boolean ret = true;
        try {
            f.printf("%s\n", p.codi);
            f.printf("%s\n", p.descripcio);
            f.printf("%.2f\n", p.preu);
            f.printf("%d\n", p.quantitat);
        } catch (Exception e) {
            System.out.println(e.toString());
            ret = false;
        }
        return ret;
    }
    /**
     * Llegeix el producte
     * @param f Scanner
     * @return el producte
     */
    public static Producte llegirProducte(Scanner f) {
        Producte pro = new Producte();
        pro.codi = f.nextLine();
        pro.descripcio = f.nextLine();
        pro.preu = f.nextDouble();
        pro.quantitat = f.nextInt();
        f.nextLine();
        return pro;
    }
    /**
     * Mostra la capçalera de la taula
     */
    public static void mostraCapçaleraTaula() {
        String codi = "Codi";
        String desc = "Descripció";
        String preu = "Preu";
        String quan = "Quantitat";
        System.out.printf(" %20s %20s %20s %20s\n", codi, desc, preu, quan);
    }
    /**
     * Mostra el producte en format taula
     * @param pro producte
     */
    public static void mostrarProducteTaula(Producte pro) {
        System.out.printf("%20s %20s %20.2f %20d\n", pro.codi, pro.descripcio, pro.preu, pro.quantitat);
    }
    /**
     * Mostra el producte en format fitxa
     * @param pro producte
     */
    public static void mostrarProducteFitxa(Producte pro) {
        System.out.printf("\nCodi: %s\nDescripció: %s\nPreu: %.2f\nQuantitat: %d\n", pro.codi, pro.descripcio, pro.preu, pro.quantitat);
    }
    /**
     * Afegeix en un arxiu les dades del producte fins que el codi estigui buit, si el codi esta buit s'acaba el metode i si el codi ja existeix et demana un altre
     * @param arx File 
     * @param afegir true o false
     */
    public static void afegirDadesProducte(File arx, boolean afegir) {
        PrintStream escr = null;
        Producte pro = new Producte();
        boolean sortir = true;
        do {
            sortir = true;
            if (demanarCodi(pro)) {
                sortir = false;
                try {
                    FileOutputStream fos = new FileOutputStream(arx, afegir);
                    escr = new PrintStream(fos);
                    if (!buscarCodi(pro, arx)) {
                        pro = demanarProducte(pro);
                        if (!escriuProducte(escr, pro)) {
                            System.out.println("Error escrivint productes");
                        }
                    } else {
                        System.out.println("Codi ja existent, posa un altre");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.toString());
                }
                if (escr != null) {
                    escr.close();
                }
            }
        } while (!sortir);
    }
    /**
     * Demana el codi del producte i et diu si el codi esta ple o no amb una boolean
     * @param p producte
     * @return bolean
     */
    public static boolean demanarCodi(Producte p) {
        Scanner teclat = new Scanner(System.in);
        boolean codiPle = true;
        System.out.println("Codi:");
        p.codi = teclat.nextLine();
        p.codi = p.codi.trim();
        if (p.codi.length() == 0) {
            codiPle = false;
        }
        return codiPle;
    }
    /**
     * Et busca el codi per l'arxiu i diu si esta o no amb una boolean
     * @param p producte
     * @param arx arxiu
     * @return boolean
     */
    public static boolean buscarCodi(Producte p, File arx) {
        boolean trobat = false;
        Producte pro = new Producte();
        Scanner lector;
        try {
            lector = new Scanner(arx);
            while (lector.hasNext() && trobat == false) {
                pro = llegirProducte(lector);
                if (p.codi.equals(pro.codi)) {
                    trobat = true;
                }
            }
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        return trobat;
    }
    /**
     * Mostra els productes en format taula
     * @param arx 
     */
    public static void mostraProductesTaula(File arx) {
        Scanner lector = null;
        Producte pro = new Producte();
        int numEsquerra = 1;
        try {
            lector = new Scanner(arx);
            mostraCapçaleraTaula();
            while (lector.hasNext()) {
                System.out.printf("%d", numEsquerra);
                pro = llegirProducte(lector);
                mostrarProducteTaula(pro);
                numEsquerra++;
            }
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }
    /**
     * Mostra el producte en format fitxa del producte demanat amb el codi
     * @param arx arxiu
     */
    public static void motraProductesFitxa(File arx) {
        Scanner lector = null;
        Producte pro = new Producte();
        Producte p = new Producte();
        if (demanarCodi(pro)) {
            try {
                lector = new Scanner(arx);
                while (lector.hasNext()) {
                    if (!buscarCodi(pro, arx)) {
                        System.out.println("Codi no existeix");
                    } else {
                        p = llegirProducte(lector);
                        if (pro.codi.equals(p.codi)) {
                            mostrarProducteFitxa(p);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.toString());
            }
            if (lector != null) {
                lector.close();
            }
        }
    }
    /**
     * Et calcula la quantitat total i te'l mostra, també et calcula l'import de l'estoc total i t'el mostra
     * @param arx 
     */
    public static void mostrarQuantitatProducteICalcularImport(File arx) {
        Scanner lector = null;
        Producte pro = new Producte();
        int quanTotal = 0;
        double preuTotal = 0, preuStock;
        try {
            lector = new Scanner(arx);
            while (lector.hasNext()) {
                pro = llegirProducte(lector);
                quanTotal += pro.quantitat;
                preuTotal += pro.preu;
            }
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        System.out.printf("\nQuantitat total: %d", quanTotal);
        preuStock = preuTotal * quanTotal;
        System.out.printf("\nImport de l'estoc: %.2f\n", preuStock);
        if (lector != null) {
            lector.close();
        }

    }
    /**
     * T'elimina un producte de l'arxiu, si existeix el codi i et pregunta si el vols eliminar
     * @param arx arxiu
     */
    public static void eliminarProducte(File arx) {
        Scanner lector = null;
        Producte pro = new Producte();
        Producte p = new Producte();
        String copia = "copia.txt";
        File cop = new File(copia);
        if (demanarCodi(pro)) {
            try {
                if (!buscarCodi(pro, arx)) {
                    System.out.println("Codi no existeix");
                } else {
                    lector = new Scanner(arx);
                    while (lector.hasNext()) {
                        p = llegirProducte(lector);
                        if (pro.codi.equals(p.codi)) {
                            mostrarProducteFitxa(p);
                            if (confirmacio("Vols eliminar el producte? s/n")) {
                                copiaArxiu(pro, arx, cop);
                            }
                        }
                    }
                    arx.delete();
                    cop.renameTo(arx);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.toString());
            }
            if (lector != null) {
                lector.close();
            }
        }
    }
    /**
     * Copia un arxiu a un altre treient un producte
     * @param pro producte
     * @param arx arxiu
     * @param cop copia
     */
    public static void copiaArxiu(Producte pro, File arx, File cop) {
        Producte proCopia = new Producte();

        try {
            FileOutputStream fos = new FileOutputStream(cop, true);
            PrintStream escr = new PrintStream(fos);
            Scanner lector = new Scanner(arx);
            while (lector.hasNext()) {
                proCopia = llegirProducte(lector);
                if (!pro.codi.equals(proCopia.codi)) {
                    escriuProducte(escr, proCopia);
                }
            }
            lector.close();
            escr.close();            
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
    /**
     * Mostra per pantalla els productes que tenen menys quantitat de la demanada i et diu si ho vols guardar en un arxiu
     * @param arx arxiu
     */
    public static void mostrarMenorYDemanarNouArxiu(File arx) {
        int quantMax;
        quantMax = llegirInt("Quantitat menor a: ");
        Scanner lector = null;
        boolean trobat = false;
        Producte pro = new Producte();
        String menor = "menor.txt";
        File men = new File(menor);
        int numEsquerra = 1;
        try {
            lector = new Scanner(arx);
            mostraCapçaleraTaula();
            while (lector.hasNext()) {
                pro = llegirProducte(lector);
                if (quantMax >= pro.quantitat) {
                    System.out.printf("%d", numEsquerra);
                    mostrarProducteTaula(pro);
                    numEsquerra++;
                }
            }
            if (confirmacio("Vols generar un nou arxiu amb aquesta llista? s/n")) {
                crearNouArxiuFiltratMenor(arx, quantMax, men);
            }
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }
    /**
     * Cera un nou arxiu amb els productes de menor quantitat demanada
     * @param arx arxiu
     * @param quantMax quantitat per la que filtra
     * @param men arxiu menor
     */
    public static void crearNouArxiuFiltratMenor(File arx, int quantMax, File men) {
        Scanner lector = null;
        Producte pro = new Producte();
        try {
            lector = new Scanner(arx);
            FileOutputStream fos = new FileOutputStream(men, false);
            PrintStream escr = new PrintStream(fos);
            while (lector.hasNext()) {
                pro = llegirProducte(lector);
                if (quantMax >= pro.quantitat) {
                    if (!escriuProducte(escr, pro)) {
                        System.out.println("Error escrivint Producte");
                    }
                }
                
            }
            escr.close();
            lector.close();
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (lector != null) {
            lector.close();
        }
    }
}
