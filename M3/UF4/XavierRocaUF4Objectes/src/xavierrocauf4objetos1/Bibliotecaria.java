/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objetos1;

import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class Bibliotecaria {
    
    private String nom;
    private String dni;
   

    public Bibliotecaria(String nom, String dni) {
        this.nom = nom;
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public boolean presteLlibre(Soci s, Llibre l){
        
        if(l.getPrestat()){
            return false;
        }else{
            s.setLlibre(l);
            l.setPrestat(true);
            return true;
        }         
    }
    
    
    
    
    
}
