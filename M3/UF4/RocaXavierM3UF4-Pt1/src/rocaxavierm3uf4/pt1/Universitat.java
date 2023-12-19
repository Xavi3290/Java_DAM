/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocaxavierm3uf4.pt1;

import java.util.ArrayList;
import static rocaxavierm3uf4.pt1.Util.confirmacio;
import static rocaxavierm3uf4.pt1.Util.llegirString;

/**
 *
 * @author usuari
 */
public class Universitat {

    private String nom;
    private ArrayList<Persona> persones = new ArrayList<>();
    private ArrayList<Assignatura> assignatures = new ArrayList<>();

    /**
     * Constructor de Universitat
     *
     * @param nom String nom de l'universitat
     */
    public Universitat(String nom) {
        this.nom = nom;
    }

    /**
     * Getter del nom de l'universitat
     *
     * @return String del nom de l'universitat
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter del nom de l'universitat
     *
     * @param nom String del nom de l'universitat
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * String de les dades de l'universitat
     *
     * @return String de les dades de l'universitat
     */
    @Override
    public String toString() {
        return "Universitat{" + "nom=" + nom + '}';
    }

    /**
     * Afegeix una persona a l'arraylist de persones
     *
     * @param pe Persona
     */
    public void afegirPersona(Persona pe) {
        this.persones.add(pe);
    }

    /**
     * Elimina una persona de l'arraylist de persones
     *
     * @param pe Persona
     */
    public void eliminarPersona(Persona pe) {
        if (confirmacio("\nVols eliminar aquesta persona? s/n\n")) {
            this.persones.remove(pe);
        }

    }

    /**
     * Elimina la persona buscada per DNI
     */
    public void eliminarPersona() {
        boolean trobat = false;
        System.out.println("\nEliminar per DNI\n");
        String dni = llegirString("DNI per buscar:");
        for (int i = 0; i < persones.size(); i++) {
            if (dni.equals(this.persones.get(i).getDni())) {
                this.persones.get(i).dades();
                trobat = true;
                if (confirmacio("\nVols eliminar aquesta persona? s/n\n")) {
                    this.persones.remove(this.persones.get(i));
                }
            }
        }
        if(!trobat){
            System.out.println("No esta a la Universitat");
        }
        System.out.println("");
    }

    /**
     * Mostra las persones de l'arraylist de persones
     */
    public void mostrarPersones() {
        System.out.println("\nLlistat de la Universitat\n");
        for (int i = 0; i < persones.size(); i++) {
            this.persones.get(i).dades();
        }
        System.out.println("");
    }

    /**
     * Mostra la persona buscada amb DNI
     */
    public void mostrarPersonesDNI() {   
        boolean trobat = false;
        System.out.println("\nBuscar per DNI\n");
        String dni = llegirString("DNI per buscar:");        
        for (int i = 0; i < persones.size(); i++) {
            if (dni.equals(this.persones.get(i).getDni())) {
                this.persones.get(i).dades();
                trobat = true;
            }
        }     
        if(!trobat){
            System.out.println("No esta a la Universitat");
        }
    }

    /**
     * Mostra el alumnes de l'arraylist de persones
     */
    public void mostrarAlumnes() {
        System.out.println("\nMostrar Alumnes\n");
        for (Persona alu : persones) {
            if (alu instanceof Alumne) {
                alu.dades();
            }

        }
        System.out.println("");
    }

    /**
     * Mostra els doctorats de l'arraylist de persones
     */
    public void mostrarDoctorats() {
        System.out.println("\nMostrar Doctorats\n");
        for (Persona doc : persones) {
            if (doc instanceof Doctorat) {
                doc.dades();
            }
        }
        System.out.println("");
    }

    /**
     * Mostra els professors de l'arraylist de persones
     */
    public void mostrarProfessors() {
        System.out.println("\nMosatrar Professors");
        for (Persona pro : persones) {
            if (pro instanceof Professor) {
                pro.dades();
            }
        }
        System.out.println("");
    }

    /**
     * Afegeix una assignatura en l'arraylist de assignatures
     *
     * @param as Assignatura
     */
    public void afegirAssignatura(Assignatura as) {
        this.assignatures.add(as);
    }

    /**
     * Elimina una assignatura en l'arraylist de assignatures
     *
     * @param as Assignatura
     */
    public void eliminarAssignatura(Assignatura as) {
        this.assignatures.remove(as);
    }

    /**
     * Mostra les assignatures de l'arraylist assignaturs
     */
    public void mostrarAssignatures() {
        for (int i = 0; i < assignatures.size(); i++) {
           this.assignatures.get(i).dades();
        }
    }

    /**
     * Mostra els alumnes i professors de cada assignatura
     */
    public void mostrarAssignaturaAlumneYProfessors() {
        System.out.println("Llistat de assignatures alumne i professor");
        for (Assignatura ass : assignatures) {
            System.out.println("");
            ass.dades();
            System.out.println("");
            for (Persona per : persones) {
                if (per instanceof Alumne) {
                    Alumne alu = (Alumne) per;
                    if (alu.teAssignatura(ass.getNom())) {
                        alu.dades();
                    }
                }
                if (per instanceof Professor) {
                    Professor pro = (Professor) per;
                    if (pro.teAssignatura(ass.getNom())) {
                        pro.dades();
                    }
                }
            }
        }
    }
}
