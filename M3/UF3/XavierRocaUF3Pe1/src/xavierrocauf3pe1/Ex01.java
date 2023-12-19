/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf3pe1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import static xavierrocauf3pe1.Util.*;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        menu();
    }
    /**
     * Un Menu amb els diferents casos sobre les montanyes
     */
    public static void menu() {

        int menu;
        File arxiu;
        arxiu = crearArxiu();
        do {
            do {
                menu = menu = llegirInt("\nMenu\n1- Escriu a l'arxiu\n2- Afegir un registre\n3- Llistar\n4- Mostrar informacio de una montanya\n5- Mostrar la llista\n6- Sortir");
            } while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu != 6);
            switch (menu) {
                case 1:
                    afegirDadesMontanya(arxiu, true);
                    break;
                case 2:
                    afegirDadesMontanyaDeUnRegistre(arxiu, true);
                    break;
                case 3:
                    mostraMontanyesTaula(arxiu);
                    break;
                case 4:
                    mostraMontanyaFitxa(arxiu);
                    break;
                case 5:
                    mostraMontanyesComarcaTaula(arxiu);
                    break;
            }

        } while (menu != 6);

    }
    /**
     * Creas un arxiu, si existeix utilitzes ja l'existent sino et crea un de nou
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
     * Demana el codi de la montanya, si no es igual a 0 et retorna true, sino false
     * @param m montanya
     * @return boolean
     */
    public static boolean demanarCodi(Montanya m) {
        Scanner teclat = new Scanner(System.in);
        boolean codiNoZero = true;
        System.out.println("Codi:");
        m.codi = teclat.nextInt();
        if (m.codi == 0) {
            codiNoZero = false;
        }
        return codiNoZero;
    }
    /**
     * Busca el codi de la montanya 
     * @param m montanya
     * @param arx arxiu
     * @return bolean si la trobat o no
     */
    public static boolean buscarCodi(Montanya m, File arx) {
        boolean trobat = false;
        Montanya mon = new Montanya();
        Scanner lector;
        try {
            lector = new Scanner(arx);
            while (lector.hasNext() && trobat == false) {
                mon = llegirMontanya(lector);
                if (m.codi == mon.codi) {
                    trobat = true;
                }
            }
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        return trobat;
    }
    /**
     * Demana les dades de la montanya
     * @param mon montanya
     * @return una montanya
     */
    public static Montanya demanarMontanya(Montanya mon) {
        Scanner teclat = new Scanner(System.in);
        mon.nom = llegirString("Nom: ");
        mon.codiComarca = llegirInt("Codi de comarca: ");
        mon.altura = llegirDouble("Altura: ");

        return mon;
    }
    /**
     * Escriu la montanya, i amb la boolean et diu si hi ha hagut algun error
     * @param f PrintStrem per escriure
     * @param m montanya
     * @return boolean
     */
    public static boolean escriuMontanya(PrintStream f, Montanya m) {
        Boolean ret = true;
        try {
            f.printf("%s\n", m.codi);
            f.printf("%s\n", m.nom);
            f.printf("%d\n", m.codiComarca);
            f.printf("%.2f\n", m.altura);
        } catch (Exception e) {
            System.out.println(e.toString());
            ret = false;
        }
        return ret;
    }
    /**
     * Llegeix una montanya
     * @param f Scanner de lector
     * @return montanya
     */
    public static Montanya llegirMontanya(Scanner f) {
        Montanya mon = new Montanya();
        mon.codi = f.nextInt();
        f.nextLine();
        mon.nom = f.nextLine();
        mon.codiComarca = f.nextInt();
        mon.altura = f.nextDouble();
        return mon;
    }
    /**
     * Mostra la capçalera de la taula
     */
    public static void mostraCapçaleraTaula() {
        String codi = "Codi";
        String nom = "Nom";
        String codiCom = "Codi Comarca";
        String altura = "Altura";
        System.out.printf(" %20s %20s %20s %20s\n", codi, nom, codiCom, altura);
    }
    /**
     * Mostra les dades de la montanya en format taula
     * @param mon montanya
     */
    public static void mostrarMontanyaTaula(Montanya mon) {
        System.out.printf("%20d %20s %20d %20.2f \n", mon.codi, mon.nom, mon.codiComarca, mon.altura);
    }
    /**
     * Mostra les dades de la montanya en format fitxa
     * @param mon montanya
     */
    public static void mostrarMontanyaFitxa(Montanya mon) {
        System.out.printf("\nCodi: %d\nNom: %s\nCodi Comarca: %d\nAltura %.2f\n", mon.codi, mon.nom, mon.codiComarca, mon.altura);
    }
    /**
     * Afegeix dades de montanyes en un arxiu
     * @param arx arxiu
     * @param afegir bolean de si sobreescriu o no
     */
    public static void afegirDadesMontanya(File arx, boolean afegir) {
        PrintStream escr = null;
        Montanya mon = new Montanya();
        boolean sortir = true;
        do {
            sortir = true;
            if (demanarCodi(mon)) {
                sortir = false;
                try {
                    FileOutputStream fos = new FileOutputStream(arx, afegir);
                    escr = new PrintStream(fos);
                    if (!buscarCodi(mon, arx)) {
                        mon = demanarMontanya(mon);
                        if (!escriuMontanya(escr, mon)) {
                            System.out.println("Error escrivint montanyes");
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
     * Afegeix dades de una montanya de un registre a l'arxiu
     * @param arx arxiu
     * @param afegir bolean de si sobreescriu o no
     */
    public static void afegirDadesMontanyaDeUnRegistre(File arx, boolean afegir) {
        PrintStream escr = null;
        Montanya mon = new Montanya();
        String nom = "mon1.txt";
        File arxiu = new File("mon1.txt");
        boolean sortir = true;
        do {
            try {
                FileOutputStream fos = new FileOutputStream(arx, afegir);
                escr = new PrintStream(fos);
                Scanner lector = new Scanner(arxiu);
                while (lector.hasNext()) {
                    mon = llegirMontanya(lector);
                    if (!escriuMontanya(escr, mon)) {
                        System.out.println("Error escrivint montanyes");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.toString());
            }
            if (escr != null) {
                escr.close();
            }

        } while (!sortir);
    }
    /**
     * Mostra les dades de les montanyes en format taula
     * @param arx 
     */
    public static void mostraMontanyesTaula(File arx) {
        Scanner lector = null;
        Montanya mon = new Montanya();
        int numEsquerra = 1;
        try {
            lector = new Scanner(arx);
            mostraCapçaleraTaula();
            while (lector.hasNext()) {
                System.out.printf("%d", numEsquerra);
                mon = llegirMontanya(lector);
                mostrarMontanyaTaula(mon);
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
     * Mostra la montanya demanada per el codi amb format fitxa
     * @param arx 
     */
    public static void mostraMontanyaFitxa(File arx) {
        Scanner lector = null;
        Montanya mon = new Montanya();
        Montanya m = new Montanya();
        if (demanarCodi(mon)) {
            try {
                lector = new Scanner(arx);
                while (lector.hasNext()) {
                    if (!buscarCodi(mon, arx)) {
                        System.out.println("Codi no existeix");
                    } else {
                        m = llegirMontanya(lector);
                        if (mon.codi == m.codi) {
                            mostrarMontanyaFitxa(m);
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
     * Mostra les montanyes per el codi comarca en format taula
     * @param arx arxiu
     */
    public static void mostraMontanyesComarcaTaula(File arx) {
        Scanner lector = null;
        Montanya mon = new Montanya();
        Montanya m = new Montanya();
        mon.codiComarca = llegirInt("Codi Comarca: ");
        try {
            lector = new Scanner(arx);
            mostraCapçaleraTaula();
            while (lector.hasNext()) {
                if (!buscarCodiComarca(mon, arx)) {
                    System.out.println("Codi no existeix");
                } else {
                    m = llegirMontanya(lector);
                    if (mon.codiComarca == m.codiComarca) {
                        mostrarMontanyaTaula(m);
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
    /**
     * Busca el codi de la comarca en l'arxiu i et diu si esta o no amb una boolean
     * @param m montanya
     * @param arx arxiu
     * @return boolean si esta trobat o no
     */
    public static boolean buscarCodiComarca(Montanya m, File arx) {
        boolean trobat = false;
        Montanya mon = new Montanya();
        Scanner lector;
        try {
            lector = new Scanner(arx);
            while (lector.hasNext() && trobat == false) {
                mon = llegirMontanya(lector);
                if (m.codiComarca == mon.codiComarca) {
                    trobat = true;
                }
            }
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        return trobat;
    }

}
