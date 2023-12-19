/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persist;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.*;

/**
 *
 * @author usuari
 */
public class PropietariDAO extends BaseDAO {

    public PropietariDAO() {
        this.connect();
    }

    public Propietari getPropietari(String dni) throws SQLException {
        PreparedStatement stmt;
        ResultSet rs;
        Propietari pro = null;

        String query = "SELECT * FROM PROPIETARIOS WHERE DNI = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, dni);
        rs = stmt.executeQuery();

        if (rs.next()) {
            pro = new Propietari();
            pro.setDni(rs.getString("DNI"));
            pro.setNom(rs.getString("Nombre"));
            pro.setEdat(rs.getInt("Edad"));

        }
        rs.close();
        stmt.close();

        return pro;
    }

    public int insert(Propietari pro) throws SQLException {
        String query = "INSERT INTO PROPIETARIOS (dni, Nombre, Edad) VALUES (?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        // Paràmetre per a claus autoincrementals
        // PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, pro.getDni());
        stmt.setString(2, pro.getNom());
        stmt.setInt(3, pro.getEdat());

        int affectedRows = stmt.executeUpdate();
//        Important !!!!
//        Per a claus Autoincrementals hem de recuperar la clau que ha donat
//        la base de dades:
//        if (affectedRows > 0) {
//            ResultSet generatedKeys = stmt.getGeneratedKeys();
//            if (generatedKeys.next()) {
//                int idGenerado = generatedKeys.getInt(1);
//                book.codi = idGenerado;
//            }
//        }
        stmt.close();
        return affectedRows;
    }

    public int delete(String dni) throws SQLException {
        // Si no se esborra en cascade
        // hem de esborrar primer els capitols
        // En UML seria una composició: si esborro el llibre
        // he de esborrar també els capitols

        String query = "DELETE FROM PROPIETARIOS WHERE DNI = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, dni);
        int count = stmt.executeUpdate();
        stmt.close();

        if (ifExists("Select * from COCHES where DNI = ?", dni)) {
            CocheDAO coDAO = new CocheDAO();
            coDAO.deleteDNI(dni);
        }

        return count;
    }

    public int update(Propietari pro) throws SQLException {
        String query = "UPDATE PROPIETARIOS SET  Nombre = ?, Edad = ? "
                + " WHERE DNI = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(3, pro.getDni());
        stmt.setString(1, pro.getNom());
        stmt.setInt(2, pro.getEdat());

        int count = stmt.executeUpdate();
        stmt.close();

        return count;
    }

}
