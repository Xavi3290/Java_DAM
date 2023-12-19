/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5calculadora;

/**
 *
 * @author usuari
 */
public class Calculadora {
    
 

    public Calculadora() {
   
    }

      
    public double suma(double num1, double num2){
        return num1 + num2;
    }
    
    public double resta (double num1, double num2){
        return num1 - num2;
    }
    
    public double multiplicacio(double num1, double num2){
        return num1 * num2;
    }
    
    public double divisio(double num1, double num2){
        if (num2 == 0){
            return 0;
        }else{
            return num1 / num2; 
        }
    }   

   
    
}
