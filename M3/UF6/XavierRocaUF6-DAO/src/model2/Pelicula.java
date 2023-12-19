/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model2;

import java.time.LocalDate;


/**
 *
 * @author usuari
 */
public class Pelicula  {        //    le quito esto porque no lo necesita, mejor hacer arraylist que treeset implements Comparable <Pelicula>
    
    private int id;
    private String titulo;
    private LocalDate fechaEstreno;
    private int duracion;

    public Pelicula(int id, String titulo, LocalDate fechaEstreno, int duracion) {
        this.id = id;
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
    }
    
    public Pelicula(){
        
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

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
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

//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 11 * hash + this.id;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Pelicula other = (Pelicula) obj;
//        return this.id == other.id;
//    }
//
//    @Override
//    public int compareTo(Pelicula pel) {
//        return this.id-pel.id;
//    }

    
    
   
    
    
    
}
