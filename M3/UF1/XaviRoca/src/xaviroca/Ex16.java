/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xaviroca;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex16 {
    
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        
        double num, multi = 1;
        
        System.out.println("Donam un valor que farem la seva taula de multiplicar");
        num = teclat.nextDouble();
   
        
        System.out.printf("%.2f x 1 = %.2f \n", num, num*multi);
        multi++;
        System.out.printf("%.2f x 2 = %.2f \n", num, num*multi);
        multi = multi + 1;
        System.out.printf("%.2f x 3 = %.2f \n", num, num*multi);
        multi++;
        System.out.printf("%.2f x 4 = %.2f \n", num, num*multi);
        multi = multi + 1;
        System.out.printf("%.2f x 5 = %.2f \n", num, num*multi);
        multi++;
        System.out.printf("%.2f x 6 = %.2f \n", num, num*multi);
        multi = multi + 1;
        System.out.printf("%.2f x 7 = %.2f \n", num, num*multi);
        multi++;
        System.out.printf("%.2f x 8 = %.2f \n", num, num*multi);
        multi = multi + 1;
        System.out.printf("%.2f x 9 = %.2f \n", num, num*multi);
        multi++;
        System.out.printf("%.2f x 10 = %.2f \n\n", num, num*multi);
        
        System.out.println("Donam un valor que farem una altra taula de multiplicar \n");
        num = teclat.nextDouble();
        
        for ( multi = 1; multi<=10; multi++){
            System.out.printf("%.2f x %.2f = %.2f \n\n", num, multi, num*multi);
           
            
         }
        
        System.out.println("Donam un valor que farem una altra taula de multiplicar");
        num = teclat.nextDouble();
        multi = 1;
        while(multi<=10) { 
            System.out.printf("%.2f x %.2f = %.2f \n", num, multi, num*multi);
            multi++;
        
        }   
        
        
    }
    
}
