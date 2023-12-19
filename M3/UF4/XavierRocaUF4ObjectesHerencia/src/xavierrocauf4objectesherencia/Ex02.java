/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf4objectesherencia;

/**
 *
 * @author usuari
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tenda t = new Tenda("Corte Ingles");
        Rentadora ele = new Rentadora(4, "Siemens", 100, 40, 250);
        Rentadora ele2 = new Rentadora(7, "Siemens1", 100, 40, 250);
        Televisor ele3 = new Televisor(30, "Siemens2", 100, 40, 250);
        Televisor ele4 = new Televisor(55, "Siemens3", 100, 40, 250);
        TelevisorTDT ele5 = new TelevisorTDT(100, 30, "Siemens4", 100, 40, 250);
        TelevisorTDT ele6 = new TelevisorTDT(100, 55, "Siemens5", 100, 40, 250);
        Electrodomestic ele7 = new Electrodomestic("Siemens6", 100, 40, 250);
        Electrodomestic ele8 = new Electrodomestic("Siemens7", 100, 40, 250);

        t.afegirElectrodomestic(ele);
        t.afegirElectrodomestic(ele2);
        t.afegirElectrodomestic(ele3);
        t.afegirElectrodomestic(ele4);
        t.afegirElectrodomestic(ele5);
        t.afegirElectrodomestic(ele6);
        t.afegirElectrodomestic(ele7);
        t.afegirElectrodomestic(ele8);

        t.dades();

    }

}
