/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf5ioserialitzacio;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author usuari
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        Alumne alu = new Alumne("Xavi", 31);
        Nota not = new Nota(8, "M3");
        Nota not2 = new Nota(9, "M2");
        alu.afegirNota(not);
        alu.afegirNota(not2);

        Alumne alu2 = new Alumne("Xavi2", 31);
        Nota not3 = new Nota(3, "M3");
        Nota not4 = new Nota(4, "M2");
        alu2.afegirNota(not3);
        alu2.afegirNota(not4);

        Alumne alu3 = new Alumne("Xavi3", 31);
        Nota not5 = new Nota(10, "M3");
        Nota not6 = new Nota(9, "M2");
        alu3.afegirNota(not5);
        alu3.afegirNota(not6);

        Curs cu = new Curs("DAM");

        cu.afegirAlumne(alu);
        cu.afegirAlumne(alu2);
        cu.afegirAlumne(alu3);

        String nomFitxer = "info";
        File fitxer = new File(nomFitxer);

        FileOutputStream fos = new FileOutputStream(fitxer, false);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        setEscritura(oos, cu);
        oos.close();
        System.out.println("Lectura");
        getLectura(nomFitxer);

    }

    public static void setEscritura(ObjectOutputStream oos, Curs cu) {
        try {
            oos.writeObject(cu);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void getLectura(String nFitxer) {
        Curs c = null;
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(nFitxer);
            ois = new ObjectInputStream(fis);
            while (true) {
                c = (Curs) ois.readObject();
                c.dades();

            }
        } catch (EOFException exc) {
            System.out.println("\n**************** FIN ARXIU**************");
        } catch (Exception io) {
            io.printStackTrace(System.out);
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }

}
