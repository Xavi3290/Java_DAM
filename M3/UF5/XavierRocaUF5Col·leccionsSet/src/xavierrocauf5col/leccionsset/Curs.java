/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccionsset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author usuari
 */
public class Curs {
    
     private Set<Alumne> alumnes = new HashSet<>();
     private String nom;

    public Curs(String nom) {
        this.nom = nom;
    }   

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Curs{" + "nom=" + nom + '}';
    }
     
    public boolean afegirAlumne(Alumne al){
        return alumnes.add(al);
    } 
    
    public boolean eliminar(String dni){
       Alumne alu = new Alumne(dni,"0", 0);
       return alumnes.remove(alu);
    }
    
    public Alumne buscar (String dni){
        Alumne alu = null;
        for (Alumne al : alumnes){
            if(al.getDni().equals(dni)){
                alu = al;
            }
        }
        return alu;
    }
    
    public void llista() {
        System.out.println("Curs{" + "nom=" + nom + '}');
        for (Alumne al : alumnes) {
            System.out.println(al.toString());
        }
    }

    public void llistaDNI() {
        TreeSet<Alumne> tx = new TreeSet<>();

        tx.addAll(alumnes);

        System.out.println("Curs{" + "nom=" + nom + '}');
        for (Alumne al : tx) {
            System.out.println(al.toString());
        }
    }
}
