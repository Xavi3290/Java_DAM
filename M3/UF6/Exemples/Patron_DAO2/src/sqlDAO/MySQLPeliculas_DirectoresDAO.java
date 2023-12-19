/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDAO;

import dao.Pelicula_DirectoresDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Pelicula;
import model.Peliculas_Directores;
import static sqlDAO.Conexion.conex;

/**
 *
 * @author agustincintas
 */
public class MySQLPeliculas_DirectoresDAO extends Conexion implements Pelicula_DirectoresDAO {

    public void insertarPeliDirec(int idPel, int idDel) {
        final String INSERT = "INSERT INTO Peliculas_directores(pelicula_id,director_id) VALUES (?,?)";
        PreparedStatement st = null;
        try {
            this.conectar();
            st = conex.prepareStatement(INSERT);

            if (ifExists("SELECT * FROM Peliculas where ID = ? ", idPel) && ifExists("SELECT * FROM Directores where ID = ? ", idDel)) {
                st.setInt(1, idPel);
                st.setInt(2, idDel);
                int cont = st.executeUpdate();

                System.out.println("Pelicula_Directores introduit amb exit: " + cont);
            } else {
                System.out.println("El id de Pelicula o el id del Director no esta a la BDD");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            if (st != null) {
                try {
                    this.desconectar();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public void modificarDir(int idDir, int idpeli) throws SQLException {
        String update = "UPDATE Peliculas_directores SET director_id = ? where pelicula_id = ?";

        PreparedStatement st = null;

        try {
            st = conex.prepareStatement(update);

            st.setInt(1, idDir);
            st.setInt(2, idpeli);
            int cont = st.executeUpdate();
            System.out.println("Pelicula_director modificada amb èxit " + cont);

        } catch (Exception e) {
            System.out.println(e.toString());

        } finally {
            if (st != null) {
                try {
                    this.desconectar();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }

    @Override
    public void eliminar(Peliculas_Directores a) {

    }

    @Override
    public List<Peliculas_Directores> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Peliculas_Directores obtener(Integer id) {
        final String getOne = "SELECT Dir.Nombre FROM Cine.Directores Dir\n"
                + "inner join Cine.Peliculas_directores pd on Dir.ID=pd.director_id\n"
                + "inner join Cine.Peliculas pe on pd.pelicula_id = pe.ID\n"
                + "where pe.ID=?";

        PreparedStatement stat = null;
        ResultSet rs = null;
        Peliculas_Directores pd = null;

        try {
            this.conectar();
            stat = conex.prepareStatement(getOne);
            stat.setInt(1, id);
            rs = stat.executeQuery();

            if (rs.next()) {

                System.out.println("Nombre: " + rs.getString("Nombre"));

            }

        } catch (Exception e) {

        } finally {
            try {
                this.desconectar();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }
        return pd;

    }

    private Peliculas_Directores convertir(ResultSet rs) throws SQLException {
        int id = rs.getInt("pelicula_id");
        int idDir = rs.getInt("director_id");

        Peliculas_Directores pd = new Peliculas_Directores(id, idDir);

        return pd;

    }

    @Override
    public boolean insertar(Peliculas_Directores a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean ifExists(String sSQL, int nId) throws SQLException {
        PreparedStatement ps = conex.prepareStatement(sSQL);
        ps.setInt(1, nId);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    @Override
    public void modificar(Peliculas_Directores a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
