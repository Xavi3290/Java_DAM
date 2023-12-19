/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf4objetos1;

/**
 *
 * @author usuari
 */
public class Ex08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Soci s2 = new Soci("6666666X", "Pepe");
        Soci s = new Soci("6666666X", "Xavi");
        Llibre l = new Llibre("JKRowling", "HarryPoter", 100, "asdfas");
        Llibre l2 = new Llibre("JKRowling", "HarryPoter21", 100, "asdfas");
        Bibliotecaria b = new Bibliotecaria("Xavi", "454545s");
        s.mostraDades();        
        System.out.println(b.presteLlibre(s, l));
        System.out.println("");
        s.mostraDades();
        System.out.println(b.presteLlibre(s2, l));
        System.out.println("");
        s2.mostraDades();
        System.out.println(b.presteLlibre(s2, l2));
        System.out.println("");
        s2.mostraDades();
        System.out.println(b.presteLlibre(s2, l2));
    }
    
}
