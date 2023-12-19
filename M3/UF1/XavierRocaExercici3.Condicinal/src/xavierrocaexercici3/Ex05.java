/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici3;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex05 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int num, elevat;
        System.out.println("Escriu un número");
        num = teclat.nextInt();
        if (num % 2 == 0) {
            elevat = num * num;
            System.out.println("El número es parell, llavors l'elevem al quadrat " + elevat);
        }
        else{
            elevat = num * num * num;
            System.out.println("El número es senar, llavors l'eleven al cub " + elevat);
        }
    }

}
