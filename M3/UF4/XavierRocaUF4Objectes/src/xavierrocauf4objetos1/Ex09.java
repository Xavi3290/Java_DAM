/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf4objetos1;

/**
 *
 * @author usuari
 */
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BlocDeNotes nota = new BlocDeNotes();
        
        nota.afegirNota("5");
        nota.afegirNota("10");
        System.out.println(nota.numeroNotes());  
        nota.llistatNotes();
    }
    
}
