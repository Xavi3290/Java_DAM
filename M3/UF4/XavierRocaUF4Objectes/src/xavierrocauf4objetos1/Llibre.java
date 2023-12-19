/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objetos1;

/**
 *
 * @author usuari
 */
public class Llibre {

    private String autor;
    private String titol;
    private int numPag;
    private String isbn;
    private boolean prestat = false;

    public Llibre(String autor, String titol, int numPag, String isbn) {
        this.autor = autor;
        this.titol = titol;
        this.numPag = numPag;
        this.isbn = isbn;        
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean getPrestat() {
        return prestat;
    }

    public void setPrestat(boolean prestat) {
        this.prestat = prestat;
    }

    public void mostra() {
        if (prestat) {
            System.out.printf("\nAutor: %s\nTitol: %s\nNumero de pagina: %d\nISBN: %s\nPrestat\n", autor, titol, numPag, isbn);
        } else {
            System.out.printf("\nAutor: %s\nTitol: %s\nNumero de pagina: %d\nISBN: %s\nNo Prestat\n", autor, titol, numPag, isbn);
        }
    }
}
