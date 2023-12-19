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
import static persist.BaseDAO.conn;

/**
 *
 * @author usuari
 */
public class VaixellDAO extends BaseDAO {

    public VaixellDAO() {
        this.connect();
    }

    public Vaixell getVaixell(int codi) {
        PreparedStatement stmt;
        ResultSet rs;
        Vaixell vai = null;

        String query = "select *\n"
                + "from vaixells\n"
                + "where codi = ?;";
        try {
            stmt = conn.prepareStatement(query);
            stmt.setInt(1, codi);
            rs = stmt.executeQuery();

            if (rs.next()) {
                vai = new Vaixell();
                vai.setCodi(rs.getInt("codi"));
                vai.setNom(rs.getString("nom"));
                int catId = rs.getInt("categoriaId");
                CategoriaDAO caDao = new CategoriaDAO();
                Categoria cat = caDao.getCategoria(catId);
                vai.setCategoria(cat);
                vai.setRating(rs.getDouble("rating"));
                vai.setClub(rs.getString("club"));
                vai.setTipus(rs.getString("tipus"));
                vai.setSenior(rs.getBoolean("senior"));
                vai.setTemps(rs.getDouble("temps"));

                rs.close();
                stmt.close();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

        return vai;
    }

    public ArrayList<Vaixell> getVaixellFiltratPerCategoriaYOrdenat(String nomCat, int ordre) {

        ArrayList<Vaixell> vaixells = new ArrayList<>();
        Vaixell vai = null;
        String query;

        try {

            if (nomCat.equals("...")) {
                if (ordre == 0) {
                    query = "select *\n"
                            + "from vaixells\n"
                            + "order by codi;";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {
                        vai = new Vaixell();
                        vai.setCodi(rs.getInt("codi"));
                        vai.setNom(rs.getString("nom"));
                        int catId = rs.getInt("categoriaId");
                        CategoriaDAO caDao = new CategoriaDAO();
                        Categoria cat = caDao.getCategoria(catId);
                        vai.setCategoria(cat);
                        vai.setRating(rs.getDouble("rating"));
                        vai.setClub(rs.getString("club"));
                        vai.setTipus(rs.getString("tipus"));
                        vai.setSenior(rs.getBoolean("senior"));
                        vai.setTemps(rs.getDouble("temps"));
                        vaixells.add(vai);
                    }
                    rs.close();
                    stmt.close();
                } else {
                    query = "select *, (rating * temps) as temCom\n"
                            + "from vaixells\n"
                            + "order by temCom;";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {
                        vai = new Vaixell();
                        vai.setCodi(rs.getInt("codi"));
                        vai.setNom(rs.getString("nom"));
                        int catId = rs.getInt("categoriaId");
                        CategoriaDAO caDao = new CategoriaDAO();
                        Categoria cat = caDao.getCategoria(catId);
                        vai.setCategoria(cat);
                        vai.setRating(rs.getDouble("rating"));
                        vai.setClub(rs.getString("club"));
                        vai.setTipus(rs.getString("tipus"));
                        vai.setSenior(rs.getBoolean("senior"));
                        vai.setTemps(rs.getDouble("temps"));
                        vaixells.add(vai);
                    }
                    rs.close();
                    stmt.close();
                }

            } else {
                if (ordre == 0) {
                    query = "select *\n"
                            + "from vaixells\n"
                            + "inner join categoria on vaixells.categoriaId = categoria.id\n"
                            + "where categoria.nom = ?\n"
                            + "order by codi;";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setString(1, nomCat);
                    ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {
                        vai = new Vaixell();
                        vai.setCodi(rs.getInt("codi"));
                        vai.setNom(rs.getString("nom"));
                        int catId = rs.getInt("categoriaId");
                        CategoriaDAO caDao = new CategoriaDAO();
                        Categoria cat = caDao.getCategoria(catId);
                        vai.setCategoria(cat);
                        vai.setRating(rs.getDouble("rating"));
                        vai.setClub(rs.getString("club"));
                        vai.setTipus(rs.getString("tipus"));
                        vai.setSenior(rs.getBoolean("senior"));
                        vai.setTemps(rs.getDouble("temps"));
                        vaixells.add(vai);
                    }
                    rs.close();
                    stmt.close();

                } else {
                    query = "select *, (rating * temps) as temCom\n"
                            + "from vaixells\n"
                            + "inner join categoria on vaixells.categoriaId = categoria.id\n"
                            + "where categoria.nom = ?\n"
                            + "order by temCom;";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setString(1, nomCat);
                    ResultSet rs = stmt.executeQuery();
                    while (rs.next()) {
                        vai = new Vaixell();
                        vai.setCodi(rs.getInt("codi"));
                        vai.setNom(rs.getString("nom"));
                        int catId = rs.getInt("categoriaId");
                        CategoriaDAO caDao = new CategoriaDAO();
                        Categoria cat = caDao.getCategoria(catId);
                        vai.setCategoria(cat);
                        vai.setRating(rs.getDouble("rating"));
                        vai.setClub(rs.getString("club"));
                        vai.setTipus(rs.getString("tipus"));
                        vai.setSenior(rs.getBoolean("senior"));
                        vai.setTemps(rs.getDouble("temps"));
                        vaixells.add(vai);
                    }
                    rs.close();
                    stmt.close();
                }

            }
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

        return vaixells;
    }

    public int insert(Vaixell vai) {
        String query = "INSERT INTO vaixells (codi, nom, categoriaId, rating, club, tipus, senior, temps) VALUES (?,?,?,?,?,?,?,?)";
        int affectedRows = 0;

        try {

            PreparedStatement stmt = conn.prepareStatement(query);
            // Paràmetre per a claus autoincrementals
            // PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            stmt.setInt(1, vai.getCodi());
            stmt.setString(2, vai.getNom());
            if (vai.getCategoria() == null) {
                stmt.setNull(3, 0);//.setInt(3, 1);
            } else {
                stmt.setInt(3, vai.getCategoria().getId());
            }
            stmt.setDouble(4, vai.getRating());
            stmt.setString(5, vai.getClub());
            stmt.setString(6, vai.getTipus());
            stmt.setBoolean(7, vai.isSenior());
            stmt.setDouble(8, vai.getTemps());

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

    public int delete(int codi) {

        int count = 0;

        String query = "DELETE FROM vaixells WHERE codi = ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, codi);
            count = count + stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
        return count;
    }

    public int update(Vaixell vai) {
        String query = "UPDATE vaixells SET nom = ?, categoriaId = ?, rating = ?, club = ?, tipus = ?, senior = ?, temps = ? where codi = ?";
        int count = 0;
        try {
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(8, vai.getCodi());
            stmt.setString(1, vai.getNom());
            if (vai.getCategoria() != null) {
                stmt.setInt(2, vai.getCategoria().getId());
            } else {
                stmt.setNull(2, 0);
            }
            stmt.setDouble(3, vai.getRating());
            stmt.setString(4, vai.getClub());
            stmt.setString(5, vai.getTipus());
            stmt.setBoolean(6, vai.isSenior());
            stmt.setDouble(7, vai.getTemps());

            count = stmt.executeUpdate();
            stmt.close();
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }

        return count;
    }

}
