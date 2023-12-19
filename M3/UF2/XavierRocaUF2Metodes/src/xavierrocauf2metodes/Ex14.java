/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes;

import java.util.Scanner;
import static xavierrocauf2metodes.Util.llegirInt;

/**
 *
 * @author Xavi Realitzar un mètode que se li passi com a paràmetre un vector
 * que ha d'omplir. Es llegirà per teclat una sèrie de nombres: ens guardem
 * només els parells i ignorem els senars.
 */
public class Ex14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        int x = 0;

        System.out.println("Diguem de quina allargada vols que sigui el teu vector");
        x = llegirInt(x);

        int[] vector = new int[x];
        vector = ompleVectorPar(vector);
        for (int i = 0; i < vector.length; i++) {
            System.out.printf("%2d", vector[i]);
        }

    }

    public static int[] ompleVectorPar(int[] vector) {

        Scanner teclat = new Scanner(System.in);

        int num = 0, pos = 0;

       /* for (int i = 0; i < vector.length; i++) {
            System.out.println("Diguem un número");
            num = llegirInt(num);
            if (num % 2 == 0) {
                vector[i] = num;
            }else {
                vector[i] = 0;
            }
        }
           */
       
       while (pos >vector.length){
           System.out.println("Posa un número");
           num = llegirInt(num);
           if(num % 2 == 0){
               vector[pos] = num;
               pos++;
           }else{
               System.out.println("Es senar");
           }               
                         
       }
                                                              
        return vector;

    }

}
