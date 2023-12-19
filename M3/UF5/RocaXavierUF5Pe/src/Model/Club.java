/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author usuari
 */
public class Club implements Serializable {

    private String nom;
    private Set<Soci> socis = new TreeSet<>();

    public Club(String nom) {
        this.nom = nom;
    }

    public Club() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Club{" + "nom=" + nom + '}';
    }

    public boolean afegirSoci(Soci so) {
        return socis.add(so);
    }

    public boolean eliminar(String dni) {
        Soci so = new Soci(dni, "", 0, null);
        return socis.remove(so);
    }

    public Soci buscar(String dni) {
        Soci so = null;
        for (Soci soc : socis) {
            if (soc.getDni().equals(dni)) {
                so = soc;
            }
        }
        return so;
    }

    public void llista() {
        System.out.println(this.toString());
        for (Soci so : socis) {
            System.out.println(so.toString());
        }
    }

    public void afegirConsum(int con, Soci so) throws Exception {    
        so.setImpTotal(so.getImpTotal() + con);
        if (so.getImpTotal()>1000){
             throw new Exception("Tens un soci Vip");
        } else {
            System.out.println("Consum sumat");
        }        
    }

}
