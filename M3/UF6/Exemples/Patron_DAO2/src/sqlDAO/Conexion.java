/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author agustincintas
 */
public class Conexion {
    
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/Cine";
    //Nom de la nostra BBDD
    private final String userName = "agustin";
    private final String password = "Adminroot95";

    protected static Connection conex = null;

    public void conectar() throws Exception {

        try {
            Class.forName(driver);

            conex = DriverManager.getConnection(url, userName, password);

        } catch (Exception e) {
            throw e;

        }
    }

    public void desconectar() throws SQLException {

        if (conex != null) {
            if (!conex.isClosed()) {
                conex.close();

            }
        }

    }
    
}
