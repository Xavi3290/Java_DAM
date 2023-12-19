/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objetos1;

/**
 *
 * @author usuari
 */
public class EuroDolar {

    private static final double E_TO_DO = 1.20;

    public static void conversioDolarToEuro(double dolar) {
            
        double con;
        con = dolar / E_TO_DO;
        System.out.printf("%.2f dolars són %.2f euros\n", dolar, con);
    }
    
    /*
    millor fer-ho així
    public static double conversioDolarToEuro(double dolar){
        return dolar / E_TO_DO;
    }
    */
    public static void conversioEuroToDolar(double euro) {
        double con;
        con = euro * E_TO_DO;
        System.out.printf("%.2f euros són %.2f dolars\n", euro, con);
    }
}
