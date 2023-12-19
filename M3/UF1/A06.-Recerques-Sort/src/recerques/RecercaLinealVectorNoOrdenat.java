/*
 * Buscarà un element en un vector que no té per què estar ordenat. 
 * Si la dada es troba tornarà la posició on es troba. or.
 */
package recerques;

import java.util.Scanner;

/**
 *
 * @author Francesca
 */
public class RecercaLinealVectorNoOrdenat {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        boolean trobat = false;
        int numABuscar = 0;
        int posicio = 0;
        int taula[] = {2, 5, 3, 8, 9, 0};

        System.out.print("Introdueix el número a buscar: ");
        numABuscar = teclat.nextInt();

        while (posicio < taula.length && trobat == false) { // trobat == false és el mateix que !trobat

            if (taula[posicio] == numABuscar) {
                trobat = true;
            } else {
                posicio++;
            }
        }

        if (trobat) { //trobat == true és el mateix que trobat
            System.out.printf("S'ha trobat el %d a la posició %d.", numABuscar, posicio);
        } else {
            System.out.println("No trobat");
        }
    }
}
