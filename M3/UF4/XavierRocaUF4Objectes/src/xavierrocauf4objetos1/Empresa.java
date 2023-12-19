/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objetos1;

import java.util.ArrayList;
import static xavierrocauf4objetos1.util.confirmacio;

/**
 *
 * @author usuari
 */
public class Empresa {
    
     private String nom;
     private ArrayList<Treballador> llistatTreballadors = new ArrayList<>();

    public Empresa(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void afegirTreballador(Treballador t){
        llistatTreballadors.add(t);
    }
    
    public void eliminarTreballador(String dni){
        Treballador t = buscarTreballador(dni);
        if(t == null){
            System.out.println("No esta aquest treballador");
        }
        if(confirmacio("Vols eliminar el treballaodr? s/n")){
            llistatTreballadors.remove(t);
        }        
    }
    
    public Treballador buscarTreballador(String dni){
         for (int i = 0; i < llistatTreballadors.size(); i++) {
            if (llistatTreballadors.get(i).getDni().equals(dni)) {
                return llistatTreballadors.get(i);                
            }
        }       
        return null;
    }
     
    public void mostrarLlistatTreballadors(){        
        for (int i = 0; i < llistatTreballadors.size(); i++) {
            llistatTreballadors.get(i).mostrarTreballadorTaula();
        }       
    }
    
    public void mostrarTaulaFormat(){
        System.out.printf("%20s %20s %20s %20s", "DNI","NOM", "ADREÇA", "SOU");
    }
    
    
    
    
}
