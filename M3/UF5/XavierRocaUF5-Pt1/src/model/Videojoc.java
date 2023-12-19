/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author usuari
 */
public class Videojoc implements Comparable <Videojoc>, Serializable{
    
    private int codi;
    private String nom;
    private String categoria;
    private String plataforma;
    private String tematica;
    private int quantStock;
    private String oferta;
    private double preu;

    public Videojoc() {
    }
/**
 * Constructor de videojoc
 * @param codi
 * @param nom
 * @param categoria
 * @param plataforma
 * @param tematica
 * @param quantStock
 * @param oferta
 * @param preu 
 */
    public Videojoc(int codi, String nom, String categoria, String plataforma, String tematica, int quantStock, String oferta, double preu) {
        this.codi = codi;
        this.nom = nom;
        this.categoria = categoria;
        this.plataforma = plataforma;
        this.tematica = tematica;
        this.quantStock = quantStock;
        this.oferta = oferta;
        this.preu = preu;
    }
/**
 * Getter de codi
 * @return int
 */
    public int getCodi() {
        return codi;
    }
/**
 * Setter de codi
 * @param codi int
 */
    public void setCodi(int codi) {
        this.codi = codi;
    }
/**
 * Getter de nom
 * @return string
 */
    public String getNom() {
        return nom;
    }
/**
 * Setter de nom
 * @param nom String
 */
    public void setNom(String nom) {
        this.nom = nom;
    }
/**
 * Getter de categoria
 * @return String
 */
    public String getCategoria() {
        return categoria;
    }
/**
 * Setter de categoria
 * @param categoria string
 */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
/**
 * Getter de plataforma
 * @return string
 */
    public String getPlataforma() {
        return plataforma;
    }
/**
 * Setter de plataforma
 * @param plataforma String
 */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
/**
 * Getter de tematica
 * @return string
 */
    public String getTematica() {
        return tematica;
    }
/**
 * Setter de tematica
 * @param tematica string
 */
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }
/**
 * Getter de quantstock
 * @return int
 */
    public int getQuantStock() {
        return quantStock;
    }
/**
 * Setter quanstock
 * @param quantStock int
 */
    public void setQuantStock(int quantStock) {
        this.quantStock = quantStock;
    }
/**
 * Getter de oferta
 * @return String
 */
    public String getOferta() {
        return oferta;
    }
/**
 * Setter de oferta
 * @param oferta String
 */
    public void setOferta(String oferta) {
        this.oferta = oferta;
    }
/**
 * Getter de preu
 * @return double
 */
    public double getPreu() {
        return preu;
    }
/**
 * Setter de preu
 * @param preu double
 */
    public void setPreu(double preu) {
        this.preu = preu;
    }
/**
 * to String de videojoc, envia un string amb tots els parametres
 * @return string
 */
    @Override
    public String toString() {
        return "Videojoc{" + "codi=" + codi + ", nom=" + nom + ", categoria=" + categoria + ", plataforma=" + plataforma + ", tematica=" + tematica + ", quantStock=" + quantStock + ", oferta=" + oferta + ", preu=" + preu + '}';
    }
/**
 * Hashcode per fer el treeset
 * @return int
 */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.codi;
        return hash;
    }
/**
 * Equals per poder fer el treeset
 * @param obj
 * @return 
 */
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
        final Videojoc other = (Videojoc) obj;
        return this.codi == other.codi;
    }
/**
 * CompareTo per fer el treeset
 * @param vid videojoc
 * @return negatiu, 0 o positiu
 */      
    @Override
    public int compareTo(Videojoc vid) {
         return this.codi-vid.codi;
    }
    
    
    
}
