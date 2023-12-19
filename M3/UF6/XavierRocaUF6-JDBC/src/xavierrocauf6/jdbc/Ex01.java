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
import model.Coche;
import model.Propietari;

/**
 *
 * @author usuari
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    static final String driver = "com.mysql.cj.jdbc.Driver";
    static final String url = "jdbc:mysql://127.0.0.1:3306/";
    static final String dbName = "DatosCoches";                  //Nom de la nostra BBDD
    static final String userName = "xavi";     //cambiar
    static final String password = "xavi";

    private static Connection conn = null;

    public static void main(String[] args) {
        // TODO code application logic here

        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);

            if (!conn.isClosed()) {
                System.out.println("Database connection is working using TCP/IP ...");
            } else {
                System.out.println("Error");
                System.exit(0);
            }

//            BDUtil.createEstructuraMysql(conn);
//        BDUtil.netejaTaules(conn);
//            insertaPropietari("1A","Pepe",30);
//            insertaPropietari("1B","Ana",40);
//            insertaPropietari("1C","Maria",50);
//            insertaCoches("MA-1111","Opel",1000,"1A");
//            insertaCoches("MA-2222","Renault",2000,"1A");
//            insertaCoches("BA-3333", "Seat", 3000,"1B");
//            insertaCoches("ww-1111", "FIat", 2000, "5s");
            consultaPropietari("1B");
//            esborraPropietari("1A");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

//     query = "INSERT INTO PROPIETARIOS values('1A','Pepe',30);\n"
//                + "INSERT INTO PROPIETARIOS values('1B','Ana',40);\n"
//                + "INSERT INTO PROPIETARIOS values('1C','Maria',50);\n"
//                + "INSERT INTO COCHES values('MA-1111','Opel',1000,'1A');\n"
//                + "INSERT INTO COCHES values('MA-2222','Renault',2000,'1A');\n"
//                + "INSERT INTO COCHES values('BA-3333', 'Seat', 3000,'1B');";
//        stmt = conn.prepareStatement(query);
//        stmt.executeUpdate();
//        stmt.close();
    private static void esborraPropietari(String dni) throws SQLException {
        String sql = "DELETE FROM PROPIETARIOS WHERE DNI = ?";
        String sql2 = "delete from COCHES where DNI = ?";
        try {
            if (ifExists("SELECT * FROM PROPIETARIOS WHERE DNI = ?;", dni)) {
                PreparedStatement stmt = conn.prepareStatement(sql);
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt.setString(1, dni);
                stmt2.setString(1, dni);

                int count = stmt.executeUpdate();
                int count2 = stmt2.executeUpdate();

                System.out.println("Deleted PROPIETARI: " + count + count2);
                stmt.close();
            } else {
                System.out.println("\nNo existeix el DNI\n");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    private static void insertaPropietari(String dni, String nom, int edat) throws SQLException {
        String sql = "INSERT INTO PROPIETARIOS (dni, Nombre, Edad) VALUES (?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, dni);
        stmt.setString(2, nom);
        stmt.setInt(3, edat);

        int count = stmt.executeUpdate();

        System.out.println("Inserted PROPIETARI count: " + count);
        stmt.close();
    }

    private static void insertaCoches(String matricula, String marca, int preu, String dni) throws SQLException {

        if (ifExists("SELECT * FROM COCHES WHERE DNI = ?;", dni)) {

            String sql = "INSERT INTO COCHES (Matricula, Marca, Precio, DNI) VALUES (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, matricula);
            stmt.setString(2, marca);
            stmt.setInt(3, preu);
            stmt.setString(4, dni);

            int count = stmt.executeUpdate();
            System.out.println("Inserted COCHE count: " + count);
            stmt.close();
        } else {
            System.out.println("\nNo existeix el DNI\n");
        }

    }

    private static void consultaPropietari(String dni) throws SQLException, ClassNotFoundException {

        //Exemple d'una consulta senzilla
        PreparedStatement stmt;
        ResultSet rs;

        String query = "SELECT * FROM DatosCoches.PROPIETARIOS inner join DatosCoches.COCHES on COCHES.DNI = PROPIETARIOS.DNI WHERE COCHES.DNI = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, dni);
        rs = stmt.executeQuery();

        while (rs.next()) {
            System.out.println("DNI: " + rs.getString("DNI"));
            System.out.println("Nom: " + rs.getString("Nombre"));
            System.out.println("Edat: " + rs.getString("Edad"));

            System.out.println("Matriucla: " + rs.getString("Matricula"));
            System.out.println("Marca: " + rs.getString("Marca"));
            System.out.println("Preu: " + rs.getString("Precio"));

            System.out.println();
        }
        rs.close();
        stmt.close();
    }

    private static void consultaCotche(String dni) throws SQLException, ClassNotFoundException {

        //Exemple d'una consulta senzilla
        PreparedStatement stmt;
        ResultSet rs;

        String query = "SELECT * FROM COCHES WHERE DNI = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, dni);
        rs = stmt.executeQuery();

        while (rs.next()) {
            System.out.println("Matriucla: " + rs.getString("Matricula"));
            System.out.println("Marca: " + rs.getString("Marca"));
            System.out.println("Preu: " + rs.getString("Precio"));
            System.out.println("Dni: " + rs.getString("DNI"));

            System.out.println();
        }
        rs.close();
        stmt.close();
    }

    public static boolean ifExists(String sSQL, String nif) throws SQLException {
        PreparedStatement ps = conn.prepareStatement(sSQL);
        ps.setString(1, nif);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

//    private static void insertaCoche(String matricula, String marca, int preu, String dni) throws SQLException {
//        String sql = "INSERT INTO book (isbn, book_name, publisher_code, publish_date, price) VALUES (?,?,?,?,?)";
//        PreparedStatement stmt = conn.prepareStatement(sql);
//        stmt.setString(1, matricula);
//        stmt.setString(2, marca);
//        stmt.setInt(3, preu);
//        if (!dni.equals()) {  // if(buscarPropietari)
//            stmt.setString(4, dni);
//        } else {
//            stmt.setNull(4, 0);
//        }
//
//        int count = stmt.executeUpdate();
//
//        System.out.println("Inserted Book count: " + count);
//        stmt.close();
//    }
//    private static Propietari consultaPropietariORM(String dni, boolean ambCoches) throws SQLException {
//        String sql = "SELECT * FROM PROPIETARIOS WHERE DNI = ?";
//        PreparedStatement stmt = conn.prepareStatement(sql);
//        stmt.setString(1, dni);
//
//        ResultSet rs = stmt.executeQuery();
//        Propietari prop = null;
//        if (rs.next()) {
//            prop = new Propietari();
//            prop.setDni(rs.getString("DNI"));
//            prop.setNom(rs.getString("Nombre"));
//            prop.setEdat(rs.getInt("Edad"));
//
//            rs.close();
//            stmt.close();
//            if (ambCoches) {
//                List<Coche> coches = new ArrayList<>();
//                stmt = conn.prepareStatement("SELECT * FROM COCHES WHERE DNI = ?");
//                stmt.setString(1, dni);
//                rs = stmt.executeQuery();
//                while (rs.next()) {
//                    Coche co = new Coche();
//                    co.setMatricula(rs.getString("Matricula"));
//                    co.setMarca(rs.getString("Marca"));
//                    co.setPreu(rs.getInt("Precio"));
//                    co.setDni(rs.getString("DNI"));
//
//                    coches.add(co);
//                }
//                prop.setCoches(coches);
//                rs.close();
//                stmt.close();
//            }
//        }
//        return prop;
//    }
}
