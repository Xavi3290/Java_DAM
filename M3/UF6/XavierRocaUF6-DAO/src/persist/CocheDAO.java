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
public class CocheDAO extends BaseDAO {

    public CocheDAO() {
        this.connect();
    }

    public Coche getCoche(String matricula) throws SQLException {
        PreparedStatement stmt;
        ResultSet rs;
        Coche co = null;

        String query = "SELECT * FROM COCHES WHERE Matricula = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, matricula);
        rs = stmt.executeQuery();

        if (rs.next()) {
            co = new Coche();
            co.setMatricula(rs.getString("Matricula"));
            co.setMarca(rs.getString("Marca"));
            co.setPreu(rs.getInt("Precio"));
            String dniCode = rs.getString("DNI");
            //Cridem a Propietari
            PropietariDAO proDao = new PropietariDAO();
            Propietari pro = proDao.getPropietari(dniCode);
            co.setPropietario(pro);

        }

        return co;
    }

    public ArrayList<Coche> getCocheDniPropietario(String dni) throws SQLException {

        String query = "SELECT * FROM COCHES WHERE DNI = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, dni);
        ResultSet rs = stmt.executeQuery();
        ArrayList<Coche> coches = new ArrayList<>();
        while (rs.next()) {
            Coche co = new Coche();
            co.setMatricula(rs.getString("Matricula"));
            co.setMarca(rs.getString("Marca"));
            co.setPreu(rs.getInt("Precio"));
            String dniCode = rs.getString("DNI");
            PropietariDAO proDao = new PropietariDAO();
            Propietari pro = proDao.getPropietari(dniCode);
            co.setPropietario(pro);
            coches.add(co);
        }
        rs.close();
        stmt.close();
        return coches;
    }

    public int insert(Coche co) throws SQLException {
        String query = "INSERT INTO COCHES (Matricula, Marca, Precio, DNI) VALUES (?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        int affectedRows = 0;
        // Paràmetre per a claus autoincrementals
        // PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        if (ifExists("Select * from PROPIETARIOS where DNI = ?", co.getPropietario().getDni())) {

            stmt.setString(1, co.getMatricula());
            stmt.setString(2, co.getMarca());
            stmt.setInt(3, co.getPreu());
            if (co.getPropietario() == null) {
                stmt.setNull(4, 0);//.setInt(3, 1);
            } else {
                stmt.setString(4, co.getPropietario().getDni());
            }
        
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
        }
        return affectedRows;
    }

    public int delete(String matricula) throws SQLException {
        // Si no se esborra en cascade
        // hem de esborrar primer els capitols
        // En UML seria una composició: si esborro el llibre
        // he de esborrar també els capitols

        // i despres el llibre 
        String query = "DELETE FROM COCHES WHERE Matricula = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt = conn.prepareStatement(query);
        stmt.setString(1, matricula);
        int count = stmt.executeUpdate();
        stmt.close();
        return count;

    }
    
    public int deleteDNI(String dni) throws SQLException {
        
        String query = "DELETE FROM COCHES WHERE DNI = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt = conn.prepareStatement(query);
        stmt.setString(1, dni);
        int count = stmt.executeUpdate();
        stmt.close();
        return count;
    }

    public int update(Coche co) throws SQLException {
        String query = "UPDATE COCHES SET  Marca = ?, "
                + "Precio = ?, DNI = ? WHERE Matricula = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(4, co.getMatricula());
        stmt.setString(1, co.getMarca());
        stmt.setDouble(2, co.getPreu());
        if (co.getPropietario() != null) {
            stmt.setString(3, co.getPropietario().getDni());
        } else {
            stmt.setNull(3, 0);
        }

        int count = stmt.executeUpdate();
        stmt.close();

        return count;
    }

}
