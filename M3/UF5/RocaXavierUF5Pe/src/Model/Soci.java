/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Objects;



/**
 *
 * @author usuari
 */
public class Soci implements Comparable <Soci>, Serializable{
    
    private String dni;
    private String nom;
    private transient int impTotal;
    private Activitat activitat;

    public Soci(String dni, String nom, int impTotal, Activitat activitat) {
        this.dni = dni;
        this.nom = nom;
        this.impTotal = impTotal;
        this.activitat = activitat;
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

    public int getImpTotal() {
        return impTotal;
    }

    public void setImpTotal(int impTotal) {
        this.impTotal = impTotal;
    }

    public Activitat getActivitat() {
        return activitat;
    }

    public void setActivitat(Activitat activitat) {
        this.activitat = activitat;
    }

    @Override
    public String toString() {
        return "Soci{" + "dni=" + dni + ", nom=" + nom + ", impTotal=" + impTotal + ", activitat=" + activitat + '}';
    }

    @Override
    public int compareTo(Soci so) {
        return this.dni.compareTo(so.dni);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Soci other = (Soci) obj;
        return Objects.equals(this.dni, other.dni);
    }
    
    
    
}
