/*
 * A través d'un vector ordenat de forma ascendent i el valor
 * que es vol buscar tornarà la posició on es troba el primer
 * valor coincident.
 */
package recerques;

import java.util.Scanner;

/**
 *
 * @author Francesca
 */
public class RecercaLinealVectorOrdenat {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        boolean trobat = false;
        int numABuscar = 0;
        int pos = 0;
        int taula[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Introdueix el número a buscar: ");
        numABuscar = teclat.nextInt();

        while (pos < taula.length && trobat == false && taula[pos]<=numABuscar) { // trobat == false és el mateix que !trobat

            if (taula[pos] == numABuscar) {
                trobat = true;
            } else {
                pos++;
            }
        }

        if (trobat) { //trobat == true és el mateix que trobat
            System.out.printf("S'ha trobat el %d a la posició %d.", numABuscar, pos);
        } else {
            System.out.println("No trobat");
        }
    }
}
