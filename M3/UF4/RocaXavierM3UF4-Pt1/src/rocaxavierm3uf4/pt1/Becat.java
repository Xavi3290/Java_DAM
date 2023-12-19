/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocaxavierm3uf4.pt1;

/**
 *
 * @author usuari
 */
public class Becat extends Alumne{
    
    private String beca;
    
    /**
     * Constructor de Becat
     * @param beca Beca d'alumne
     * @param dni DNI d'alumne
     * @param nom Nom d'alumne
     * @param cognom Cognom d'Alumne
     */
    public Becat(String beca, String dni, String nom, String cognom) {
        super(dni, nom, cognom);
        this.beca = beca;
    }
    
    /**
     * Getter de Beca, string de beca
     * @return String de beca de l'alumne
     */
    public String getBeca() {
        return beca;
    }
    
    /**
     * Setter de Beca
     * @param beca String nom de beca
     */
    public void setBeca(String beca) {
        this.beca = beca;
    }
    
    /**
     * String de les dades de l'alumne becat
     * @return String de les dades 
     */
    @Override
    public String toString() {
        return "Becat{"+ super.toString() + "beca=" + beca + '}';
    }
    
    /**
     * Mostra les dades del becat
     */
    @Override
    public void dades(){
        System.out.printf("\nBecat: Beca: %s, DNI: %s, Nom: %s, Cognom: %s\n", this.getBeca(), super.getDni(), super.getNom(), super.getCognom());
         mostrarAssignatures();
         System.out.println("");
    }
}
