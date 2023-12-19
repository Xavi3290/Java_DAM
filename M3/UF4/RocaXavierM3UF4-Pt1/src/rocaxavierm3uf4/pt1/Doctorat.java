/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocaxavierm3uf4.pt1;

import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class Doctorat extends Alumne{
    
    private String anyInici;
    private String tipusContracte;
    private Professor director;

    /**
     * Constructor de l'Alumne Doctorat
     * @param anyInici Any d'inici del doctorat
     * @param tipusContracte Tipus de contracte del doctorat
     * @param dni Dni del doctorat
     * @param nom Nom del doctorat
     * @param cognom Cognom del doctorat
     * @param director Director del doctorat
     */
    public Doctorat(String anyInici, String tipusContracte, String dni, String nom, String cognom, Professor director) {
        super(dni, nom, cognom);
        this.anyInici = anyInici;
        this.tipusContracte = tipusContracte;
        this.director = director;
    }
    
    /**
     * Getter de any de inici del doctorat
     * @return String any de inici
     */
    public String getAnyInici() {
        return anyInici;
    }

    /**
     * Setter de any de inici del doctorat
     * @param anyInici String de l'any de inici
     */
    public void setAnyInici(String anyInici) {
        this.anyInici = anyInici;
    }
    /**
     * Getter de tipus de contracte del doctorat
     * @return String de tipus de contracte
     */
    public String getTipusContracte() {
        return tipusContracte;
    }

    /**
     * Setter del tipus de contracte
     * @param tipusContracte String del tipus de contracte
     */
    public void setTipusContracte(String tipusContracte) {
        this.tipusContracte = tipusContracte;
    }

    /**
     * Getter del director
     * @return Professor del director
     */
    public Professor getDirector() {
        return director;
    }

    /**
     * Setter del director
     * @param director Professor del director
     */
    public void setDirector(Professor director) {
        this.director = director;
    }

    /**
     * String de les dades del doctorat
     * @return String dades del doctorat
     */
    @Override
    public String toString() {
        return "Doctorat{" + super.toString() + "anyInici=" + anyInici + ", tipusContracte=" + tipusContracte + ", director=" + director + '}';
    }  
    
    /**
     * Mostra les dades del doctorat
     */
    @Override
    public void dades(){
        System.out.printf("\nDoctorat: Any de inici: %s, Tipus de contracte: %s, Director: %s, DNI: %s, Nom: %s, Cognom: %s\n", this.getAnyInici(), this.getTipusContracte(), this.getDirector().getNom(), super.getDni(), super.getNom(), super.getCognom());
        mostrarAssignatures();
        System.out.println("");
    }
    
  

      
   
}
