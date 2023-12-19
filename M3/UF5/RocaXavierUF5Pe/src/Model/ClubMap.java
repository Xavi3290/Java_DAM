/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author usuari
 */
public class ClubMap {

    private String nom;
    private TreeMap<String, Soci> socis = new TreeMap<String, Soci>();

    public ClubMap(String nom) {
        this.nom = nom;
    }

    public ClubMap() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "ClubMap{" + "nom=" + nom + ", soci=" + socis + '}';
    }

    public void afegir(Soci so) {
        socis.put(so.getDni().toLowerCase(), so);
    }

    public boolean esborrar(String dni) {
        Soci s = socis.remove(dni.toLowerCase());
        return s != null;
    }

    public Soci cercarSoci(String dni) {
        return socis.get(dni.toLowerCase());
    }

    public void showSoci(String dni) {
        System.out.println(cercarSoci(dni).toString());
    }

    public void mostrarSocis() {
        Set<String> ks = socis.keySet();
        for (String clau : ks) {
            showSoci(clau);
        }
    }

    public void afegirConsum(int con, Soci so) throws Exception {
        so.setImpTotal(so.getImpTotal() + con);
        if (so.getImpTotal() > 1000) {
            throw new Exception("Tens un soci Vip");
        } else {
            System.out.println("Consum sumat");
        }
    }

}
