/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author usuari
 */
public class Pokemon {
    
    private int codi;
    private String nom;
    private int nivell;
    private String tipus;
    private double altura;

    public Pokemon(int codi, String nom, int nivell, String tipus, double altura) {
        this.codi = codi;
        this.nom = nom;
        this.nivell = nivell;
        this.tipus = tipus;
        this.altura = altura;
    }
    
    public Pokemon(){
        
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "codi=" + codi + ", nom=" + nom + ", nivell=" + nivell + ", tipus=" + tipus + ", altura=" + altura + '}';
    }
    
    
    
}
