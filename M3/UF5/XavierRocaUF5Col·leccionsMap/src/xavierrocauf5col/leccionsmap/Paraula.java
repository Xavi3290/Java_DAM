/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccionsmap;

/**
 *
 * @author usuari
 */
public class Paraula {

    private String nom;
    private String definicio;
    private String idioma;
    private String tipus;

    public Paraula(String nom, String definicio, String idioma, String tipus) {
        this.nom = nom;
        this.definicio = definicio;
        this.idioma = idioma;
        this.tipus = tipus;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDefinicio() {
        return definicio;
    }

    public void setDefinicio(String definicio) {
        this.definicio = definicio;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    @Override
    public String toString() {
        return "Paraula{" + "nom=" + nom + ", definicio=" + definicio + ", idioma=" + idioma + ", tipus=" + tipus + '}';
    }

}
