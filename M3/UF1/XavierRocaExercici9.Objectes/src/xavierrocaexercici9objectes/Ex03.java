/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici9objectes;

import java.util.Scanner;

/**
 *
 * @author Xavi
 * Desenvolupeu un programa que enregistra (en un vector de N elements) el nom,
el dorsal i el temps que ha trigat cadascun d’una sèrie de corredors en fer una
cursa. El programa mostrarà totes les dades d'aquells que han trigat més de 15
minuts o bé el seu temps està per sota de la mitjana.
 */
public class Ex03 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int quant, cont = 0;
        double suma = 0, mitjana;

        System.out.println("Quants participants vols que participin a la cursa:");
        quant = teclat.nextInt();
        teclat.nextLine();
        Corredor[] corredors = new Corredor[quant];

        for (int i = 0; i < corredors.length; i++) {
            corredors[i] = new Corredor();
            System.out.println("Dades del corredor\nNom:");
            corredors[i].nom = teclat.nextLine();
            System.out.println("Dorsal:");
            corredors[i].dorsal = teclat.nextInt();
            System.out.println("Temps:");
            corredors[i].temps = teclat.nextDouble();
            suma = suma + corredors[i].temps;
            teclat.nextLine();
        }
        /*for (int i = 0; i < corredors.length; i++) {
            suma = suma + corredors[i].temps;
        }*/
        mitjana = suma / corredors.length;
        System.out.println("Dades del corredor");
        for (int i = 0; i < corredors.length; i++) {
            if (corredors[i].temps > 15 || corredors[i].temps < mitjana) {
                System.out.println("Corredors");
                System.out.printf("Nom: %s, Dorsal: %d, Temps: %.2f \n", corredors[i].nom, corredors[i].dorsal, corredors[i].temps);
            }
            /*else {
                System.out.println("Corredores en temps");
                System.out.printf("Nom: %s, Dorsal: %d, Temps: %.2f \n", corredors[i].nom, corredors[i].dorsal, corredors[i].temps);
            }*/
        }

    }

}
