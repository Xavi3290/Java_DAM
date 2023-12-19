/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objetos1;

/**
 *
 * @author usuari
 */
public class Calculadora {
    
    // millor que retorni un duble, ja que els metodes millor que no interactuin
    public static void suma(double num1, double num2) { 
        double suma;        
        suma = num1 + num2;
        System.out.printf("%.1f + %.1f = %.1f\n", num1, num2, suma);
    }

    public static void resta(double num1, double num2) {
        double resta;        
        resta = num1 - num2;
        System.out.printf("%.1f - %.1f = %.1f\n", num1, num2, resta);
    }

    public static void multiplicacio(double num1, double num2) {
        double mult;        
        mult = num1 * num2;
        System.out.printf("%.1f * %.1f = %.1f\n", num1, num2, mult);
    }

    public static void divisio(double num1, double num2) {
        double div;        
        if (num2 == 0) {
            System.out.println("La divisio dona infinit");
        } else {
            div = num1 / num2;
            System.out.printf("%.1f / %.1f = %.1f\n", num1, num2, div);
        }
    }

}
