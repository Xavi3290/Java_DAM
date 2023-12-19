/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocape1uf2;

import java.util.Scanner;
import static xavierrocape1uf2.Util.llegirDouble;
import static xavierrocape1uf2.Util.llegirInt;

/**
 *
 * @author usuari
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int eleccio;
        double conversio, num;
        do {
            do {
                eleccio = llegirInt("\nConvertir\n1- Polsades\n2- Centimetres");
            } while (eleccio != 1 && eleccio != 2);
            num = llegirDouble("Posa el número: ");
            conversio = conversioCmPulsades(eleccio, num);
            System.out.printf("La conversió dona %.2f", conversio);
        } while (num > 0);
    }

    /**
     * Fa la conversio entre centimetres i polsadas
     *
     * @param eleccio 1 polsades a centimentres, 2 centimetres a polsades
     * @param num numero a fer la conversio
     * @return la conversio feta
     */
    public static double conversioCmPulsades(int eleccio, double num) {

        final double POL = 2.54;
        double total;
        if (eleccio == 1) {            
            total = num * POL;
        } else {           
            total = num / POL;
        }
        return total;
    }
}
