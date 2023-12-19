/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocaexercici9objectes;

import java.util.Scanner;

/**
 *
 * @author usuari
 * Llegir en un registre les dades de temperatura, humitat i pressió registrades al
llarg d'un a sèrie indefinida de mesures i després mostrar totes les dades de la
que tingui la temperatura màxima. En cas de temperatures repetides ha de
mostrar el registre que es va llegir primer. (No utilitzar vectors)
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        
     //   Clima dadesle;    
        Clima tempMax = new Clima();
        tempMax.temperatura = -1000;
        int num;

        System.out.println("Quantes vegades vols repetir el procés");
        num = teclat.nextInt();
        for (int i = 0; i < num; i++) {
            Clima clima = new Clima();
            System.out.println("Diguem la temperatura:");
            clima.temperatura = teclat.nextDouble();
            System.out.println("Diguem la pressió:");
            clima.pressio = teclat.nextDouble();
            System.out.println("Diguem la humitat:");
            clima.humitat = teclat.nextDouble();
            if (tempMax.temperatura < clima.temperatura) {
                tempMax = clima;
            }

        }
        System.out.println("Temperatura: " + tempMax.temperatura + "\nPressió: " + tempMax.pressio + "\nHumitat: " + tempMax.humitat);

    }

}
