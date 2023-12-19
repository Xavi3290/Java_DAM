/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5ioserialitzacio;

import java.io.Serializable;

/**
 *
 * @author usuari
 */
public class Propietari implements Serializable{
    
    private String nom;
    private String dni;

    public Propietari(String nom, String dni) {
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

    @Override
    public String toString() {
        return "Propietari{" + "nom=" + nom + ", dni=" + dni + '}';
    }
    
    
}
