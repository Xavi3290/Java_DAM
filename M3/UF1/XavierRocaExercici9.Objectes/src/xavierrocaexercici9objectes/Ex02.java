/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici9objectes;

import java.util.Scanner;

/**
 *
 * @author usuari
 * Desenvolupeu un programa que defineixi un tipus  Cotxe  i utilitzi una variable
d'aquest tipus per a llegir les dades d'un cotxe amb els camps: marca, model,
matricula, cilindrada i potència. Després haurà de mostrar en línies diferents el
cotxe amb més cilindrada i el de més potència. (No utilitzar vectors)
 */
public class Ex02 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        Cotxe cilMax = new Cotxe();
        Cotxe potMax = new Cotxe();
        int num;

        System.out.println("Quantes vegades vols repetir el procés");
        num = teclat.nextInt();
        teclat.nextLine();
        for (int i = 0; i < num; i++) {
            Cotxe cot = new Cotxe();
            System.out.println("Quina marca és:");
            cot.marca = teclat.nextLine();
            System.out.println("Quin model és:");
            cot.model = teclat.nextLine();
            System.out.println("Quina matricula te:");
            cot.matricula = teclat.nextLine();
            System.out.println("Quina cilindrada és:");
            cot.cilindrada = teclat.nextDouble();
            if (cilMax.cilindrada < cot.cilindrada) {
                cilMax = cot;
            }
            System.out.println("Quina potència te:");
            cot.potencia = teclat.nextDouble();
            teclat.nextLine();
            if (potMax.potencia < cot.potencia) {
                potMax = cot;
            }
        }
        System.out.printf("Marca: %s\nModel: %s\nMatricula: %s\nCilindrada: %.1f\nPotència: %.1f\n", cilMax.marca, cilMax.model, cilMax.matricula, cilMax.cilindrada, cilMax.potencia);
        System.out.printf("Marca: %s\nModel: %s\nMatricula: %s\nCilindrada: %.1f\nPotència: %.1f\n", potMax.marca, potMax.model, potMax.matricula, potMax.cilindrada, potMax.potencia);

    }

}
