/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2activitat03.recursivitat;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("La sortida és: ");
        metode(23);
        System.out.println();
    }
    
    public static void metode(int numero){
        if(numero > 0){
            metode(numero/2);
            System.out.println(numero % 2);
        }
    }
    //La sortida es 1-0-1-1-1 Et calcula el número binari de 23
    // el sout al estar després de la funció imprimeix per pantalla
    // primer el ultim metode en comptes del primer metode utilitzat.
}
