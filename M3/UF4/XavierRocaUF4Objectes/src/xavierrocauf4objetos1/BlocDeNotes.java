/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objetos1;

import java.util.ArrayList;

/**
 *
 * @author usuari
 */
public class BlocDeNotes {
    
   private ArrayList<String> notes = new ArrayList<>();

        
    public void afegirNota(String nota){
                
        notes.add(nota);        
    }
   
    public int numeroNotes(){
        
        return notes.size();      
    }
    
    public void llistatNotes(){
        
        System.out.println(notes.toString());
    }
   
    
    
    
    
    
    
}
