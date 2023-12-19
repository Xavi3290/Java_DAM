/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf5excepcions;

/**
 *
 * @author usuari
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            error1();
        } catch (ArithmeticException e) {
            System.out.println("No es pot dividir entre 0, MAIN");
            e.printStackTrace();
        }

    }

    public static void error1() {
        try {
            error2();
        } catch (NullPointerException e) {
            System.out.println("El objecte es null, ERROR 1");
            e.printStackTrace();
        }
    }

    public static void error2() {
        error3();
    }

    public static void error3() {
        Object a = null;
      //  a.toString();           //Si ho comento falla el error ho catpura el main, sino o captura el error1
        int x = 5 / 0;
        
    }
}
