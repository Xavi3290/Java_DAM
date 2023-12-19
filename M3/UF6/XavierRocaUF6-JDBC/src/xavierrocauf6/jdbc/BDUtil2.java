/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf6.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author usuari
 */
public class BDUtil2 {
    
    public static void createEstructuraMysql(Connection conn) throws SQLException {

        String query = " create table peliculas (\n" +
"        id int,\n" +
"        titulo varchar(50),\n" +
"        fechaEstreno date,\n" +
"        duracion int,\n" +
"        primary key (id)\n" +
"        );";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        
        query = "create table directores(\n" +
"        id int,\n" +
"        nombre varchar(50),\n" +
"        primary key (id)\n" +
"        );";
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();

        query = "create table peliculas_directores(\n" +
        "pelicula_id int,\n" +
        "director_id int,\n" +
        "primary key (pelicula_id, director_id)\n" +
        ");";
       
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        
        query ="alter table peliculas_directores\n" +
        "add foreign key (pelicula_id) references peliculas(id),\n" +
        "add foreign key (director_id) references directores(id);";
        
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
       
    }

    public static void netejaTaules(Connection conn) {
        PreparedStatement stmt;
        try {
            String query = "delete from peliculas";
            stmt = conn.prepareStatement(query);
            stmt.executeUpdate();
            stmt = conn.prepareStatement("delete from directores");
            stmt.executeUpdate();
            stmt.close();
            stmt = conn.prepareStatement("delete from peliculas_directores");
            stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//        create table peliculas (
//        id int,
//        titulo varchar(50),
//        fechaEstreno date,
//        duracion int,
//        primary key (id)
//        );
//
//        create table directores(
//        id int,
//        nombre varchar(50),
//        primary key (id)
//        );
//
//        create table peliculas_directores(
//        pelicula_id int,
//        director_id int,
//        primary key (pelicula_id, director_id)
//        );
//
//        alter table peliculas_directores
//        add foreign key (pelicula_id) references peliculas(id),
//        add foreign key (director_id) references directores(id);