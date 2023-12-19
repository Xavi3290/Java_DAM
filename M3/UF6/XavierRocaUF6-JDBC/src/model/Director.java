/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author usuari
 */
public class Director {
    
    private int id;
    private String nom;

    public Director(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    
    public Director(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Director{" + "id=" + id + ", nom=" + nom + '}';
    }
    
    
    
}
