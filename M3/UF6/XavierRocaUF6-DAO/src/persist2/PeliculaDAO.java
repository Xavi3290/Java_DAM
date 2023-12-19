/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persist2;

import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import model2.*;

/**
 *
 * @author usuari
 */
public class PeliculaDAO extends BaseDAO {

    public PeliculaDAO() {
        this.connect();
    }

    public Pelicula getPelicula(int id) throws SQLException {
        PreparedStatement stmt;
        ResultSet rs;
        Pelicula pel = null;

        String query = "SELECT * FROM peliculas WHERE id = ?";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        rs = stmt.executeQuery();

        if (rs.next()) {
            pel = new Pelicula();
            pel.setId(rs.getInt("id"));
            pel.setTitulo(rs.getString("titulo"));
            pel.setFechaEstreno(rs.getDate("fechaEstreno").toLocalDate());
            pel.setDuracion(rs.getInt("duracion"));

        }
        rs.close();
        stmt.close();

        return pel;
    }

    public int insert(Pelicula pel) throws SQLException {
        String query = "INSERT INTO peliculas (id, titulo, fechaEstreno, duracion) VALUES (?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        // Paràmetre per a claus autoincrementals
        // PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        stmt.setInt(1, pel.getId());
        stmt.setString(2, pel.getTitulo());
        stmt.setDate(3, Date.valueOf(pel.getFechaEstreno()));
        stmt.setInt(4, pel.getDuracion());

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

        int count = 0;

        if (ifExists("Select * from peliculas_directores where pelicula_id = ?", String.valueOf(id))) {
            PeliculasDirectoresDAO pdDao = new PeliculasDirectoresDAO();
            count = pdDao.delete(id);
        }

        String query = "DELETE FROM peliculas WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);
        count = count + stmt.executeUpdate();
        stmt.close();

        return count;
    }

    public int update(Pelicula pel) throws SQLException {
        String query = "UPDATE peliculas SET  titulo = ?, fechaEstreno = ?, duracion = ? where id = ?";
        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setInt(4, pel.getId());
        stmt.setString(1, pel.getTitulo());
        stmt.setDate(2, Date.valueOf(pel.getFechaEstreno()));
        stmt.setInt(3, pel.getDuracion());

        int count = stmt.executeUpdate();
        stmt.close();

        return count;
    }

    public ArrayList<Pelicula> mostrarOrdenadesId() throws SQLException {
        String query = "Select * from peliculas order by id";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();       
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        while (rs.next()) {
            Pelicula pel = new Pelicula();
            pel.setId(rs.getInt("id"));
            pel.setTitulo(rs.getString("titulo"));
            pel.setFechaEstreno(rs.getDate("fechaEstreno").toLocalDate());
            pel.setDuracion(rs.getInt("duracion"));
            peliculas.add(pel);

        }
        rs.close();
        stmt.close();

        return peliculas;
    }

}
