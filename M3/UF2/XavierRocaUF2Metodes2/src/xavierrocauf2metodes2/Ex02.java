/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes2;

import static xavierrocauf2metodes2.Util.llegirInt;

/**
 *
 * @author usuari Llegir un nombre i imprimiu la seva arrel quadrada . Si el
 * nombre és menor que 0 retorneu el número -1. (Utilitzeu Math.sqrt())
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num = 0;
        double resu;

        
        num = llegirInt("Escriu un número:");
        resu = arrelQuadrada(num);
        System.out.printf("L'arrel quadrada és %.1f\n", resu);

    }

    /**
     * Et calcula l'arrel quadrada d'un valor int
     * @param v1 es el valor que l'hi dones per calcular
     * @return el valor de l'arrel quadrada
     */
    
    public static double arrelQuadrada(int v1) {

        double resultat;

        if (v1 < 0) {
            resultat = -1;
        } else {
            resultat = Math.sqrt(v1);
        }

        return resultat;
    }

}
