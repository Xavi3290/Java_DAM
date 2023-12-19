/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici3;

import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public class Ex15 {
    
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        
        int primerNumero, segonNumero;
        
        System.out.println("Mostrarem el número més gran per pantalla \nDonam el primer número");
        primerNumero=teclat.nextInt();
        System.out.println("Donam el segon númer");
        segonNumero=teclat.nextInt();
        if(primerNumero>segonNumero){
            System.out.printf("El número més gran és %d \n", primerNumero);
        }else{
            System.out.printf("El número més gran és %d \n", segonNumero);
        }
        
        
    }
    
}
