/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objecteabstract;

import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class Institut {

    private String nom;
    private ArrayList<Alumne> alumnes = new ArrayList<>();
    private ArrayList<Professor> professors = new ArrayList<>();

    public Institut(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void afegirAlumne(Alumne a) {
        this.alumnes.add(a);
    }

    public void afegirProfessor(Professor p) {
        this.professors.add(p);
    }

    public void eliminarAlumne(Alumne a) {
        this.alumnes.remove(a);
    }

    public void eliminarProfessor(Professor p) {
        this.professors.remove(p);
    }

    public Alumne buscarAlumne(String nom) {

        System.out.println(this.nom);
        for (int i = 0; i < alumnes.size(); i++) {
            if (alumnes.get(i).getNom().equals(nom)) {
                return alumnes.get(i);
            }
        }
        return null;
    }

    public Professor buscarProfessor(String nom) {

        System.out.println(this.nom);
        for (int i = 0; i < professors.size(); i++) {
            if (professors.get(i).getNom().equals(nom)) {
                return professors.get(i);
            }
        }
        return null;
    }

    public void dadesAlumnes() {
        System.out.println(this.nom);
        for (int i = 0; i < alumnes.size(); i++) {
            System.out.println(alumnes.get(i).toString());
        }
    }
    
    public void dadesProfessors() {
        System.out.println(this.nom);
        for (int i = 0; i < professors.size(); i++) {
            System.out.println(professors.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return "Institut{" + "nom=" + nom + '}';
    }
    
    

}
