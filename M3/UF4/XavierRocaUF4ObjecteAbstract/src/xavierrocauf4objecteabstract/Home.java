/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objecteabstract;

/**
 *
 * @author usuari
 */
public class Home extends Pacient{

    public Home(double pes, double alçada, int edad) {
        super(pes, alçada, edad);
    }   
       
    @Override
    public double contaCalories(){
        double calories;
        calories = this.getAlçada() * this.getEdad() * this.getPes() *50;
        return calories;
    }  
    
    @Override
    public String toString() {
        return "Home{" + super.toString() + "Calories" + this.contaCalories() + '}';
    }
}
