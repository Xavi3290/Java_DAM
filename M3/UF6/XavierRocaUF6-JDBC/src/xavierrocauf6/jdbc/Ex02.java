/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xavierrocauf6.jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.text.*;

/**
 *
 * @author usuari
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://127.0.0.1:3306/";
    static final String dbName = "Cine";                  //Nom de la nostra BBDD
    static final String userName = "xavi";     //cambiar
    static final String password = "xavi";

    private static Connection conn = null;

    public static void main(String[] args) {
        // TODO code application logic here

        try {

            Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName, userName, password);

              BDUtil2.createEstructuraMysql(conn);
            //  mostraPelis();
            // insertaPelis(4,"Titanic",dameFecha("06/09/2000"),180);
            // insertaDirector(2,"Tim Burton");
            // insertaPeliDirector(4,4);
            //      nomDirector(2);
            //   esborrarPeli(4);
//          insertaPeliDirector(2,3);
//          insertaPeliDirector(2,4);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static boolean ifExists(String sSQL, String nif) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(sSQL);
        ps.setString(1, nif);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public static boolean ifExists(String sSQL, int nId) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(sSQL);
        ps.setInt(1, nId);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    public static void mostraPelis() throws SQLException, ClassNotFoundException {

        PreparedStatement stm;
        ResultSet result;
        String query = "SELECT * FROM Peliculas order by id asc";
        stm = conn.prepareStatement(query);
        result = stm.executeQuery();

        while (result.next()) {
            System.out.println("ID: " + result.getInt("id"));
            System.out.println("Titulo: " + result.getString("titulo"));
            System.out.println("FechaEstreno: " + result.getDate("fechaEstreno"));
            System.out.println("Duracion: " + result.getInt("duracion"));
            System.out.println();
        }
        result.close();
        stm.close();
    }

    public static void insertaPelis(int id, String title, Date fecha, int dura) throws SQLException {

        PreparedStatement stm;

        String query = "INSERT INTO Peliculas(id,titulo,fechaEstreno,duracion) values (?,?,?,?)";

        stm = conn.prepareStatement(query);
        stm.setInt(1, id);
        stm.setString(2, title);
        stm.setDate(3, fecha);
        stm.setInt(4, dura);

        int cont = stm.executeUpdate();

        System.out.println("Inserted peli count: " + cont);
        stm.close();

    }

    public static void insertaDirector(int id, String name) throws SQLException {

        PreparedStatement stm;

        String query = "INSERT INTO Directores(id,nombre) values (?,?)";

        stm = conn.prepareStatement(query);
        stm.setInt(1, id);
        stm.setString(2, name);

        int cont = stm.executeUpdate();

        System.out.println("Inserted director count: " + cont);
        stm.close();

    }

    public static Date dameFecha(String txt) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String xfecha = txt;

        Date data;
        java.util.Date ndata = formato.parse(xfecha);

        data = new java.sql.Date(ndata.getTime());
        return data;

    }

    public static void insertaPeliDirector(int peliid, int director_id) throws SQLException {

        PreparedStatement stm;

        String query = "INSERT INTO peliculas_directores values(?,?)";
        stm = conn.prepareStatement(query);
        stm.setInt(1, peliid);
        stm.setInt(2, director_id);

        int cont = stm.executeUpdate();

        System.out.println("Inserted peli_director count: " + cont);
        stm.close();

    }

    public static void nomDirector(int idPeli) throws SQLException {

        PreparedStatement stm;
        ResultSet rs;
        String query = "SELECT d.Nombre FROM Cine.peliculas_directores pd\n"
                + "inner join Cine.directores d on pd.director_id = d.id\n"
                + "where pd.pelicula_id=?";

        stm = conn.prepareStatement(query);
        stm.setInt(1, idPeli);
        rs = stm.executeQuery();

        while (rs.next()) {
            System.out.println("Nom director: " + rs.getString("nombre"));
        }
        rs.close();
        stm.close();

    }

    public static void esborrarPeli(int nId) throws SQLException {
        String sql = "DELETE FROM Peliculas WHERE id = ?";
        String query = "DELETE FROM peliculas_directores WHERE pelicula_id = ?";
        try {

            PreparedStatement stmt = conn.prepareStatement(sql);

            PreparedStatement myStat = conn.prepareStatement(query);
            if (ifExists("select * FROM peliculas_directores where pelicula_id = ?", nId)) {

                stmt.setInt(1, nId);

                myStat.setInt(1, nId);

            } else {
                System.out.println("No existeix la pelicula");
            }
            int count = stmt.executeUpdate();
            int cont = myStat.executeUpdate();

            System.out.println("Deleted count: " + count + cont);
            stmt.close();
            myStat.close();

        } catch (Exception e) {
            System.out.println(e.toString());

        }

    }

    public static void insertaDosDirectors(int idPeli, int idDirector, String nDirector, int idDosDirec, String nDosDirec) throws SQLException {

        PreparedStatement stm;

        String xQuery = "INSERT INTO directores (id,nombre) values (?,?)";
        String nQuery = "INSERT INTO peliculas_directores (pelicula_id,director_id) values(?,?)";

        stm = conn.prepareStatement(xQuery);
        stm.setInt(1, idDirector);
        stm.setString(2, nDirector);

        stm = conn.prepareStatement(xQuery);
        stm.setInt(1, idDosDirec);
        stm.setString(2, nDosDirec);

        stm = conn.prepareStatement(nQuery);
        stm.setInt(1, idPeli);
        stm.setInt(2, idDirector);

        stm = conn.prepareStatement(nQuery);
        stm.setInt(1, idPeli);
        stm.setInt(2, idDosDirec);

        int cont = stm.executeUpdate();

        System.out.println("Inserted peli count: " + cont);
        stm.close();

    }

}
