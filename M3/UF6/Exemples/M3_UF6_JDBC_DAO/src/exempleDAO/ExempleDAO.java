/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exempleDAO;

import persist.BDUtil;
import java.time.LocalDate;

import persist.BookDAO;
import model.Book;
import model.Chapter;
import model.Publisher;
import persist.ChapterDAO;
import persist.PublisherDAO;

/**
 *
 * @author Alfredo
 */
public class ExempleDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book book;
        int count;
        //Connexió a BBDD simple
        try {

            BDUtil.createEstructuraMysql();
            BDUtil.netejaTaules();

            BookDAO bkDao = new BookDAO();
            PublisherDAO pbDao = new PublisherDAO();
            ChapterDAO chDao = new ChapterDAO();

            //book sense publisher
            book = new Book("11112", "El señor de los membrillos", LocalDate.of(2020, 5, 22), 34.5);
            count = bkDao.insert(book);
            System.out.println("Inserted count: " + count);

            // Book amb publisher
            book = new Book("12345", "Nom game", LocalDate.now(), 27);
            Publisher pub = new Publisher(1, "Alianza Editorial", "C/ Pricipal, 3");
            pbDao.insertaPublisher(pub);
            book.setPublisher(pub);
            count = bkDao.insert(book);
            System.out.println("Inserted count: " + count);

            // Inserim capitols
            chDao.insertaChapter("12345", new Chapter(1, "Capitol 1", 10));
            chDao.insertaChapter("12345", new Chapter(2, "Capitol 2", 15));
            book = bkDao.getBook("12345", false);
            book.mostra();
            //Modifiquem titol del llibre
            book = bkDao.getBook("11112", true);
            book.mostra();
            book.setName("Nou Titol 2");
            bkDao.update(book);
            book.mostra();

            //Inserim un llibre sencer
            LocalDate data = LocalDate.of(2018, 1, 15);
            book = new Book("09876", "Ender's game", data, 34);
            book.setPublisher(pub);
            bkDao.insert(book);
            chDao.insertaChapter("09876", new Chapter(1, "Capitol 1.1", 21));
            chDao.insertaChapter("09876", new Chapter(2, "Capitol 1.2", 37));
            book = bkDao.getBook("09876", true);
            if (book != null) {
                book.mostra();
            }
            bkDao.delete("09876");
            bkDao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
