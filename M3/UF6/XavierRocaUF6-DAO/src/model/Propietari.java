/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuari
 */
public class Propietari {

    private String dni;
    private String nom;
    private int edat;

    public Propietari(String dni, String nom, int edat) {
        this.dni = dni;
        this.nom = nom;
        this.edat = edat;
    }

    public Propietari() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    @Override
    public String toString() {
        return "Propietari{" + "dni=" + dni + ", nom=" + nom + ", edat=" + edat + '}';
    }

 

}
