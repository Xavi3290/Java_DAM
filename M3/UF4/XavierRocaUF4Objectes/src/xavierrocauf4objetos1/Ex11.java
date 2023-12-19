/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf4objetos1;

import static xavierrocauf4objetos1.util.*;

/**
 *
 * @author usuari
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Biblioteca bibl = new Biblioteca("Biblioteca Granollers");
        Soci s = new Soci("66666f", "Xavi");
        Soci s1 = new Soci("777777s", "Yassin");
        Llibre l = new Llibre("JKRowling", "HarryPotter", 100, "34234");
        Llibre l2 = new Llibre("hola","hola", 200, "1234");
        bibl.afegiLlibre(l);
        bibl.afegirSoci(s);
        bibl.mostrarLlistatLlibres();
        System.out.println();
        bibl.mostrarLlistatSocis();
        System.out.println();
        String nom = llegirString("Nom del llibre que vols buscar:");
        Llibre l3 = bibl.buscarLlibreTitol(nom);
        nom = llegirString("Nom del soci que vols buscar:");         
        String isbn = llegirString("Isbn del llibre que vols buscar");
        int pos = bibl.buscarLlibreIsbn(isbn);
        String dni = llegirString("Dni del que vols buscar:");
        Soci s2 = bibl.buscarSociDni(dni);
        nom = llegirString("Nom del llibre que vols eliminar pel nom:");
        bibl.eliminarLlibreTitol(nom);
        nom = llegirString("Nom del soci que vols eliminar pel nom:");
        bibl.eliminarSociNom(nom);

    }

}
