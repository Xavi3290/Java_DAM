/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objetos1;

import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class Curs {
        
    private String nomCurs;
    private ArrayList<Estudiant> llistatAlumnes = new ArrayList<>();

    public Curs(String nomCurs) {
        this.nomCurs = nomCurs;
    }

    public String getNomCurs() {
        return nomCurs;
    }

    public void setNomCurs(String nomCurs) {
        this.nomCurs = nomCurs;
    }
    
    public void afegirAlumne(Estudiant es){
        
        llistatAlumnes.add(es);
    }
    
    public void eliminarAlumne(Estudiant es){
        
        llistatAlumnes.remove(es);
    }    
       
    public void mostrarLlistatAlumnes(){
        
        for (int i = 0; i < llistatAlumnes.size(); i++) {
            System.out.println(llistatAlumnes.get(i).getNom());
        }
    }
    
    public Estudiant buscarNomAlumne(String nom){
        
        for (int i = 0; i < llistatAlumnes.size(); i++) {
            if(llistatAlumnes.get(i).getNom().equals(nom)){
                return llistatAlumnes.get(i);
            }
        }
          return null;     
    }
    
}
