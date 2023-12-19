/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persist;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.*;

/**
 *
 * @author usuari
 */
public class PokemonDAO extends BaseDAO {

    public PokemonDAO() {
        this.connect();
    }

    public Pokemon getPokemon(int codi) throws SQLException {
        PreparedStatement stmt;
        ResultSet rs;
        Pokemon pok = null;

        String query = "SELECT * FROM pokemon WHERE codi = ?";
        stmt = conn.prepareStatement(query);
        stmt.setInt(1, codi);
        rs = stmt.executeQuery();

        if (rs.next()) {
            pok = new Pokemon();
            pok.setCodi(rs.getInt("codi"));
            pok.setNom(rs.getString("nom"));
            pok.setNivell(rs.getInt("nivell"));
            pok.setTipus(rs.getString("tipus"));
            pok.setAltura(rs.getDouble("altura"));

        }
        rs.close();
        stmt.close();

        return pok;
    }

    public ArrayList<Pokemon> getPokemonListCodi() throws SQLException {

        String query = "select *\n"
                + "from pokemon\n"
                + "order by codi;";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        while (rs.next()) {
            Pokemon pok = new Pokemon();
            pok.setCodi(rs.getInt("codi"));
            pok.setNom(rs.getString("nom"));
            pok.setNivell(rs.getInt("nivell"));
            pok.setTipus(rs.getString("tipus"));
            pok.setAltura(rs.getDouble("altura"));
            pokemons.add(pok);
        }
        rs.close();
        stmt.close();
        return pokemons;
    }

    public ArrayList<Pokemon> getPokemonListNivell() throws SQLException {

        String query = "select *\n" +
        "from pokemon\n" +
        "order by nivell desc;";
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        while (rs.next()) {
            Pokemon pok = new Pokemon();
            pok.setCodi(rs.getInt("codi"));
            pok.setNom(rs.getString("nom"));
            pok.setNivell(rs.getInt("nivell"));
            pok.setTipus(rs.getString("tipus"));
            pok.setAltura(rs.getDouble("altura"));
            pokemons.add(pok);
        }
        rs.close();
        stmt.close();
        return pokemons;
    }

    public ArrayList<Pokemon> getPokemonListTipus(String tipus) throws SQLException {

        String query = "select *\n"
                + "from pokemon\n"
                + "where tipus = ?\n"
                + "order by nom;";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, tipus);
        ResultSet rs = stmt.executeQuery();
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        while (rs.next()) {
            Pokemon pok = new Pokemon();
            pok.setCodi(rs.getInt("codi"));
            pok.setNom(rs.getString("nom"));
            pok.setNivell(rs.getInt("nivell"));
            pok.setTipus(rs.getString("tipus"));
            pok.setAltura(rs.getDouble("altura"));
            pokemons.add(pok);
        }
        rs.close();
        stmt.close();
        return pokemons;
    }

    public boolean insert(Pokemon pok) throws SQLException {
        String query = "INSERT INTO pokemon (codi, nom, nivell, tipus, altura) VALUES (?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        // Paràmetre per a claus autoincrementals
        // PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        stmt.setInt(1, pok.getCodi());
        stmt.setString(2, pok.getNom());
        stmt.setInt(3, pok.getNivell());
        stmt.setString(4, pok.getTipus());
        stmt.setDouble(5, pok.getAltura());

        int affectedRows = 0;
        if (this.getPokemon(pok.getCodi()) == null) {
            affectedRows = stmt.executeUpdate();
        }

        boolean insert = false;
        if (affectedRows != 0) {
            insert = true;
        }
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
        return insert;
    }

    public boolean delete(int codi) throws SQLException {
        // Si no se esborra en cascade
        // hem de esborrar primer els capitols
        // En UML seria una composició: si esborro el llibre
        // he de esborrar també els capitols

        int count = 0;

        String query = "DELETE FROM pokemon WHERE codi = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, codi);
        count = count + stmt.executeUpdate();
        boolean del = false;
        if (count != 0) {
            del = true;
        }
        stmt.close();

        return del;
    }

    public boolean update(Pokemon pok) throws SQLException {
        String query = "UPDATE pokemon SET nom = ?, nivell = ?, tipus = ?, altura = ? where codi = ?";
        PreparedStatement stmt = conn.prepareStatement(query);

        stmt.setInt(5, pok.getCodi());
        stmt.setString(1, pok.getNom());
        stmt.setInt(2, pok.getNivell());
        stmt.setString(3, pok.getTipus());
        stmt.setDouble(4, pok.getAltura());

        int count = stmt.executeUpdate();
        boolean upd = false;
        if (count != 0) {
            upd = true;
        }
        stmt.close();

        return upd;
    }

}
