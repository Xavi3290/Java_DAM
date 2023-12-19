/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xavierrocauf4objetos1;

/**
 *
 * @author usuari
 */
public class Estudiant {
    
    private String nom;
    private String curs;
    private double nota;
    private static int cont = 0;
    
    public Estudiant(String nom, String curs, double nota){
        this.nom = nom;
        this.curs = curs;
        this.nota = nota;
        cont++;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    public void mostra(){
        System.out.printf("\nNom: %s\nCurs: %s\n", this.nom, this.curs);
    }
    
    public void mostra(boolean ambNota){
        if(ambNota){
        System.out.printf("\nNom: %s\nCurs: %s\nNota: %.1f\n", nom, curs, nota);
        }else {
            this.mostra();
        }
    }    

    public static int getNumEstudiants() {
        return cont;
    }    
           
}
