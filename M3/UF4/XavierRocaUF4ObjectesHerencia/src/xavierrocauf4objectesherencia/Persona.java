/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesherencia;

/**
 *
 * @author usuari
 */
public class Persona {
     private String nom;
    protected String dni;
    private String adreça;

    public Persona(String nom, String dni, String adreça) {
        this.nom = nom;
        this.dni = dni;
        this.adreça = adreça;
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

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public String dades() {
        return "Persona: {nom=" + nom + ", dni=" + dni + ", adre\u00e7a=" + adreça + "}";
    }
}
