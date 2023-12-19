/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2activitat03.recursivitat;

/**
 *
 * @author usuari
 */
public class Ex04 {

    /**
     * @param args the command line arguments Escriu un mètode recursiu que
     * calculi la suma de tots els valors d'un vector.
     */
    public static void main(String[] args) {

        int[] vector = {1, 2, 3, 4};
        int sumaVec;

        System.out.println("La sortida és: ");
        sumaVec = sumaVector(vector, 0);
        System.out.println(sumaVec);

    }

    public static int sumaVector(int[] array, int pos) {

        int resu = 0;
        if (pos <= array.length - 1) {
            resu = array[pos] + sumaVector(array, pos + 1);
        }
        return resu;
    }

}
