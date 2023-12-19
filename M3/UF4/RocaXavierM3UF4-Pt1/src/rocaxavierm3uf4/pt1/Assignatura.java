/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocaxavierm3uf4.pt1;

/**
 *
 * @author usuari
 */
public class Assignatura {
     
    private String nom;

    /**
     * Constructor de assignatura
     * @param nom Nom assignatura
     */
    public Assignatura(String nom) {
        this.nom = nom;
    }
    
    /**
     * Getter de nom, string del nom de l'assignatura
     * @return String del nom de l'assignatura
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter de nom, posa nom de l'assignatura 
     * @param nom String nom d'assignatura
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    /**
     * String de les dades de l'assignatura
     * @return String
     */
    @Override
    public String toString() {
        return "Assignatura{" + "nom=" + nom + '}';
    }   
    
    /**
     * Mostra les dades de l'assignatura
     */
    public void dades(){
        System.out.printf("Assignatura: %s ", this.getNom());
    }
    
}
