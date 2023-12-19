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
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import model.*;

/**
 *
 * @author usuari
 */
public class CategoriaDAO extends BaseDAO {

    public CategoriaDAO() {
        this.connect();
    }

    public Categoria getCategoria(int id) {
        PreparedStatement stmt;
        ResultSet rs;
        Categoria cat = null;

        try {
            String query = "SELECT * FROM categoria WHERE id = ?";
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                cat = new Categoria();
                cat.setId(rs.getInt("id"));
                cat.setNom(rs.getString("nom"));

            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

        return cat;
    }

    public ArrayList<Categoria> getCategoriaList() {

        String query = "select *\n"
                + "from categoria;";
        ArrayList<Categoria> categories = new ArrayList<>();
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setId(rs.getInt("id"));
                cat.setNom(rs.getString("nom"));
                categories.add(cat);
            }
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        return categories;
    }

    public int insert(Categoria cat) {
        String query = "INSERT INTO categoria (id, nom) VALUES (?,?)";
        int affectedRows = 0;
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            // Paràmetre per a claus autoincrementals
            // PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            stmt.setInt(1, cat.getId());
            stmt.setString(2, cat.getNom());

            affectedRows = stmt.executeUpdate();
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
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        return affectedRows;
    }

    public int delete(int id) {
        // Si no se esborra en cascade
        // hem de esborrar primer els capitols
        // En UML seria una composició: si esborro el llibre
        // he de esborrar també els capitols

        int count = 0;

        try {
            String query = "DELETE FROM categoria WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id);
            count = count + stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

        return count;
    }

    public int update(Categoria cat) {
        String query = "UPDATE categoria SET nom = ? where id = ?";
        int count = 0;
        try {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(2, cat.getId());
            stmt.setString(1, cat.getNom());

            count = stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

        return count;
    }

}
