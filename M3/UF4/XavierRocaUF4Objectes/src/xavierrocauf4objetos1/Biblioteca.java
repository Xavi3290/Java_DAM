/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objetos1;

import java.util.ArrayList;
import static xavierrocauf4objetos1.util.confirmacio;

/**
 *
 * @author usuari
 */
public class Biblioteca {

    private ArrayList<Llibre> llistatLlibres = new ArrayList<>();
    private ArrayList<Soci> llistatSocis = new ArrayList<>();
    String nom;

    public Biblioteca(String nom) {
        this.nom = nom;
    }

    public ArrayList<Llibre> getLlistatLlibres() {
        return llistatLlibres;
    }

    public void setLlistatLlibres(ArrayList<Llibre> llistatLlibres) {
        this.llistatLlibres = llistatLlibres;
    }

    public ArrayList<Soci> getLlistatSocis() {
        return llistatSocis;
    }

    public void setLlistatSocis(ArrayList<Soci> llistatSocis) {
        this.llistatSocis = llistatSocis;
    }

    public Llibre buscarLlibreTitol(String titol) {

        for (int i = 0; i < llistatLlibres.size(); i++) {
            if (llistatLlibres.get(i).getTitol().equals(titol)) {
                return llistatLlibres.get(i);
            }
        }
        return null;
    }

    public int buscarLlibreIsbn(String isbn) {

        for (int i = 0; i < llistatLlibres.size(); i++) {
            if (llistatLlibres.get(i).getIsbn().equals(isbn)) {
                return i;
            }
        }
        return -1;
    }

    public Soci buscarSociDni(String dni) {

        for (int i = 0; i < llistatSocis.size(); i++) {
            if (llistatSocis.get(i).getDni().equals(dni)) {
                return llistatSocis.get(i);
            }
        }
        return null;
    }

    public int buscarSociNom(String nom) {

        for (int i = 0; i < llistatSocis.size(); i++) {
            if (llistatSocis.get(i).getNom().equals(nom)) {
                return i;
            }
        }
        return -1;
    }
    
   

    public void mostrarLlistatLlibres() {

        for (int i = 0; i < llistatLlibres.size(); i++) {
            llistatLlibres.get(i).mostra();
        }
    }

    public void mostrarLlistatSocis() {

        for (int i = 0; i < llistatSocis.size(); i++) {
            llistatSocis.get(i).mostraDades();
        }
    }
               

    public void eliminarLlibreTitol(String titol) {

        Llibre l = buscarLlibreTitol(titol);
        if (l == null) {
            System.out.println("No hi ha cap llibre amb aquest títol");
        } else {
            if (confirmacio("Vols eliminar aquest llibre? s/n")) {
                llistatLlibres.remove(l);
            }
        }

    }

    public void eliminarLlibreIsbn(String isbn) {

        int pos = buscarLlibreIsbn(isbn);
        if (pos == -1) {
            System.out.println("No hi ha cap llibre amb aquest isbn");
        } else {
            if (confirmacio("Vols eliminar aquest llibre? s/n")) {
                llistatLlibres.remove(pos);
            }

        }
    }     

    public void eliminarSociNom(String nom) {

        int pos = buscarSociNom(nom);
        if (pos == -1) {
            System.out.println("No hi ha cap soci amb aquest nom");
        } else {
            if (confirmacio("Vols eliminar aquest soci? s/n")) {
                llistatSocis.remove(pos);
            }

        }
    }
    
    public void eliminarSociDni(String dni) {

        Soci s = buscarSociDni(dni);
        if (s == null) {
            System.out.println("No hi ha cap soci amb aquest dni");
        } else {
            if (confirmacio("Vols eliminar aquest soci? s/n")) {
                llistatSocis.remove(s);
            }

        }
    }
    
    public void afegirSoci(Soci s){
        
        llistatSocis.add(s);
    }
    
    public void afegiLlibre(Llibre l){
        
        llistatLlibres.add(l);
    }
        
}
