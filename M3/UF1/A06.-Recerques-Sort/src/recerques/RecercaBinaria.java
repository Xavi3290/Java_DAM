/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recerques;

import java.util.Scanner;

/**
 *
 * @author Francesca
 */
public class RecercaBinaria {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        int numABuscar = 0;
        int taula[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int esquerra, dreta, centre;
        esquerra = 0;
        dreta = taula.length - 1;
        centre = (dreta + esquerra) / 2;

        System.out.print("Introdueix el número a buscar: ");
        numABuscar = teclat.nextInt();

        while (esquerra < dreta && taula[centre] != numABuscar) {

            if (taula[centre] > numABuscar) {
                dreta = centre - 1;
            } else {
                esquerra = centre + 1;
            }

            centre = (esquerra + dreta) / 2;
        }

        if (taula[centre] == numABuscar) {
            System.out.printf("S'ha trobat el %d a la posició %d.", numABuscar, centre);
        }
    }
}
