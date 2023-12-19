/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5ioserialitzacio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author usuari
 */
public class Alumne implements Serializable{
    
    private String nom;
    private transient int edat;     // transient para no guardar la edad
    private ArrayList<Nota> notes = new ArrayList<>();

    public Alumne(String nom, int edat) {        
        this.nom = nom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
    
    public void afegirNota(Nota n){
        notes.add(n);
    }
    
    public void eliminarNota(Nota n){
        notes.remove(n);
    }
    
    public void mostrarNotes(){
       for (Nota n : notes){
            n.dades();
        }
    }

    @Override
    public String toString() {
        return "Alumne{" + "nom=" + nom + ", edat=" + edat + '}';
    }

   public void dades(){
       System.out.printf("\nNom: %s, Edat: %d\n",this.nom, this.edat);
       mostrarNotes();
       
   }

   

        
    
}
