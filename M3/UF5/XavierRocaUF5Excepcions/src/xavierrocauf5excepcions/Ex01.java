/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf5excepcions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String t[] = {"Hola", "Adéu", "Fins demà"};

        try {

            System.out.println("Abans d’executar el for");
            for (int i = 0; i <= t.length; i++) {
                System.out.println("Posició " + i + " : " + t[i]);
            }
            System.out.println("Després d’executar el for");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("1-Error: Fora del array");
            e.printStackTrace();
        }

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("2-Error: No es pot dividir entre 0");
            e.printStackTrace();
        }
        try {
            Object a = null;
            a.toString();
        } catch (NullPointerException e) {
            System.out.println("3-Error: Objecte a es null");
            e.printStackTrace();
        }
        String ruta = "c:/practicas/programacion";
        File fitxer = new File(ruta, "datos.dat");
        try {
            FileOutputStream fitx = new FileOutputStream(fitxer);
            fitx.close();

        } catch (IOException e) {
            System.out.println("4-Error: Error en acces al ficher");
            e.printStackTrace();
        }

        System.out.println("Final del programa");
    }

}
