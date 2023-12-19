/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocaxavierm3uf4.pt1;

/**
 *
 * @author usuari
 */
public abstract class Persona {
    
    private String dni;
    private String nom;
    private String cognom;

    /**
     * Construcor de la Persona
     * @param dni Dni de la Persona
     * @param nom Nom de la Persona
     * @param cognom  Cognom de la Persona
     */
    public Persona(String dni, String nom, String cognom) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
    }

    /**
     * Getter del dni de la persona
     * @return String del dni de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Setter del dni de la persona
     * @param dni String del dni de la persona
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Getter del nom de la persona
     * @return Strin del nom de la persona
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter del nom de la persona
     * @param nom String del nom de la persona
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter del cognom de la persona
     * @return String del cognom de la persona 
     */
    public String getCognom() {
        return cognom;
    }

    /**
     * Setter del cognom de la persona
     * @param cognom String del cognom de la persona
     */
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    /**
     * String de les dades de la persona
     * @return String de les dades de la persona
     */
    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nom=" + nom + ", cognom=" + cognom + '}';
    }
    
    /**
     * Mostra les dades de la persona
     */    
    public void dades(){
        System.out.printf("\nDNI: %s, Nom: %s, Cognom: %s\n", this.getDni(), this.getNom(), this.getCognom());
    }
    
    
}
