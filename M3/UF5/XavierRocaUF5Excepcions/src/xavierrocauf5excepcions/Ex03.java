/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf5excepcions;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            exepcio();
        } catch (ProvaError e) {
            System.out.println(e.toString());
            e.fillInStackTrace();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.fillInStackTrace();
        }
    }

    public static void exepcio() throws Exception, ProvaError {

        Scanner teclat = new Scanner(System.in);
        // ProvaError er = new ProvaError("Número entre 5 i 10");

        int num;
        System.out.println("Digues un numero:");
        num = teclat.nextInt();
        if (num > 10) {
            throw new Exception("Error, número mes gran que 10");
        } else if (num <= 10 && num >= 5) {
            throw new ProvaError("Número entre 5 i 10");
        } else {
            throw new Exception("Error, número mes petit que 5");
        }
    }
}
