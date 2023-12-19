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
public class Condicional01 {
    
    public static void main(String[] args) {
        
        Scanner teclat = new Scanner(System.in);
        
        String culp;
        
        System.out.println("Di si eres culpable o no? (en minusculas(");
        culp=teclat.nextLine();
        switch(culp){
            case "si":
                System.out.println("Irás a la carcel");
                break;
            case "no":
                System.out.println("Irás a casa");
                break;
            default:
                System.out.println("La documentación por favor");
                break;
        }
        
    }
    
}
