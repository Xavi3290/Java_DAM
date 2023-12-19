/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf5col.leccions;

/**
 *
 * @author usuari
 */
public class Document {
    
    private String titol;
    private String cos;

    public Document(String titol, String cos) {
        this.titol = titol;
        this.cos = cos;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }

    @Override
    public String toString() {
        return "Document{" + "titol=" + titol + ", cos=" + cos + '}';
    }    
    
}
