/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persist;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Chapter;

/**
 *
 * @author alfredo
 */
public class ChapterDAO extends BaseDAO {

    public ChapterDAO() {
        connect();
    }

    public ArrayList<Chapter> getChapters(String isbn) throws SQLException {

        String query = "SELECT * FROM chapter WHERE book_isbn = ?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, isbn);
        ResultSet rs = stmt.executeQuery();
        ArrayList<Chapter> chapters = new ArrayList<>();
        while (rs.next()) {
            Chapter chapter = new Chapter();
            chapter.setNum(rs.getInt("num"));
            chapter.setTitle(rs.getString("title"));
            chapter.setNumPages(rs.getInt("numpages"));
            chapters.add(chapter);
        }
        rs.close();
        stmt.close();
        return chapters;
    }

    public int insertaChapter(String bookIsbn, Chapter ch) throws SQLException {
        String query = "INSERT INTO chapter (num, title, numPages, book_isbn) VALUES (?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, ch.getNum());
        stmt.setString(2, ch.getTitle());
        stmt.setInt(3, ch.getNumPages());
        stmt.setString(4, bookIsbn);

        int count = stmt.executeUpdate();

        stmt.close();
        return count;
    }
}
