/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5ioserialitzacio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class Curs implements Serializable{
    
    private String nom;
    private ArrayList<Alumne> alumnes = new ArrayList<>();

    public Curs(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void afegirAlumne(Alumne al){
        alumnes.add(al);
    }
    
    public void eliminarAlumne(String nom){
        for (int i = 0; i < alumnes.size(); i++) {
            if(alumnes.get(i).getNom().equals(nom)){
                alumnes.remove(alumnes.get(i));
            }
        }
    }
    
    public void mostrarAlumnes(){
        for (Alumne a : alumnes){
            a.dades();
        }
    }

    @Override
    public String toString() {
        return "Curs{" + "nom=" + nom + '}';
    }
    
    public void dades(){
        System.out.printf("Nom: %s", this.nom);
        mostrarAlumnes();
    }
}
