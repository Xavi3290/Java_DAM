/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesherencia;

import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class Tenda {

    private String nom;
    private ArrayList<Electrodomestic> electrodomestics = new ArrayList<>();

    public Tenda(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void afegirElectrodomestic(Electrodomestic e) {
        this.electrodomestics.add(e);
    }

    public Electrodomestic buscarElectrodomestic(String marca) {
        
        System.out.println(this.nom);
        for (int i = 0; i < electrodomestics.size(); i++) {
            if (electrodomestics.get(i).getMarca().equals(marca)) {
                return electrodomestics.get(i);
            }
        }
        return null;
    }

    public void eliminarElectrodomestic(Electrodomestic e) {
        this.electrodomestics.remove(e);
    }

   
    

    public void dades() {
        System.out.println(this.nom);
        for (int i = 0; i < electrodomestics.size(); i++) {
            System.out.println(electrodomestics.get(i).toString());
        }                 
    }
}
