/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf6.dao;

import java.util.ArrayList;
import persist.*;
import model.*;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int count;
        //Connexió a BBDD simple
        try {

//            BDUtil.createEstructuraMysql();
            BDUtil.netejaTaules();

            CocheDAO coDao = new CocheDAO();
            PropietariDAO proDao = new PropietariDAO();

            //            insertaPropietari("1A","Pepe",30);
//            insertaPropietari("1B","Ana",40);
//            insertaPropietari("1C","Maria",50);
//            insertaCoches("MA-1111","Opel",1000,"1A");
//            insertaCoches("MA-2222","Renault",2000,"1A");
//            insertaCoches("BA-3333", "Seat", 3000,"1B");
//            insertaCoches("ww-1111", "FIat", 2000, "5s");
            // insertem propietari
            Propietari pro = new Propietari("1A", "Pepe", 30);
            Propietari pro2 = new Propietari("1B", "Ana", 40);
            Propietari pro3 = new Propietari("1C", "Maria", 50);
            count = proDao.insert(pro);
            System.out.println("Inserted count: " + count);
            count = proDao.insert(pro2);
            System.out.println("Inserted count: " + count);
            count = proDao.insert(pro3);
            System.out.println("Inserted count: " + count);

            //inserrtem coches
            Coche co = new Coche("MA-1111", "Opel", 1000, pro);
            Coche co2 = new Coche("MA-2222", "Renault", 2000, pro);
            Coche co3 = new Coche("BA-3333", "Seat", 3000, pro2);
            Coche co4 = new Coche("WW-1111", "Fiat", 2000, pro3);
            count = coDao.insert(co);
            System.out.println("Inserted count: " + count);
            count = coDao.insert(co2);
            System.out.println("Inserted count: " + count);
            count = coDao.insert(co3);
            System.out.println("Inserted count: " + count);
            count = coDao.insert(co4);
            System.out.println("Inserted count: " + count);

            System.out.println("-----------------------------");

            Propietari pro01 = proDao.getPropietari("1A");
            System.out.println(pro01.toString());
            Propietari pro02 = proDao.getPropietari("1B");
            System.out.println(pro02.toString());

            System.out.println("--------------------------");

            System.out.println(pro.toString());
            System.out.println(pro2.toString());
            System.out.println(pro3.toString());

            System.out.println("----------------------Dni Propietario mostra dades");

            ArrayList<Coche> coches = coDao.getCocheDniPropietario("1A");
            System.out.println(coches.toString());
            coches = coDao.getCocheDniPropietario("1B");
            System.out.println(coches.toString());

            System.out.println("------------------Dni que no existeix");
            Propietari pro11 = new Propietari("9A", "Fran", 20);
            Coche co01 = new Coche("WW-2222", "Peugeot", 2000, pro11);
            count = coDao.insert(co01);
            System.out.println("Inserted count: " + count);

            System.out.println("----------------------");

            pro3.setNom("Luisa");
            count = proDao.update(pro3);
            System.out.println("Update count: " + count);
            System.out.println(pro3.toString());

            System.out.println("------------- borrar");
            
            count = proDao.delete("1C");
            System.out.println("Delete count: " + count);

            proDao.close();
            coDao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
