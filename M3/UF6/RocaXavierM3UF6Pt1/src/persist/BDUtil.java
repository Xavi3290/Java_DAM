/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Categoria;
import model.Vaixell;

/**
 *
 * @author usuari
 */
public class BDUtil {
    
     public static void createEstructuraMysql() throws SQLException {

        BaseDAO.connect();
        Connection conn = BaseDAO.getConn();

        String query = "create table categoria (\n" +
        "id int,\n" +
        "nom varchar(50),\n" +
        "primary key(id)\n" +
        ");";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();

        query = "create table vaixells (\n" +
        "codi int,\n" +
        "nom varchar(50),\n" +
        "categoriaId int,\n" +
        "rating double,\n" +
        "club varchar(50),\n" +
        "tipus varchar(50),\n" +
        "senior boolean,\n" +
        "temps double,\n" +
        "primary key (codi)\n" +
        ");";
        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();

        query = "alter table vaixells\n" +
        "add foreign key (categoriaId) references categoria(id);";

        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
      

    }

    public static void netejaTaules() {

        BaseDAO.connect();
        Connection conn = BaseDAO.getConn();

        PreparedStatement stmt;
        try {
            String query = "delete from vaixells";
            stmt = conn.prepareStatement(query);
            stmt.executeUpdate();
            stmt.close();
            query = "delete from categoria";
            stmt = conn.prepareStatement(query);
            stmt.executeUpdate();           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void carregarDades() throws SQLException {

        try {
            createEstructuraMysql();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Base de dades ja creada");
        }

        netejaTaules();

        CategoriaDAO cDao = new CategoriaDAO();
        VaixellDAO vDao = new VaixellDAO();

        Categoria c = new Categoria(1, "Crussier");
        Categoria c2 = new Categoria(2, "Perfomance");
        Categoria c3 = new Categoria(3, "High Level");

        Vaixell v = new Vaixell(1, "Pegasus", c, 1.3, "BCN", "Regata", true, 2.90);
        Vaixell v2 = new Vaixell(2, "Lion", c2, 1.2, "MAT", "Creuer", false, 2.86);
        Vaixell v3 = new Vaixell(3, "Turtle", c3, 1.1, "VIL", "Creuer-Regata", false, 2.73);
        Vaixell v4 = new Vaixell(4, "Qilin", c2, 1.2, "MAT", "Creuer", true, 2.65);

        cDao.insert(c);
        cDao.insert(c2);
        cDao.insert(c3);

        vDao.insert(v);
        vDao.insert(v2);
        vDao.insert(v3);
        vDao.insert(v4);
        
        

    }
    
}
