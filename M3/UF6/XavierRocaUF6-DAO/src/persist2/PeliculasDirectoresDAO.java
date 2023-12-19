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
public class PeliculasDirectoresDAO extends BaseDAO {
    
    public PeliculasDirectoresDAO() {
        this.connect();
    }

    public PeliculasDirectores getPeliculaDirector(int idPel) throws SQLException {
        PreparedStatement stmt;
        ResultSet rs;
        PeliculasDirectores pelDir = null;

        String query = "select *\n" +
        "from Cine.peliculas_directores\n" +
        "inner join Cine.directores on directores.id = peliculas_directores.director_id\n" +
        "inner join Cine.peliculas on peliculas.id = peliculas_directores.pelicula_id\n" +
        "where peliculas.id = ?;";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, idPel);
        rs = stmt.executeQuery();

        if (rs.next()) {
            pelDir = new PeliculasDirectores();
            pelDir.setPeliculaId(rs.getInt("pelicula_id"));
            pelDir.setDirectorId(rs.getInt("director_id"));

        }
        rs.close();
        stmt.close();

        return pelDir;
    }

    public int insert(PeliculasDirectores pelDir) throws SQLException {
        String query = "INSERT INTO peliculas_directores (pelicula_id, director_id) VALUES (?,?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        // Paràmetre per a claus autoincrementals
        // PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        stmt.setInt(1, pelDir.getPeliculaId());
        stmt.setInt(2, pelDir.getDirectorId());

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

        String query = "DELETE FROM peliculas_directores WHERE pelicula_id = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        int count = stmt.executeUpdate();
        stmt.close();

        return count;
    }

    public int update(PeliculasDirectores pelDir) throws SQLException {
        String query = "UPDATE peliculas_directores SET  direcor_id = ? where pelicula_id = ?";
        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setInt(2, pelDir.getPeliculaId());
        stmt.setInt(1, pelDir.getDirectorId());

        int count = stmt.executeUpdate();
        stmt.close();

        return count;
    }

}

    
    

