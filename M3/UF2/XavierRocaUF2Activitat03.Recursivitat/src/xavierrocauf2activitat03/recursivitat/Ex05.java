/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2activitat03.recursivitat;

/**
 *
 * @author usuari
 * Escriu un mètode recursiu que calculi el número de dígits senars en un nombre.
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int digit;
        System.out.println("La sortida és: ");
        digit = digitSenar(11156);
        System.out.println(digit);
    }
    
    public static int digitSenar(int num){
        
        int resu =0;
        if(num > 0){
            boolean senar = (num % 10) % 2 == 1;
            digitSenar(num/10);
            if(senar){
                resu = resu + 1;
            }
        }
        return resu;
    }
   //mal
    
}
