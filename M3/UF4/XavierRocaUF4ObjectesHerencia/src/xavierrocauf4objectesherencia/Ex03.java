/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf4objectesherencia;

import static xavierrocauf4objectesherencia.util.llegirInt;

/**
 *
 * @author usuari
 */
public class Ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int menu;
        do{
        menu = llegirInt("1-Numero clients actuals\n2-Numero clients >65\n3-Calories a prendre\n4-Mostrar informacio\n5-Mostrar informacio total\n6-Donar d'alta\n7-Donar de baixa\n8-Sortir");
        switch(menu){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                System.out.println("Adeu");
                break;
            default:                
                break;
        }
        }while(menu != 8);       
    }
    
}
