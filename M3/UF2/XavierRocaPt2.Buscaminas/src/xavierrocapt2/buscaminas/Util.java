/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocapt2.buscaminas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Util {

    /**
     * Reb un String com a pregunta i la resposta comproba que sigui Int
     *
     * @param txt Pregunta que fas
     * @return Valor Int
     */
    public static int llegirInt(String txt) {

        Scanner teclat = new Scanner(System.in);

        int numInt = 0;
        boolean esInt = false;
        do {
            System.out.println(txt);
            if (teclat.hasNextInt()) {
                numInt = teclat.nextInt();
                teclat.nextLine();
                esInt = true;
            } else {
                System.out.println("Error!!!");
                teclat.nextLine();
            }

        } while (!esInt);

        return numInt;

    }

    /**
     * Inicialitza el taulell de String omplint-ho tot amb "-"
     *
     * @param taulell Matriu que l'hi envies
     * @return Matriu omplerta
     */
    public static String[][] iniciarTaulell(String[][] taulell) {

        for (int f = 0; f < taulell.length; f++) {
            for (int c = 0; c < taulell[f].length; c++) {
                taulell[f][c] = "-";
            }
        }
        return taulell;
    }

    /**
     * Posa bombes en el taulell en una posició random.
     *
     * @param taulell matriu
     * @param b número de bombes
     * @param x número de files
     * @param y número de bombes
     * @return matriu omplerta amb bombes
     */
    public static String[][] posarBombes(String[][] taulell, int b, int x, int y) {

        Random rnd = new Random();

        int fila, columna;
        for (int i = 0; i < b; i++) {
            fila = rnd.nextInt(x);
            columna = rnd.nextInt(y);
            if (taulell[fila][columna].equals("-")) {
                taulell[fila][columna] = "B";
            } else {
                i = i - 1;
            }
        }
        return taulell;
    }

    /**
     * Mostra el tauell per pantalla
     *
     * @param taulell matriu
     */
    public static void mostrarTaulell(String[][] taulell) {
        System.out.printf("  ");
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

    /**
     * Posa el número de bombes que té al costat una casella
     *
     * @param taulell matriu
     * @return matriu amb els números
     */
    public static String[][] numerosCostatBomba(String[][] taulell) {

        for (int f = 0; f < taulell.length; f++) {
            for (int c = 0; c < taulell[f].length; c++) {
                if (taulell[f][c].equals("B")) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (f - 1 + i >= 0 && f - 1 + i < taulell.length && c - 1 + j >= 0 && c - 1 + j < taulell[f].length) {
                                switch (taulell[f - 1 + i][c - 1 + j]) {
                                    case "7":
                                        taulell[f - 1 + i][c - 1 + j] = "8";
                                        break;
                                    case "6":
                                        taulell[f - 1 + i][c - 1 + j] = "7";
                                        break;
                                    case "5":
                                        taulell[f - 1 + i][c - 1 + j] = "6";
                                        break;
                                    case "4":
                                        taulell[f - 1 + i][c - 1 + j] = "5";
                                        break;
                                    case "3":
                                        taulell[f - 1 + i][c - 1 + j] = "4";
                                        break;
                                    case "2":
                                        taulell[f - 1 + i][c - 1 + j] = "3";
                                        break;
                                    case "1":
                                        taulell[f - 1 + i][c - 1 + j] = "2";
                                        break;
                                    case "-":
                                        taulell[f - 1 + i][c - 1 + j] = "1";
                                        break;

                                }

                            }
                        }
                    }
                }
            }
        }

        return taulell;
    }

    /**
     * Et comproba si les coordenades de la matriu és una bomba amb una boolean,
     * si ja hi has tirat en aquelles coordenades, et resta 1 en les tirades
     * repetides i t'ho dibuixa en una nova matriu.
     *
     * @param taulell taulell amb bombes i números
     * @param taulellJoc taulell que veu el jugador
     * @param fila coordenada de fila
     * @param columna coordenada de columna
     * @param tirades tirades que s'han fet
     * @return boolean si troba la bomba o no
     */
    public static boolean buscarMina(String[][] taulell, String[][] taulellJoc, int fila, int columna, int tirades) {

        boolean bomba = false;
        if (bomba == false) {
            if (taulell[fila][columna].equals("B")) {
                taulellJoc[fila][columna] = "B";
                bomba = true;
            } else if (taulellJoc[fila][columna].equals(" ")) {
                System.out.println("Aqui ja has tirat");
                tirades--;
            } else if (taulellJoc[fila][columna].equals("1")) {
                System.out.println("Aqui ja has tirat");
                tirades--;
            } else if (taulellJoc[fila][columna].equals("2")) {
                System.out.println("Aqui ja has tirat");
                tirades--;
            } else if (taulellJoc[fila][columna].equals("3")) {
                System.out.println("Aqui ja has tirat");
                tirades--;
            } else if (taulellJoc[fila][columna].equals("4")) {
                System.out.println("Aqui ja has tirat");
                tirades--;
            } else if (taulellJoc[fila][columna].equals("5")) {
                System.out.println("Aqui ja has tirat");
                tirades--;
            } else if (taulellJoc[fila][columna].equals("6")) {
                System.out.println("Aqui ja has tirat");
                tirades--;
            } else if (taulellJoc[fila][columna].equals("7")) {
                System.out.println("Aqui ja has tirat");
                tirades--;
            } else if (taulellJoc[fila][columna].equals("8")) {
                System.out.println("Aqui ja has tirat");
                tirades--;
            } else if (taulell[fila][columna].equals("8")) {
                taulellJoc[fila][columna] = "8";
            } else if (taulell[fila][columna].equals("7")) {
                taulellJoc[fila][columna] = "7";
            } else if (taulell[fila][columna].equals("6")) {
                taulellJoc[fila][columna] = "6";
            } else if (taulell[fila][columna].equals("5")) {
                taulellJoc[fila][columna] = "5";
            } else if (taulell[fila][columna].equals("4")) {
                taulellJoc[fila][columna] = "4";
            } else if (taulell[fila][columna].equals("3")) {
                taulellJoc[fila][columna] = "3";
            } else if (taulell[fila][columna].equals("2")) {
                taulellJoc[fila][columna] = "2";
            } else if (taulell[fila][columna].equals("1")) {
                taulellJoc[fila][columna] = "1";
            } else if (taulell[fila][columna].equals("-")) {
                taulellJoc[fila][columna] = " ";
            }
        }
        return bomba;
    }

    /**
     * Comproba que la coordenada de la fila estigui dintre dels paramentres,
     * sigui int i amb -1 et mostra el taulell de les bombes
     *
     * @param fila coordenada de fila
     * @param taulell taulell de bombes
     * @return coordenada de la fila
     */
    public static int coordenadaFila(int fila, String[][] taulell) {

        do {
            fila = llegirInt("Fila:") - 1;
            if (fila == -2) {
                mostrarTaulell(taulell);
            } else if (fila >= taulell.length || fila < 0) {
                System.out.println("Error");
            }
        } while (fila >= taulell.length || fila < 0 || fila == -2);

        return fila;
    }

    /**
     * Comproba que la coordenada de la columna estigui dintre dels parametres,
     * sigui int i amb -1 et mostra el taulell de les bombes
     *
     * @param columna coordenada de la columna
     * @param taulell taulell de bombes
     * @return coordenada de la columna
     */
    public static int coordenadaColumna(int columna, String[][] taulell) {

        do {
            columna = llegirInt("Columna:") - 1;
            if (columna == -2) {
                mostrarTaulell(taulell);
            } else if (columna >= taulell[0].length || columna < 0) {
                System.out.println("Error");
            }
        } while (columna >= taulell[0].length || columna < 0 || columna == -2);

        return columna;
    }

    /**
     * Comproba que el valor de files estigui dintre dels parametres x < 3 || x
     * > 200
     *
     * @param x número de files
     * @return números de files
     */
    public static int personalitzadax(int x) {

        do {
            x = llegirInt("Quantes files vols posar: ");
            if (x < 3 || x > 200) {
                System.out.println("Fora de rang");
            }
        } while (x < 3 || x > 200);
        return x;
    }

    /**
     * Comproba que el valor de columnes estigui dintre dels parametres y < 3 || y
     * > 200
     *
     * @param y número de columnes
     * @return número de columnes
     */
    public static int personalitzaday(int y) {

        do {
            y = llegirInt("Quantes columnes vols posar: ");
            if (y < 3 || y > 200) {
                System.out.println("Fora de rang");
            }
        } while (y < 3 || y > 200);
        return y;
    }

    /**
     * Comproba que el número de bombes estigui dintre dels parametres b < x * y / 8 || b
     * > x * y / 1.5
     *
     * @param b número de bombes
     * @param x número de files
     * @param y número de columnes
     * @return número de bombes
     */
    public static int personalitzadaBombes(int b, int x, int y) {

        do {
            b = llegirInt("Quantes bombes vols posar: ");
            if (b < x * y / 8 || b > x * y / 1.5) {
                System.out.println("Fora de rang");
            }
        } while (b < x * y / 8 || b > x * y / 1.5);
        return b;
    }
    /**
     * Destapa les caselles que hi ha un "-"
     * @param fila número de fila
     * @param columna múmero de columna
     * @param taulell taulell de bombes
     * @param taulellJoc taulell de joc
     * @return el taulell de joc destapat
     */
    public static String[][] recursivaDestapaCaselles(int fila, int columna, String[][] taulell, String[][] taulellJoc) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (fila - 1 + i >= 0 && fila - 1 + i < taulell.length && columna - 1 + j >= 0 && columna - 1 + j < taulell[0].length) {
                    if (taulell[fila - 1 + i][columna - 1 + j].equals("-")) {
                        taulell[fila -1 +i][columna -1 +j] = " ";
                        taulellJoc[fila- 1 +i][columna -1 +j] = " ";
                        return recursivaDestapaCaselles(fila -1 +i, columna -1 +j, taulell, taulellJoc);
                    }
                }

            }

        }
        return taulellJoc;
    }
    /**
     * Et calcula les caselles que son iguals a "-"
     * @param taulellJoc taulell de joc
     * @return el número de caselles igual a "-"
     */
    public static int contadorDeBombes(String[][] taulellJoc){
        
        int guanyat = 0;
        
        for (int f = 0; f < taulellJoc.length; f++) {
            for (int c = 0; c < taulellJoc[f].length; c++) {
                if(taulellJoc[f][c].equals("-"))
                    guanyat++;
            }
        }
        return guanyat;
    }
}
