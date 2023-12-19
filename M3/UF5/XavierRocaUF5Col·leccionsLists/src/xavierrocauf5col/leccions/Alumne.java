/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccions;

import java.util.Arrays;

/**
 *
 * @author usuari
 */
public class Alumne extends Persona {

    private double[] notes = new double[3];

    public Alumne(String nom, String dni) {
        super(nom, dni);
    }

    public double[] getNotes() {
        return notes;
    }

    public void setNotes(double[] notes) {
        this.notes = notes;
    }
   

    @Override
    public String toString() {
        return "Alumne{" + super.toString() + "notes=" + Arrays.toString(notes) + '}';
    }
}
