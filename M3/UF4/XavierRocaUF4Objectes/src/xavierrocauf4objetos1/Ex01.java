/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf4objetos1;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Estudiant estu = new Estudiant("Xavi", "DAW", 10);

        estu.mostra();
        // estu.nom = "Pepe";   No es pot perque l'atribut es privat, s'ha de fer amb el set
        estu.mostra(true);

    }

}
