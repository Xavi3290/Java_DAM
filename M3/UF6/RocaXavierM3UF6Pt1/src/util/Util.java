/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Util {
    public static boolean isDouble(String txt) {
        boolean valido = true;
        txt.replace(',', '.');
        try{
            double valor = Double.parseDouble(txt);
            
        } catch (Exception e) {
            valido = false;
        }
        
        return valido;
    }

    public static boolean isInt(String txt) {

        boolean valido = true;
        
        try{
           int valor = Integer.parseInt(txt);
            
        } catch (Exception e) {
            valido = false;
        }
        
        return valido;

    }

    public static String llegirString(String txt) {
        Scanner teclat = new Scanner(System.in);

        String text = "";
        boolean estaEnPle = true;
        do {
            System.out.println(txt);
            text = teclat.nextLine();
            text = text.trim();
            if (text.length() == 0) {
                estaEnPle = false;
            }
        } while (!estaEnPle);

        return text;
    }

    public static boolean confirmacio(String txt) {
        Scanner teclat = new Scanner(System.in);

        String conf = "";
        boolean confi = true;
        do {
            conf = llegirString(txt);
            if(conf.equalsIgnoreCase("s")){                
                return confi;
            }else if(conf.equalsIgnoreCase("n")){
                confi = false;
                return confi;
            }
        } while (!conf.equalsIgnoreCase("s") | !conf.equalsIgnoreCase("n"));
        return confi;
    }
    
    
}
