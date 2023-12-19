/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf3activitat01.fitxers;

import java.io.File;
import java.util.Date;
import java.util.Scanner;
import static xavierrocauf3activitat01.fitxers.Util.llegirInt;

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
        String archiu = "", archiu2 = "";
        do {
            do {
                menu = llegirInt("\nMenu\n1- Nom Fitxer\n2- Esborrar Fitxer\n3- Dos noms Fitxer\n4- Nom Directori\n5- Sortir");
            } while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5);
            switch (menu) {
                case 1:
                    archiu = nomArchiu();
                    dadesFitxer(archiu);
                    break;
                case 2:
                    archiu = nomArchiu();
                    esborrarFitxer(archiu);
                    break;
                case 3:
                    archiu = nomArchiu();
                    archiu2 = nomArchiu();
                    comparacioFitxer(archiu, archiu2);
                    break;
                case 4:
                    archiu = nomArchiu();
                    dadesFitxer(archiu);
                    dadesDirectori(archiu);

            }
        } while (menu != 5);

    }

    public static String nomArchiu() {

        Scanner teclat = new Scanner(System.in);

        String archiu;
        System.out.println("Nom del fitxer:");
        archiu = teclat.nextLine();
        return archiu;
    }

    public static void dadesFitxer(String archiu) {

        File fitxer = new File(archiu);
        if (fitxer.exists()) {
            System.out.println("Existeix");
            if (fitxer.isFile()) {
                System.out.println("És fitxer");
                if (fitxer.canWrite()) {
                    System.out.println("Tens permisos d'escritura");
                } else {
                    System.out.println("No tens permisos d'escritura");
                }
                System.out.printf("Grandaria %d\n", fitxer.length());
                Date data = new Date(fitxer.lastModified());
                System.out.println(data.toLocaleString()); // muestra la fecha

            }
            if (fitxer.isDirectory()) {
                System.out.println("És directori");
            }

        } else {
            System.out.println("Final found");
        }
    }

    public static void comparacioFitxer(String archiu, String archiu2) {

        File fitxer = new File(archiu);
        File fitxer2 = new File(archiu2);
        Date data = new Date(fitxer.lastModified());
        Date data2 = new Date(fitxer2.lastModified());
        if (fitxer.lastModified() == fitxer2.lastModified()) {
            System.out.println("Tenen la mateixa data");
        } else {
            System.out.println("Diferent data de modificació");
            if (data.after(data2)) {
                confirmacioBorrar("Vols borrar el segon fitxer: S/N", archiu);
            } else {
                confirmacioBorrar("Vols borrar el primer fitxer: S/N", archiu);
            }
        }

    }

    public static void esborrarFitxer(String archiu) {

        File fitxer = new File(archiu);

        if (fitxer.exists()) {
            System.out.println("Existeix");
            System.out.println(fitxer.getAbsolutePath());
            confirmacioBorrar("Vols borrar el segon fitxer: S/N", archiu);

        } else {
            System.out.println("Final found");
        }
    }

    public static void confirmacioBorrar(String txt, String archiu) {

        Scanner teclat = new Scanner(System.in);

        File fitxer = new File(archiu);
        String opcio;
        System.out.println(txt);
        opcio = teclat.nextLine();
        if (opcio.equals("s") || opcio.equals("S")) {
            fitxer.delete();
            System.out.println("Borrat");
        } else {
            System.out.println("No borrat");
        }
    }

    public static void dadesDirectori(String archiu) {

        File fitxer = new File(archiu);
        if (fitxer.exists()) {
            System.out.println("Existeix");
            if (fitxer.isDirectory()) {
                System.out.println("És directori");
                File[] list = fitxer.listFiles();
                long suma = 0;
                for (int i = 0; i < list.length; i++) {
                    System.out.println(list[i].getAbsolutePath() + "  " + list[i].length());
                    suma = suma + list[i].length();
                }
                System.out.printf("La grandaria total es %d", suma);
            } else {
                System.out.println("Final found");
            }
        }else{
            System.out.println("final found");
        }        
    }
    
    public static long cuentaRecursiva(File arxiu){  // Como se hace la recursividad
        long cont = 0;
        File[] arrf;
        if(arxiu.isFile()){
            cont = arxiu.length();
        }else{
            arrf = arxiu.listFiles();
            for (int i = 0; i < arrf.length; i++) {
                cont += cuentaRecursiva(arrf[i]);
            }
        }
        return cont;
    }
}
