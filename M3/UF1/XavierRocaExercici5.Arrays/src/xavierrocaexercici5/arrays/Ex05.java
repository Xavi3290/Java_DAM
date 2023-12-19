/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici5.arrays;

/**
 *
 * @author usuari
 */
public class Ex05 {

    public static void main(String[] args) {

        int[] b = new int[10];
        for (int i = 1; i <= b.length; i++) {
            b[i] = 5 * i;
        }
// Al poner el <= se pasa en uno en el indice, por eso sale ERROR
    }
}
