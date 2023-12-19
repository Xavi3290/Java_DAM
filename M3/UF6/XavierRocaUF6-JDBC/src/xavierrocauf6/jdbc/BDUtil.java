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
public class BDUtil {
    
     public static void createEstructuraMysql(Connection conn) throws SQLException {

        String query = "CREATE TABLE PROPIETARIOS (DNI VARCHAR(10), Nombre VARCHAR(40), Edad INTEGER, UNIQUE KEY(DNI));";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        query = "CREATE TABLE COCHES (Matricula VARCHAR(10) , Marca VARCHAR(20), Precio INTEGER, DNI VARCHAR(10), UNIQUE KEY(Matricula), FOREIGN KEY (DNI) References PROPIETARIOS(DNI));";

        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();

       
    }

    public static void netejaTaules(Connection conn) {
        PreparedStatement stmt;
        try {
            String query = "delete from PROPIETARIOS";
            stmt = conn.prepareStatement(query);
            stmt.executeUpdate();
            stmt = conn.prepareStatement("delete from COCHES");
            stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public static void createEstructuraPosgreSql(Connection conn) throws SQLException {
//        PreparedStatement stmt;
//        String query = "CREATE TABLE public.publisher "
//                + "(code integer NOT NULL, "
//                + " name text COLLATE pg_catalog.\"default\","
//                + " address text COLLATE pg_catalog.\"default\", "
//                + " CONSTRAINT publisher_pkey PRIMARY KEY (code)"
//                + ")";
//        stmt = conn.prepareStatement(query);
//        stmt.executeUpdate();
//        stmt.close();
//        query = "CREATE TABLE public.book "
//                + "(isbn text COLLATE pg_catalog.\"default\" NOT NULL,"
//                + " book_name text COLLATE pg_catalog.\"default\","
//                + " publisher_code integer, publish_date date, price integer,"
//                + " CONSTRAINT book_pkey PRIMARY KEY (isbn),"
//                + " CONSTRAINT book_publisher_code_fkey FOREIGN KEY (publisher_code)"
//                + " REFERENCES public.publisher (code) MATCH SIMPLE"
//                + " ON UPDATE NO ACTION ON DELETE NO ACTION"
//                + ")";
//
//        stmt = conn.prepareStatement(query);
//        stmt.executeUpdate();
//        stmt.close();
//
//        query = "CREATE TABLE public.chapter"
//                + "( num integer NOT NULL,"
//                + "  title text COLLATE pg_catalog.\"default\", numpages integer, "
//                + "  book_isbn text COLLATE pg_catalog.\"default\", "
//                + " CONSTRAINT chapter_pkey PRIMARY KEY (num), "
//                + " CONSTRAINT chapter_book_isbn_fkey FOREIGN KEY (book_isbn) "
//                + " REFERENCES public.book (isbn) MATCH SIMPLE "
//                + " ON UPDATE NO ACTION ON DELETE NO ACTION"
//                + ")";
//        stmt = conn.prepareStatement(query);
//        stmt.executeUpdate();
//        stmt.close();
//    }
}
