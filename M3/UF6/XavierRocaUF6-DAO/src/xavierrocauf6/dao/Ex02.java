/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf6.dao;

import java.time.LocalDate;
import java.time.Month;
import persist2.*;
import model2.*;

/**
 *
 * @author usuari
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int count;

        try {
            //   BDUtil.createEstructuraMysql();      
            BDUtil.netejaTaules();

            DirectorDAO dirDao = new DirectorDAO();
            PeliculaDAO pelDao = new PeliculaDAO();
            PeliculasDirectoresDAO pelDirDao = new PeliculasDirectoresDAO();

            Pelicula p1 = new Pelicula(1, "El Resplandor", LocalDate.of(2001, 11, 9), 160);
            Pelicula p2 = new Pelicula(3, "Casablanca", LocalDate.of(2009, 12, 1), 180);
            Pelicula p3 = new Pelicula(4, "Prueba", LocalDate.of(2010, 10, 15), 130);
            Pelicula p4 = new Pelicula(5, "Borrame Facil", LocalDate.of(2020, 9,14 ), 140);

            Director d1 = new Director(1, "Michael Curtis");
            Director d2 = new Director(2, "Stanley Kubrik");

            PeliculasDirectores pd1 = new PeliculasDirectores(1, 1);
            PeliculasDirectores pd2 = new PeliculasDirectores(3, 2);
            PeliculasDirectores pd3 = new PeliculasDirectores(4, 1);
            PeliculasDirectores pd4 = new PeliculasDirectores(4, 2);

            System.out.println("Insertar pelicules");
            count = pelDao.insert(p1);
            System.out.println("Inserted count: " + count);
            count = pelDao.insert(p2);
            System.out.println("Inserted count: " + count);
            count = pelDao.insert(p3);
            System.out.println("Inserted count: " + count);
            count = pelDao.insert(p4);
            System.out.println("Inserted count: " + count);

            System.out.println("Insertar directores");
            count = dirDao.insert(d1);
            System.out.println("Inserted count: " + count);
            count = dirDao.insert(d2);
            System.out.println("Inserted count: " + count);

            System.out.println("Insertar peliculasDirectores");
            count = pelDirDao.insert(pd1);
            System.out.println("Inserted count: " + count);
            count = pelDirDao.insert(pd2);
            System.out.println("Inserted count: " + count);
            count = pelDirDao.insert(pd3);
            System.out.println("Inserted count: " + count);
            count = pelDirDao.insert(pd4);
            System.out.println("Inserted count: " + count);

            System.out.println("\nOrdenar peliculas por id\n");
            System.out.println(pelDao.mostrarOrdenadesId().toString());

            System.out.println("\nMostra el director de una peli, pasant la id de la peli\n");
            System.out.println(dirDao.getDirectorPerIdPelicula(1).toString());

            System.out.println("Eliminar pelicula");
            count = pelDao.delete(1);
            System.out.println("Deleted count: " + count);
            
            System.out.println("\nModificar director\n");
            d2.setNombre("Nolan");
            count = dirDao.update(d2);
            System.out.println("Updated count: " + count);
            System.out.println(dirDao.getDirector(2));
            

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}
