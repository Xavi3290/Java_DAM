/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocaexercici5.arrays;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] unArray = new int[10];

        for (int i = 0; i < unArray.length; i++) {
            unArray[i] = 2 * i;
        }
        for (int i = 0; i < unArray.length; i++) {
            System.out.print(unArray[i] + " ");
        }
        System.out.println();
    }
// Sortida: 0 2 4 6 8 10 12 14 16 18
}
