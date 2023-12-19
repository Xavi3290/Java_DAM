/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objecteabstract;

import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class Consulta {
    
    private String nom;
    private ArrayList<Pacient> pacients = new ArrayList<>();    

    public Consulta(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
     public void afegirPacient(Pacient p) {
        this.pacients.add(p);
    }
}
