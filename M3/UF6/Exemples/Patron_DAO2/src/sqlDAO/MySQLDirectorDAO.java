/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlDAO;

import dao.DirectorDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Director;
import model.Pelicula;
import static sqlDAO.Conexion.conex;
import static sqlDAO.MySQLPeliculaDAO.ifExists;

/**
 *
 * @author agustincintas
 */
public class MySQLDirectorDAO extends Conexion implements DirectorDAO {

    @Override
    public boolean insertar(Director a) {

        final String INSERT = "INSERT INTO Directores(ID,Nombre) VALUES (?,?)";
        PreparedStatement st = null;
        
        try {
            this.conectar();
            st = conex.prepareStatement(INSERT);
            st.setInt(1, a.getId());
            st.setString(2, a.getNombre());

            if (ifExists("SELECT * FROM Directores where ID = ?", a.getId())) {
                return false;

            } else {
                int cont = st.executeUpdate();
                System.out.println("Director insertat amb exit " + cont);
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
        return true;

    }

    @Override
    public void modificar(Director a) {

        final String UPDATE = "UPDATE Directores SET Nombre = ? where ID = ?";

        PreparedStatement st = null;
        try {
            this.conectar();
            st = conex.prepareStatement(UPDATE);
            st.setString(1, a.getNombre());
            st.setInt(2, a.getId());

            int count = st.executeUpdate();

            System.out.println("Modificació executada: " + count);

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

    @Override
    public void eliminar(Director a) {
        final String DELETE = "DELETE FROM Directores where ID= ?";

        PreparedStatement st = null;
        try {
            this.conectar();
            st = conex.prepareStatement(DELETE);
            st.setInt(1, a.getId());

            int count = st.executeUpdate();

            System.out.println("Eliminació executada: " + count);

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

    private Director convertir(ResultSet rs) throws SQLException {
        int id = rs.getInt("ID");
        String nombre = rs.getString("Nombre");

        Director d1 = new Director(id, nombre);
        return d1;

    }

    @Override
    public List<Director> obtenerTodos() {

        final String getAll = "SELECT ID,Nombre from Directores";

        PreparedStatement stat = null;
        ResultSet rs = null;
        Director r = null;
        List<Director> direcs = new ArrayList<>();
        try {
            this.conectar();
            stat = conex.prepareStatement(getAll);

            rs = stat.executeQuery();
            while (rs.next()) {
                direcs.add(convertir(rs));
            }

        } catch (Exception e) {

        } finally {
            try {
                this.desconectar();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }
        return direcs;

    }

    @Override
    public Director obtener(Integer id) {
        final String getOne = "SELECT ID,Nombre from Directores where ID = ?";

        PreparedStatement stat = null;
        ResultSet rs = null;
        Director r = null;

        try {
            this.conectar();
            stat = conex.prepareStatement(getOne);
            stat.setInt(1, id);
            rs = stat.executeQuery();

            if (rs.next()) {
                r = convertir(rs);

            }

        } catch (Exception e) {

        } finally {
            try {
                this.desconectar();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }
        return r;
    }

}
