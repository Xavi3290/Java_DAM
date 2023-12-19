/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccionsmap;

/**
 *
 * @author usuari
 */
public class Contacte {
    
    private String nom;
    private String adreça;
    private String poblacio;
    private int telefon;

    public Contacte(String nom, String adreça, String poblacio, int telefon) {
        this.nom = nom;
        this.adreça = adreça;
        this.poblacio = poblacio;
        this.telefon = telefon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdreça() {
        return adreça;
    }

    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Contacte{" + "nom=" + nom + ", adre\u00e7a=" + adreça + ", poblacio=" + poblacio + ", telefon=" + telefon + '}';
    }
    
    
}
