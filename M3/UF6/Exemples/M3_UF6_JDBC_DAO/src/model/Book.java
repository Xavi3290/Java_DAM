/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Alfredo
 */
public class Book {

    private String isbn;
    private String name;
    private Publisher publisher;
    private LocalDate publishDate;
    private double price;
    private List<Chapter> chapters;

    public Book() {
    }

    public Book(String isbn, String name, LocalDate publishDate, double price) {
        this.isbn = isbn;
        this.name = name;
        this.publishDate = publishDate;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", name=" + name + ", publisher=" + publisher
                + ", publishDate=" + publishDate + ", price=" + price + ", chapters=" + chapters + '}';
    }

    public void mostra() {
        System.out.println("ISBN: " + this.getIsbn());
        System.out.println("Book Name: " + this.getName());
        System.out.println("Publish date: " + this.getPublishDate());
        System.out.println("Price: " + this.getPrice());
        if (this.getPublisher() != null) {
            System.out.println("Publisher Code: " + this.getPublisher().getCode());
            System.out.println("          Name: " + this.getPublisher().getName());
            System.out.println("       Address: " + this.getPublisher().getAddress());

        } else {
            System.out.println("Publisher: Sense asignar ");
        }
        if (this.getChapters() != null) {
            List<Chapter> ach = this.getChapters();
            System.out.println("Capitols:");
            for (Chapter ch : ach) {
                System.out.println("     " + ch);
            }
        }
        System.out.println();

    }

}
