/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objecteabstract;

/**
 *
 * @author usuari
 */
public  class Dona extends Pacient{

    public Dona(double pes, double alçada, int edad) {
        super(pes, alçada, edad);
    }   
    
    
    @Override
    public double contaCalories(){
        double calories;
        calories = this.getPes() * this.getAlçada() * 1000;
        return calories;
    }   
    
    @Override
    public String toString() {
        return "Dona{" + super.toString() + "Calories" + this.contaCalories() + '}';
    }
}
