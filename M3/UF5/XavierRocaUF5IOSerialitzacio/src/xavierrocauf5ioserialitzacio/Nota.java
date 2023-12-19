/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5ioserialitzacio;

import java.io.Serializable;

/**
 *
 * @author usuari
 */
public class Nota implements Serializable{
     
    private double puntuacio;
    private String modul; 

    public Nota(double puntuacio, String modul) {
        this.puntuacio = puntuacio;
        this.modul = modul;
    }

    public double getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(double puntuacio) {
        this.puntuacio = puntuacio;
    }

    public String getModul() {
        return modul;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }

    @Override
    public String toString() {
        return "Nota{" + "puntuacio=" + puntuacio + ", modul=" + modul + '}';
    }
    
    public void dades(){
        System.out.printf("\nPuntuacio: %.2f, Módul: %s\n", this.puntuacio, this.modul);
    }
      
}
