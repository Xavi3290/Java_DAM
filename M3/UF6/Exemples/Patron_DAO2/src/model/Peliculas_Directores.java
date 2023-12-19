/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author agustincintas
 */
public class Peliculas_Directores {
    
    private int pelicula_id;
    private int director_id;

    public Peliculas_Directores(int pelicula_id, int director_id) {
        this.pelicula_id = pelicula_id;
        this.director_id = director_id;
    }

    public Peliculas_Directores() {
    }
    
    

    
    
    
    public int getPelicula_id() {
        return pelicula_id;
    }

    public void setPelicula_id(int pelicula_id) {
        this.pelicula_id = pelicula_id;
    }

    public int getDirector_id() {
        return director_id;
    }

    public void setDirector_id(int director_id) {
        this.director_id = director_id;
    }

    @Override
    public String toString() {
        return "Peliculas_Directores{" + "pelicula_id=" + pelicula_id + ", director_id=" + director_id + '}';
    }

    
    
    
}
