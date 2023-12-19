/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author agustincintas
 */
public class Pelicula implements Comparable<Pelicula>{
    
    private int id;
    private String titulo;
    private Date fechaEstreno;
    private int duracion;

    public Pelicula(int id, String titulo, Date fechaEstreno, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(Date fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", titulo=" + titulo + ", fechaEstreno=" + fechaEstreno + ", duracion=" + duracion + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.id;
        return hash;
    }

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
        final Pelicula other = (Pelicula) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pelicula a) {
        int r=1212121;
        
        if(this.id>a.id){
            return 1;
        }
        if(this.id==a.id){
            return 0;
        }
        if(this.id<a.id){
            return -1;
        }
        return r;
         
        
        
    }
    
    
    
}
