/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public class Ex18 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);
        Random rnd = new Random();

        int saldoEnCompte, quantitatATreure;

        saldoEnCompte = rnd.nextInt(1001);
        quantitatATreure = rnd.nextInt(1001);
        if (saldoEnCompte >= quantitatATreure) {
            System.out.printf("Petició acceptada, el teu saldo és %d i la quantitat que vols treure és %d \n", saldoEnCompte, quantitatATreure);
        } else {
            System.out.printf("Saldo insuficient, el teu saldo és %d i la quantitat que vols treure és %d \n", saldoEnCompte, quantitatATreure);
        }
    }

}
