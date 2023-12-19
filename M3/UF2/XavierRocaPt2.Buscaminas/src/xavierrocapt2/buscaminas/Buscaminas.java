/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocapt2.buscaminas;

import static xavierrocapt2.buscaminas.Util.*;
import java.util.Date;

/**
 *
 * @author usuari
 */
public class Buscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Date fecha = new Date();
        int menu, guanyat = 0, perdut = 0;

        do {
            do {
                System.out.println("\n\nBUSCAMINAS");
                menu = llegirInt("\n\n1- Nivell 1 \n2- Nivell 2 \n3- Nivell 3 \n4- Sortir ");
            } while (menu != 1 && menu != 2 && menu != 3 && menu != 4);

            switch (menu) {
                case 1:
                    boolean bomba = false;
                    int x = 8, y = 8, b = 10, fila = 0, columna = 0, contGuanyat = 0;     // variables del nivell 1
                    String[][] taulell = new String[x][y];
                    String[][] taulellJoc = new String[x][y];
                    System.out.println("Nivell 1");
                    taulell = iniciarTaulell(taulell);
                    taulellJoc = iniciarTaulell(taulellJoc);
                    taulell = posarBombes(taulell, b, x, y);
                    taulell = numerosCostatBomba(taulell);
                    mostrarTaulell(taulellJoc);
                    int tirades = 0;
                    do {
                        Date fecha1 = new Date();
                        System.out.println("Portes " + ((fecha1.getTime() - fecha.getTime()) / 1000) / 60 + " minuts i " + (fecha1.getTime() - fecha.getTime()) / 1000 + " segons.");  // Mostra el temps desde que has començat la partida
                        fila = coordenadaFila(fila, taulell);
                        columna = coordenadaColumna(fila, taulell);
                        bomba = buscarMina(taulell, taulellJoc, fila, columna, tirades);
                        taulellJoc = recursivaDestapaCaselles(fila, columna, taulell, taulellJoc);
                        contGuanyat = contadorDeBombes(taulellJoc);
                        mostrarTaulell(taulellJoc);
                        tirades++;
                        if (bomba) {
                            System.out.println("Has perdut");
                            perdut++;
                        } else if (contGuanyat == b) {     // Si el contador es igual a les bombes has guanyat
                            System.out.println("Has Guanyat");
                            bomba = true;
                            guanyat++;
                        }
                    } while (!bomba);
                    System.out.printf("\nHas tirat %d vegades", tirades);
                    System.out.printf("\nHas guanyat %d vegades", guanyat);
                    System.out.printf("\nHas perdut %d vegades", perdut);
                    break;
                case 2:
                    bomba = false;
                    x = 16; y = 20; b = 50; fila = 0; columna = 0; contGuanyat = 0;      // variables del nivell 2
                    taulell = new String[x][y];
                    taulellJoc = new String[x][y];
                    System.out.println("Nivell 2");
                    taulell = iniciarTaulell(taulell);
                    taulellJoc = iniciarTaulell(taulellJoc);
                    taulell = posarBombes(taulell, b, x, y);
                    taulell = numerosCostatBomba(taulell);
                    mostrarTaulell(taulellJoc);
                    tirades = 0;
                    do {
                        Date fecha1 = new Date();
                        System.out.println("Portes " + ((fecha1.getTime() - fecha.getTime()) / 1000) / 60 + " minuts i " + (fecha1.getTime() - fecha.getTime()) / 1000 + " segons.");  // Mostra el temps desde que has començat la partida
                        fila = coordenadaFila(fila, taulell);
                        columna = coordenadaColumna(fila, taulell);
                        bomba = buscarMina(taulell, taulellJoc, fila, columna, tirades);
                        taulellJoc = recursivaDestapaCaselles(fila, columna, taulell, taulellJoc);
                        contGuanyat = contadorDeBombes(taulellJoc);
                        mostrarTaulell(taulellJoc);
                        tirades++;
                        if (bomba) {
                            System.out.println("Has perdut");
                            perdut++;
                        } else if (contGuanyat == b) {    // Si el contador es igual a les bombes has guanyat
                            System.out.println("Has Guanyat");
                            bomba = true;
                            guanyat++;
                        }
                    } while (!bomba);
                    System.out.printf("\nHas tirat %d vegades", tirades);
                    System.out.printf("\nHas guanyat %d vegades", guanyat);
                    System.out.printf("\nHas perdut %d vegades", perdut);
                    break;
                case 3:
                    bomba = false;
                    x = 0; y = 0; b = 0; fila = 0; columna = 0; contGuanyat = 0;
                    System.out.println("Nivell 3");
                    x = personalitzadax(x);                     // Posa les variables per la partida del nivell 3, en aquest nivell és personalitzat
                    y = personalitzaday(y);
                    b = personalitzadaBombes(b, x, y);
                    taulell = new String[x][y];
                    taulellJoc = new String[x][y];
                    taulell = iniciarTaulell(taulell);
                    taulellJoc = iniciarTaulell(taulellJoc);
                    taulell = posarBombes(taulell, b, x, y);
                    taulell = numerosCostatBomba(taulell);
                    mostrarTaulell(taulellJoc);
                    tirades = 0;
                    do {
                        Date fecha1 = new Date();
                        System.out.println("Portes " + ((fecha1.getTime() - fecha.getTime()) / 1000) / 60 + " minuts i " + (fecha1.getTime() - fecha.getTime()) / 1000 + " segons.");  // Mostra el temps desde que has començat la partida
                        fila = coordenadaFila(fila, taulell);
                        columna = coordenadaColumna(fila, taulell);
                        bomba = buscarMina(taulell, taulellJoc, fila, columna, tirades);
                        taulellJoc = recursivaDestapaCaselles(fila, columna, taulell, taulellJoc);
                        contGuanyat = contadorDeBombes(taulellJoc);
                        mostrarTaulell(taulellJoc);
                        tirades++;
                        if (bomba) {
                            System.out.println("Has perdut");
                            perdut++;
                        } else if (contGuanyat == b) {    // Si el contador es igual a les bombes has guanyat
                            System.out.println("Has Guanyat");
                            bomba = true;
                            guanyat++;
                        }
                    } while (!bomba);
                    System.out.printf("\nHas tirat %d vegades", tirades);
                    System.out.printf("\nHas guanyat %d vegades", guanyat);
                    System.out.printf("\nHas perdut %d vegades", perdut);
                    break;
                case 4:
                    System.out.println("Fins un altre");
                    break;
            }
        } while (menu != 4);
    }

}
