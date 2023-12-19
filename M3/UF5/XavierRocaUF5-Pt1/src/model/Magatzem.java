/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author usuari
 */
public class Magatzem implements Serializable {

    private TreeSet<Videojoc> videojocs = new TreeSet();
    private TreeSet<Categoria> categories = new TreeSet();

    public Magatzem() {

    }

    /**
     * Afegir un videojoc al treeset
     *
     * @param vj
     * @return
     */
    public boolean add(Videojoc vj) {
        return videojocs.add(vj);
    }

    /**
     * Si el treeset del videojocs es buit
     *
     * @return boolean
     */
    public boolean isEmpty() {
        return videojocs.isEmpty();
    }

    /**
     * Un Set de videojocs
     *
     * @return set de videojocs
     */
    public Set<Videojoc> getVideojocs() {
        return videojocs;
    }

    /**
     * Mostra el treeset de videojocs
     */
    public void mostrar() {
        for (Videojoc vj : videojocs) {
            System.out.println(vj.toString());
        }
    }

    /**
     * Busca un videojoc a partir de codi
     *
     * @param codi int
     * @return un videojoc o null
     */
    public Videojoc buscarVideojoc(int codi) {
        Videojoc vid = null;
        for (Videojoc vj : videojocs) {
            if (vj.getCodi() == codi) {
                vid = vj;
            }
        }
        return vid;
    }

    /**
     * Calcula l'import total de l'estoc
     *
     * @return
     */
    public double importTotal() {
        double suma = 0;
        for (Videojoc vj : videojocs) {
            suma = suma + vj.getPreu() * vj.getQuantStock();
        }
        return suma;
    }

}
