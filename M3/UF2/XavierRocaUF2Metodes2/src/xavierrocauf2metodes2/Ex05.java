/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf2metodes2;

import java.util.Scanner;
import static xavierrocauf2metodes2.Util.llegirInt;

/**
 *
 * @author usuari Es vol seleccionar un atleta per a una marató internacional,
 * per seleccionar aquest ha d'haver acabat la marató anterior , en un temps
 * determinat . Els temps són 150 minuts per a homes menors de 40 anys; 175
 * minuts per a homes amb una edat major o igual a 40 anys i 180 minuts per a
 * dones. Les dades a introduir (llegir ) són : Sexe , Edat i temps efectuat en
 * el seu marató anterior . Feu mètodes per a demanar dades i per a esbrinar si
 * són aptes per la marató internacional.
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int temps = 0, edat = 0, sexe = 0;
        boolean participant;
        
        sexe = llegirInt("1.Home o 2.Dona:");        
        temps = llegirInt("Temps (en minuts):");        
        edat = llegirInt("Edat:");

        participant = apte(sexe, temps, edat);

        if (participant) {
            System.out.println("Apte");
        } else {
            System.out.println("No apte");
        }

    }

    /**
     * Et calculca la boolean de si es apte o no
     * @param v1 sexe
     * @param v2 temps
     * @param v3 edat
     * @return true o false
     */
    
    
    public static boolean apte(int v1, int v2, int v3) {

        boolean participant = true;

        if (v1 == 1) {
            if (v3 < 40) {
                if (v2 < 150) {
                    participant = true;
                } else {
                    participant = false;
                }
            } else if (v3 >= 40) {
                if (v2 < 175) {
                    participant = true;
                } else {
                    participant = false;
                }
            }
        } else {
            if (v2 < 180) {
                participant = true;
            } else {
                participant = false;
            }
        }

        return participant;

    }

}
