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
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Curs cu = new Curs("DAW");
        Estudiant es = new Estudiant("Xavi", "DAW", 10);
        Estudiant es2 = new Estudiant("Adam", "DAW", 10);
        Estudiant es3 = new Estudiant("Yassin", "DAW", 10);

        cu.afegirAlumne(es);
        cu.afegirAlumne(es2);
        cu.afegirAlumne(es3);
        System.out.println(cu.getNomCurs());
        cu.mostrarLlistatAlumnes();

        Estudiant es4;
        String nom;
        nom = llegirString("Nom de l'alumne a buscar: ");
        es4 = cu.buscarNomAlumne(nom);
        if (es4 == null) {
            System.out.println("No hi ha aquest alumne");
        } else {
            if (confirmacio("Vols eliminar l'alumne s/n")) {
                cu.eliminarAlumne(es4);
            }
        }

    }

}
