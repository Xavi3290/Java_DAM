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

        String query = "CREATE TABLE PROPIETARIOS (DNI VARCHAR(10), Nombre VARCHAR(40), Edad INTEGER, UNIQUE KEY(DNI));";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();
        query = "CREATE TABLE COCHES (Matricula VARCHAR(10) , Marca VARCHAR(20), Precio INTEGER, DNI VARCHAR(10), UNIQUE KEY(Matricula), FOREIGN KEY (DNI) References PROPIETARIOS(DNI));";

        stmt = conn.prepareStatement(query);
        stmt.executeUpdate();
        stmt.close();

       
    }

    public static void netejaTaules() {
        BaseDAO.connect();
        Connection conn = BaseDAO.getConn();
        
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
    
}
