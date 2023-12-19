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
import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        Propietari prop = new Propietari("Xavi","xx1");
        Propietari prop2 = new Propietari("Xavi2","xx2");
        
        Casa ca = new Casa("Calle 202", "Granollers", 3, prop);
        Casa ca2 = new Casa("Calle 203", "Granollers2", 4, prop2);
        
//        ArrayList<Casa> aCas = new ArrayList<>();
//        
//        aCas.add(ca);
//        aCas.add(ca2);
        
        String nomFitxer = "dades";
        File dades = new File(nomFitxer);
        
        FileOutputStream fos = new FileOutputStream(nomFitxer, false);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        setEscritura(oos,ca);
        setEscritura(oos,ca2);
        oos.close();
        System.out.println("Lectura");
        getLectura(nomFitxer);
        
    }
    
    public static void setEscritura(ObjectOutputStream oos, Casa ca) {
        try {
            oos.writeObject(ca);           

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void getLectura(String nFitxer) {
        Casa c = null;
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(nFitxer);
            ois = new ObjectInputStream(fis);
            while (true) {
                c = (Casa) ois.readObject();
                System.out.println(c.toString());                

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
