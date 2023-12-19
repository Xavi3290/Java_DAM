/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocaexercici7strings;

/**
 *
 * @author usuari
 */
public class Ex07 {

    public static void main(String[] args) {

        String s1 = "Hola Mundo";
        String s2 = "hola mundo";

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareToIgnoreCase(s2));

        //El s1.equalsIgnoreCase(s2) et diu si les posicions son iguals amb un true o false ignoran les majuscules.
        //El  s1.compareToIgnoreCase(s2) et compara la cuantitat de caràcters que hi ha 
        //per això surt 0 perque tenen la mateixa quantitat de caràcters.
    }

}
