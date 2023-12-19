/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici3;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex09 {
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        
        int num1, num2, opc;
        System.out.println("Donam dos números \nDonam el primer ńumero");
        num1 = teclat.nextInt();
        System.out.println("Donam el segon número");
        num2 = teclat.nextInt();
        System.out.println("Elegeix l'opció seguent: \n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir");
        opc = teclat.nextInt();
        switch ( opc ){
            case 1:
                System.out.printf("El número %d més el número %d és %d \n", num1, num2, num1 + num2);
                break;
            case 2:
                System.out.printf("El número %d menys el número %d és %d \n", num1, num2, num1 - num2);
                break;
            case 3:
                System.out.printf("El número %d per el número %d és %d \n", num1, num2, num1 * num2);
                break;
            case 4:
                System.out.printf("El número %d per el numero %d és %d \n", num1, num2, num1 / num2);
                break;
            default:
                System.out.printf("Error \n");
                break;
        }
    }
    
}
