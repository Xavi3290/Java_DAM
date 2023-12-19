/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objecteabstract;

/**
 *
 * @author usuari
 */
public abstract class Pacient {

    private double pes;
    private double alçada;
    private int edad;

    public Pacient(double pes, double alçada, int edad) {
        this.pes = pes;
        this.alçada = alçada;
        this.edad = edad;
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public double getAlçada() {
        return alçada;
    }

    public void setAlçada(double alçada) {
        this.alçada = alçada;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Pacient{" + "pes=" + pes + ", alçada=" + alçada + ", edad=" + edad + '}';
    }
    
    public abstract double contaCalories();
    
    
}
