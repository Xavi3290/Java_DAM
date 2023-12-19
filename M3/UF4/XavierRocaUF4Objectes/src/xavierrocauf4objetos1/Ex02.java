/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf4objetos1;

/**
 *
 * @author usuari
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Llibre lli = new Llibre("JK.Rowling", "Harry Potter", 1000, "11111C");
        
        lli.mostra();
        lli.setIsbn("666666A");
        lli.setPrestat(true);
        lli.mostra();
    }
    
}
