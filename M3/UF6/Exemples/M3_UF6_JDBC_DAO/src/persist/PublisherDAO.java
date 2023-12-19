/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Publisher;

/**
 *
 * @author alfredo
 */
public class PublisherDAO extends BaseDAO {

    public PublisherDAO() {
        connect();
    }

    public Publisher getPublisher(int code) throws SQLException {

        ResultSet rs;
        Publisher publisher = null;

        String query = "SELECT * FROM publisher WHERE code = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, code);
        rs = stmt.executeQuery();
        if (rs.next()) {
            publisher = new Publisher();
            publisher.setCode(rs.getInt("code"));
            publisher.setName(rs.getString("name"));
            publisher.setAddress(rs.getString("address"));
        }
        rs.close();
        stmt.close();
        return publisher;
    }

    public int insertaPublisher(Publisher pub) throws SQLException {
        String query = "INSERT INTO publisher (code, name, address) VALUES (?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, pub.getCode());
        stmt.setString(2, pub.getName());
        stmt.setString(3, pub.getAddress());

        int count = stmt.executeUpdate();
        stmt.close();
        return count;
    }
}
