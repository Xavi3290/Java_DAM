/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Scanner;
import static xavierrocauf2metodes.Util.llegirDouble;
import static xavierrocauf2metodes.Util.llegirInt;

/**
 *
 * @author usuari Realitzar un mètode que faci la conversió entre Celsius i
 * Fahrenheit tenint en compte que la fórmula de la conversió és la següent:
 * fahrenheit = (9,0 / 5) * celsius + 32 celsius = (5,0 /9) * (fahrenheit - 32
 */
public class Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        
        double num = 0;
        int ele = 0;
        
        System.out.println("Elegeix una opció:\n1.Fahrenheit\n2.Celsius");
        ele = llegirInt(ele);
        switch (ele) {
            
            case 1:
                System.out.println("Posa els graus celsius que vols convertir a fahrenheit");
                num = fahrenheit(num);
                System.out.printf("%.2f fahrenheit\n", num);
                break;
                
            case 2:
                System.out.println("Posa els graus fahrenheit que vols convertir en celsius");                
                num = celsius(num);
                System.out.printf("%.2f celsius\n", num);
                break;
                
            default:
                break;
        }
        
        

    }

    public static double fahrenheit(double v1) {

        double fahr, cel;

        cel = llegirDouble(v1);

        fahr = (9.0 / 5) * cel + 32;

        return fahr;

    }

    public static double celsius(double v1) {

        double fahr, cel;

        fahr = llegirDouble(v1);

        cel = (5.0 / 9) * (fahr - 32);

        return cel;

    }

}
