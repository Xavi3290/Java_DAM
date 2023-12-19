/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2activitat03.recursivitat;

/**
 *
 * @author usuari Escriu un mètode recursiu que sumi tots el nombres naturals
 * fins a N,
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int sumaNat;

        System.out.println("La sortida és: ");
        sumaNat = suma(4);
        System.out.println(sumaNat);
    }

    public static int suma(int num) {
        int resu = 0;

        if (num > 0) {
            resu = num + suma(num - 1);
        }
        return resu;
    }

}
