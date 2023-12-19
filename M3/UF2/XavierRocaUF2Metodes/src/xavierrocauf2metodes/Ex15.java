/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Scanner;
import static xavierrocauf2metodes.Util.llegirDouble;

/**
 *
 * @author usuari Realitzar un mètode que calculi l'àrea o el volum d'un
 * cilindre, segons s'especifiqui. Per a distingir un cas de l'altre se li
 * passarà un caràcter 'a' (per a àrea) o 'v' (per a volum). A més, se li ha de
 * passar al mètode el radi i l’altura.
 */
public class Ex15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        double radi = 0, altura = 0, resultat;

        System.out.println("Diguem el radi:");
        radi = llegirDouble(radi);
        System.out.println("Diguem l'altura:");
        altura = llegirDouble(altura);

        resultat = areaOVolum(radi, altura);

        System.out.printf("El teu resultat és %.2f", resultat);

    }

    public static double areaOVolum(double v1, double v2) {

        Scanner teclat = new Scanner(System.in);

        String ele;
        char ch;
        double resultat = 0;
        final double PI = 3.1416;

        boolean ver = false;

        do {

            System.out.println("Que vols calcular l'àrea o el volum (a o v)");
            ele = teclat.nextLine();
            ch = ele.charAt(0);

            ver = false;
            switch (ch) {

                case 'a':
                case 'A':
                    resultat = (2 * (PI * (v1 * v1))) + ((2 * PI) * v2);
                    break;
                case 'v':
                case 'V':
                    resultat = PI * v2 * (v1 * v1);
                    break;
                default:
                    System.out.println("Error");
                    ver = true;
                    teclat.nextLine();
                    break;

            }
        } while (ver);

        return resultat;

    }

}
