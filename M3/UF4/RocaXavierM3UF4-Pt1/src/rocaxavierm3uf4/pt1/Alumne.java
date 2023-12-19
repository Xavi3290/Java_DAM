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
public class Alumne extends Persona{
    
    private ArrayList<Assignatura> assignatures = new ArrayList<>();
    
    /**
     * Constructor de Alumne
     * @param dni Dni Alumne
     * @param nom Nom Alumne
     * @param cognom Cognom Alumne
     */
    public Alumne(String dni, String nom, String cognom) {
        super(dni, nom, cognom);
    }
    
    /**
     * Afegeix assignatures a l'alumne
     * @param as assignatura
     */
    public void afegirAssignatura(Assignatura as){
        this.assignatures.add(as);
    }
    
    /**
     * Elimina una assignatura
     * @param as assignatura
     */
    public void eliminarAssignatura(Assignatura as){
        this.assignatures.remove(as);
    }
    
    /**
     * Mostra totes les assignatures
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
     * Moistra les dades de l'alumne
     */    
    @Override
    public void dades(){
        System.out.printf("\nAlumne: DNI: %s, Nom: %s, Cognom: %s\n", super.getDni(), super.getNom(), super.getCognom());
        mostrarAssignatures();
        System.out.println("");
    }    
   
}
