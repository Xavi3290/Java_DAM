/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocaxavierm3uf4pe1;

import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class Galeria {

    private String nom;
    private ArrayList<Obres> obresDArt = new ArrayList<>();

    public Galeria(String nom) {
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
        return "Galeria{" + "nom=" + nom + '}';
    }

    public void afegirObres(Escultura es) {
        int trobat = 0;
        this.obresDArt.add(es);
        for (int i = 0; i < obresDArt.size(); i++) {
            if (es.getCodi() == this.obresDArt.get(i).getCodi()) {
                trobat++;
            }
        }
        if (trobat == 1) {
            System.out.println("\nS'ha afegit correctament\n");
        } else {
            System.out.println("\nCodi repetit\n");
            this.obresDArt.remove(es);
        }

    }

    public void afegirObres(Quadres qua) {  // Parametre Obres
        int trobat = 0;
        this.obresDArt.add(qua);
        for (int i = 0; i < obresDArt.size(); i++) {
            if (qua.getCodi() == this.obresDArt.get(i).getCodi()) {
                trobat++;
            }
        }
        if (trobat == 1) {
            System.out.println("\nS'ha afegit correctament\n");
        } else {
            System.out.println("\nCodi repetit\n");
            this.obresDArt.remove(qua);
        }
    }

    public void afegirObres(Mural mur) {
        int trobat = 0;
        this.obresDArt.add(mur);
        for (int i = 0; i < obresDArt.size(); i++) {
            if (mur.getCodi() == this.obresDArt.get(i).getCodi()) {
                trobat++;
            }
        }
        if (trobat == 1) {
            System.out.println("\nS'ha afegit correctament\n");
        } else {
            System.out.println("\nCodi repetit\n");
            this.obresDArt.remove(mur);
        }
    }

    public void eliminarObres(int codi) {
        System.out.println("\nEliminar obra");
        boolean trobat = false;
        for (int i = 0; i < obresDArt.size(); i++) {
            if (codi == this.obresDArt.get(i).getCodi()) {
                this.obresDArt.remove(this.obresDArt.get(i));
                trobat = true;
            }
        }
        if (trobat) {
            System.out.println("\nS'ha esborrat correctament\n");
        } else {
            System.out.println("\nCodi no trobat\n");
        }
    }

    public void mostrarDades() {
        System.out.println("\nDades Galeria\n");
        System.out.println(this.getNom());
        System.out.println("");
        for (int i = 0; i < obresDArt.size(); i++) {
            this.obresDArt.get(i).dades();
        }
    }

    public void valorTotalVenda() {
        double suma = 0;
        for (int i = 0; i < obresDArt.size(); i++) {
            suma = suma + this.obresDArt.get(i).getPreuVenda();
        }

        System.out.printf("\nEl valor total de totes les obres d'art són %.2f\n", suma);
    }

    public void mostrarMuralsAvanç2000() {
        System.out.println("\nMostrar murals avanç 2000\n");
        for (Obres ob : obresDArt) {
            if (ob instanceof Mural) {
                Mural mur = (Mural) ob;
                if (mur.getAny() < 2000) {
                    mur.dades();
                }
            }
        }
    }
}
