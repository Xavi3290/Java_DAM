/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persist;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author usuari
 */
public class BDUtil {
    
    public static void createEstructuraMysql() throws SQLException {

        BaseDAO.connect();
        Connection conn = BaseDAO.getConn();

        String query = "create table pokemon(\n" +
        "codi int,\n" +
        "nom varchar(50),\n" +
        "nivell int,\n" +
        "tipus varchar(50),\n" +
        "altura double,\n" +
        "primary key (codi)\n" +
        ")";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();


    }

    public static void netejaTaules() {

        BaseDAO.connect();
        Connection conn = BaseDAO.getConn();

        PreparedStatement stmt;
        try {
            stmt = conn.prepareStatement("delete from pokemon");
            stmt.executeUpdate();
            stmt.close();          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
