/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;
import java.util.TreeSet;

/**
 *
 * @author usuari
 */
public class Categoria implements Comparable<Categoria>, Serializable {

    String categoria;

    /**
     * Constructor
     *
     * @param categoria
     */
    public Categoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Getter de categoria
     *
     * @return string
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Setter de categoria
     *
     * @param categoria String
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Hashcode per poder fer el treeset
     *
     * @return
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.categoria);
        return hash;
    }

    /**
     * Equals per poder fer el tresset
     *
     * @param obj
     * @return categoria
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        return Objects.equals(this.categoria, other.categoria);
    }

    /**
     * CompareTo per poder fer el treeset
     *
     * @param cat categoria
     * @return un bolean
     */
    @Override
    public int compareTo(Categoria cat) {
        return this.categoria.compareTo(cat.categoria);
    }

}
