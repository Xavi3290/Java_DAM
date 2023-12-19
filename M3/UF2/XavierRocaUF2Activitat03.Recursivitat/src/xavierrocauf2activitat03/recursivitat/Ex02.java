/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2activitat03.recursivitat;

/**
 *
 * @author usuari
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("La sortida és: ");
        metode(11156);
        System.out.println();
    }
    
    public static void metode(int numero){
        if(numero > 0){
            int d = numero % 10;
            boolean senar = (numero / 10) % 2 == 1;
            metode(numero / 10);
            if(senar){
                System.out.println(d / 2+5);
            }else {
                System.out.println(d / 2);
            }
        }
    }
}
// 0-5-5-7-8