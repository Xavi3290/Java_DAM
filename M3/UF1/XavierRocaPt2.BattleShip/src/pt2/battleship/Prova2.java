/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pt2.battleship;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Prova2 {
    
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String[][] taulell = new String[10][8];
        int mida = 0, fila = 0, columna = 0, eleccio = 0, tocat = 0, vaixells = 0;
        String orientacio;
        char ch = 'a';
        boolean jugar = false;

        do {

            boolean esNum = false;
            do {
                System.out.println("\nBenvingut a Battleship\n\nElegeix una opcio(en número):\n");
                System.out.println("1. Introduir un vaixell\n2. Jugar\n3. Sortir");
                if (teclat.hasNextInt()) {
                    eleccio = teclat.nextInt();
                    teclat.nextLine();
                    esNum = true;
                    if (eleccio != 1 && eleccio != 2 && eleccio != 3) {
                        System.out.println("Error");
                    }
                } else {
                    System.out.println("Error");
                    teclat.nextLine();
                }

            } while (eleccio != 1 && eleccio != 2 && eleccio != 3 || !esNum);

            if (eleccio == 1) {

                esNum = false;

                for (int f = 0; f < taulell.length; f++) {
                    for (int c = 0; c < taulell[f].length; c++) {
                        taulell[f][c] = ".";
                    }
                }

                do {

                    System.out.println("Quants vaixells vols posar (Màxim 3)");
                    if (teclat.hasNextInt()) {
                        vaixells = teclat.nextInt();
                        teclat.nextLine();
                        esNum = true;
                        if (vaixells != 1 && vaixells != 2 && vaixells != 3) {
                            System.out.println("Error");
                        }
                    } else {
                        System.out.println("Error");
                        teclat.nextLine();
                    }

                } while (vaixells != 1 && vaixells != 2 && vaixells != 3 || !esNum);

                for (int j = 0; j < vaixells; j++) {

                    System.out.println("\nIntrodueix el teu vaixell\n");

                    for (int f = 0; f < taulell[0].length; f++) {
                        System.out.printf("%4d", f + 1);
                    }
                    System.out.println(" ");
                    for (int f = 0; f < taulell.length; f++) {
                        System.out.printf("%d", f + 1);
                        for (int c = 0; c < taulell[f].length; c++) {
                            System.out.printf("%4s", taulell[f][c]);

                        }
                        System.out.println();
                    }

                    boolean solapat = false;
                    do {

                        solapat = false;
                        esNum = false;

                        do {
                            System.out.println("\nQuina es la mida del vaixel (2 a 4)");
                            if (teclat.hasNextInt()) {
                                mida = teclat.nextInt();
                                teclat.nextLine();
                                esNum = true;
                                if (mida != 2 && mida != 3 && mida != 4) {
                                    System.out.println("Error");
                                }
                            } else {
                                System.out.println("Error");
                                teclat.nextLine();
                            }

                        } while (mida != 2 && mida != 3 && mida != 4 || !esNum);

                        do {
                            System.out.println("Diguem l'orientació del vaixell, vertical o horitzontal (v o h) ");
                            orientacio = teclat.nextLine();
                            ch = orientacio.charAt(0);
                            if (ch != 'v' && ch != 'h') {
                                System.out.println("Error");
                            }
                        } while (ch != 'v' && ch != 'h');

                        if (ch == 'v') {
                            esNum = false;
                            do {
                                System.out.println("Diguem la posició en que ho vols colocar (fila i columna)\nFila:");
                                if (teclat.hasNextInt()) {
                                    fila = teclat.nextInt() - 1;
                                    teclat.nextLine();
                                    esNum = true;
                                    if (fila + mida > taulell.length || fila < 0) {
                                        System.out.println("Error");
                                    }

                                } else {
                                    System.out.println("Error");
                                    teclat.nextLine();
                                }

                            } while (fila + mida > taulell.length || fila < 0 || !esNum);
                            esNum = false;
                            do {
                                System.out.println("Columna:");
                                if (teclat.hasNextInt()) {
                                    columna = teclat.nextInt() - 1;
                                    teclat.nextLine();
                                    esNum = true;
                                    if (columna + mida > taulell[0].length + mida - 1 || columna < 0) {
                                        System.out.println("Error");
                                    }
                                } else {
                                    System.out.println("Error");
                                    teclat.nextLine();
                                }

                            } while (columna + mida > taulell[0].length + mida - 1 || columna < 0 || !esNum);
                        } else {
                            esNum = false;
                            do {
                                System.out.println("Diguem la posició en que ho vols colocar (fila i columna)\nFila:");
                                if (teclat.hasNextInt()) {
                                    fila = teclat.nextInt() - 1;
                                    teclat.nextLine();
                                    esNum = true;
                                    if (fila + mida > taulell.length + mida - 1 || fila < 0) {
                                        System.out.println("Error");
                                    }

                                } else {
                                    System.out.println("Error");
                                    teclat.nextLine();
                                }
                            } while (fila + mida > taulell.length + mida - 1 || fila < 0 || !esNum);
                            esNum = false;
                            do {
                                System.out.println("Columna:");
                                if (teclat.hasNextInt()) {
                                    columna = teclat.nextInt() - 1;
                                    teclat.nextLine();
                                    esNum = true;
                                    if (columna + mida > taulell[0].length || columna < 0) {
                                        System.out.println("Error");
                                    }
                                } else {
                                    System.out.println("Error");
                                    teclat.nextLine();
                                }

                            } while (columna + mida > taulell[0].length || columna < 0 || !esNum);

                        }

                        for (int i = 0; i < mida; i++) {
                            if (ch == 'v') {
                                if (taulell[fila + i][columna].equals("X")) {
                                    solapat = true;
                                    if (solapat) {
                                        System.out.printf("\nEsta solapat en la posició fila: %d columna: %d", fila + i + 1, columna + 1);
                                    }
                                }

                            } else {
                                if (taulell[fila][columna + i].equals("X")) {
                                    solapat = true;
                                    if (solapat) {
                                        System.out.printf("\nEsta solapat en la posicio fila: %d columna: %d", fila + 1, columna + i + 1);
                                    }
                                }
                            }
                        }
                        if (solapat) {
                            System.out.println(" ");
                            for (int f = 0; f < taulell[0].length; f++) {
                                System.out.printf("%4d", f + 1);
                            }
                            System.out.println(" ");
                            for (int f = 0; f < taulell.length; f++) {
                                System.out.printf("%d", f + 1);
                                for (int c = 0; c < taulell[f].length; c++) {
                                    System.out.printf("%4s", taulell[f][c]);

                                }
                                System.out.println();
                            }
                        }
                    } while (solapat);

                    for (int i = 0; i < mida; i++) {
                        if (ch == 'v') {
                            taulell[fila + i][columna] = "X";
                        } else {
                            taulell[fila][columna + i] = "X";
                        }
                    }
                    System.out.println(" ");
                    for (int f = 0; f < taulell[0].length; f++) {
                        System.out.printf("%4d", f + 1);
                    }
                    System.out.println(" ");
                    for (int f = 0; f < taulell.length; f++) {
                        System.out.printf("%d", f + 1);
                        for (int c = 0; c < taulell[f].length; c++) {
                            System.out.printf("%4s", taulell[f][c]);

                        }
                        System.out.println();
                    }
                    jugar = true;

                }

            } else if (eleccio == 2) {

                if (jugar == true) {

                    String[][] taulell2 = new String[10][8];
                    tocat = 0;

                    System.out.println("\nÉs el teu torn d'atacar");

                    for (int f = 0; f < taulell2.length; f++) {
                        for (int c = 0; c < taulell2[f].length; c++) {
                            taulell2[f][c] = ".";
                        }
                    }

                    for (int f = 0; f < taulell2[0].length; f++) {
                        System.out.printf("%4d", f + 1);
                    }
                    System.out.println(" ");
                    for (int f = 0; f < taulell2.length; f++) {
                        System.out.printf("%d", f + 1);
                        for (int c = 0; c < taulell2[f].length; c++) {
                            System.out.printf("%4s", taulell2[f][c]);

                        }
                        System.out.println();
                    }

                    do {
                        esNum = false;
                        do {
                            System.out.println("Diguem la posició vols atacar (fila i columna)\nFila:");
                            if (teclat.hasNextInt()) {
                                fila = teclat.nextInt() - 1;
                                teclat.nextLine();
                                esNum = true;
                                if (fila >= taulell2.length || fila < 0) {
                                    System.out.println("Error");
                                }
                            } else {
                                System.out.println("Error");
                                teclat.nextLine();
                            }
                        } while (fila >= taulell2.length || fila < 0 || !esNum);
                        esNum = false;
                        do {
                            System.out.println("Columna:");
                            if (teclat.hasNextInt()) {
                                columna = teclat.nextInt() - 1;
                                teclat.nextLine();
                                esNum = true;
                                if (columna >= taulell2[0].length || columna < 0) {
                                    System.out.println("Error");
                                }
                            } else {
                                System.out.println("Error");
                                teclat.nextLine();
                            }

                        } while (columna >= taulell2[0].length || columna < 0 || !esNum);

                        if (taulell2[fila][columna].equals("T")) {
                            System.out.println("Aquest ja esta tocat");
                        } else if (taulell2[fila][columna].equals("A")) {
                            System.out.println("Aqui ja has tirat");
                        } else if (taulell[fila][columna].equals("X")) {
                            taulell2[fila][columna] = "T";
                            tocat++;
                            System.out.println("Has tocat el vaixell");
                            if (tocat == mida) {
                                System.out.println("Has enfonsat el vaixell");
                            }
                        } else {
                            System.out.println("Aigua");
                            taulell2[fila][columna] = "A";
                        }

                        for (int f = 0; f < taulell2[0].length; f++) {
                            System.out.printf("%4d", f + 1);
                        }
                        System.out.println(" ");
                        for (int f = 0; f < taulell2.length; f++) {
                            System.out.printf("%d", f + 1);
                            for (int c = 0; c < taulell2[f].length; c++) {
                                System.out.printf("%4s", taulell2[f][c]);

                            }
                            System.out.println();
                        }

                    } while (tocat != mida);

                } else {
                    System.out.println("\nPosa primer un vaixell");
                }

            } else if (eleccio == 3) {
                System.out.println("\nFins un altre");
            }

        } while (eleccio != 3);

    }
    
}
