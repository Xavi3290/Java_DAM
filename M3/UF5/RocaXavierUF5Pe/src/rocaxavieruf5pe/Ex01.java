/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rocaxavieruf5pe;

import Model.*;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        String nomFitxer = "socisClub";
        File fit = new File(nomFitxer);
        
        Club club = new Club("Ares");

        Activitat act = new Activitat("1", "natacio");
        Activitat act2 = new Activitat("2", "bici");
        Activitat act3 = new Activitat("1", "natacio");

        Soci soci = new Soci("1000A", "Pepe", 0, act);
        Soci soci2 = new Soci("2000A", "Marc", 0, act2);
        Soci soci3 = new Soci("3000A", "Xavi", 0, act3);
        Soci soci4 = new Soci("4000A", "Fran", 0, act);
        Soci soci5 = new Soci("1000A", "Juli", 0, act2);

        System.out.println("\n1-\n");

        if (club.afegirSoci(soci)) {
            System.out.println("Soci afegit");
        } else {
            System.out.println("Soci no afegit, dni repetit");
        }
        if (club.afegirSoci(soci2)) {
            System.out.println("Soci afegit");
        } else {
            System.out.println("Soci no afegit, dni repetit");
        }
        if (club.afegirSoci(soci3)) {
            System.out.println("Soci afegit");
        } else {
            System.out.println("Soci no afegit, dni repetit");
        }
        if (club.afegirSoci(soci4)) {
            System.out.println("Soci afegit");
        } else {
            System.out.println("Soci no afegit, dni repetit");
        }
        if (club.afegirSoci(soci5)) {
            System.out.println("Soci afegit");
        } else {
            System.out.println("Soci no afegit, dni repetit");
        }

        System.out.println("\n2-\n");
        club.llista();

        System.out.println("\n3-\n");
        if (club.eliminar("2000A")) {
            System.out.println("S'ha eliminat correctament");
        } else {
            System.out.println("No s'ha pogut eliminar, dni inexistent");
        }

        if (club.eliminar("10000A")) {
            System.out.println("S'ha eliminat correctament");
        } else {
            System.out.println("No s'ha pogut eliminar, dni inexistent");
        }

        System.out.println("\n4-\n");
        club.llista();

        System.out.println("\n5 i 6-\n");

         try {
            club.afegirConsum(50, null);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        try {
            club.afegirConsum(50, soci);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        try {
            club.afegirConsum(100, soci2);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        try {
            club.afegirConsum(200, soci3);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        try {
            club.afegirConsum(300, soci4);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        
        try {
            club.afegirConsum(1001, soci5);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        System.out.println("\n7-\n");
        
        guardarClub(fit, club);
        
        System.out.println("\n8-\n");
        
        Club club2 = new Club();
        club2 = cargarClub(nomFitxer);
        
        System.out.println("\n9-\n");
        
        club2.llista();
        
    }
    
     public static void guardarClub(File fit, Club club) {
        try {
            FileOutputStream fos = new FileOutputStream(fit);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(club);
            oos.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
     
     public static Club cargarClub(String nFitxer) {
        Club clu = null;
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream(nFitxer);
            ois = new ObjectInputStream(fis);
            while (true) {
                clu = (Club) ois.readObject();
                clu.toString();

            }
        } catch (EOFException exc) {
            System.out.println("\n**************** FIN ARXIU**************");
        } catch (Exception io) {
            System.out.println(io.toString());
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.out.println(e.toString());
            }
        }
        return clu;
    }

}
