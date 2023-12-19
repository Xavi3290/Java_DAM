/*
 * Ordena una taula de forma ascendent
 */
package ordenacions;

import java.util.Scanner;

/**
 *
 * @author Francesca
 */
public class ordenacioBombolla {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        boolean ordenat = false;
        int taula[] = {2, 5, 3, 8, 9, 0};
        int voltes = taula.length - 1, aux = 0;

        while (voltes > 0 && ordenat == false) {
            ordenat = true;
            for (int i = 0; i < taula.length; i++) {
                System.out.print(taula[i] + " ");
            }
            System.out.println("");
            for (int pos = 0; pos < voltes; pos++) {

                if (taula[pos] > taula[pos + 1]) {
                    aux = taula[pos];
                    taula[pos] = taula[pos + 1];
                    taula[pos + 1] = aux;
                    ordenat = false;
                }
            }
            voltes--;
        }

        for (int i = 0; i < taula.length; i++) {
            System.out.print(taula[i] + " ");

        }

    }
}
