/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pt2.battleship;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Pt2BattleShip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        String[][] taulell = new String[10][8];
        int mida = 0, fila = 0, columna = 0, eleccio = 0, tocat2 = 0, tocat3 = 0, tocat4 = 0;
        String orientacio;
        char ch = 'a';
        boolean jugar = false;
        final int VAIXELLS = 3;

        do {

            boolean esNum = false;
            do {
                System.out.println("\nBenvingut a Battleship\n\nElegeix una opcio(en número):\n");
                System.out.println("1. Introduir els vaixells\n2. Jugar\n3. Sortir");
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

            switch (eleccio) {
                case 1:
                    esNum = false;
                    for (int f = 0; f < taulell.length; f++) {
                        for (int c = 0; c < taulell[f].length; c++) {
                            taulell[f][c] = ".";
                        }
                    }

                    boolean enseñar = false;

                    for (int j = 0; j < VAIXELLS; j++) {

                        if (!enseñar) {
                            System.out.println("\nIntrodueix els teus vaixells\n");

                            System.out.print("  ");
                            for (int f = 0; f < taulell[0].length; f++) {
                                System.out.printf("%4d", f + 1);
                            }
                            System.out.println(" ");
                            for (int f = 0; f < taulell.length; f++) {
                                System.out.printf("%2d", f + 1);
                                for (int c = 0; c < taulell[f].length; c++) {
                                    System.out.printf("%4s", taulell[f][c]);

                                }
                                System.out.println();
                            }
                        }

                        mida = 2 + j;

                        boolean solapat = false;
                        do {

                            solapat = false;
                            esNum = false;

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
                                    if (taulell[fila + i][columna].equals("2")) {
                                        solapat = true;
                                        if (solapat) {
                                            System.out.printf("\nEsta solapat en la posició fila: %d columna: %d", fila + i + 1, columna + 1);
                                        }
                                    } else if (taulell[fila + i][columna].equals("3")) {
                                        solapat = true;
                                        if (solapat) {
                                            System.out.printf("\nEsta solapat en la posició fila: %d columna: %d", fila + i + 1, columna + 1);
                                        }
                                    } else if (taulell[fila + i][columna].equals("4")) {
                                        solapat = true;
                                        if (solapat) {
                                            System.out.printf("\nEsta solapat en la posició fila: %d columna: %d", fila + i + 1, columna + 1);
                                        }
                                    }

                                } else {
                                    if (taulell[fila][columna + i].equals("2")) {
                                        solapat = true;
                                        if (solapat) {
                                            System.out.printf("\nEsta solapat en la posicio fila: %d columna: %d", fila + 1, columna + i + 1);
                                        }
                                    } else if (taulell[fila][columna + i].equals("3")) {
                                        solapat = true;
                                        if (solapat) {
                                            System.out.printf("\nEsta solapat en la posició fila: %d columna: %d", fila + 1, columna + i + 1);
                                        }
                                    } else if (taulell[fila][columna + i].equals("4")) {
                                        solapat = true;
                                        if (solapat) {
                                            System.out.printf("\nEsta solapat en la posició fila: %d columna: %d", fila + 1, columna + i + 1);
                                        }
                                    }
                                }
                            }
                            if (solapat) {
                                System.out.println(" ");
                                System.out.print("  ");
                                for (int f = 0; f < taulell[0].length; f++) {
                                    System.out.printf("%4d", f + 1);
                                }
                                System.out.println(" ");
                                for (int f = 0; f < taulell.length; f++) {
                                    System.out.printf("%2d", f + 1);
                                    for (int c = 0; c < taulell[f].length; c++) {
                                        System.out.printf("%4s", taulell[f][c]);

                                    }
                                    System.out.println();
                                }
                            }
                        } while (solapat);

                        for (int i = 0; i < mida; i++) {
                            if (ch == 'v') {
                                taulell[fila + i][columna] = String.valueOf(mida);
                            } else {
                                taulell[fila][columna + i] = String.valueOf(mida);
                            }
                        }
                        System.out.print("  ");
                        for (int f = 0; f < taulell[0].length; f++) {
                            System.out.printf("%4d", f + 1);
                        }
                        System.out.println(" ");
                        for (int f = 0; f < taulell.length; f++) {
                            System.out.printf("%2d", f + 1);
                            for (int c = 0; c < taulell[f].length; c++) {
                                System.out.printf("%4s", taulell[f][c]);

                            }
                            System.out.println();
                        }

                        enseñar = true;
                        jugar = true;
                    }
                    break;
                case 2:
                    if (jugar == true) {

                        String[][] taulell2 = new String[10][8];
                        tocat2 = 0;
                        tocat3 = 0;
                        tocat4 = 0;

                        System.out.println("\nÉs el teu torn d'atacar");

                        for (int f = 0; f < taulell2.length; f++) {
                            for (int c = 0; c < taulell2[f].length; c++) {
                                taulell2[f][c] = ".";
                            }
                        }
                        System.out.print("  ");
                        for (int f = 0; f < taulell2[0].length; f++) {
                            System.out.printf("%4d", f + 1);
                        }
                        System.out.println(" ");
                        for (int f = 0; f < taulell2.length; f++) {
                            System.out.printf("%2d", f + 1);
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
                            } else if (taulell[fila][columna].equals("2")) {
                                taulell2[fila][columna] = "T";
                                tocat2++;
                                System.out.println("Has tocat el vaixell");
                                if (tocat2 == 2) {
                                    System.out.println("Has enfonsat el vaixell de mida 2");
                                }
                            } else if (taulell[fila][columna].equals("3")) {
                                taulell2[fila][columna] = "T";
                                tocat3++;
                                System.out.println("Has tocat el vaixell");
                                if (tocat3 == 3) {
                                    System.out.println("Has enfonsat el vaixell de mida 3");
                                }
                            } else if (taulell[fila][columna].equals("4")) {
                                taulell2[fila][columna] = "T";
                                tocat4++;
                                System.out.println("Has tocat el vaixell");
                                if (tocat4 == 4) {
                                    System.out.println("Has enfonsat el vaixell de mida 4");
                                }
                            } else {
                                System.out.println("Aigua");
                                taulell2[fila][columna] = "A";
                            }

                            System.out.print("  ");
                            for (int f = 0; f < taulell2[0].length; f++) {
                                System.out.printf("%4d", f + 1);
                            }
                            System.out.println(" ");
                            for (int f = 0; f < taulell2.length; f++) {
                                System.out.printf("%2d", f + 1);
                                for (int c = 0; c < taulell2[f].length; c++) {
                                    System.out.printf("%4s", taulell2[f][c]);

                                }
                                System.out.println();
                            }

                        } while (tocat2 != 2 || tocat3 != 3 || tocat4 != 4);

                        System.out.println("\nFelicitats has guanyat!");

                    } else {
                        System.out.println("\nPosa primer els vaixells");
                    }
                    break;
                case 3:
                    System.out.println("\nFins un altre");
                    break;
                default:
                    break;
            }

        } while (eleccio != 3);

    }
}
