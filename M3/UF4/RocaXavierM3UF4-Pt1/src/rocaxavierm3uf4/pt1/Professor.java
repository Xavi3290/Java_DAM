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
public class Professor extends Persona{
    
    private String anyInici;
    private ArrayList<Assignatura> assignatures = new ArrayList<>();

    /**
     * Constructor de Professor
     * @param anyInici
     * @param dni
     * @param nom
     * @param cognom 
     */
    public Professor(String anyInici, String dni, String nom, String cognom) {
        super(dni, nom, cognom);
        this.anyInici = anyInici;
    }

    /**
     * Getter de l'any de l'inici del profesor
     * @return String de l'any de l'inici del profesor
     */
    public String getAnyInici() {
        return anyInici;
    }

    /**
     * Setter de l'any de l'inici del profesor
     * @param anyInici String de l'any de l'inici del profesor
     */
    public void setAnyInici(String anyInici) {
        this.anyInici = anyInici;
    }

    /**
     * String de les dades del profesor
     * @return String de les dades del profesor
     */
    @Override
    public String toString() {
        return "Professor{"+ super.toString() + "anyInici=" + anyInici + '}';
    }
       
    /**
     * Afegeix una assignatura a l'arraylist d'assignatures
     * @param as Assignatura
     */
    public void afegirAssignatura(Assignatura as){
        this.assignatures.add(as);
    }
    
    /**
     * Elimina una assignatura de l'arraylist d'assignatures
     * @param as 
     */
    public void eliminarAssignatura(Assignatura as){
        this.assignatures.remove(as);
    }
    
    /**
     * Mostra les assignatures de l'arraylist de assignatures
     */
    public void mostrarAssignatures(){
        for (int i = 0; i < assignatures.size(); i++) {
           this.assignatures.get(i).dades();
        }
    }
    
    /**
     * Fa la booleana de si hi ha o no assignatura
     * @param ass assignatura
     * @return true o false
     */
    public boolean teAssignatura(String ass){
        boolean siNo = false;
        for (int i = 0; i < assignatures.size(); i++) {
            if(ass.equals(assignatures.get(i).getNom())){
                siNo = true;
                return siNo;
            }
        }
        return siNo;
    }
    
    /**
     * Mostra les dades del Professor
     */
    public void dades(){
        System.out.printf("\nProfessor: Any d'inici: %s, DNI: %s, Nom: %s, Cognom: %s\n", this.getAnyInici(), super.getDni(), super.getNom(), super.getCognom());
        mostrarAssignatures();
        System.out.println("");
    }    
    
}
