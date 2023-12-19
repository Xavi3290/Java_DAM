/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model2;

/**
 *
 * @author usuari
 */
public class Director {
    
    private int id;
    private String nombre;

    public Director(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public Director(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "pelicula{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
