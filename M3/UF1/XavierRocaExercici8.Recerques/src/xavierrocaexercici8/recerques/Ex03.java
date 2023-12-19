/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici8.recerques;

import java.util.Scanner;

/**
 *
 * @author usuari
 * Escriu un programa que demani a l'usuari que insereixi quants alumnes té una
classe. Posteriorment, es demanarà que insereixi les notes que han obtingut
aquests alumnes en un determinat examen. Un cop inserides les notes, es
procedirà a la recerca de determinades qualificacions, que es demanaran a través
del teclat amb la finalitat de visualitzar una de les posicions on es troba aquesta
nota. Es demanaran vàries qualificacions per a buscar fins que l'usuari introdueixi
-1.
S'ha de tenir en compte que l'usuari inserirà les notes de manera ordenada (de
forma ascendent) i s'ha d'utilitzar el mètode de recerca binària. 
 */
public class Ex03 {
    
    public static void main(String[] args) {
        
       Scanner teclat = new Scanner(System.in);
       
       int classe, buscar, posicio = 0;
       
        System.out.println("Quants alumnes té la classe");
        classe = teclat.nextInt();
        int[] notes = new int[classe];
        System.out.println("Donam les notes dels alumnes");
        for (int i = 0; i < notes.length; i++) {
            notes[i] = teclat.nextInt();
        }
        
        
        
        
    }
    
}
