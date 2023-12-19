/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf4objetos1;

/**
 *
 * @author usuari
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiant estu = new Estudiant("Xavi", "DAW", 10);
        Estudiant estu1 = new Estudiant("Xavi1", "DAW", 10);
        Estudiant estu2 = new Estudiant("Xavi2", "DAW", 10);
        System.out.println(Estudiant.getNumEstudiants());
    }
    
}
