/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rocapérezxavim3pe1;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex03 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int endevinar, num, cont = 0, numGran, numPetit;

        System.out.println("Número a endevinar:");
        endevinar = teclat.nextInt();
        numGran = endevinar + 1;
        numPetit = endevinar - 1;
        do {
            System.out.println("Introdueix un número:");
            num = teclat.nextInt();
            if (num < endevinar) {
                System.out.println("major!");
                if (numPetit > num) {
                    numPetit = num;
                }
            } else if (num > endevinar) {
                System.out.println("menor!");
                if (numGran < num) {
                    numGran = num;
                }
            } else {
                System.out.println("correcte!");
            }
            cont++;
        } while (num != endevinar);
        System.out.printf("Has introduit %d números, el mes gran és el %d i el més petit és el %d\n", cont, numGran, numPetit);

    }

}
