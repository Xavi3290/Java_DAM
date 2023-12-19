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
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int menu;

        do {
            do {
                menu = llegirInt("\nMenu\n1- Llegir linias\n2- Escriure linia\n3- Afegir una linia\n4- Sortir");
            } while (menu != 1 && menu != 2 && menu != 3 && menu != 4);
            switch (menu) {
                case 1:
                    llegirArxiuDeLineas("arxiu.txt");
                    break;
                case 2:
                    escriureArxiuDeText("nou.txt");
                    break;
                case 3:
                    afegirArxiuDeText("arxiu.txt");
                    break;
            }
        } while (menu != 4);

    }

    public static void llegirArxiuDeLineas(String fnom) {
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

    public static void escriureArxiuDeText(String fnom) {
        PrintStream escr = null;
        try {
            File fo = new File(fnom);
            escr = new PrintStream(fo);
            escr.println("Bon dia!");
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (escr != null) {
            escr.close();
        }
    }

    public static void afegirArxiuDeText(String fnom) {
        PrintStream escr = null;
        try {
            File fo = new File(fnom);
            FileOutputStream fos = new FileOutputStream(fo, true);
            escr = new PrintStream(fos);
            escr.println("Bona nit!");
        } catch (Exception e) {
            System.out.printf("Error: %s", e.toString());
        }
        if (escr != null) {
            escr.close();
        }
    }
}
