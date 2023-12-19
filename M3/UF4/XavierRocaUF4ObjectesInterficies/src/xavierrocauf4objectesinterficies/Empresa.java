/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objectesinterficies;

import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class Empresa {
    
    private String nom;
    private ArrayList<I_Activacio> dispositius = new ArrayList<>();

    public Empresa(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }   
  
    public void afegirDispositiu(I_Activacio disp) {

        this.dispositius.add(disp);
    }
    
    public void eliminarDisopsitiu(I_Activacio disp){
        this.dispositius.remove(disp);
    }
        
    public void mostrarDispositius(){
        for (int i = 0; i < dispositius.size(); i++) {
            this.dispositius.get(i).dades();
        }
    }
    
    
    
}
