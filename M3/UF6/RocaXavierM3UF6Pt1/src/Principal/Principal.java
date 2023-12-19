/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

import persist.*;
import controler.*;
import java.sql.SQLException;

/**
 *
 * @author usuari
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        
        try {
            try {
                BDUtil.carregarDades();
            } catch (Exception e) {
                System.out.println(e.toString());
                e.printStackTrace();
            }

            LlistaCtl llctl = new LlistaCtl();

        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

    }

    

}
