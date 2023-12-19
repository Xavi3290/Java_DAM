/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rocaxavieruf5pe;

import Model.*;

/**
 *
 * @author usuari
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        ClubMap club = new ClubMap("Ares");

        Activitat act = new Activitat("1", "natacio");
        Activitat act2 = new Activitat("2", "bici");
        Activitat act3 = new Activitat("1", "natacio");

        Soci soci = new Soci("1000A", "Pepe", 0, act);
        Soci soci2 = new Soci("2000A", "Marc", 0, act2);
        Soci soci3 = new Soci("3000A", "Xavi", 0, act3);
        Soci soci4 = new Soci("4000A", "Fran", 0, act);
        Soci soci5 = new Soci("1000A", "Juli", 0, act2);

        System.out.println("\n1-\n");
        
        club.afegir(soci);
        club.afegir(soci2);
        club.afegir(soci3);
        club.afegir(soci4);
        club.afegir(soci5);
        
        System.out.println("\n2-\n");
        
        club.mostrarSocis();
        
        System.out.println("\n3-\n");
        
        club.esborrar("2000A");
        club.esborrar("10000A");
        
        System.out.println("\n4-\n");
        
        club.mostrarSocis();
        
        System.out.println("\n5-\n");
        
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
    }

}
