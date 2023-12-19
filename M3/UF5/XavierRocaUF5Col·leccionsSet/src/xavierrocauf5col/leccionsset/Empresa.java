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
public class Empresa {

    private Set<Treballador> treballadors = new TreeSet<>();  // podria posar aqui directament el treeset
    private String nom;

    public Empresa(String nom) {
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
        return "Empresa{" + "nom=" + nom + '}';
    }
    
    public boolean afegirTreballador(Treballador tre) {
        return treballadors.add(tre);
    }

    public void llista() {
        System.out.println("Empresa{" + "nom=" + nom + '}');
        for (Treballador tre : treballadors) {
            System.out.println(tre.toString());
        }
    }

//    public void llistaCognomNom() {
//        TreeSet<Treballador> tx = new TreeSet<>();
//
//        tx.addAll(treballadors);
//
//        System.out.println("Empresa{" + "nom=" + nom + '}');
//        for (Treballador tre : tx) {
//            System.out.println(tre.toString());
//        }
//    }
    
     public boolean eliminar(String cognom, String nom){
       Treballador tre = new Treballador(nom, cognom, 0);
       return treballadors.remove(tre);
    }
    
    public Treballador buscar (String cognom, String nom){
        Treballador tre = null;
        for (Treballador t : treballadors){
            if(t.getCognom().equals(cognom)){
                if(t.getNom().equals(nom)){
                   tre = t; 
                }                
            }
        }
        return tre;
    }
    
    public Treballador modificar (String cognom, String nom, String cognom2, String nom2){
        
        Treballador tre = this.buscar(cognom, nom);
        tre.setCognom(cognom2);
        tre.setNom(nom2);
        return tre;          
    }
    
    public void isEmpty(){
        treballadors.isEmpty();
    }
}
