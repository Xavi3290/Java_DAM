/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objetos1;

/**
 *
 * @author usuari
 */
public class Soci {
    
    private String dni;
    private String nom;
    private Llibre llibre;

    public Soci(String dni, String nom) {
        this.dni = dni;
        this.nom = nom;
        this.llibre = null;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Llibre getLlibre() {
        return llibre;
    }

    public void setLlibre(Llibre llibre) {
        this.llibre = llibre;
    }
    
    public void mostraDades(){
        
        System.out.printf("DNI: %s\nNom: %s\n", this.dni, this.nom);
        if(llibre != null){
            System.out.println("llibre:" + llibre.getTitol());
        }else{
            System.out.println("No ha agafat cap llibre");
        }     
    }  
    
    
   
    
   

    
}
