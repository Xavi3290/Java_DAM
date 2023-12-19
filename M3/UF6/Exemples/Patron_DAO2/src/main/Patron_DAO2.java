/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dao.PeliculaDAO;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import model.Director;
import model.Pelicula;
import model.Peliculas_Directores;
import sqlDAO.Conexion;
import sqlDAO.MySQLDirectorDAO;
import sqlDAO.MySQLPeliculaDAO;
import sqlDAO.MySQLPeliculas_DirectoresDAO;

/**
 *
 * @author agustincintas
 */
public class Patron_DAO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Conexion con = new Conexion();
        MySQLPeliculaDAO mp = new MySQLPeliculaDAO();
        MySQLDirectorDAO md = new MySQLDirectorDAO();
        MySQLPeliculas_DirectoresDAO mpd = new MySQLPeliculas_DirectoresDAO();
        con.conectar();

        Pelicula p1 = new Pelicula(8, "Spider-Man ", dameFecha("09/11/2001"), 160);
         Pelicula p4 = new Pelicula(4, "Diario de Noa", dameFecha("12/01/2009"), 180);
        Director p2 = new Director(5, "Steven");
        Director p3 = new Director(6, "Hernandez Hernandez");
        Director d1 = new Director(7, "Tim Burton");
        Director d2 = new Director(8, "Alex de la Vega");
        Director d3 = new Director(9, "Karim");
        
        Peliculas_Directores pd = new Peliculas_Directores();
        // mp.insertar(p4);
        System.out.println( md.insertar(d3));
      //   mp.modificar(p1);
     //    System.out.println(mp.insertar(p4));
     //   mpd.insertarPeliDirec(90,87);
       // mpd.modificarDir(p2.getId(), 2);
      //  mpd.insertarPeliDirec(p1.getId(), p2.getId());
      //  pd = mpd.obtener(p1.getId());
        
      //  mp.eliminar(p4);

        //   yk.ordenarPelisId();
        con.desconectar();

    }

    public static Date dameFecha(String txt) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String xfecha = txt;

        Date data;
        java.util.Date ndata = formato.parse(xfecha);

        data = new java.sql.Date(ndata.getTime());
        return data;

    }

}
