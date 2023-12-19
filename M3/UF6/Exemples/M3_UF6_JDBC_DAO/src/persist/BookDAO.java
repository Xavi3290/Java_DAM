/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;

import model.Book;
import model.Chapter;
import model.Publisher;

/**
 *
 * @author alfredo
 */
public class BookDAO extends BaseDAO {

    public BookDAO() {
        this.connect();
    }

    public Book getBook(String isbn, boolean ambChapters) throws SQLException {
        PreparedStatement stmt;
        ResultSet rs;
        Book book = null;

        String query = "SELECT * FROM book WHERE book.isbn = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, isbn);
        rs = stmt.executeQuery();

        if (rs.next()) {
            book = new Book();
            book.setIsbn(rs.getString("isbn"));
            book.setName(rs.getString("book_name"));
            book.setPublishDate(rs.getDate("publish_date").toLocalDate());
            book.setPrice(rs.getDouble("price"));
            int pubCode = rs.getInt("publisher_code");
            //Cridem a PublisherDAO
            PublisherDAO pbDao = new PublisherDAO();
            Publisher publisher = pbDao.getPublisher(pubCode);
            book.setPublisher(publisher);

        }
        rs.close();
        stmt.close();
        // Cridem a ChapterDAO
        if (book != null && ambChapters) {
            ChapterDAO chDao = new ChapterDAO();
            List<Chapter> chapters = chDao.getChapters(isbn);
            book.setChapters(chapters);
        }
        return book;
    }

    public int insert(Book book) throws SQLException {
        String query = "INSERT INTO book (isbn, book_name, publisher_code, publish_date, price) VALUES (?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        // Paràmetre per a claus autoincrementals
        // PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, book.getIsbn());
        stmt.setString(2, book.getName());
        if (book.getPublisher() == null) {
            stmt.setNull(3, 0);//.setInt(3, 1);
        } else {
            stmt.setInt(3, book.getPublisher().getCode());
        }
        stmt.setDate(4, Date.valueOf(book.getPublishDate()));
        stmt.setDouble(5, book.getPrice());

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

    public int delete(String isbn) throws SQLException {
        // Si no se esborra en cascade
        // hem de esborrar primer els capitols
        // En UML seria una composició: si esborro el llibre
        // he de esborrar també els capitols

        String query = "DELETE FROM chapter WHERE book_isbn = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, isbn);
        stmt.executeUpdate();
        // i despres el llibre 
        query = "DELETE FROM book WHERE isbn = ?";
        stmt = conn.prepareStatement(query);
        stmt.setString(1, isbn);
        int count = stmt.executeUpdate();
        stmt.close();
        return count;

    }

    public int update(Book book) throws SQLException {
        String query = "UPDATE book SET  book_name = ?, publish_date = ?, "
                + "price = ?, publisher_code = ? WHERE isbn = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(5, book.getIsbn());
        stmt.setString(1, book.getName());
        stmt.setDate(2, Date.valueOf(book.getPublishDate()));
        stmt.setDouble(3, book.getPrice());
        if (book.getPublisher() != null) {
            stmt.setInt(4, book.getPublisher().getCode());
        } else {
            stmt.setNull(4, 0);
        }
        int count = stmt.executeUpdate();
        stmt.close();

        return count;
    }

    /**
     * Update utilitzant NamedParameters
     *
     * @param book
     * @return
     * @throws SQLException
     */
//    public int updateNamed(Book book) throws SQLException {
//        String query = "UPDATE book SET  book_name = :name, publish_date = :pdate, "
//                + "price = :price, publisher_code = :pcode WHERE isbn = :isbn";
//        NamedParameterStatement p = new NamedParameterStatement(conn, query);
//        p.setString("isbn", book.getIsbn());
//        p.setString("name", book.getName());
//        p.setObject("pdate", book.getPublishDate());
//        p.setInt("price", (int) book.getPrice());
//        if (book.getPublisher() != null) {
//            p.setInt("pcode", (int) book.getPublisher().getCode());
//        } else {
//            p.setObject("pcode", null);
//        }
//        int count = p.executeUpdate();
//        p.close();
//
//        return count;
//    }
}
