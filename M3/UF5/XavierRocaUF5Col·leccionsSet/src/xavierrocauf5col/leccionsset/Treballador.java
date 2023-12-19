/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccionsset;

import java.util.Objects;

/**
 *
 * @author usuari
 */
public class Treballador implements Comparable<Treballador> {

    private String nom;
    private String cognom;
    private double sou;

    public Treballador(String nom, String cognom, double sou) {
        this.nom = nom;
        this.cognom = cognom;
        this.sou = sou;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    @Override
    public String toString() {
        return "Treballador{" + "nom=" + nom + ", cognom=" + cognom + ", sou=" + sou + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nom);
        hash = 47 * hash + Objects.hashCode(this.cognom);
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
        final Treballador other = (Treballador) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return Objects.equals(this.cognom, other.cognom);
    }

    @Override
    public int compareTo(Treballador t) {
        int com;
        com = this.cognom.compareTo(t.cognom);
        if(com == 0){
            this.nom.compareTo(t.nom);
            return this.nom.compareTo(t.nom);
        }
        return com;
    }

}
