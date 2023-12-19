/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persist2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model2.*;

/**
 *
 * @author usuari
 */
public class DirectorDAO extends BaseDAO {

    public DirectorDAO() {
        this.connect();
    }

    public Director getDirector(int id) throws SQLException {
        PreparedStatement stmt;
        ResultSet rs;
        Director dir = null;

        String query = "SELECT * FROM directores WHERE id = ?";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if (rs.next()) {
            dir = new Director();
            dir.setId(rs.getInt("id"));
            dir.setNombre(rs.getString("nombre"));

        }
        rs.close();
        stmt.close();

        return dir;
    }

    public Director getDirectorPerIdPelicula(int id) throws SQLException {
        PreparedStatement stmt;
        ResultSet rs;
        Director dir = null;

        String query = "select *\n" +
        "from Cine.peliculas_directores\n" +
        "inner join Cine.directores on directores.id = peliculas_directores.director_id\n" +
        "inner join Cine.peliculas on peliculas.id = peliculas_directores.pelicula_id\n" +
        "where peliculas.id = ?;";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if (rs.next()) {
            dir = new Director();
            dir.setId(rs.getInt("id"));
            dir.setNombre(rs.getString("nombre"));

        }

        return dir;
    }

    public int insert(Director dir) throws SQLException {
        String query = "INSERT INTO directores (id, nombre) VALUES (?,?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        // Paràmetre per a claus autoincrementals
        // PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        stmt.setInt(1, dir.getId());
        stmt.setString(2, dir.getNombre());

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

    public int delete(int id) throws SQLException {
        // Si no se esborra en cascade
        // hem de esborrar primer els capitols
        // En UML seria una composició: si esborro el llibre
        // he de esborrar també els capitols

        String query = "DELETE FROM directores WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        int count = stmt.executeUpdate();
        stmt.close();

        return count;
    }

    public int update(Director dir) throws SQLException {
        String query = "UPDATE directores SET  nombre = ? where id = ?";
        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setInt(2, dir.getId());
        stmt.setString(1, dir.getNombre());

        int count = stmt.executeUpdate();
        stmt.close();

        return count;
    }

}
