/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model2;

/**
 *
 * @author usuari
 */
public class PeliculasDirectores {

    private int peliculaId;
    private int directorId;

    public PeliculasDirectores(int peliculaId, int directorId) {
        this.peliculaId = peliculaId;
        this.directorId = directorId;
    }

    public PeliculasDirectores() {

    }

    public int getPeliculaId() {
        return peliculaId;
    }

    public void setPeliculaId(int peliculaId) {
        this.peliculaId = peliculaId;
    }

    public int getDirectorId() {
        return directorId;
    }

    public void setDirectorId(int directorId) {
        this.directorId = directorId;
    }

    @Override
    public String toString() {
        return "Peliculas_Directores{" + "peliculaId=" + peliculaId + ", directorId=" + directorId + '}';
    }

}
