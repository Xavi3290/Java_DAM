/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocautil;

/**
 *
 * @author usuari
 */
public class XavierRocaUtil {

    /**
     * @param args the command line arguments
     */
    public static boolean buscarNumArr(int[] v1, int v2) {

        boolean trobat = false;

        for (int i = 0; i < v1.length; i++) {
            if (v2 == v1[i]) {
                trobat = true;
            }
        }

        return trobat;
    }
    
}
