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
public class Alumne implements Comparable <Alumne> {
    
    private String dni;
    private String nom;
    private int notaFinal;

    public Alumne(String dni, String nom, int notaFinal) {
        this.dni = dni;
        this.nom = nom;
        this.notaFinal = notaFinal;
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

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Alumne{" + "dni=" + dni + ", nom=" + nom + ", notaFinal=" + notaFinal + '}';
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.dni);
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
        final Alumne other = (Alumne) obj;
        return Objects.equals(this.dni, other.dni);
    }
    
    @Override
    public int compareTo(Alumne al) {
        return this.dni.compareTo(al.dni);
    }
}
