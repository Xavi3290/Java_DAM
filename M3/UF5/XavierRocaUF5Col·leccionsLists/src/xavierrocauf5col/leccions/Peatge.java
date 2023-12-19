/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccions;

import java.util.Objects;

/**
 *
 * @author usuari
 */
public class Peatge {
   
    private Cua[] caixes = new Cua[5];
    private Cotxe cot;
    
    public void afegirCotxe(Cotxe cot){
        int min = 0;
        int pos = 0;
        for (int i = 0; i < caixes.length; i++) {
            caixes[i].quantitat();
            if(min < caixes[i].quantitat()){
               min = caixes[i].quantitat();
               pos = i;
               
            }
        }
        caixes[pos].addLast(cot);
    }

    
    
}
