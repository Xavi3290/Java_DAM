/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author usuari
 */
public class BaseDAO {
    
    static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://127.0.0.1:3306/";
    static final String dbName = "Vaixells";                  //Nom de la nostra BBDD
    static final String userName = "xavi";     //cambiar
    static final String password = "xavi";

    protected static Connection conn = null;
    //  private static DataSource ds;

    public static void connect() {
        if (conn == null) {
            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url + dbName, userName, password);
            } catch (SQLException | ClassNotFoundException ex) {
                throw new ExceptionInInitializerError(ex);
            }
        }

    }

    public static Connection getConn() {
        return conn;
    }

    public static void close() throws SQLException {
        if (conn != null) {
            conn.close();
        }
        conn = null;
    }
    
    public static boolean ifExists(String sSQL, String nif) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(sSQL);
        ps.setString(1, nif);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }
    
    
}
